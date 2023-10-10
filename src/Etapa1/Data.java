package Etapa1;

public class Data {
    private int dia;
    private int mes;
    private int ano;

    public Data(int dia, int mes, int ano) {
        this.ano = ano;
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
            if (mes == 2) {
                if (verificaAnoBissexto()) {
                    if (dia >= 1 && dia <= 29) {
                        this.dia = dia;
                    } else {
                        this.dia = 1;
                        this.mes = 1;
                        this.ano = 2000;
                    }
                } else {
                    if (dia >= 1 && dia <= 28) {
                        this.dia = dia;
                    } else {
                        this.dia = 1;
                        this.mes = 1;
                        this.ano = 2000;
                    }
                }
            } else {
                if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                    if (dia >= 1 && dia <= 30) {
                        this.dia = dia;
                    } else {
                        this.dia = 1;
                        this.mes = 1;
                        this.ano = 2000;
                    }
                } else {
                    if (dia >= 1 && dia <= 31) {
                        this.dia = dia;
                    } else {
                        this.dia = 1;
                        this.mes = 1;
                        this.ano = 2000;
                    }
                }
            }
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    // Metodo Setters
    public void setDia(int dia) {
        if (mes == 2) {
            if (verificaAnoBissexto()) {
                if (dia >= 1 && dia <= 29) {
                    this.dia = dia;
                } else {
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                }
            } else {
                if (dia >= 1 && dia <= 28) {
                    this.dia = dia;
                } else {
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                }
            }
        } else {
            if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
                if (dia >= 1 && dia <= 30) {
                    this.dia = dia;
                } else {
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                }
            } else {
                if (dia >= 1 && dia <= 31) {
                    this.dia = dia;
                } else {
                    this.dia = 1;
                    this.mes = 1;
                    this.ano = 2000;
                }
            }
        }
    }

    public void setMes(int mes) {
        if (mes >= 1 && mes <= 12) {
            this.mes = mes;
        } else {
            this.dia = 1;
            this.mes = 1;
            this.ano = 2000;
        }
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    // Metodo Getters
    public int getDia() {
        return dia;
    }

    public int getMes() {
        return mes;
    }

    public int getAno() {
        return ano;
    }

    // Metodos
    public boolean verificaAnoBissexto() {
        if (ano % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "Data: " + dia + "/" + mes + "/" + ano;
    }
}
