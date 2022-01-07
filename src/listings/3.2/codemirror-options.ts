this.codemirrorOptions = {
    lineNumbers: true,
    theme: this.currentCodemirrorTheme,
    mode: 'yaml',
    extraKeys: {
        'Ctrl-Space': 'autocomplete',
        'Ctrl-S': generateHandler,
    },
    autofocus: true,
    tabSize: 2,
};
