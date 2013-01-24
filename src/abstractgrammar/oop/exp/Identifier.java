package abstractgrammar.oop.exp;

/******************************
 *   date: 2013-1-24 下午04:41:00
 * author: qb.qian
 * 标识符表达式
 *****************************************/
public class Identifier extends Exp{
    private String f0;
    public Identifier(String n0){
        f0 = n0;
    }
    public int eval(){
        return lookup(f0);
    }
}
