private String generateObjectDiagram(String objectYaml, int index) {
    String fileName = "genTmp/diagrams/diagram_" + index;
    String result = "";

    YamlIdMap idMap = new YamlIdMap();
    Object root = idMap.decode(objectYaml);

    fileName = FulibTools.objectDiagrams().dumpSVG(fileName, root);

    try {
        result = Files.readString(Path.of(fileName + ".svg"));

        Files.deleteIfExists(Path.of(fileName + ".svg"));

        Files.deleteIfExists(Path.of("genTmp/diagrams/"));
        Files.deleteIfExists(Path.of("genTmp/"));
    } catch (IOException e) {
        e.printStackTrace();
    }

    return result;
}
