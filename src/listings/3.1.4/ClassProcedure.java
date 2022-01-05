....
ClassModelManager mm = new ClassModelManager();

// Create a map String, Clazz containing every possible class from the Data notes
createClazz(mm);

// Build all associations and put it into a global list
// Also Build a list of attributes, that are not allowed to be created
buildAssociations();

// Create all attributes
createAttributes(mm);

// Create all associations
createAssociations(mm);
....
