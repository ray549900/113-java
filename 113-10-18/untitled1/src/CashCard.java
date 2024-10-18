public class CashCard {
    int number;
    int balance;
    int bonus;

    CashCard(int number,int balance,int bonus){
        this.number = number;
        this.balance =balance;
        this.bonus = bonus;
    }

    String getNumber(){
        return this.number;
    }

    int getBalance(){
        return this.balance;
    }

    int getBonus(){
        return this.bonus;
    }

    void store(int money){
        if(money >0){
            this.balance += money;
        }
        else{
            System.out.println("餘額不足");
        }
    }
    else{
        System.out.println("扣除金額為負");
    }
    int exchange(int bonus){
        if(bonus >0){

        }
    }
}

