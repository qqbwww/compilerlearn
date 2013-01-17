package linercompiler.exp;

/******************************
 *   date: 2013-1-17 下午02:18:03
 * author: qb.qian
 *****************************************/
public class PairExpList extends ExpList{
    public Exp head;public ExpList tail;
    public PairExpList(Exp h,ExpList t){
        head=h;
        tail=t;
    }
}
