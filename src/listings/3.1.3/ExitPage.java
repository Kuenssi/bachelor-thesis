@Override
public void exitPage(FulibWorkflowsParser.PageContext ctx){
    Page newPage = new Page();

    newPage.setContent(noteData);
    newPage.setIndex(noteIndex);
    noteIndex++;

    notes.add(newPage);
}
