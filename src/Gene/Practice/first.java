package Gene.Practice;

import java.util.ArrayList;
import java.util.List;

public class first {
    public static void main(String[] args){

        Gene geneClone = new Gene("Gene", "Kim", 2);
        List<Gene> CloneGeneList=  new ArrayList<Gene>();
        CloneGeneList.add(new Gene("Gene", "KIMM" , 5));
        for(Gene clone: CloneGeneList){
            System.out.println(geneClone.getID());
        }
        System.out.println("Hello World");

    }
}
