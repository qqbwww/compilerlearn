package abstractgrammar.oop.exp;

/******************************
 *   date: 2013-1-24 下午04:38:58
 * author: qb.qian
 *****************************************/
public class MinusExp extends Exp{
    private Exp e1,e2;
    public MinusExp(Exp a1,Exp a2){
        e1 = a1;
        e2 = a2;
    }
    public int eval(){
        return e1.eval()-e2.eval();
    }
}
