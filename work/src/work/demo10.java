package work;

public class demo10 {
    public static void main(String[] args) {
//        10、搬砖问题：36块砖，36人搬，男人搬4块，女人搬3块，两个小孩抬1块。要求一次搬完，问需要男人、女人、小孩各几人？
        int man;
        int woman;
        int children;
        int brick=36;
        for(man = 0;man<=36;man++){
            for(woman=0;woman<=36;woman++){
                for(children=0;children<=36;children++){
                    if((brick==4*man+3*woman+0.5*children)&&man+woman+children==36){
                        System.out.println("男人"+man+","+"女人"+woman+","+"小孩"+children);
                    }
                }
            }
        }


    }
}
