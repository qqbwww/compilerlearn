package abstractgrammar.visitor;

/******************************
 *   date: 2013-1-24 下午05:09:20
 * author: qb.qian
 *****************************************/
public interface Visitor {

    public int visit(PlusExp n);
    public int visit(MinusExp n);
    public int visit(TimesExp n);
    public int visit(DivideExp n);
    public int visit(Identifier n);
    public int visit(IntegerLiteral n);
    public void visit(Program n);
    public void visit(MainClass n);
    public void visit(ClassDeclSimple n);
    public void visit(ClassDeclExtends n);
    public void visit(VarDecl n);
    public void visit(MethodDexl n);
    public void visit(Formal n);
    public void visit(IntArrayType n);
    public void visit(BooleanType n);
    public void visit(IdentifierType n);
    public void visit(Block n);
}
