package abstractgrammar.visitor;

/******************************
 *   date: 2013-1-24 下午04:38:58
 * author: qb.qian
 *****************************************/
public class MinusExp extends Exp{
    Exp e1,e2;
    public MinusExp(Exp a1,Exp a2){
        e1 = a1;
        e2 = a2;
    }
    @Override
    public int accept(Visitor v) {
        return v.visit(this);
    }
}
