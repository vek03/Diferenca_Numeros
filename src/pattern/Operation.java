package pattern;

import javax.swing.JOptionPane;

/**
 *
 * @author Victor Cardoso
 * Vek Histories
 */
public class Operation 
{
    //criação de variaveis nulas. Numero 1, Numero 2 e resultado final
    private double num1, num2, numf;
    
    //metodo construtor
    Operation()
    {
        
    }
    
    //inicio do set e get
    /**
     * @return the num1
     */
    public double getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(double num1) {
        this.num1 = num1;
    }

    /**
     * @return the num2
     */
    public double getNum2() {
        return num2;
    }

    /**
     * @param num2 the num2 to set
     */
    public void setNum2(double num2) {
        this.num2 = num2;
    }

    /**
     * @return the numf
     */
    public double getNumf() {
        return numf;
    }

    /**
     * @param numf the numf to set
     */
    public void setNumf(double numf) {
        this.numf = numf;
    }
    //fim do set e get
    
    
    //método de boas vindas e set de variaveis operacionais
    public void recolherDados()
    {
        
        JOptionPane.showMessageDialog(null, "Bem vindo ao programa de calcular a diferença entre dois números reais!");
        setNum1(Double.parseDouble(JOptionPane.showInputDialog("Insira o primeiro número real: ")));
        setNum2(Double.parseDouble(JOptionPane.showInputDialog("Insira o segundo número real: ")));
    }
    
    //análise de caso para saber qual variavel é maior para tirar a diferença correta
    public void diferença()
    {
        //condição para saber qual numero é maior e tirar a diferença correta
        if(getNum1()>getNum2())
        {
            setNumf(getNum1() - getNum2());
            JOptionPane.showMessageDialog(null, "A diferença entre os números é de: " + getNumf());    
        }
        else
        {
            setNumf(getNum2() - getNum1());
            JOptionPane.showMessageDialog(null, "A diferença entre os números é de: " + getNumf());
        }
    }

}
