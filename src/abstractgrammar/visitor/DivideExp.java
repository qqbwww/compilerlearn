package abstractgrammar.visitor;

/******************************
 *   date: 2013-1-24 下午04:39:55
 * author: qb.qian
 * 
 *****************************************/
public class DivideExp extends Exp{
    Exp e1,e2;
    public DivideExp(Exp a1,Exp a2){
        e1 = a1;
        e2 = a2;
    }
    @Override
    public int accept(Visitor v) {
        return v.visit(this);
    }
}
