public class Boyer_Moore {
    public Boyer_Moore() {
    }

    int Boyer_Moore(String phrase, String word){
        // Looking for the first occurence of the word in the phrase, return its index
        int MAX = word.length();
        int [] ts = new int[MAX];

        for (int  i = 0; i <MAX; i++){
            ts[i] = -1;
        }

        for(int i = 0; i < word.length(); i++){
            ts[word.charAt(i)] = i;
        }

        int pos = 0;
        while(pos <= phrase.length() - word.length()){
            int i = word.length() - 1;
            int j = pos + i;

            while (i >= 0 && word.charAt(i) == phrase.charAt(j)){
                i--;
                j--;
            }
            if (i <0){
                return pos;
            }else{
                pos += Math.max(1, i-ts[phrase.charAt(j)]);
            }
        }
        return -1;
    }
}
