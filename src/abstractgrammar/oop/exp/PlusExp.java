package abstractgrammar.oop.exp;

/******************************
 *   date: 2013-1-24 下午04:35:26
 * author: qb.qian
 *****************************************/
public class PlusExp extends Exp{
    
    private Exp e1,e2;
    
    public PlusExp(Exp a1,Exp a2){
        e1 = a1;
        e2 = a2;
    }
    
    @Override
    public int eval() {
        return e1.eval() + e2.eval();
    }
    

}
