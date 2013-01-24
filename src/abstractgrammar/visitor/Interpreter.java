package abstractgrammar.visitor;

/******************************
 *   date: 2013-1-24 下午05:13:42
 * author: qb.qian
 *****************************************/
public class Interpreter implements Visitor {

    @Override
    public int visit(PlusExp n) {
        return n.e1.accept(this) + n.e2.accept(this);
    }

    @Override
    public int visit(MinusExp n) {
        return n.e1.accept(this) - n.e2.accept(this);
    }

    @Override
    public int visit(TimesExp n) {
        return n.e1.accept(this) * n.e2.accept(this);
    }

    @Override
    public int visit(DivideExp n) {
        return n.e1.accept(this) / n.e2.accept(this);
    }

    @Override
    public int visit(Identifier n) {
        return lookup(n.f0);
    }

    @Override
    public int visit(IntegerLiteral n) {
        return Integer.parseInt(n.f0);
    }

}
