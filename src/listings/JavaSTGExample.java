import org.stringtemplate.v4.ST;
import org.stringtemplate.v4.STGroupFile;
...

URL resourceUrl = Class.class.getResource("Example.stg");
STGroupFile exampleGroup = new STGroupFile(resourceUrl);

ST st = exampleGroup.getInstanceOf("example");
st.add("topic", "the university");
st.add("language", "english");

String output = st.render();
System.out.println(output);
