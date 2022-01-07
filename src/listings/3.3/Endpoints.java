@PostMapping(path = "/generate", consumes = MediaType.ALL_VALUE)
@ResponseBody
public String generate(@RequestBody String yamlData) {
    return fulibWorkflowsService.generate(yamlData);
}

@PostMapping(path = "/download",
             consumes = MediaType.ALL_VALUE,
             produces = "application/zip")
@ResponseBody
public byte[] download(@RequestBody String yamlData,
                       @RequestParam Map<String, String> queryParams) {
    return fulibWorkflowsService.createZip(yamlData, queryParams);
}
