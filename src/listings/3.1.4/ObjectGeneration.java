private String generateObjectDiagram(String objectYaml, int index) {
    String fileName = "tmp/test/diagram_" + index;
    String result = "";

    YamlIdMap idMap = new YamlIdMap();
    Object root = idMap.decode(objectYaml);

    fileName = FulibTools.objectDiagrams().dumpSVG(fileName, root);

    try {
        result = Files.readString(Path.of(fileName + ".svg"));

        Files.deleteIfExists(Path.of(fileName + ".svg"));

        Files.deleteIfExists(Path.of("tmp/test/"));
    } catch (IOException e) {
        e.printStackTrace();
    }

    return result;
}
