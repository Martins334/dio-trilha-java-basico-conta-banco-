class ContaTerminal
{
    public static void main(String[] args)
    {
        int numero =Integer.parseInt(args[0]); 
        String agencia = args[1];
        String nomeClient = args[2];
        double saldo = Double.parseDouble(args[3]);

        System.out.printf("Olá "+ nomeClient +", obrigado por criar uma conta em nosso banco, sua agência é "+agencia+", conta "+numero+" e seu saldo "+ saldo+" já está disponível para saque");
    }
}