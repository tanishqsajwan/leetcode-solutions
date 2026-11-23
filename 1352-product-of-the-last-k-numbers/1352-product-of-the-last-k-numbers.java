class ProductOfNumbers {
    ArrayList<Integer> stream;
    public ProductOfNumbers() {
        stream = new ArrayList<>();
    }
    
    public void add(int num) {
        stream.add(num);
    }
    
    public int getProduct(int k) {
        int product = 1 ; 
        int count = 0;
        for(int i = stream.size()-1 ; i >= 0 ; i--){
        if(stream.get(i) == 0) return 0;
        product *= stream.get(i);
        count++;
        if(count == k) break;
        } 
        return product;
    }
}

/**
 * Your ProductOfNumbers object will be instantiated and called as such:
 * ProductOfNumbers obj = new ProductOfNumbers();
 * obj.add(num);
 * int param_2 = obj.getProduct(k);
 */