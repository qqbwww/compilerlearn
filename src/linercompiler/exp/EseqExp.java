package linercompiler.exp;

import linercompiler.stm.Stm;

/******************************
 *   date: 2013-1-17 下午02:15:07
 * author: qb.qian
 * 
 * Exp-->(Stm,Exp)   (EseqExp)
 * 
 *****************************************/
public class EseqExp extends Exp{
    
    public Stm stm;
    public Exp exp;
    public EseqExp(Stm s,Exp e){
        stm=s;
        exp=e;
    }
}
