pageList: pageName NEWLINE element* ;

pageName: INDENTATION MINUS 'pageName' COLON NAME ;

element:  text | inputField | button ;

text: INDENTATION MINUS 'text' COLON NAME NEWLINE;

inputField: INDENTATION MINUS ELEMENTKEY COLON NAME NEWLINE fill? ;

button: INDENTATION MINUS 'button' COLON NAME NEWLINE targetPage?;

fill: INDENTATION 'fill' COLON NAME NEWLINE;

targetPage: INDENTATION 'targetPage' COLON NAME NEWLINE;
