public class Stock {
    String symbol;
    String name;
    double previousClosingPrice;
    double currentPrice;
    Stock(String newsymbol,String newname){
        symbol = newsymbol;
        name = newname;

    }
    void setPreviousPrice(double newpreviousprice){
        previousClosingPrice=newpreviousprice;
    }
    void setCurrentPrice(double newcurrentprice){
        currentPrice =newcurrentprice;
    }
    void getChangePercent(){
        double percent =0;
        if(currentPrice>previousClosingPrice){
            percent= ((currentPrice-previousClosingPrice)/previousClosingPrice) *100;
            System.out.print(percent);
        }
        else{
            percent= ((previousClosingPrice-currentPrice)/previousClosingPrice) *100;
            System.out.print(percent);
        }
    }
}
