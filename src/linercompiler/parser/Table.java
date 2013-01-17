package linercompiler.parser;

/******************************
 *   date: 2013-1-17 下午02:40:43
 * author: qb.qian
 *****************************************/
class Table {
    String id;
    int value;
    Table tail;
    Table(String i,int v,Table t){
        id = i;
        value = v;
        tail = t ;
    }
    
    int lookup(Table t,String key){
        
        return -1;
        
    }
}
