package linercompiler.exp;

/******************************
 *   date: 2013-1-17 下午02:19:08
 * author: qb.qian
 * 
 * ExpList-->Exp
 *****************************************/
public class LastExpList extends ExpList{
    public Exp head;
    public LastExpList(Exp h){
        head = h;
    }

}
