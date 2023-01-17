class Solution {
    List<String> combination = new ArrayList<>();
    List<String> input = new ArrayList<>(List.of("","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"));
    public List<String> letterCombinations(String digits) {
        
        if(digits.length()==0){
            return combination;
        }
        findCombination(digits,"",0);
        return combination;
    }

    public void findCombination(String digit,String output,int ind){
        if(output.length()==digit.length()){
            combination.add(output);
            return;
        }

        String currdigit = input.get(digit.charAt(ind)-'0');

        for(int i=0;i<currdigit.length();i++){
            findCombination(digit,output+currdigit.charAt(i),ind+1);
        }
    }
}
