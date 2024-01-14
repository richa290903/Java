class arraytype {
      public static void main(String[] args) {
            int i,j,k;
            int x1[]={10,20,30,40,50};
            int x2[][]={{10,20,30},{40,50,60},{70,80,90}};
            int x3[][][]={{{10,20},{30,40},{50,60}},
                          {{70,80},{90,100},{110,120}},
                          {{130,140},{150,160},{170,180}},
                        };
            int x4[][]={{10},{20,30},{40,50,60}};
            System.out.println("1-D Array.....");
            for(i=0;i<x1.length;i++){
                  System.out.print(x1[i]+"\t");
            }
            System.out.println();
            System.out.println("2-D Array.....");
            for(i=0;i<3;i++){
                  for(j=0;j<x2[i].length;j++){
                        System.out.print(x2[i][j]+"\t");
                  }
                  System.out.println();
            }
            System.out.println();
            System.out.println("3-D Array.....");
            for(i=0;i<3;i++){
                  System.out.println("\n Table :"+(i+1)+"\n");
                  for(j=0;j<x3[i].length;j++){
                        for(k=0;k<2;k++){
                              System.out.print(x3[i][j][k]+"\t");
                        }
                        System.out.println();
                  }
            }
            System.out.println();
            System.out.println("Multi-Dimensional Array.....");
            for(i=0;i<3;i++){
                  for(j=0;j<x4[i].length;j++){
                        System.out.print(x4[i][j]+"\t");
                  }
                  System.out.println();
            }
      }      
}
