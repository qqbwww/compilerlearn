package abstractgrammar.visitor;

/******************************
 *   date: 2013-1-24 下午04:42:40
 * author: qb.qian
 * 整数字面量
 *****************************************/
public class IntegerLiteral extends Exp{
    String f0;
    public IntegerLiteral(String n0){
        f0 = n0;
    }
    @Override
    public int accept(Visitor v) {
        return v.visit(this);
    }
}
