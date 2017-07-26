import java.util.TreeMap;

/**
 * Created by alfredo on 25/07/17.
 */
public class Assumptions {
    private TreeMap< String , Sentence > sentences;
    private TreeMap< String , Atom > atoms;
    public Atom getAtom( String name ){
        if( atoms.containsKey(name) ){
            return atoms.get(name);
        }
        return null;
    }
    public void addSentence(Sentence sentence){
        sentences.put(sentence.name,sentence);
    }
    public void addAtom(Atom atom){
        atoms.put(atom.name,atom);
    }
}
