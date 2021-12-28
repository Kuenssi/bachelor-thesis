import org.stringtemplate.v4.*;
...
ST hello = new ST("Hello, <name>!");
hello.add("name", "World");
String output = hello.render();
System.out.println(output);
