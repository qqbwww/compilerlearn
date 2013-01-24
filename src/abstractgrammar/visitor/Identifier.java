package abstractgrammar.visitor;

/******************************
 *   date: 2013-1-24 下午04:41:00
 * author: qb.qian
 * 标识符表达式
 *****************************************/
public class Identifier extends Exp{
    String f0;
    public Identifier(String n0){
        f0 = n0;
    }
    @Override
    public int accept(Visitor v) {
        return v.visit(this);
    }
}
