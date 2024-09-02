public class ParametrosIvalidosException {
    static void contar(int parametroUm, int parametroDois) throws Exception{
        if(parametroUm > parametroDois) {
            throw new Exception("O segundo parâmetro deve ser maior que o primeiro");
        }else {
            int contagem = parametroDois - parametroUm;
            for(int i = 1; i<=contagem; i++) {
                System.out.println(i);
            }
        }
    }
}
