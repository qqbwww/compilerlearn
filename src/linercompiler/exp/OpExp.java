package linercompiler.exp;

/******************************
 *   date: 2013-1-17 下午02:12:24
 * author: qb.qian
 *****************************************/
public class OpExp extends Exp {
    public Exp left,right;
    public int oper;
    final public static int Plus=1,minus=2,Times=3,Div=4;
    public OpExp(Exp l,int o,Exp r){
        left=l;
        oper=0;
        right=r;
    }
}
