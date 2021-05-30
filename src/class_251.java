
// $FF: renamed from: gt
public class class_251 {

   // $FF: renamed from: am boolean
   static boolean field_2782;
   // $FF: renamed from: n int
   int field_2783;
   // $FF: renamed from: f int
   int field_2784;
   // $FF: renamed from: w int
   static int field_2785;
   // $FF: renamed from: y int
   int field_2786;
   // $FF: renamed from: j gx[][][]
   class_41[][][] field_2787;
   // $FF: renamed from: r int
   int field_2788;
   // $FF: renamed from: b int
   int field_2789;
   // $FF: renamed from: q int
   static int field_2790;
   // $FF: renamed from: s int[][][]
   int[][][] field_2791;
   // $FF: renamed from: u int
   static final int field_2792 = 128;
   // $FF: renamed from: bq int
   public static final int field_2793 = 383;
   // $FF: renamed from: aq gn[]
   static class_247[] field_2794;
   // $FF: renamed from: an int[]
   static final int[] field_2795;
   // $FF: renamed from: e int
   static int field_2796;
   // $FF: renamed from: g int
   static int field_2797;
   // $FF: renamed from: a int
   static int field_2798;
   // $FF: renamed from: k int
   static int field_2799;
   // $FF: renamed from: ar int
   static int field_2800;
   // $FF: renamed from: x int
   static int field_2801;
   // $FF: renamed from: z int
   static int field_2802;
   // $FF: renamed from: ah gn[][]
   static class_247[][] field_2803;
   // $FF: renamed from: t int
   static int field_2804;
   // $FF: renamed from: h int
   static int field_2805;
   // $FF: renamed from: m int
   static int field_2806;
   // $FF: renamed from: d hj[]
   class_261[] field_2807;
   // $FF: renamed from: ae int
   static int field_2808;
   // $FF: renamed from: ap int
   static int field_2809;
   // $FF: renamed from: ab int
   static int field_2810;
   // $FF: renamed from: al int
   static int field_2811;
   // $FF: renamed from: ad hj[]
   static class_261[] field_2812;
   // $FF: renamed from: v boolean
   public static boolean field_2813;
   // $FF: renamed from: ai boolean
   static boolean field_2814;
   // $FF: renamed from: ag int
   static int field_2815;
   // $FF: renamed from: ax int
   static int field_2816;
   // $FF: renamed from: as int
   public static int field_2817;
   // $FF: renamed from: aj int
   public static int field_2818;
   // $FF: renamed from: o int
   static final int field_2819 = 25;
   // $FF: renamed from: bt int
   public static final int field_2820 = 128;
   // $FF: renamed from: av int
   static final int field_2821 = 128;
   // $FF: renamed from: ac int
   static int field_2822;
   // $FF: renamed from: at int[]
   static int[] field_2823;
   // $FF: renamed from: bm int[][]
   int[][] field_2824;
   // $FF: renamed from: ao int
   static int field_2825;
   // $FF: renamed from: p int[][][]
   int[][][] field_2826;
   // $FF: renamed from: aw kx
   static class_335 field_2827;
   // $FF: renamed from: af int[]
   static final int[] field_2828;
   // $FF: renamed from: c int
   static final int field_2829 = 50;
   // $FF: renamed from: ay int[]
   static final int[] field_2830;
   // $FF: renamed from: aa int[]
   static final int[] field_2831;
   // $FF: renamed from: au int[]
   static final int[] field_2832;
   // $FF: renamed from: az int
   static final int field_2833 = 32;
   // $FF: renamed from: bd int[]
   static final int[] field_2834;
   // $FF: renamed from: l int
   static final int field_2835 = 64;
   // $FF: renamed from: i int
   static int field_2836;
   // $FF: renamed from: bu int
   public static final int field_2837 = 32;
   // $FF: renamed from: bl int
   public static final int field_2838 = 9;
   // $FF: renamed from: bv int[][]
   int[][] field_2839;
   // $FF: renamed from: bh boolean[][]
   static boolean[][] field_2840;
   // $FF: renamed from: bz boolean[][][][]
   static boolean[][][][] field_2841;
   // $FF: renamed from: ak int[]
   static final int[] field_2842;
   // $FF: renamed from: bs int
   static int field_2843;
   // $FF: renamed from: br int
   static int field_2844;
   // $FF: renamed from: bf int
   static int field_2845;
   // $FF: renamed from: ba int
   static int field_2846;
   // $FF: renamed from: be int
   static int field_2847;
   // $FF: renamed from: bj int
   static int field_2848;


   // $FF: renamed from: cg (int, int, int) void
   public void method_4722(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 != null) {
         for(int var5 = 0; var5 < var4.field_282 * -2126067833; ++var5) {
            class_261 var6 = var4.field_286[var5];
            if(class_182.method_3836(var6.field_2917 * 1142152799211342585L) && var6.field_2909 * 1674574095 == var2 && var6.field_2913 * 624055081 == var3) {
               this.method_4738(var6);
               return;
            }
         }

      }
   }

   // $FF: renamed from: v () void
   public void method_4723() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.field_2783; ++var1) {
         for(var2 = 0; var2 < this.field_2784; ++var2) {
            for(int var3 = 0; var3 < this.field_2786; ++var3) {
               this.field_2787[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < field_2822; ++var1) {
         for(var2 = 0; var2 < field_2823[var1]; ++var2) {
            field_2803[var1][var2] = null;
         }

         field_2823[var1] = 0;
      }

      for(var1 = 0; var1 < this.field_2789; ++var1) {
         this.field_2807[var1] = null;
      }

      this.field_2789 = 0;

      for(var1 = 0; var1 < field_2812.length; ++var1) {
         field_2812[var1] = null;
      }

   }

   // $FF: renamed from: q (int, int, int) hj
   public class_261 method_4724(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.field_282 * 1720897143; ++var5) {
            class_261 var6 = var4.field_286[var5];
            long var8 = var6.field_2917 * 1142152799211342585L;
            int var10 = (int)(var8 >>> 14 & 3L);
            boolean var7 = 2 == var10;
            if(var7 && var6.field_2909 * 1674574095 == var2 && var6.field_2913 * 1202737381 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   // $FF: renamed from: cb (int, int, int) hw
   public class_269 method_4725(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 == null?null:var4.field_277;
   }

   // $FF: renamed from: y (int, int, int, int, int, int, int, int) void
   public static void method_4726(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class_247 var10000 = new class_247();
      class_247 var8 = var10000;
      var8.field_2734 = var2 / 128 * -848723309;
      var8.field_2735 = var3 / 128 * -1706247967;
      var8.field_2729 = var4 / 128 * -329300917;
      var8.field_2736 = var5 / 128 * -2057847319;
      var8.field_2731 = var1 * 760606617;
      var8.field_2732 = var2 * 1390384409;
      var8.field_2733 = var3 * -730652273;
      var8.field_2741 = var4 * -366098547;
      var8.field_2728 = var5 * -1672424971;
      var8.field_2739 = var6 * -437762441;
      var8.field_2737 = var7 * 1213750925;
      field_2803[var0][field_2823[var0]++] = var8;
   }

   // $FF: renamed from: p (int, int, int, int) void
   public void method_4727(int var1, int var2, int var3, int var4) {
      class_41 var5 = this.field_2787[var1][var2][var3];
      if(var5 != null) {
         this.field_2787[var1][var2][var3].field_285 = var4 * -819264225;
      }
   }

   // $FF: renamed from: j (int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int) void
   public void method_4728(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      class_241 var10000;
      class_41 var10002;
      class_241 var21;
      int var22;
      class_41[] var24;
      if(var4 == 0) {
         var10000 = new class_241(var11, var12, var13, var14, -1, var19, false);
         var21 = var10000;

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.field_2787[var22][var2][var3] == null) {
               var24 = this.field_2787[var22][var2];
               var10002 = new class_41(var22, var2, var3);
               var24[var3] = var10002;
            }
         }

         this.field_2787[var1][var2][var3].field_275 = var21;
      } else if(var4 != 1) {
         class_249 var25 = new class_249(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);
         class_249 var23 = var25;

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.field_2787[var22][var2][var3] == null) {
               var24 = this.field_2787[var22][var2];
               var10002 = new class_41(var22, var2, var3);
               var24[var3] = var10002;
            }
         }

         this.field_2787[var1][var2][var3].field_289 = var23;
      } else {
         var10000 = new class_241(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);
         var21 = var10000;

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.field_2787[var22][var2][var3] == null) {
               var24 = this.field_2787[var22][var2];
               var10002 = new class_41(var22, var2, var3);
               var24[var3] = var10002;
            }
         }

         this.field_2787[var1][var2][var3].field_275 = var21;
      }
   }

   // $FF: renamed from: r (int, int, int, int, gl, long, int) void
   public void method_4729(int var1, int var2, int var3, int var4, class_91 var5, long var6, int var8) {
      if(var5 != null) {
         class_248 var10000 = new class_248();
         class_248 var9 = var10000;
         var9.field_2749 = var5;
         var9.field_2747 = var2 * 1874556544 + -1210205376;
         var9.field_2746 = var3 * -1869772160 + 1212597568;
         var9.field_2753 = var4 * 1219668101;
         var9.field_2750 = var6 * 840149604356866431L;
         var9.field_2748 = var8 * -1766964493;
         if(this.field_2787[var1][var2][var3] == null) {
            class_41[] var10 = this.field_2787[var1][var2];
            class_41 var10002 = new class_41(var1, var2, var3);
            var10[var3] = var10002;
         }

         this.field_2787[var1][var2][var3].field_279 = var9;
      }
   }

   // $FF: renamed from: b (int, int, int, int, gl, long, gl, gl) void
   public void method_4730(int var1, int var2, int var3, int var4, class_91 var5, long var6, class_91 var8, class_91 var9) {
      class_253 var10000 = new class_253();
      class_253 var10 = var10000;
      var10.field_2863 = var5;
      var10.field_2861 = var2 * -1266586496 + -633293248;
      var10.field_2862 = var3 * 1042903936 + 521451968;
      var10.field_2867 = var4 * 1998275011;
      var10.field_2866 = var6 * 2586414638863188585L;
      var10.field_2864 = var8;
      var10.field_2865 = var9;
      int var11 = 0;
      class_41 var12 = this.field_2787[var1][var2][var3];
      if(var12 != null) {
         for(int var13 = 0; var13 < var12.field_282 * 1720897143; ++var13) {
            if((var12.field_286[var13].field_2905 * -2139353773 & 256) == 256 && var12.field_286[var13].field_2915 instanceof class_92) {
               class_92 var14 = (class_92)var12.field_286[var13].field_2915;
               var14.method_1621();
               if(var14.field_911 * 267422413 > var11) {
                  var11 = var14.field_911 * 267422413;
               }
            }
         }
      }

      var10.field_2860 = var11 * -40147101;
      if(this.field_2787[var1][var2][var3] == null) {
         class_41[] var15 = this.field_2787[var1][var2];
         class_41 var10002 = new class_41(var1, var2, var3);
         var15[var3] = var10002;
      }

      this.field_2787[var1][var2][var3].field_281 = var10;
   }

   // $FF: renamed from: d (int, int, int, int, gl, gl, int, int, long, int) void
   public void method_4731(int var1, int var2, int var3, int var4, class_91 var5, class_91 var6, int var7, int var8, long var9, int var11) {
      if(var5 != null || var6 != null) {
         class_269 var10000 = new class_269();
         class_269 var12 = var10000;
         var12.field_3169 = var9 * 6932700597450399109L;
         var12.field_3177 = var11 * -1746857141;
         var12.field_3174 = var2 * -999978368 + -499989184;
         var12.field_3176 = var3 * -20740736 + 2137113280;
         var12.field_3170 = var4 * -604923785;
         var12.field_3178 = var5;
         var12.field_3175 = var6;
         var12.field_3172 = var7 * -1064173019;
         var12.field_3173 = var8 * 1892598191;

         for(int var13 = var1; var13 >= 0; --var13) {
            if(this.field_2787[var13][var2][var3] == null) {
               class_41[] var14 = this.field_2787[var13][var2];
               class_41 var10002 = new class_41(var13, var2, var3);
               var14[var3] = var10002;
            }
         }

         this.field_2787[var1][var2][var3].field_277 = var12;
      }
   }

   // $FF: renamed from: s (int, int, int, int, gl, gl, int, int, int, int, long, int) void
   public void method_4732(int var1, int var2, int var3, int var4, class_91 var5, class_91 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if(var5 != null) {
         class_265 var10000 = new class_265();
         class_265 var14 = var10000;
         var14.field_3035 = var11 * -734143626211523767L;
         var14.field_3045 = var13 * 1441870123;
         var14.field_3036 = var2 * 1226257536 + 613128768;
         var14.field_3042 = var3 * 28035712 + 14017856;
         var14.field_3037 = var4 * -932802139;
         var14.field_3039 = var5;
         var14.field_3043 = var6;
         var14.field_3038 = var7 * 1231774405;
         var14.field_3044 = var8 * -779498855;
         var14.field_3040 = var9 * 2120424873;
         var14.field_3041 = var10 * -883278895;

         for(int var15 = var1; var15 >= 0; --var15) {
            if(this.field_2787[var15][var2][var3] == null) {
               class_41[] var16 = this.field_2787[var15][var2];
               class_41 var10002 = new class_41(var15, var2, var3);
               var16[var3] = var10002;
            }
         }

         this.field_2787[var1][var2][var3].field_278 = var14;
      }
   }

   // $FF: renamed from: i (int, int, int) go
   public class_248 method_4733(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 != null && var4.field_279 != null?var4.field_279:null;
   }

   // $FF: renamed from: ev (gp, int, int, int, int, int, int) void
   void method_4734(class_249 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.field_2764.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field_2764[var9] - field_2805;
         var11 = var1.field_2763[var9] - field_2790;
         var12 = var1.field_2762[var9] - field_2836;
         var13 = var12 * var4 + var10 * var5 >> 16;
         var12 = var12 * var5 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var11 * var3 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var3 >> 16;
         if(var12 < 50) {
            return;
         }

         if(var1.field_2754 != null) {
            class_249.field_2771[var9] = var10;
            class_249.field_2772[var9] = var13;
            class_249.field_2773[var9] = var12;
         }

         class_249.field_2756[var9] = class_70.field_545 + var10 * class_70.field_544 / var12;
         class_249.field_2770[var9] = class_70.field_538 + var13 * class_70.field_544 / var12;
      }

      class_70.field_554 = 0;
      var8 = var1.field_2760.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field_2760[var9];
         var11 = var1.field_2761[var9];
         var12 = var1.field_2769[var9];
         var13 = class_249.field_2756[var10];
         int var14 = class_249.field_2756[var11];
         int var15 = class_249.field_2756[var12];
         int var16 = class_249.field_2770[var10];
         int var17 = class_249.field_2770[var11];
         int var18 = class_249.field_2770[var12];
         if((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            class_70.field_536 = false;
            if(var13 < 0 || var14 < 0 || var15 < 0 || var13 > class_70.field_537 || var14 > class_70.field_537 || var15 > class_70.field_537) {
               class_70.field_536 = true;
            }

            if(field_2814 && method_4769(field_2815, field_2816, var16, var17, var18, var13, var14, var15)) {
               field_2817 = var6;
               field_2818 = var7;
            }

            if(var1.field_2754 != null && var1.field_2754[var9] != -1) {
               if(!field_2813) {
                  if(var1.field_2765) {
                     class_70.method_983(var16, var17, var18, var13, var14, var15, var1.field_2757[var9], var1.field_2758[var9], var1.field_2759[var9], class_249.field_2771[0], class_249.field_2771[1], class_249.field_2771[3], class_249.field_2772[0], class_249.field_2772[1], class_249.field_2772[3], class_249.field_2773[0], class_249.field_2773[1], class_249.field_2773[3], var1.field_2754[var9]);
                  } else {
                     class_70.method_983(var16, var17, var18, var13, var14, var15, var1.field_2757[var9], var1.field_2758[var9], var1.field_2759[var9], class_249.field_2771[var10], class_249.field_2771[var11], class_249.field_2771[var12], class_249.field_2772[var10], class_249.field_2772[var11], class_249.field_2772[var12], class_249.field_2773[var10], class_249.field_2773[var11], class_249.field_2773[var12], var1.field_2754[var9]);
                  }
               } else {
                  int var19 = class_70.field_555.method_31(var1.field_2754[var9], -1719860784);
                  class_70.method_977(var16, var17, var18, var13, var14, var15, method_4768(var19, var1.field_2757[var9]), method_4768(var19, var1.field_2758[var9]), method_4768(var19, var1.field_2759[var9]));
               }
            } else if(var1.field_2757[var9] != 12345678) {
               class_70.method_977(var16, var17, var18, var13, var14, var15, var1.field_2757[var9], var1.field_2758[var9], var1.field_2759[var9]);
            }
         }
      }

   }

   // $FF: renamed from: o (int, int, int, int, int, gl, int, long, int, int, int, int) boolean
   public boolean method_4735(int var1, int var2, int var3, int var4, class_91 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null?true:this.method_4736(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   // $FF: renamed from: c (int, int, int, int, int, int, int, int, gl, int, boolean, long, int) boolean
   boolean method_4736(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class_91 var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if(var15 < 0 || var16 < 0 || var15 >= this.field_2784 || var16 >= this.field_2786) {
               return false;
            }

            class_41 var17 = this.field_2787[var1][var15][var16];
            if(var17 != null && var17.field_282 * 1720897143 >= 5) {
               return false;
            }
         }
      }

      class_261 var10000 = new class_261();
      class_261 var21 = var10000;
      var21.field_2917 = var12 * -2872503573805869239L;
      var21.field_2905 = var14 * 795852507;
      var21.field_2918 = var1 * -38016809;
      var21.field_2910 = var6 * -550285103;
      var21.field_2908 = var7 * -616350743;
      var21.field_2906 = var8 * 1814338219;
      var21.field_2915 = var9;
      var21.field_2911 = var10 * -721195091;
      var21.field_2909 = var2 * 227792367;
      var21.field_2913 = var3 * -1857360659;
      var21.field_2912 = (var2 + var4 - 1) * 1673418941;
      var21.field_2914 = (var3 + var5 - 1) * 612200061;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var23 = var3; var23 < var3 + var5; ++var23) {
            int var18 = 0;
            if(var16 > var2) {
               ++var18;
            }

            if(var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if(var23 > var3) {
               var18 += 8;
            }

            if(var23 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if(this.field_2787[var19][var16][var23] == null) {
                  class_41[] var22 = this.field_2787[var19][var16];
                  class_41 var10002 = new class_41(var19, var16, var23);
                  var22[var23] = var10002;
               }
            }

            class_41 var24 = this.field_2787[var1][var16][var23];
            var24.field_286[var24.field_282 * 1720897143] = var21;
            var24.field_283[var24.field_282 * 1720897143] = var18;
            var24.field_284 = (var24.field_284 * 1099123981 | var18) * -1682880059;
            var24.field_282 += 1428908871;
         }
      }

      if(var11) {
         this.field_2807[this.field_2789++] = var21;
      }

      return true;
   }

   // $FF: renamed from: e () void
   public void method_4737() {
      for(int var1 = 0; var1 < this.field_2789; ++var1) {
         class_261 var2 = this.field_2807[var1];
         this.method_4738(var2);
         this.field_2807[var1] = null;
      }

      this.field_2789 = 0;
   }

   // $FF: renamed from: g (hj) void
   void method_4738(class_261 var1) {
      for(int var2 = var1.field_2909 * 1674574095; var2 <= var1.field_2912 * -2078907755; ++var2) {
         for(int var3 = var1.field_2913 * 1202737381; var3 <= var1.field_2914 * -129893675; ++var3) {
            class_41 var4 = this.field_2787[var1.field_2918 * -254047513][var2][var3];
            if(var4 != null) {
               int var5;
               for(var5 = 0; var5 < var4.field_282 * 1720897143; ++var5) {
                  if(var4.field_286[var5] == var1) {
                     var4.field_282 -= 1428908871;

                     for(int var6 = var5; var6 < var4.field_282 * 1720897143; ++var6) {
                        var4.field_286[var6] = var4.field_286[var6 + 1];
                        var4.field_283[var6] = var4.field_283[var6 + 1];
                     }

                     var4.field_286[var4.field_282 * 1720897143] = null;
                     break;
                  }
               }

               var4.field_284 = 0;

               for(var5 = 0; var5 < var4.field_282 * 1720897143; ++var5) {
                  var4.field_284 = (var4.field_284 * 1099123981 | var4.field_283[var5]) * -1682880059;
               }
            }
         }
      }

   }

   // $FF: renamed from: fb (int, int, int) boolean
   boolean method_4739(int var1, int var2, int var3) {
      int var4 = this.field_2791[var1][var2][var3];
      if(var4 == -field_2798) {
         return false;
      } else if(var4 == field_2798) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if(this.method_4775(var5 + 1, this.field_2826[var1][var2][var3], var6 + 1) && this.method_4775(var5 + 128 - 1, this.field_2826[var1][var2 + 1][var3], var6 + 1) && this.method_4775(var5 + 128 - 1, this.field_2826[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method_4775(var5 + 1, this.field_2826[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field_2791[var1][var2][var3] = field_2798;
            return true;
         } else {
            this.field_2791[var1][var2][var3] = -field_2798;
            return false;
         }
      }
   }

   // $FF: renamed from: k (int, int, int) void
   public void method_4740(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 != null) {
         var4.field_277 = null;
      }
   }

   // $FF: renamed from: m (int, int, int) void
   public void method_4741(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 != null) {
         var4.field_278 = null;
      }
   }

   // $FF: renamed from: dw (int[], int, int, int, int) void
   public static void method_4742(int[] var0, int var1, int var2, int var3, int var4) {
      field_2845 = 0;
      field_2846 = 0;
      field_2847 = var3;
      field_2848 = var4;
      field_2843 = var3 / 2;
      field_2844 = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][-530049686][53][-615152924];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = -216560328; var6 <= 383; var6 += 32) {
         for(var7 = 0; var7 < 581529787; var7 += 64) {
            field_2808 = class_70.field_548[var6];
            field_2809 = class_70.field_559[var6];
            field_2810 = class_70.field_548[var7];
            field_2811 = class_70.field_559[var7];
            var8 = (var6 - 128) / -1220506617;
            var9 = var7 / 64;

            for(int var10 = 1880281326; var10 < 26; ++var10) {
               var11 = -26;

               while(var11 < 26) {
                  var12 = var10 * 724917198;
                  int var13 = var11 * 128;
                  boolean var14 = false;
                  int var15 = -var1;

                  while(true) {
                     if(var15 <= var2) {
                        if(!method_4759(var12, var0[var8] + var15, var13)) {
                           var15 += 128;
                           continue;
                        }

                        var14 = true;
                     }

                     var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
                     ++var11;
                     break;
                  }
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 32; ++var7) {
            for(var8 = -25; var8 < 25; ++var8) {
               var9 = -25;

               while(var9 < 25) {
                  boolean var16 = false;
                  var11 = -1;

                  label97:
                  while(true) {
                     if(var11 <= 1) {
                        var12 = -1;

                        while(true) {
                           if(var12 > 1) {
                              ++var11;
                              continue label97;
                           }

                           if(var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           if(var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           if(var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           if(var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           ++var12;
                        }
                     }

                     field_2841[var6][var7][var8 + 25][var9 + 25] = var16;
                     ++var9;
                     break;
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: z (int, int, int) void
   public void method_4743(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 != null) {
         var4.field_279 = null;
      }
   }

   // $FF: renamed from: cx (int, int, int) hj
   public class_261 method_4744(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.field_282 * 1720897143; ++var5) {
            class_261 var6 = var4.field_286[var5];
            long var8 = var6.field_2917 * 1142152799211342585L;
            int var10 = (int)(var8 >>> 14 & 3L);
            boolean var7 = 2 == var10;
            if(var7 && var6.field_2909 * -97582400 == var2 && var6.field_2913 * -2051478242 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   // $FF: renamed from: ao (ga, int, int, int, int, int, int, int) void
   void method_4745(class_241 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - field_2805;
      int var11;
      int var12 = var11 = (var8 << 7) - field_2836;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.field_2826[var2][var7][var8] - field_2790;
      int var18 = this.field_2826[var2][var7 + 1][var8] - field_2790;
      int var19 = this.field_2826[var2][var7 + 1][var8 + 1] - field_2790;
      int var20 = this.field_2826[var2][var7][var8 + 1] - field_2790;
      int var21 = var12 * var5 + var10 * var6 >> 16;
      var12 = var12 * var6 - var10 * var5 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var12 * var3 >> 16;
      var12 = var17 * var3 + var12 * var4 >> 16;
      var17 = var21;
      if(var12 >= 50) {
         var21 = var11 * var5 + var14 * var6 >> 16;
         var11 = var11 * var6 - var14 * var5 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var11 * var3 >> 16;
         var11 = var18 * var3 + var11 * var4 >> 16;
         var18 = var21;
         if(var11 >= 50) {
            var21 = var16 * var5 + var13 * var6 >> 16;
            var16 = var16 * var6 - var13 * var5 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var16 * var3 >> 16;
            var16 = var19 * var3 + var16 * var4 >> 16;
            var19 = var21;
            if(var16 >= 50) {
               var21 = var15 * var5 + var9 * var6 >> 16;
               var15 = var15 * var6 - var9 * var5 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var15 * var3 >> 16;
               var15 = var20 * var3 + var15 * var4 >> 16;
               if(var15 >= 50) {
                  int var22 = class_70.field_545 + var10 * class_70.field_544 / var12;
                  int var23 = class_70.field_538 + var17 * class_70.field_544 / var12;
                  int var24 = class_70.field_545 + var14 * class_70.field_544 / var11;
                  int var25 = class_70.field_538 + var18 * class_70.field_544 / var11;
                  int var26 = class_70.field_545 + var13 * class_70.field_544 / var16;
                  int var27 = class_70.field_538 + var19 * class_70.field_544 / var16;
                  int var28 = class_70.field_545 + var9 * class_70.field_544 / var15;
                  int var29 = class_70.field_538 + var21 * class_70.field_544 / var15;
                  class_70.field_554 = 0;
                  int var30;
                  if((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     class_70.field_536 = false;
                     if(var26 < 0 || var28 < 0 || var24 < 0 || var26 > class_70.field_537 || var28 > class_70.field_537 || var24 > class_70.field_537) {
                        class_70.field_536 = true;
                     }

                     if(field_2814 && method_4769(field_2815, field_2816, var27, var29, var25, var26, var28, var24)) {
                        field_2817 = var7;
                        field_2818 = var8;
                     }

                     if(var1.field_2686 * -80564939 == -1) {
                        if(var1.field_2684 * 74746585 != 12345678) {
                           class_70.method_977(var27, var29, var25, var26, var28, var24, var1.field_2684 * 74746585, var1.field_2685 * -1630451137, var1.field_2687 * -338901479);
                        }
                     } else if(!field_2813) {
                        if(var1.field_2683) {
                           class_70.method_983(var27, var29, var25, var26, var28, var24, var1.field_2684 * 74746585, var1.field_2685 * -1630451137, var1.field_2687 * -338901479, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field_2686 * -80564939);
                        } else {
                           class_70.method_983(var27, var29, var25, var26, var28, var24, var1.field_2684 * 74746585, var1.field_2685 * -1630451137, var1.field_2687 * -338901479, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field_2686 * -80564939);
                        }
                     } else {
                        var30 = class_70.field_555.method_31(var1.field_2686 * -80564939, -684089130);
                        class_70.method_977(var27, var29, var25, var26, var28, var24, method_4768(var30, var1.field_2684 * 74746585), method_4768(var30, var1.field_2685 * -1630451137), method_4768(var30, var1.field_2687 * -338901479));
                     }
                  }

                  if((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     class_70.field_536 = false;
                     if(var22 < 0 || var24 < 0 || var28 < 0 || var22 > class_70.field_537 || var24 > class_70.field_537 || var28 > class_70.field_537) {
                        class_70.field_536 = true;
                     }

                     if(field_2814 && method_4769(field_2815, field_2816, var23, var25, var29, var22, var24, var28)) {
                        field_2817 = var7;
                        field_2818 = var8;
                     }

                     if(var1.field_2686 * -80564939 == -1) {
                        if(var1.field_2682 * 1657490379 != 12345678) {
                           class_70.method_977(var23, var25, var29, var22, var24, var28, var1.field_2682 * 1657490379, var1.field_2687 * -338901479, var1.field_2685 * -1630451137);
                        }
                     } else if(!field_2813) {
                        class_70.method_983(var23, var25, var29, var22, var24, var28, var1.field_2682 * 1657490379, var1.field_2687 * -338901479, var1.field_2685 * -1630451137, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field_2686 * -80564939);
                     } else {
                        var30 = class_70.field_555.method_31(var1.field_2686 * -80564939, 1563453997);
                        class_70.method_977(var23, var25, var29, var22, var24, var28, method_4768(var30, var1.field_2682 * 1657490379), method_4768(var30, var1.field_2687 * -338901479), method_4768(var30, var1.field_2685 * -1630451137));
                     }
                  }

               }
            }
         }
      }
   }

   // $FF: renamed from: h (int, int, int) ho
   public class_265 method_4746(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 == null?null:var4.field_278;
   }

   // $FF: renamed from: <init> (int, int, int, int[][][]) void
   public class_251(int var1, int var2, int var3, int[][][] var4) {
      super();
      this.field_2788 = 0;
      this.field_2789 = 0;
      this.field_2807 = new class_261[5000];
      this.field_2839 = new int[][]{{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 0, 0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 0, 1, 0, 0, 0, 1}, {0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1}, {1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0, 1, 1, 0, 0}, {0, 0, 0, 0, 0, 0, 0, 0, 1, 0, 0, 0, 1, 1, 0, 0}, {1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 0, 0, 1, 1}, {1, 1, 1, 1, 1, 1, 0, 0, 1, 0, 0, 0, 1, 0, 0, 0}, {0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 0, 1, 1, 1}, {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 0, 1, 1, 1, 1}};
      this.field_2824 = new int[][]{{0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15}, {12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3}, {15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0}, {3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12}};
      this.field_2783 = var1;
      this.field_2784 = var2;
      this.field_2786 = var3;
      this.field_2787 = new class_41[var1][var2][var3];
      this.field_2791 = new int[var1][var2 + 1][var3 + 1];
      this.field_2826 = var4;
      this.method_4723();
   }

   // $FF: renamed from: ek (int[], int, int, int, int) void
   public static void method_4748(int[] var0, int var1, int var2, int var3, int var4) {
      field_2845 = 0;
      field_2846 = 0;
      field_2847 = var3;
      field_2848 = var4;
      field_2843 = var3 / 2;
      field_2844 = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][1565573066][2015582318][-214085810];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 854303331; var6 <= -530483937; var6 += 32) {
         for(var7 = 0; var7 < -2059261896; var7 += 64) {
            field_2808 = class_70.field_548[var6];
            field_2809 = class_70.field_559[var6];
            field_2810 = class_70.field_548[var7];
            field_2811 = class_70.field_559[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 581818113;

            for(int var10 = 1275698732; var10 < 26; ++var10) {
               var11 = -2101132261;

               while(var11 < 26) {
                  var12 = var10 * -1307953833;
                  int var13 = var11 * 128;
                  boolean var14 = false;
                  int var15 = -var1;

                  while(true) {
                     if(var15 <= var2) {
                        if(!method_4759(var12, var0[var8] + var15, var13)) {
                           var15 += 128;
                           continue;
                        }

                        var14 = true;
                     }

                     var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
                     ++var11;
                     break;
                  }
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < -339398507; ++var7) {
            for(var8 = -25; var8 < 25; ++var8) {
               var9 = -25;

               while(var9 < 25) {
                  boolean var16 = false;
                  var11 = -1;

                  label85:
                  while(true) {
                     if(var11 <= 1) {
                        var12 = -1;

                        while(true) {
                           if(var12 > 1) {
                              ++var11;
                              continue label85;
                           }

                           if(var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           if(var5[var6][(var7 + 1) % -226509376][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           if(var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           if(var5[var6 + 1][(var7 + 1) % 1957395241][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           ++var12;
                        }
                     }

                     field_2841[var6][var7][var8 + 25][var9 + 25] = var16;
                     ++var9;
                     break;
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: ae (int, int, int) long
   public long method_4749(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 != null && var4.field_277 != null?var4.field_277.field_3169 * 1374506562499121997L:0L;
   }

   // $FF: renamed from: ap (int, int, int) long
   public long method_4750(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 != null && var4.field_278 != null?var4.field_278.field_3035 * 3146556658035252985L:0L;
   }

   // $FF: renamed from: ft (int, int, int, int, int, int, int, int) boolean
   static boolean method_4751(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if(var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if(var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if(var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         return var8 == 0?(var9 != 0?(var9 < 0?var10 <= 0:var10 >= 0):true):(var8 < 0?var9 <= 0 && var10 <= 0:var9 >= 0 && var10 >= 0);
      }
   }

   // $FF: renamed from: al (int, int, int) long
   public long method_4752(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 != null && var4.field_279 != null?var4.field_279.field_2750 * 5096767537878498943L:0L;
   }

   // $FF: renamed from: ad (int, int, int, long) int
   public int method_4753(int var1, int var2, int var3, long var4) {
      class_41 var6 = this.field_2787[var1][var2][var3];
      if(var6 == null) {
         return -1;
      } else if(var6.field_277 != null && var6.field_277.field_3169 * 1374506562499121997L == var4) {
         return var6.field_277.field_3177 * -1331667357 & 255;
      } else if(var6.field_278 != null && var6.field_278.field_3035 * 3146556658035252985L == var4) {
         return var6.field_278.field_3045 * -740686461 & 255;
      } else if(var6.field_279 != null && var6.field_279.field_2750 * 5096767537878498943L == var4) {
         return var6.field_279.field_2748 * -383801797 & 255;
      } else {
         for(int var7 = 0; var7 < var6.field_282 * 1720897143; ++var7) {
            if(var6.field_286[var7].field_2917 * 1142152799211342585L == var4) {
               return var6.field_286[var7].field_2905 * -2139353773 & 255;
            }
         }

         return -1;
      }
   }

   // $FF: renamed from: ai (int, int, int) void
   public void method_4754(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_2783; ++var4) {
         for(int var5 = 0; var5 < this.field_2784; ++var5) {
            for(int var6 = 0; var6 < this.field_2786; ++var6) {
               class_41 var7 = this.field_2787[var4][var5][var6];
               if(var7 != null) {
                  class_269 var8 = var7.field_277;
                  class_93 var10;
                  if(var8 != null && var8.field_3178 instanceof class_93) {
                     class_93 var9 = (class_93)var8.field_3178;
                     this.method_4756(var9, var4, var5, var6, 1, 1);
                     if(var8.field_3175 instanceof class_93) {
                        var10 = (class_93)var8.field_3175;
                        this.method_4756(var10, var4, var5, var6, 1, 1);
                        class_93.method_1710(var9, var10, 0, 0, 0, false);
                        var8.field_3175 = var10.method_1711(var10.field_1009, var10.field_1010, var1, var2, var3);
                     }

                     var8.field_3178 = var9.method_1711(var9.field_1009, var9.field_1010, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.field_282 * 1720897143; ++var12) {
                     class_261 var14 = var7.field_286[var12];
                     if(var14 != null && var14.field_2915 instanceof class_93) {
                        class_93 var11 = (class_93)var14.field_2915;
                        this.method_4756(var11, var4, var5, var6, var14.field_2912 * -2078907755 - var14.field_2909 * 1674574095 + 1, var14.field_2914 * -129893675 - var14.field_2913 * 1202737381 + 1);
                        var14.field_2915 = var11.method_1711(var11.field_1009, var11.field_1010, var1, var2, var3);
                     }
                  }

                  class_248 var13 = var7.field_279;
                  if(var13 != null && var13.field_2749 instanceof class_93) {
                     var10 = (class_93)var13.field_2749;
                     this.method_4876(var10, var4, var5, var6);
                     var13.field_2749 = var10.method_1711(var10.field_1009, var10.field_1010, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: am (int, int, int, boolean) void
   public void method_4755(int var1, int var2, int var3, boolean var4) {
      if(!method_4824() || var4) {
         field_2814 = true;
         field_2782 = var4;
         field_2800 = var1;
         field_2815 = var2;
         field_2816 = var3;
         field_2817 = -1;
         field_2818 = -1;
      }
   }

   // $FF: renamed from: ag (gm, int, int, int, int, int) void
   void method_4756(class_93 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if(var12 != this.field_2783) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if(var13 >= 0 && var13 < this.field_2784) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if(var14 >= 0 && var14 < this.field_2786 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        class_41 var15 = this.field_2787[var12][var13][var14];
                        if(var15 != null) {
                           int var16 = (this.field_2826[var12][var13][var14] + this.field_2826[var12][var13 + 1][var14] + this.field_2826[var12][var13][var14 + 1] + this.field_2826[var12][var13 + 1][var14 + 1]) / 4 - (this.field_2826[var2][var3][var4] + this.field_2826[var2][var3 + 1][var4] + this.field_2826[var2][var3][var4 + 1] + this.field_2826[var2][var3 + 1][var4 + 1]) / 4;
                           class_269 var17 = var15.field_277;
                           if(var17 != null) {
                              class_93 var18;
                              if(var17.field_3178 instanceof class_93) {
                                 var18 = (class_93)var17.field_3178;
                                 class_93.method_1710(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if(var17.field_3175 instanceof class_93) {
                                 var18 = (class_93)var17.field_3175;
                                 class_93.method_1710(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.field_282 * 1720897143; ++var23) {
                              class_261 var19 = var15.field_286[var23];
                              if(var19 != null && var19.field_2915 instanceof class_93) {
                                 class_93 var20 = (class_93)var19.field_2915;
                                 int var21 = var19.field_2912 * -2078907755 - var19.field_2909 * 1674574095 + 1;
                                 int var22 = var19.field_2914 * -129893675 - var19.field_2913 * 1202737381 + 1;
                                 class_93.method_1710(var1, var20, (var19.field_2909 * 1674574095 - var3) * 128 + (var21 - var5) * 64, var16, (var19.field_2913 * 1202737381 - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   // $FF: renamed from: bj (int, int, int, int, gl, long, int) void
   public void method_4757(int var1, int var2, int var3, int var4, class_91 var5, long var6, int var8) {
      if(var5 != null) {
         class_248 var10000 = new class_248();
         class_248 var9 = var10000;
         var9.field_2749 = var5;
         var9.field_2747 = var2 * 1874556544 + -1210205376;
         var9.field_2746 = var3 * -1869772160 + 1212597568;
         var9.field_2753 = var4 * 1219668101;
         var9.field_2750 = var6 * 840149604356866431L;
         var9.field_2748 = var8 * -1766964493;
         if(this.field_2787[var1][var2][var3] == null) {
            class_41[] var10 = this.field_2787[var1][var2];
            class_41 var10002 = new class_41(var1, var2, var3);
            var10[var3] = var10002;
         }

         this.field_2787[var1][var2][var3].field_279 = var9;
      }
   }

   // $FF: renamed from: eq (gp, int, int, int, int, int, int) void
   void method_4758(class_249 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.field_2764.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field_2764[var9] - field_2805;
         var11 = var1.field_2763[var9] - field_2790;
         var12 = var1.field_2762[var9] - field_2836;
         var13 = var12 * var4 + var10 * var5 >> 16;
         var12 = var12 * var5 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var11 * var3 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var3 >> 16;
         if(var12 < -888351941) {
            return;
         }

         if(var1.field_2754 != null) {
            class_249.field_2771[var9] = var10;
            class_249.field_2772[var9] = var13;
            class_249.field_2773[var9] = var12;
         }

         class_249.field_2756[var9] = class_70.field_545 + var10 * class_70.field_544 / var12;
         class_249.field_2770[var9] = class_70.field_538 + var13 * class_70.field_544 / var12;
      }

      class_70.field_554 = 0;
      var8 = var1.field_2760.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field_2760[var9];
         var11 = var1.field_2761[var9];
         var12 = var1.field_2769[var9];
         var13 = class_249.field_2756[var10];
         int var14 = class_249.field_2756[var11];
         int var15 = class_249.field_2756[var12];
         int var16 = class_249.field_2770[var10];
         int var17 = class_249.field_2770[var11];
         int var18 = class_249.field_2770[var12];
         if((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            class_70.field_536 = false;
            if(var13 < 0 || var14 < 0 || var15 < 0 || var13 > class_70.field_537 || var14 > class_70.field_537 || var15 > class_70.field_537) {
               class_70.field_536 = true;
            }

            if(field_2814 && method_4769(field_2815, field_2816, var16, var17, var18, var13, var14, var15)) {
               field_2817 = var6;
               field_2818 = var7;
            }

            if(var1.field_2754 != null && var1.field_2754[var9] != -1) {
               if(!field_2813) {
                  if(var1.field_2765) {
                     class_70.method_983(var16, var17, var18, var13, var14, var15, var1.field_2757[var9], var1.field_2758[var9], var1.field_2759[var9], class_249.field_2771[0], class_249.field_2771[1], class_249.field_2771[3], class_249.field_2772[0], class_249.field_2772[1], class_249.field_2772[3], class_249.field_2773[0], class_249.field_2773[1], class_249.field_2773[3], var1.field_2754[var9]);
                  } else {
                     class_70.method_983(var16, var17, var18, var13, var14, var15, var1.field_2757[var9], var1.field_2758[var9], var1.field_2759[var9], class_249.field_2771[var10], class_249.field_2771[var11], class_249.field_2771[var12], class_249.field_2772[var10], class_249.field_2772[var11], class_249.field_2772[var12], class_249.field_2773[var10], class_249.field_2773[var11], class_249.field_2773[var12], var1.field_2754[var9]);
                  }
               } else {
                  int var19 = class_70.field_555.method_31(var1.field_2754[var9], -570047477);
                  class_70.method_977(var16, var17, var18, var13, var14, var15, method_4768(var19, var1.field_2757[var9]), method_4768(var19, var1.field_2758[var9]), method_4768(var19, var1.field_2759[var9]));
               }
            } else if(var1.field_2757[var9] != 593601591) {
               class_70.method_977(var16, var17, var18, var13, var14, var15, var1.field_2757[var9], var1.field_2758[var9], var1.field_2759[var9]);
            }
         }
      }

   }

   // $FF: renamed from: aj (int, int, int) boolean
   static boolean method_4759(int var0, int var1, int var2) {
      int var3 = var2 * field_2810 + var0 * field_2811 >> 16;
      int var4 = var2 * field_2811 - var0 * field_2810 >> 16;
      int var5 = var1 * field_2808 + var4 * field_2809 >> 16;
      int var6 = var1 * field_2809 - var4 * field_2808 >> 16;
      if(var5 >= 50 && var5 <= 3500) {
         int var7 = field_2843 + var3 * 128 / var5;
         int var8 = field_2844 + var6 * 128 / var5;
         return var7 >= field_2845 && var7 <= field_2847 && var8 >= field_2846 && var8 <= field_2848;
      } else {
         return false;
      }
   }

   // $FF: renamed from: cp () void
   public void method_4760() {
      for(int var1 = 0; var1 < this.field_2789; ++var1) {
         class_261 var2 = this.field_2807[var1];
         this.method_4738(var2);
         this.field_2807[var1] = null;
      }

      this.field_2789 = 0;
   }

   // $FF: renamed from: dh (gm, int, int, int) void
   void method_4761(class_93 var1, int var2, int var3, int var4) {
      class_41 var5;
      class_93 var6;
      if(var3 < this.field_2784) {
         var5 = this.field_2787[var2][var3 + 1][var4];
         if(var5 != null && var5.field_279 != null && var5.field_279.field_2749 instanceof class_93) {
            var6 = (class_93)var5.field_279.field_2749;
            class_93.method_1710(var1, var6, 128, 0, 0, true);
         }
      }

      if(var4 < this.field_2784) {
         var5 = this.field_2787[var2][var3][var4 + 1];
         if(var5 != null && var5.field_279 != null && var5.field_279.field_2749 instanceof class_93) {
            var6 = (class_93)var5.field_279.field_2749;
            class_93.method_1710(var1, var6, 0, 0, 128, true);
         }
      }

      if(var3 < this.field_2784 && var4 < this.field_2786) {
         var5 = this.field_2787[var2][var3 + 1][var4 + 1];
         if(var5 != null && var5.field_279 != null && var5.field_279.field_2749 instanceof class_93) {
            var6 = (class_93)var5.field_279.field_2749;
            class_93.method_1710(var1, var6, 128, 0, -948273935, true);
         }
      }

      if(var3 < this.field_2784 && var4 > 0) {
         var5 = this.field_2787[var2][var3 + 1][var4 - 1];
         if(var5 != null && var5.field_279 != null && var5.field_279.field_2749 instanceof class_93) {
            var6 = (class_93)var5.field_279.field_2749;
            class_93.method_1710(var1, var6, 128, 0, 1474920347, true);
         }
      }

   }

   // $FF: renamed from: bv (int) void
   public void method_4762(int var1) {
      this.field_2788 = var1;

      for(int var2 = 0; var2 < this.field_2784; ++var2) {
         for(int var3 = 0; var3 < this.field_2786; ++var3) {
            if(this.field_2787[var1][var2][var3] == null) {
               class_41[] var10000 = this.field_2787[var1][var2];
               class_41 var10002 = new class_41(var1, var2, var3);
               var10000[var3] = var10002;
            }
         }
      }

   }

   // $FF: renamed from: dp (int[], int, int, int, int, int) void
   public void method_4763(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      class_41 var7 = this.field_2787[var4][var5][var6];
      if(var7 != null) {
         class_241 var8 = var7.field_275;
         int var10;
         if(var8 != null) {
            int var18 = var8.field_2688 * 1334428134;
            if(var18 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }

            }
         } else {
            class_249 var9 = var7.field_289;
            if(var9 != null) {
               var10 = var9.field_2755;
               int var11 = var9.field_2766;
               int var12 = var9.field_2767;
               int var13 = var9.field_2768;
               int[] var14 = this.field_2839[var10];
               int[] var15 = this.field_2824[var11];
               int var16 = 0;
               int var17;
               if(var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0?var12:var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if(var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   // $FF: renamed from: bn (int, int, int, int, gl, long, gl, gl) void
   public void method_4764(int var1, int var2, int var3, int var4, class_91 var5, long var6, class_91 var8, class_91 var9) {
      class_253 var10000 = new class_253();
      class_253 var10 = var10000;
      var10.field_2863 = var5;
      var10.field_2861 = var2 * -1266586496 + -633293248;
      var10.field_2862 = var3 * -221423422 + 521451968;
      var10.field_2867 = var4 * 25355524;
      var10.field_2866 = var6 * 2586414638863188585L;
      var10.field_2864 = var8;
      var10.field_2865 = var9;
      int var11 = 0;
      class_41 var12 = this.field_2787[var1][var2][var3];
      if(var12 != null) {
         for(int var13 = 0; var13 < var12.field_282 * 1422606727; ++var13) {
            if((var12.field_286[var13].field_2905 * -1430840850 & 256) == 938214029 && var12.field_286[var13].field_2915 instanceof class_92) {
               class_92 var14 = (class_92)var12.field_286[var13].field_2915;
               var14.method_1621();
               if(var14.field_911 * 81474983 > var11) {
                  var11 = var14.field_911 * 267422413;
               }
            }
         }
      }

      var10.field_2860 = var11 * -1779268677;
      if(this.field_2787[var1][var2][var3] == null) {
         class_41[] var15 = this.field_2787[var1][var2];
         class_41 var10002 = new class_41(var1, var2, var3);
         var15[var3] = var10002;
      }

      this.field_2787[var1][var2][var3].field_281 = var10;
   }

   // $FF: renamed from: ah (gx, boolean) void
   void method_4765(class_41 var1, boolean var2) {
      field_2827.method_5939(var1);

      while(true) {
         class_41 var3 = (class_41)field_2827.method_5974();
         if(var3 == null) {
            return;
         }

         if(var3.field_287) {
            int var4 = var3.field_272 * -509167035;
            int var5 = var3.field_273 * 950473561;
            int var6 = var3.field_274 * 952681323;
            int var7 = var3.field_276 * 1257822241;
            class_41[][] var8 = this.field_2787[var6];
            class_41 var9;
            class_269 var10;
            int var11;
            class_261 var12;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var21;
            boolean var22;
            class_41 var33;
            if(var3.field_293) {
               if(var2) {
                  if(var6 > 0) {
                     var9 = this.field_2787[var6 - 1][var4][var5];
                     if(var9 != null && var9.field_287) {
                        continue;
                     }
                  }

                  if(var4 <= field_2785 && var4 > field_2799) {
                     var9 = var8[var4 - 1][var5];
                     if(var9 != null && var9.field_287 && (var9.field_293 || (var3.field_284 * 1099123981 & 1) == 0)) {
                        continue;
                     }
                  }

                  if(var4 >= field_2785 && var4 < field_2806 - 1) {
                     var9 = var8[var4 + 1][var5];
                     if(var9 != null && var9.field_287 && (var9.field_293 || (var3.field_284 * 1099123981 & 4) == 0)) {
                        continue;
                     }
                  }

                  if(var5 <= field_2804 && var5 > field_2801) {
                     var9 = var8[var4][var5 - 1];
                     if(var9 != null && var9.field_287 && (var9.field_293 || (var3.field_284 * 1099123981 & 8) == 0)) {
                        continue;
                     }
                  }

                  if(var5 >= field_2804 && var5 < field_2802 - 1) {
                     var9 = var8[var4][var5 + 1];
                     if(var9 != null && var9.field_287 && (var9.field_293 || (var3.field_284 * 1099123981 & 2) == 0)) {
                        continue;
                     }
                  }
               } else {
                  var2 = true;
               }

               var3.field_293 = false;
               if(var3.field_292 != null) {
                  var9 = var3.field_292;
                  if(var9.field_275 != null) {
                     if(!this.method_4771(0, var4, var5)) {
                        this.method_4745(var9.field_275, 0, field_2808, field_2809, field_2810, field_2811, var4, var5);
                     }
                  } else if(var9.field_289 != null && !this.method_4771(0, var4, var5)) {
                     this.method_4856(var9.field_289, field_2808, field_2809, field_2810, field_2811, var4, var5);
                  }

                  var10 = var9.field_277;
                  if(var10 != null) {
                     var10.field_3178.method_1607(0, field_2808, field_2809, field_2810, field_2811, var10.field_3174 * 662711357 - field_2805, var10.field_3170 * -727989945 - field_2790, var10.field_3176 * -1127510877 - field_2836, var10.field_3169 * 1374506562499121997L);
                  }

                  for(var11 = 0; var11 < var9.field_282 * 1720897143; ++var11) {
                     var12 = var9.field_286[var11];
                     if(var12 != null) {
                        var12.field_2915.method_1607(var12.field_2911 * -202388443, field_2808, field_2809, field_2810, field_2811, var12.field_2910 * 1140262961 - field_2805, var12.field_2906 * -1917415421 - field_2790, var12.field_2908 * 364858457 - field_2836, var12.field_2917 * 1142152799211342585L);
                     }
                  }
               }

               var22 = false;
               if(var3.field_275 != null) {
                  if(!this.method_4771(var7, var4, var5)) {
                     var22 = true;
                     if(var3.field_275.field_2684 * 74746585 != 12345678 || field_2814 && var6 <= field_2800) {
                        this.method_4745(var3.field_275, var7, field_2808, field_2809, field_2810, field_2811, var4, var5);
                     }
                  }
               } else if(var3.field_289 != null && !this.method_4771(var7, var4, var5)) {
                  var22 = true;
                  this.method_4856(var3.field_289, field_2808, field_2809, field_2810, field_2811, var4, var5);
               }

               var21 = 0;
               var11 = 0;
               class_269 var23 = var3.field_277;
               class_265 var13 = var3.field_278;
               if(var23 != null || var13 != null) {
                  if(field_2785 == var4) {
                     ++var21;
                  } else if(field_2785 < var4) {
                     var21 += 2;
                  }

                  if(field_2804 == var5) {
                     var21 += 3;
                  } else if(field_2804 > var5) {
                     var21 += 6;
                  }

                  var11 = field_2828[var21];
                  var3.field_271 = field_2830[var21] * 495564059;
               }

               if(var23 != null) {
                  if((var23.field_3172 * 643320237 & field_2842[var21]) != 0) {
                     if(var23.field_3172 * 643320237 == 16) {
                        var3.field_291 = -1352508415;
                        var3.field_290 = field_2831[var21] * -1568837483;
                        var3.field_280 = -2035736443 - var3.field_290 * 1996560059;
                     } else if(var23.field_3172 * 643320237 == 32) {
                        var3.field_291 = 1589950466;
                        var3.field_290 = field_2832[var21] * -1568837483;
                        var3.field_280 = 223494410 - var3.field_290 * 1996560059;
                     } else if(var23.field_3172 * 643320237 == 64) {
                        var3.field_291 = -1115066364;
                        var3.field_290 = field_2795[var21] * -1568837483;
                        var3.field_280 = 446988820 - var3.field_290 * 1996560059;
                     } else {
                        var3.field_291 = 237442051;
                        var3.field_290 = field_2834[var21] * -1568837483;
                        var3.field_280 = -1812242033 - var3.field_290 * 1996560059;
                     }
                  } else {
                     var3.field_291 = 0;
                  }

                  if((var23.field_3172 * 643320237 & var11) != 0 && !this.method_4772(var7, var4, var5, var23.field_3172 * 643320237)) {
                     var23.field_3178.method_1607(0, field_2808, field_2809, field_2810, field_2811, var23.field_3174 * 662711357 - field_2805, var23.field_3170 * -727989945 - field_2790, var23.field_3176 * -1127510877 - field_2836, var23.field_3169 * 1374506562499121997L);
                  }

                  if((var23.field_3173 * 1924609359 & var11) != 0 && !this.method_4772(var7, var4, var5, var23.field_3173 * 1924609359)) {
                     var23.field_3175.method_1607(0, field_2808, field_2809, field_2810, field_2811, var23.field_3174 * 662711357 - field_2805, var23.field_3170 * -727989945 - field_2790, var23.field_3176 * -1127510877 - field_2836, var23.field_3169 * 1374506562499121997L);
                  }
               }

               if(var13 != null && !this.method_4773(var7, var4, var5, var13.field_3039.field_911 * 267422413)) {
                  if((var13.field_3038 * 1760283661 & var11) != 0) {
                     var13.field_3039.method_1607(0, field_2808, field_2809, field_2810, field_2811, var13.field_3036 * 1511932377 - field_2805 + var13.field_3040 * -2026318183, var13.field_3037 * -1988235731 - field_2790, var13.field_3042 * 750074813 - field_2836 + var13.field_3041 * 1292762417, var13.field_3035 * 3146556658035252985L);
                  } else if(var13.field_3038 * 1760283661 == 256) {
                     var14 = var13.field_3036 * 1511932377 - field_2805;
                     var15 = var13.field_3037 * -1988235731 - field_2790;
                     var16 = var13.field_3042 * 750074813 - field_2836;
                     var17 = var13.field_3044 * 1111812521;
                     if(var17 != 1 && var17 != 2) {
                        var18 = var14;
                     } else {
                        var18 = -var14;
                     }

                     int var19;
                     if(var17 != 2 && var17 != 3) {
                        var19 = var16;
                     } else {
                        var19 = -var16;
                     }

                     if(var19 < var18) {
                        var13.field_3039.method_1607(0, field_2808, field_2809, field_2810, field_2811, var14 + var13.field_3040 * -2026318183, var15, var16 + var13.field_3041 * 1292762417, var13.field_3035 * 3146556658035252985L);
                     } else if(var13.field_3043 != null) {
                        var13.field_3043.method_1607(0, field_2808, field_2809, field_2810, field_2811, var14, var15, var16, var13.field_3035 * 3146556658035252985L);
                     }
                  }
               }

               if(var22) {
                  class_248 var27 = var3.field_279;
                  if(var27 != null) {
                     var27.field_2749.method_1607(0, field_2808, field_2809, field_2810, field_2811, var27.field_2747 * -1864149275 - field_2805, var27.field_2753 * 859770957 - field_2790, var27.field_2746 * -1474470851 - field_2836, var27.field_2750 * 5096767537878498943L);
                  }

                  class_253 var31 = var3.field_281;
                  if(var31 != null && var31.field_2860 * 1688818251 == 0) {
                     if(var31.field_2864 != null) {
                        var31.field_2864.method_1607(0, field_2808, field_2809, field_2810, field_2811, var31.field_2861 * -840082071 - field_2805, var31.field_2867 * 1950267115 - field_2790, var31.field_2862 * -1958043433 - field_2836, var31.field_2866 * 8707211480451132889L);
                     }

                     if(var31.field_2865 != null) {
                        var31.field_2865.method_1607(0, field_2808, field_2809, field_2810, field_2811, var31.field_2861 * -840082071 - field_2805, var31.field_2867 * 1950267115 - field_2790, var31.field_2862 * -1958043433 - field_2836, var31.field_2866 * 8707211480451132889L);
                     }

                     if(var31.field_2863 != null) {
                        var31.field_2863.method_1607(0, field_2808, field_2809, field_2810, field_2811, var31.field_2861 * -840082071 - field_2805, var31.field_2867 * 1950267115 - field_2790, var31.field_2862 * -1958043433 - field_2836, var31.field_2866 * 8707211480451132889L);
                     }
                  }
               }

               var14 = var3.field_284 * 1099123981;
               if(var14 != 0) {
                  if(var4 < field_2785 && (var14 & 4) != 0) {
                     var33 = var8[var4 + 1][var5];
                     if(var33 != null && var33.field_287) {
                        field_2827.method_5939(var33);
                     }
                  }

                  if(var5 < field_2804 && (var14 & 2) != 0) {
                     var33 = var8[var4][var5 + 1];
                     if(var33 != null && var33.field_287) {
                        field_2827.method_5939(var33);
                     }
                  }

                  if(var4 > field_2785 && (var14 & 1) != 0) {
                     var33 = var8[var4 - 1][var5];
                     if(var33 != null && var33.field_287) {
                        field_2827.method_5939(var33);
                     }
                  }

                  if(var5 > field_2804 && (var14 & 8) != 0) {
                     var33 = var8[var4][var5 - 1];
                     if(var33 != null && var33.field_287) {
                        field_2827.method_5939(var33);
                     }
                  }
               }
            }

            if(var3.field_291 * 1695083523 != 0) {
               var22 = true;

               for(var21 = 0; var21 < var3.field_282 * 1720897143; ++var21) {
                  if(var3.field_286[var21].field_2907 * -137941941 != field_2798 && (var3.field_283[var21] & var3.field_291 * 1695083523) == var3.field_290 * 1060231869) {
                     var22 = false;
                     break;
                  }
               }

               if(var22) {
                  var10 = var3.field_277;
                  if(!this.method_4772(var7, var4, var5, var10.field_3172 * 643320237)) {
                     var10.field_3178.method_1607(0, field_2808, field_2809, field_2810, field_2811, var10.field_3174 * 662711357 - field_2805, var10.field_3170 * -727989945 - field_2790, var10.field_3176 * -1127510877 - field_2836, var10.field_3169 * 1374506562499121997L);
                  }

                  var3.field_291 = 0;
               }
            }

            int var24;
            int var26;
            if(var3.field_288) {
               try {
                  int var25 = var3.field_282 * 1720897143;
                  var3.field_288 = false;
                  var21 = 0;

                  label544:
                  for(var11 = 0; var11 < var25; ++var11) {
                     var12 = var3.field_286[var11];
                     if(var12.field_2907 * -137941941 != field_2798) {
                        for(var26 = var12.field_2909 * 1674574095; var26 <= var12.field_2912 * -2078907755; ++var26) {
                           for(var14 = var12.field_2913 * 1202737381; var14 <= var12.field_2914 * -129893675; ++var14) {
                              var33 = var8[var26][var14];
                              if(var33.field_293) {
                                 var3.field_288 = true;
                                 continue label544;
                              }

                              if(var33.field_291 * 1695083523 != 0) {
                                 var16 = 0;
                                 if(var26 > var12.field_2909 * 1674574095) {
                                    ++var16;
                                 }

                                 if(var26 < var12.field_2912 * -2078907755) {
                                    var16 += 4;
                                 }

                                 if(var14 > var12.field_2913 * 1202737381) {
                                    var16 += 8;
                                 }

                                 if(var14 < var12.field_2914 * -129893675) {
                                    var16 += 2;
                                 }

                                 if((var16 & var33.field_291 * 1695083523) == var3.field_280 * -726038297) {
                                    var3.field_288 = true;
                                    continue label544;
                                 }
                              }
                           }
                        }

                        field_2812[var21++] = var12;
                        var26 = field_2785 - var12.field_2909 * 1674574095;
                        var14 = var12.field_2912 * -2078907755 - field_2785;
                        if(var14 > var26) {
                           var26 = var14;
                        }

                        var15 = field_2804 - var12.field_2913 * 1202737381;
                        var16 = var12.field_2914 * -129893675 - field_2804;
                        if(var16 > var15) {
                           var12.field_2916 = (var26 + var16) * 1212965461;
                        } else {
                           var12.field_2916 = (var26 + var15) * 1212965461;
                        }
                     }
                  }

                  while(var21 > 0) {
                     var11 = -50;
                     var24 = -1;

                     for(var26 = 0; var26 < var21; ++var26) {
                        class_261 var34 = field_2812[var26];
                        if(var34.field_2907 * -137941941 != field_2798) {
                           if(var34.field_2916 * -327316739 > var11) {
                              var11 = var34.field_2916 * -327316739;
                              var24 = var26;
                           } else if(var34.field_2916 * -327316739 == var11) {
                              var15 = var34.field_2910 * 1140262961 - field_2805;
                              var16 = var34.field_2908 * 364858457 - field_2836;
                              var17 = field_2812[var24].field_2910 * 1140262961 - field_2805;
                              var18 = field_2812[var24].field_2908 * 364858457 - field_2836;
                              if(var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                 var24 = var26;
                              }
                           }
                        }
                     }

                     if(var24 == -1) {
                        break;
                     }

                     class_261 var35 = field_2812[var24];
                     var35.field_2907 = field_2798 * 230964579;
                     if(!this.method_4774(var7, var35.field_2909 * 1674574095, var35.field_2912 * -2078907755, var35.field_2913 * 1202737381, var35.field_2914 * -129893675, var35.field_2915.field_911 * 267422413)) {
                        var35.field_2915.method_1607(var35.field_2911 * -202388443, field_2808, field_2809, field_2810, field_2811, var35.field_2910 * 1140262961 - field_2805, var35.field_2906 * -1917415421 - field_2790, var35.field_2908 * 364858457 - field_2836, var35.field_2917 * 1142152799211342585L);
                     }

                     for(var14 = var35.field_2909 * 1674574095; var14 <= var35.field_2912 * -2078907755; ++var14) {
                        for(var15 = var35.field_2913 * 1202737381; var15 <= var35.field_2914 * -129893675; ++var15) {
                           class_41 var36 = var8[var14][var15];
                           if(var36.field_291 * 1695083523 != 0) {
                              field_2827.method_5939(var36);
                           } else if((var14 != var4 || var15 != var5) && var36.field_287) {
                              field_2827.method_5939(var36);
                           }
                        }
                     }
                  }

                  if(var3.field_288) {
                     continue;
                  }
               } catch (Exception var20) {
                  var3.field_288 = false;
               }
            }

            if(var3.field_287 && var3.field_291 * 1695083523 == 0) {
               if(var4 <= field_2785 && var4 > field_2799) {
                  var9 = var8[var4 - 1][var5];
                  if(var9 != null && var9.field_287) {
                     continue;
                  }
               }

               if(var4 >= field_2785 && var4 < field_2806 - 1) {
                  var9 = var8[var4 + 1][var5];
                  if(var9 != null && var9.field_287) {
                     continue;
                  }
               }

               if(var5 <= field_2804 && var5 > field_2801) {
                  var9 = var8[var4][var5 - 1];
                  if(var9 != null && var9.field_287) {
                     continue;
                  }
               }

               if(var5 >= field_2804 && var5 < field_2802 - 1) {
                  var9 = var8[var4][var5 + 1];
                  if(var9 != null && var9.field_287) {
                     continue;
                  }
               }

               var3.field_287 = false;
               --field_2796;
               class_253 var29 = var3.field_281;
               if(var29 != null && var29.field_2860 * 1688818251 != 0) {
                  if(var29.field_2864 != null) {
                     var29.field_2864.method_1607(0, field_2808, field_2809, field_2810, field_2811, var29.field_2861 * -840082071 - field_2805, var29.field_2867 * 1950267115 - field_2790 - var29.field_2860 * 1688818251, var29.field_2862 * -1958043433 - field_2836, var29.field_2866 * 8707211480451132889L);
                  }

                  if(var29.field_2865 != null) {
                     var29.field_2865.method_1607(0, field_2808, field_2809, field_2810, field_2811, var29.field_2861 * -840082071 - field_2805, var29.field_2867 * 1950267115 - field_2790 - var29.field_2860 * 1688818251, var29.field_2862 * -1958043433 - field_2836, var29.field_2866 * 8707211480451132889L);
                  }

                  if(var29.field_2863 != null) {
                     var29.field_2863.method_1607(0, field_2808, field_2809, field_2810, field_2811, var29.field_2861 * -840082071 - field_2805, var29.field_2867 * 1950267115 - field_2790 - var29.field_2860 * 1688818251, var29.field_2862 * -1958043433 - field_2836, var29.field_2866 * 8707211480451132889L);
                  }
               }

               if(var3.field_271 * 1501732115 != 0) {
                  class_265 var30 = var3.field_278;
                  if(var30 != null && !this.method_4773(var7, var4, var5, var30.field_3039.field_911 * 267422413)) {
                     if((var30.field_3038 * 1760283661 & var3.field_271 * 1501732115) != 0) {
                        var30.field_3039.method_1607(0, field_2808, field_2809, field_2810, field_2811, var30.field_3036 * 1511932377 - field_2805 + var30.field_3040 * -2026318183, var30.field_3037 * -1988235731 - field_2790, var30.field_3042 * 750074813 - field_2836 + var30.field_3041 * 1292762417, var30.field_3035 * 3146556658035252985L);
                     } else if(var30.field_3038 * 1760283661 == 256) {
                        var11 = var30.field_3036 * 1511932377 - field_2805;
                        var24 = var30.field_3037 * -1988235731 - field_2790;
                        var26 = var30.field_3042 * 750074813 - field_2836;
                        var14 = var30.field_3044 * 1111812521;
                        if(var14 != 1 && var14 != 2) {
                           var15 = var11;
                        } else {
                           var15 = -var11;
                        }

                        if(var14 != 2 && var14 != 3) {
                           var16 = var26;
                        } else {
                           var16 = -var26;
                        }

                        if(var16 >= var15) {
                           var30.field_3039.method_1607(0, field_2808, field_2809, field_2810, field_2811, var11 + var30.field_3040 * -2026318183, var24, var26 + var30.field_3041 * 1292762417, var30.field_3035 * 3146556658035252985L);
                        } else if(var30.field_3043 != null) {
                           var30.field_3043.method_1607(0, field_2808, field_2809, field_2810, field_2811, var11, var24, var26, var30.field_3035 * 3146556658035252985L);
                        }
                     }
                  }

                  class_269 var28 = var3.field_277;
                  if(var28 != null) {
                     if((var28.field_3173 * 1924609359 & var3.field_271 * 1501732115) != 0 && !this.method_4772(var7, var4, var5, var28.field_3173 * 1924609359)) {
                        var28.field_3175.method_1607(0, field_2808, field_2809, field_2810, field_2811, var28.field_3174 * 662711357 - field_2805, var28.field_3170 * -727989945 - field_2790, var28.field_3176 * -1127510877 - field_2836, var28.field_3169 * 1374506562499121997L);
                     }

                     if((var28.field_3172 * 643320237 & var3.field_271 * 1501732115) != 0 && !this.method_4772(var7, var4, var5, var28.field_3172 * 643320237)) {
                        var28.field_3178.method_1607(0, field_2808, field_2809, field_2810, field_2811, var28.field_3174 * 662711357 - field_2805, var28.field_3170 * -727989945 - field_2790, var28.field_3176 * -1127510877 - field_2836, var28.field_3169 * 1374506562499121997L);
                     }
                  }
               }

               class_41 var32;
               if(var6 < this.field_2783 - 1) {
                  var32 = this.field_2787[var6 + 1][var4][var5];
                  if(var32 != null && var32.field_287) {
                     field_2827.method_5939(var32);
                  }
               }

               if(var4 < field_2785) {
                  var32 = var8[var4 + 1][var5];
                  if(var32 != null && var32.field_287) {
                     field_2827.method_5939(var32);
                  }
               }

               if(var5 < field_2804) {
                  var32 = var8[var4][var5 + 1];
                  if(var32 != null && var32.field_287) {
                     field_2827.method_5939(var32);
                  }
               }

               if(var4 > field_2785) {
                  var32 = var8[var4 - 1][var5];
                  if(var32 != null && var32.field_287) {
                     field_2827.method_5939(var32);
                  }
               }

               if(var5 > field_2804) {
                  var32 = var8[var4][var5 - 1];
                  if(var32 != null && var32.field_287) {
                     field_2827.method_5939(var32);
                  }
               }
            }
         }
      }
   }

   // $FF: renamed from: a (int, int, int, int) void
   public void method_4766(int var1, int var2, int var3, int var4) {
      class_41 var5 = this.field_2787[var1][var2][var3];
      if(var5 != null) {
         class_265 var6 = var5.field_278;
         if(var6 != null) {
            var6.field_3040 = var6.field_3040 * -2026318183 * var4 / 16 * 2120424873;
            var6.field_3041 = var6.field_3041 * 1292762417 * var4 / 16 * -883278895;
         }
      }
   }

   // $FF: renamed from: ep (int, int, int, boolean) void
   public void method_4767(int var1, int var2, int var3, boolean var4) {
      if(!method_4824() || var4) {
         field_2814 = true;
         field_2782 = var4;
         field_2800 = var1;
         field_2815 = var2;
         field_2816 = var3;
         field_2817 = -1;
         field_2818 = -1;
      }
   }

   // $FF: renamed from: aw (int, int) int
   static final int method_4768(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   // $FF: renamed from: af (int, int, int, int, int, int, int, int) boolean
   static boolean method_4769(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if(var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if(var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if(var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         return var8 == 0?(var9 != 0?(var9 < 0?var10 <= 0:var10 >= 0):true):(var8 < 0?var9 <= 0 && var10 <= 0:var9 >= 0 && var10 >= 0);
      }
   }

   // $FF: renamed from: ak () void
   void method_4770() {
      int var1 = field_2823[field_2797];
      class_247[] var2 = field_2803[field_2797];
      field_2825 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         class_247 var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         boolean var8;
         int var9;
         if(var4.field_2731 * -713034583 == 1) {
            var5 = var4.field_2734 * -1269044325 - field_2785 + 25;
            if(var5 >= 0 && var5 <= 50) {
               var6 = var4.field_2729 * 725968227 - field_2804 + 25;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field_2736 * 1353247321 - field_2804 + 25;
               if(var7 > 50) {
                  var7 = 50;
               }

               var8 = false;

               while(var6 <= var7) {
                  if(field_2840[var5][var6++]) {
                     var8 = true;
                     break;
                  }
               }

               if(var8) {
                  var9 = field_2805 - var4.field_2732 * 818345769;
                  if(var9 > 32) {
                     var4.field_2738 = 861516291;
                  } else {
                     if(var9 >= -32) {
                        continue;
                     }

                     var4.field_2738 = 1723032582;
                     var9 = -var9;
                  }

                  var4.field_2740 = (var4.field_2741 * -621751483 - field_2836 << 8) / var9 * 230234799;
                  var4.field_2742 = (var4.field_2728 * 1703842397 - field_2836 << 8) / var9 * 864587643;
                  var4.field_2727 = (var4.field_2739 * -189041849 - field_2790 << 8) / var9 * 1101489299;
                  var4.field_2744 = (var4.field_2737 * 1423545413 - field_2790 << 8) / var9 * -1564454389;
                  field_2794[field_2825++] = var4;
               }
            }
         } else if(var4.field_2731 * -713034583 == 2) {
            var5 = var4.field_2729 * 725968227 - field_2804 + 25;
            if(var5 >= 0 && var5 <= 50) {
               var6 = var4.field_2734 * -1269044325 - field_2785 + 25;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field_2735 * -386233567 - field_2785 + 25;
               if(var7 > 50) {
                  var7 = 50;
               }

               var8 = false;

               while(var6 <= var7) {
                  if(field_2840[var6++][var5]) {
                     var8 = true;
                     break;
                  }
               }

               if(var8) {
                  var9 = field_2836 - var4.field_2741 * -621751483;
                  if(var9 > 32) {
                     var4.field_2738 = -1710418423;
                  } else {
                     if(var9 >= -32) {
                        continue;
                     }

                     var4.field_2738 = -848902132;
                     var9 = -var9;
                  }

                  var4.field_2743 = (var4.field_2732 * 818345769 - field_2805 << 8) / var9 * -1314093411;
                  var4.field_2730 = (var4.field_2733 * -635118225 - field_2805 << 8) / var9 * -1547916691;
                  var4.field_2727 = (var4.field_2739 * -189041849 - field_2790 << 8) / var9 * 1101489299;
                  var4.field_2744 = (var4.field_2737 * 1423545413 - field_2790 << 8) / var9 * -1564454389;
                  field_2794[field_2825++] = var4;
               }
            }
         } else if(var4.field_2731 * -713034583 == 4) {
            var5 = var4.field_2739 * -189041849 - field_2790;
            if(var5 > 128) {
               var6 = var4.field_2729 * 725968227 - field_2804 + 25;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field_2736 * 1353247321 - field_2804 + 25;
               if(var7 > 50) {
                  var7 = 50;
               }

               if(var6 <= var7) {
                  int var13 = var4.field_2734 * -1269044325 - field_2785 + 25;
                  if(var13 < 0) {
                     var13 = 0;
                  }

                  var9 = var4.field_2735 * -386233567 - field_2785 + 25;
                  if(var9 > 50) {
                     var9 = 50;
                  }

                  boolean var10 = false;

                  label156:
                  for(int var11 = var13; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if(field_2840[var11][var12]) {
                           var10 = true;
                           break label156;
                        }
                     }
                  }

                  if(var10) {
                     var4.field_2738 = 12614159;
                     var4.field_2743 = (var4.field_2732 * 818345769 - field_2805 << 8) / var5 * -1314093411;
                     var4.field_2730 = (var4.field_2733 * -635118225 - field_2805 << 8) / var5 * -1547916691;
                     var4.field_2740 = (var4.field_2741 * -621751483 - field_2836 << 8) / var5 * 230234799;
                     var4.field_2742 = (var4.field_2728 * 1703842397 - field_2836 << 8) / var5 * 864587643;
                     field_2794[field_2825++] = var4;
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: ay (int, int, int) boolean
   boolean method_4771(int var1, int var2, int var3) {
      int var4 = this.field_2791[var1][var2][var3];
      if(var4 == -field_2798) {
         return false;
      } else if(var4 == field_2798) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if(this.method_4775(var5 + 1, this.field_2826[var1][var2][var3], var6 + 1) && this.method_4775(var5 + 128 - 1, this.field_2826[var1][var2 + 1][var3], var6 + 1) && this.method_4775(var5 + 128 - 1, this.field_2826[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method_4775(var5 + 1, this.field_2826[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field_2791[var1][var2][var3] = field_2798;
            return true;
         } else {
            this.field_2791[var1][var2][var3] = -field_2798;
            return false;
         }
      }
   }

   // $FF: renamed from: aa (int, int, int, int) boolean
   boolean method_4772(int var1, int var2, int var3, int var4) {
      if(!this.method_4771(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field_2826[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if(var4 < 16) {
            if(var4 == 1) {
               if(var5 > field_2805) {
                  if(!this.method_4775(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method_4775(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method_4775(var5, var9, var6)) {
                  return false;
               }

               if(!this.method_4775(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 2) {
               if(var6 < field_2836) {
                  if(!this.method_4775(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method_4775(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method_4775(var5, var9, var6 + 128)) {
                  return false;
               }

               if(!this.method_4775(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 4) {
               if(var5 < field_2805) {
                  if(!this.method_4775(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method_4775(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method_4775(var5 + 128, var9, var6)) {
                  return false;
               }

               if(!this.method_4775(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 8) {
               if(var6 > field_2836) {
                  if(!this.method_4775(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method_4775(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if(!this.method_4775(var5, var9, var6)) {
                  return false;
               }

               if(!this.method_4775(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         return !this.method_4775(var5 + 64, var10, var6 + 64)?false:(var4 == 16?this.method_4775(var5, var9, var6 + 128):(var4 == 32?this.method_4775(var5 + 128, var9, var6 + 128):(var4 == 64?this.method_4775(var5 + 128, var9, var6):(var4 == 128?this.method_4775(var5, var9, var6):true))));
      }
   }

   // $FF: renamed from: au (int, int, int, int) boolean
   boolean method_4773(int var1, int var2, int var3, int var4) {
      if(!this.method_4771(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method_4775(var5 + 1, this.field_2826[var1][var2][var3] - var4, var6 + 1) && this.method_4775(var5 + 128 - 1, this.field_2826[var1][var2 + 1][var3] - var4, var6 + 1) && this.method_4775(var5 + 128 - 1, this.field_2826[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method_4775(var5 + 1, this.field_2826[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   // $FF: renamed from: an (int, int, int, int, int, int) boolean
   boolean method_4774(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if(var2 == var3 && var4 == var5) {
         if(!this.method_4771(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method_4775(var7 + 1, this.field_2826[var1][var2][var4] - var6, var8 + 1) && this.method_4775(var7 + 128 - 1, this.field_2826[var1][var2 + 1][var4] - var6, var8 + 1) && this.method_4775(var7 + 128 - 1, this.field_2826[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method_4775(var7 + 1, this.field_2826[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if(this.field_2791[var1][var7][var8] == -field_2798) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.field_2826[var1][var2][var4] - var6;
         if(!this.method_4775(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if(!this.method_4775(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if(!this.method_4775(var7, var9, var11)) {
                  return false;
               } else if(!this.method_4775(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   // $FF: renamed from: bd (int, int, int) boolean
   boolean method_4775(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < field_2825; ++var4) {
         class_247 var5 = field_2794[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if(var5.field_2738 * -2138961749 == 1) {
            var6 = var5.field_2732 * 818345769 - var1;
            if(var6 > 0) {
               var7 = var5.field_2741 * -621751483 + (var5.field_2740 * -2125693873 * var6 >> 8);
               var8 = var5.field_2728 * 1703842397 + (var5.field_2742 * 1761408947 * var6 >> 8);
               var9 = var5.field_2739 * -189041849 + (var5.field_2727 * 536172955 * var6 >> 8);
               var10 = var5.field_2737 * 1423545413 + (var5.field_2744 * -533190237 * var6 >> 8);
               if(var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field_2738 * -2138961749 == 2) {
            var6 = var1 - var5.field_2732 * 818345769;
            if(var6 > 0) {
               var7 = var5.field_2741 * -621751483 + (var5.field_2740 * -2125693873 * var6 >> 8);
               var8 = var5.field_2728 * 1703842397 + (var5.field_2742 * 1761408947 * var6 >> 8);
               var9 = var5.field_2739 * -189041849 + (var5.field_2727 * 536172955 * var6 >> 8);
               var10 = var5.field_2737 * 1423545413 + (var5.field_2744 * -533190237 * var6 >> 8);
               if(var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field_2738 * -2138961749 == 3) {
            var6 = var5.field_2741 * -621751483 - var3;
            if(var6 > 0) {
               var7 = var5.field_2732 * 818345769 + (var5.field_2743 * -853135435 * var6 >> 8);
               var8 = var5.field_2733 * -635118225 + (var5.field_2730 * -668340379 * var6 >> 8);
               var9 = var5.field_2739 * -189041849 + (var5.field_2727 * 536172955 * var6 >> 8);
               var10 = var5.field_2737 * 1423545413 + (var5.field_2744 * -533190237 * var6 >> 8);
               if(var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field_2738 * -2138961749 == 4) {
            var6 = var3 - var5.field_2741 * -621751483;
            if(var6 > 0) {
               var7 = var5.field_2732 * 818345769 + (var5.field_2743 * -853135435 * var6 >> 8);
               var8 = var5.field_2733 * -635118225 + (var5.field_2730 * -668340379 * var6 >> 8);
               var9 = var5.field_2739 * -189041849 + (var5.field_2727 * 536172955 * var6 >> 8);
               var10 = var5.field_2737 * 1423545413 + (var5.field_2744 * -533190237 * var6 >> 8);
               if(var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field_2738 * -2138961749 == 5) {
            var6 = var2 - var5.field_2739 * -189041849;
            if(var6 > 0) {
               var7 = var5.field_2732 * 818345769 + (var5.field_2743 * -853135435 * var6 >> 8);
               var8 = var5.field_2733 * -635118225 + (var5.field_2730 * -668340379 * var6 >> 8);
               var9 = var5.field_2741 * -621751483 + (var5.field_2740 * -2125693873 * var6 >> 8);
               var10 = var5.field_2728 * 1703842397 + (var5.field_2742 * 1761408947 * var6 >> 8);
               if(var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_2813 = true;
      field_2796 = 0;
      field_2797 = 0;
      field_2812 = new class_261[100];
      field_2814 = false;
      field_2800 = 0;
      field_2815 = 0;
      field_2816 = 0;
      field_2817 = -1;
      field_2818 = -1;
      field_2782 = false;
      field_2822 = 4;
      field_2823 = new int[field_2822];
      field_2803 = new class_247[field_2822][500];
      field_2825 = 0;
      field_2794 = new class_247[500];
      class_335 var10000 = new class_335();
      field_2827 = var10000;
      field_2828 = new int[]{19, 55, 38, 155, 255, 110, 137, 205, 76};
      field_2842 = new int[]{160, 192, 80, 96, 0, 144, 80, 48, 160};
      field_2830 = new int[]{76, 8, 137, 4, 0, 1, 38, 2, 19};
      field_2831 = new int[]{0, 0, 2, 0, 0, 2, 1, 1, 0};
      field_2832 = new int[]{2, 0, 0, 2, 0, 0, 0, 4, 4};
      field_2795 = new int[]{0, 4, 4, 8, 0, 0, 8, 0, 0};
      field_2834 = new int[]{1, 1, 0, 0, 0, 8, 0, 0, 8};
      field_2841 = new boolean[8][32][51][51];
   }

   // $FF: renamed from: bt () void
   public void method_4777() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.field_2783; ++var1) {
         for(var2 = 0; var2 < this.field_2784; ++var2) {
            for(int var3 = 0; var3 < this.field_2786; ++var3) {
               this.field_2787[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < field_2822; ++var1) {
         for(var2 = 0; var2 < field_2823[var1]; ++var2) {
            field_2803[var1][var2] = null;
         }

         field_2823[var1] = 0;
      }

      for(var1 = 0; var1 < this.field_2789; ++var1) {
         this.field_2807[var1] = null;
      }

      this.field_2789 = 0;

      for(var1 = 0; var1 < field_2812.length; ++var1) {
         field_2812[var1] = null;
      }

   }

   // $FF: renamed from: bq () void
   public void method_4778() {
      int var1;
      int var2;
      for(var1 = 0; var1 < this.field_2783; ++var1) {
         for(var2 = 0; var2 < this.field_2784; ++var2) {
            for(int var3 = 0; var3 < this.field_2786; ++var3) {
               this.field_2787[var1][var2][var3] = null;
            }
         }
      }

      for(var1 = 0; var1 < field_2822; ++var1) {
         for(var2 = 0; var2 < field_2823[var1]; ++var2) {
            field_2803[var1][var2] = null;
         }

         field_2823[var1] = 0;
      }

      for(var1 = 0; var1 < this.field_2789; ++var1) {
         this.field_2807[var1] = null;
      }

      this.field_2789 = 0;

      for(var1 = 0; var1 < field_2812.length; ++var1) {
         field_2812[var1] = null;
      }

   }

   // $FF: renamed from: bu (int) void
   public void method_4779(int var1) {
      this.field_2788 = var1;

      for(int var2 = 0; var2 < this.field_2784; ++var2) {
         for(int var3 = 0; var3 < this.field_2786; ++var3) {
            if(this.field_2787[var1][var2][var3] == null) {
               class_41[] var10000 = this.field_2787[var1][var2];
               class_41 var10002 = new class_41(var1, var2, var3);
               var10000[var3] = var10002;
            }
         }
      }

   }

   // $FF: renamed from: bl (int) void
   public void method_4780(int var1) {
      this.field_2788 = var1;

      for(int var2 = 0; var2 < this.field_2784; ++var2) {
         for(int var3 = 0; var3 < this.field_2786; ++var3) {
            if(this.field_2787[var1][var2][var3] == null) {
               class_41[] var10000 = this.field_2787[var1][var2];
               class_41 var10002 = new class_41(var1, var2, var3);
               var10000[var3] = var10002;
            }
         }
      }

   }

   // $FF: renamed from: cq (int, int, int) void
   public void method_4781(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 != null) {
         var4.field_278 = null;
      }
   }

   // $FF: renamed from: bm (int) void
   public void method_4782(int var1) {
      this.field_2788 = var1;

      for(int var2 = 0; var2 < this.field_2784; ++var2) {
         for(int var3 = 0; var3 < this.field_2786; ++var3) {
            if(this.field_2787[var1][var2][var3] == null) {
               class_41[] var10000 = this.field_2787[var1][var2];
               class_41 var10002 = new class_41(var1, var2, var3);
               var10000[var3] = var10002;
            }
         }
      }

   }

   // $FF: renamed from: bz (int) void
   public void method_4783(int var1) {
      this.field_2788 = var1;

      for(int var2 = 0; var2 < this.field_2784; ++var2) {
         for(int var3 = 0; var3 < this.field_2786; ++var3) {
            if(this.field_2787[var1][var2][var3] == null) {
               class_41[] var10000 = this.field_2787[var1][var2];
               class_41 var10002 = new class_41(var1, var2, var3);
               var10000[var3] = var10002;
            }
         }
      }

   }

   // $FF: renamed from: bh (int, int) void
   public void method_4784(int var1, int var2) {
      class_41 var3 = this.field_2787[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         class_41 var5 = this.field_2787[var4][var1][var2] = this.field_2787[var4 + 1][var1][var2];
         if(var5 != null) {
            var5.field_274 -= -522170045;

            for(int var6 = 0; var6 < var5.field_282 * 1720897143; ++var6) {
               class_261 var7 = var5.field_286[var6];
               long var9 = 1142152799211342585L * var7.field_2917;
               int var11 = (int)(var9 >>> 14 & 3L);
               boolean var8 = 2 == var11;
               if(var8 && var7.field_2909 * 1674574095 == var1 && var7.field_2913 * -221829725 == var2) {
                  var7.field_2918 -= 1631501213;
               }
            }
         }
      }

      if(this.field_2787[0][var1][var2] == null) {
         class_41[] var10000 = this.field_2787[0][var1];
         class_41 var10002 = new class_41(0, var1, var2);
         var10000[var2] = var10002;
      }

      this.field_2787[0][var1][var2].field_292 = var3;
      this.field_2787[3][var1][var2] = null;
   }

   // $FF: renamed from: bi (int, int, int, int, gl, gl, int, int, long, int) void
   public void method_4785(int var1, int var2, int var3, int var4, class_91 var5, class_91 var6, int var7, int var8, long var9, int var11) {
      if(var5 != null || var6 != null) {
         class_269 var10000 = new class_269();
         class_269 var12 = var10000;
         var12.field_3169 = var9 * 6932700597450399109L;
         var12.field_3177 = var11 * -1746857141;
         var12.field_3174 = var2 * -999978368 + -499989184;
         var12.field_3176 = var3 * -20740736 + 2137113280;
         var12.field_3170 = var4 * -604923785;
         var12.field_3178 = var5;
         var12.field_3175 = var6;
         var12.field_3172 = var7 * -1064173019;
         var12.field_3173 = var8 * 1462529140;

         for(int var13 = var1; var13 >= 0; --var13) {
            if(this.field_2787[var13][var2][var3] == null) {
               class_41[] var14 = this.field_2787[var13][var2];
               class_41 var10002 = new class_41(var13, var2, var3);
               var14[var3] = var10002;
            }
         }

         this.field_2787[var1][var2][var3].field_277 = var12;
      }
   }

   // $FF: renamed from: ba (int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int) void
   public void method_4786(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      class_241 var10000;
      class_41 var10002;
      class_241 var21;
      int var22;
      class_41[] var24;
      if(var4 == 0) {
         var10000 = new class_241(var11, var12, var13, var14, -1, var19, false);
         var21 = var10000;

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.field_2787[var22][var2][var3] == null) {
               var24 = this.field_2787[var22][var2];
               var10002 = new class_41(var22, var2, var3);
               var24[var3] = var10002;
            }
         }

         this.field_2787[var1][var2][var3].field_275 = var21;
      } else if(var4 != 1) {
         class_249 var25 = new class_249(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);
         class_249 var23 = var25;

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.field_2787[var22][var2][var3] == null) {
               var24 = this.field_2787[var22][var2];
               var10002 = new class_41(var22, var2, var3);
               var24[var3] = var10002;
            }
         }

         this.field_2787[var1][var2][var3].field_289 = var23;
      } else {
         var10000 = new class_241(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);
         var21 = var10000;

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.field_2787[var22][var2][var3] == null) {
               var24 = this.field_2787[var22][var2];
               var10002 = new class_41(var22, var2, var3);
               var24[var3] = var10002;
            }
         }

         this.field_2787[var1][var2][var3].field_275 = var21;
      }
   }

   // $FF: renamed from: bf (int, int, int, int, int, int, int, int) void
   public static void method_4787(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class_247 var10000 = new class_247();
      class_247 var8 = var10000;
      var8.field_2734 = var2 / 128 * -848723309;
      var8.field_2735 = var3 / 128 * -1706247967;
      var8.field_2729 = var4 / 128 * -329300917;
      var8.field_2736 = var5 / 128 * -2057847319;
      var8.field_2731 = var1 * 760606617;
      var8.field_2732 = var2 * 1390384409;
      var8.field_2733 = var3 * -730652273;
      var8.field_2741 = var4 * -366098547;
      var8.field_2728 = var5 * -1672424971;
      var8.field_2739 = var6 * -437762441;
      var8.field_2737 = var7 * 1213750925;
      field_2803[var0][field_2823[var0]++] = var8;
   }

   // $FF: renamed from: fi (int, int, int, int, int, int) boolean
   boolean method_4788(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if(var2 == var3 && var4 == var5) {
         if(!this.method_4771(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method_4775(var7 + 1, this.field_2826[var1][var2][var4] - var6, var8 + 1) && this.method_4775(var7 + 128 - 1, this.field_2826[var1][var2 + 1][var4] - var6, var8 + 1) && this.method_4775(var7 + 128 - 1, this.field_2826[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method_4775(var7 + 1, this.field_2826[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if(this.field_2791[var1][var7][var8] == -field_2798) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.field_2826[var1][var2][var4] - var6;
         if(!this.method_4775(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if(!this.method_4775(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if(!this.method_4775(var7, var9, var11)) {
                  return false;
               } else if(!this.method_4775(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   // $FF: renamed from: be (int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int) void
   public void method_4789(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19, int var20) {
      class_241 var10000;
      class_41 var10002;
      class_241 var21;
      int var22;
      class_41[] var24;
      if(var4 == 0) {
         var10000 = new class_241(var11, var12, var13, var14, -1, var19, false);
         var21 = var10000;

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.field_2787[var22][var2][var3] == null) {
               var24 = this.field_2787[var22][var2];
               var10002 = new class_41(var22, var2, var3);
               var24[var3] = var10002;
            }
         }

         this.field_2787[var1][var2][var3].field_275 = var21;
      } else if(var4 != 1) {
         class_249 var25 = new class_249(var4, var5, var6, var2, var3, var7, var8, var9, var10, var11, var12, var13, var14, var15, var16, var17, var18, var19, var20);
         class_249 var23 = var25;

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.field_2787[var22][var2][var3] == null) {
               var24 = this.field_2787[var22][var2];
               var10002 = new class_41(var22, var2, var3);
               var24[var3] = var10002;
            }
         }

         this.field_2787[var1][var2][var3].field_289 = var23;
      } else {
         var10000 = new class_241(var15, var16, var17, var18, var6, var20, var7 == var8 && var7 == var9 && var7 == var10);
         var21 = var10000;

         for(var22 = var1; var22 >= 0; --var22) {
            if(this.field_2787[var22][var2][var3] == null) {
               var24 = this.field_2787[var22][var2];
               var10002 = new class_41(var22, var2, var3);
               var24[var3] = var10002;
            }
         }

         this.field_2787[var1][var2][var3].field_275 = var21;
      }
   }

   // $FF: renamed from: bg (int, int, int, int, int, gl, int, long, boolean) boolean
   public boolean method_4790(int var1, int var2, int var3, int var4, int var5, class_91 var6, int var7, long var8, boolean var10) {
      if(var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var2 + var5;
         int var14 = var3 + var5;
         if(var10) {
            if(var7 > 640 && var7 < 1408) {
               var14 += 128;
            }

            if(var7 > 2123300076 && var7 < 1920) {
               var13 += 128;
            }

            if(var7 > -839849166 || var7 < -2080173884) {
               var12 -= 128;
            }

            if(var7 > 255646873 && var7 < 1712774321) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var14 /= 128;
         return this.method_4736(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   // $FF: renamed from: bx (int, int, int, int, gl, long, int) void
   public void method_4791(int var1, int var2, int var3, int var4, class_91 var5, long var6, int var8) {
      if(var5 != null) {
         class_248 var10000 = new class_248();
         class_248 var9 = var10000;
         var9.field_2749 = var5;
         var9.field_2747 = var2 * 1874556544 + -468414677;
         var9.field_2746 = var3 * -1869772160 + 1212597568;
         var9.field_2753 = var4 * 1091452896;
         var9.field_2750 = var6 * 840149604356866431L;
         var9.field_2748 = var8 * -1766964493;
         if(this.field_2787[var1][var2][var3] == null) {
            class_41[] var10 = this.field_2787[var1][var2];
            class_41 var10002 = new class_41(var1, var2, var3);
            var10[var3] = var10002;
         }

         this.field_2787[var1][var2][var3].field_279 = var9;
      }
   }

   // $FF: renamed from: ct (int, int, int, int) void
   public void method_4792(int var1, int var2, int var3, int var4) {
      class_41 var5 = this.field_2787[var1][var2][var3];
      if(var5 != null) {
         class_265 var6 = var5.field_278;
         if(var6 != null) {
            var6.field_3040 = var6.field_3040 * -2026318183 * var4 / 16 * 2120424873;
            var6.field_3041 = var6.field_3041 * 1292762417 * var4 / 16 * -883278895;
         }
      }
   }

   // $FF: renamed from: ca (int, int, int) hj
   public class_261 method_4793(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 == null) {
         return null;
      } else {
         for(int var5 = 0; var5 < var4.field_282 * 1720897143; ++var5) {
            class_261 var6 = var4.field_286[var5];
            long var8 = var6.field_2917 * 1142152799211342585L;
            int var10 = (int)(var8 >>> 14 & 3L);
            boolean var7 = 2 == var10;
            if(var7 && var6.field_2909 * 1674574095 == var2 && var6.field_2913 * -985231975 == var3) {
               return var6;
            }
         }

         return null;
      }
   }

   // $FF: renamed from: bo (int, int, int, int, gl, long, gl, gl) void
   public void method_4794(int var1, int var2, int var3, int var4, class_91 var5, long var6, class_91 var8, class_91 var9) {
      class_253 var10000 = new class_253();
      class_253 var10 = var10000;
      var10.field_2863 = var5;
      var10.field_2861 = var2 * -1266586496 + -633293248;
      var10.field_2862 = var3 * 1042903936 + -241110880;
      var10.field_2867 = var4 * 1998275011;
      var10.field_2866 = var6 * 2586414638863188585L;
      var10.field_2864 = var8;
      var10.field_2865 = var9;
      int var11 = 0;
      class_41 var12 = this.field_2787[var1][var2][var3];
      if(var12 != null) {
         for(int var13 = 0; var13 < var12.field_282 * 1720897143; ++var13) {
            if((var12.field_286[var13].field_2905 * -2139353773 & -733017510) == 1368042309 && var12.field_286[var13].field_2915 instanceof class_92) {
               class_92 var14 = (class_92)var12.field_286[var13].field_2915;
               var14.method_1621();
               if(var14.field_911 * -773275286 > var11) {
                  var11 = var14.field_911 * -839637530;
               }
            }
         }
      }

      var10.field_2860 = var11 * -720987406;
      if(this.field_2787[var1][var2][var3] == null) {
         class_41[] var15 = this.field_2787[var1][var2];
         class_41 var10002 = new class_41(var1, var2, var3);
         var15[var3] = var10002;
      }

      this.field_2787[var1][var2][var3].field_281 = var10;
   }

   // $FF: renamed from: bw (int, int, int, int, gl, gl, int, int, long, int) void
   public void method_4795(int var1, int var2, int var3, int var4, class_91 var5, class_91 var6, int var7, int var8, long var9, int var11) {
      if(var5 != null || var6 != null) {
         class_269 var10000 = new class_269();
         class_269 var12 = var10000;
         var12.field_3169 = var9 * 6932700597450399109L;
         var12.field_3177 = var11 * -1809048964;
         var12.field_3174 = var2 * 317040704 + -499989184;
         var12.field_3176 = var3 * -20740736 + 2137113280;
         var12.field_3170 = var4 * -604923785;
         var12.field_3178 = var5;
         var12.field_3175 = var6;
         var12.field_3172 = var7 * -1064173019;
         var12.field_3173 = var8 * 1892598191;

         for(int var13 = var1; var13 >= 0; --var13) {
            if(this.field_2787[var13][var2][var3] == null) {
               class_41[] var14 = this.field_2787[var13][var2];
               class_41 var10002 = new class_41(var13, var2, var3);
               var14[var3] = var10002;
            }
         }

         this.field_2787[var1][var2][var3].field_277 = var12;
      }
   }

   // $FF: renamed from: cd (int, int, int, int, int, int, int, int, gl, int, boolean, long, int) boolean
   boolean method_4796(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, class_91 var9, int var10, boolean var11, long var12, int var14) {
      int var16;
      for(int var15 = var2; var15 < var2 + var4; ++var15) {
         for(var16 = var3; var16 < var3 + var5; ++var16) {
            if(var15 < 0 || var16 < 0 || var15 >= this.field_2784 || var16 >= this.field_2786) {
               return false;
            }

            class_41 var17 = this.field_2787[var1][var15][var16];
            if(var17 != null && var17.field_282 * 1720897143 >= 5) {
               return false;
            }
         }
      }

      class_261 var10000 = new class_261();
      class_261 var21 = var10000;
      var21.field_2917 = var12 * -2872503573805869239L;
      var21.field_2905 = var14 * 795852507;
      var21.field_2918 = var1 * -38016809;
      var21.field_2910 = var6 * -550285103;
      var21.field_2908 = var7 * -616350743;
      var21.field_2906 = var8 * 1814338219;
      var21.field_2915 = var9;
      var21.field_2911 = var10 * -721195091;
      var21.field_2909 = var2 * 227792367;
      var21.field_2913 = var3 * -1857360659;
      var21.field_2912 = (var2 + var4 - 1) * 1673418941;
      var21.field_2914 = (var3 + var5 - 1) * 612200061;

      for(var16 = var2; var16 < var2 + var4; ++var16) {
         for(int var23 = var3; var23 < var3 + var5; ++var23) {
            int var18 = 0;
            if(var16 > var2) {
               ++var18;
            }

            if(var16 < var2 + var4 - 1) {
               var18 += 4;
            }

            if(var23 > var3) {
               var18 += 8;
            }

            if(var23 < var3 + var5 - 1) {
               var18 += 2;
            }

            for(int var19 = var1; var19 >= 0; --var19) {
               if(this.field_2787[var19][var16][var23] == null) {
                  class_41[] var22 = this.field_2787[var19][var16];
                  class_41 var10002 = new class_41(var19, var16, var23);
                  var22[var23] = var10002;
               }
            }

            class_41 var24 = this.field_2787[var1][var16][var23];
            var24.field_286[var24.field_282 * 1720897143] = var21;
            var24.field_283[var24.field_282 * 1720897143] = var18;
            var24.field_284 = (var24.field_284 * 1099123981 | var18) * -1682880059;
            var24.field_282 += 1428908871;
         }
      }

      if(var11) {
         this.field_2807[this.field_2789++] = var21;
      }

      return true;
   }

   // $FF: renamed from: bb (int, int, int, int, gl, gl, int, int, int, int, long, int) void
   public void method_4797(int var1, int var2, int var3, int var4, class_91 var5, class_91 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if(var5 != null) {
         class_265 var10000 = new class_265();
         class_265 var14 = var10000;
         var14.field_3035 = var11 * -734143626211523767L;
         var14.field_3045 = var13 * 1441870123;
         var14.field_3036 = var2 * 1226257536 + 613128768;
         var14.field_3042 = var3 * 2114546 + 14017856;
         var14.field_3037 = var4 * -932802139;
         var14.field_3039 = var5;
         var14.field_3043 = var6;
         var14.field_3038 = var7 * 1231774405;
         var14.field_3044 = var8 * 557213877;
         var14.field_3040 = var9 * 2120424873;
         var14.field_3041 = var10 * -2027428158;

         for(int var15 = var1; var15 >= 0; --var15) {
            if(this.field_2787[var15][var2][var3] == null) {
               class_41[] var16 = this.field_2787[var15][var2];
               class_41 var10002 = new class_41(var15, var2, var3);
               var16[var3] = var10002;
            }
         }

         this.field_2787[var1][var2][var3].field_278 = var14;
      }
   }

   // $FF: renamed from: bk (int, int, int, int, gl, gl, int, int, int, int, long, int) void
   public void method_4798(int var1, int var2, int var3, int var4, class_91 var5, class_91 var6, int var7, int var8, int var9, int var10, long var11, int var13) {
      if(var5 != null) {
         class_265 var10000 = new class_265();
         class_265 var14 = var10000;
         var14.field_3035 = var11 * -734143626211523767L;
         var14.field_3045 = var13 * 1196436268;
         var14.field_3036 = var2 * -1005833947 + 613128768;
         var14.field_3042 = var3 * 28035712 + -413752597;
         var14.field_3037 = var4 * -932802139;
         var14.field_3039 = var5;
         var14.field_3043 = var6;
         var14.field_3038 = var7 * 1012620993;
         var14.field_3044 = var8 * -779498855;
         var14.field_3040 = var9 * 754085339;
         var14.field_3041 = var10 * 1165959220;

         for(int var15 = var1; var15 >= 0; --var15) {
            if(this.field_2787[var15][var2][var3] == null) {
               class_41[] var16 = this.field_2787[var15][var2];
               class_41 var10002 = new class_41(var15, var2, var3);
               var16[var3] = var10002;
            }
         }

         this.field_2787[var1][var2][var3].field_278 = var14;
      }
   }

   // $FF: renamed from: cu (int, int, int) void
   public void method_4799(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 != null) {
         var4.field_281 = null;
      }
   }

   // $FF: renamed from: by (int, int, int, int, int, gl, int, long, int, int, int, int) boolean
   public boolean method_4800(int var1, int var2, int var3, int var4, class_91 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null?true:this.method_4736(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   // $FF: renamed from: bc (int, int, int, int, int, gl, int, long, int, int, int, int) boolean
   public boolean method_4801(int var1, int var2, int var3, int var4, class_91 var6, int var7, long var8, int var10, int var11, int var12, int var13) {
      return var6 == null?true:this.method_4736(var1, var10, var11, var12 - var10 + 1, var13 - var11 + 1, var2, var3, var4, var6, var7, true, var8, 0);
   }

   // $FF: renamed from: bs (int, int) void
   public void method_4802(int var1, int var2) {
      class_41 var3 = this.field_2787[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         class_41 var5 = this.field_2787[var4][var1][var2] = this.field_2787[var4 + 1][var1][var2];
         if(var5 != null) {
            var5.field_274 -= -522170045;

            for(int var6 = 0; var6 < var5.field_282 * -437601439; ++var6) {
               class_261 var7 = var5.field_286[var6];
               long var9 = 1142152799211342585L * var7.field_2917;
               int var11 = (int)(var9 >>> 14 & 3L);
               boolean var8 = 2 == var11;
               if(var8 && var7.field_2909 * 1091950797 == var1 && var7.field_2913 * 1202737381 == var2) {
                  var7.field_2918 -= -38016809;
               }
            }
         }
      }

      if(this.field_2787[0][var1][var2] == null) {
         class_41[] var10000 = this.field_2787[0][var1];
         class_41 var10002 = new class_41(0, var1, var2);
         var10000[var2] = var10002;
      }

      this.field_2787[0][var1][var2].field_292 = var3;
      this.field_2787[3][var1][var2] = null;
   }

   // $FF: renamed from: cm () void
   public void method_4803() {
      for(int var1 = 0; var1 < this.field_2789; ++var1) {
         class_261 var2 = this.field_2807[var1];
         this.method_4738(var2);
         this.field_2807[var1] = null;
      }

      this.field_2789 = 0;
   }

   // $FF: renamed from: cv () void
   public void method_4804() {
      for(int var1 = 0; var1 < this.field_2789; ++var1) {
         class_261 var2 = this.field_2807[var1];
         this.method_4738(var2);
         this.field_2807[var1] = null;
      }

      this.field_2789 = 0;
   }

   // $FF: renamed from: w (int, int, int) void
   public void method_4805(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 != null) {
         var4.field_281 = null;
      }
   }

   // $FF: renamed from: ci (int, int, int, int) void
   public void method_4806(int var1, int var2, int var3, int var4) {
      class_41 var5 = this.field_2787[var1][var2][var3];
      if(var5 != null) {
         class_265 var6 = var5.field_278;
         if(var6 != null) {
            var6.field_3040 = var6.field_3040 * -2026318183 * var4 / 16 * 2120424873;
            var6.field_3041 = var6.field_3041 * 1292762417 * var4 / 16 * -883278895;
         }
      }
   }

   // $FF: renamed from: u (int, int, int, int, int, int, gl, int, long, int) boolean
   public boolean method_4807(int var1, int var2, int var3, int var4, int var5, int var6, class_91 var7, int var8, long var9, int var11) {
      if(var7 == null) {
         return true;
      } else {
         int var12 = var2 * 128 + 64 * var5;
         int var13 = var3 * 128 + 64 * var6;
         return this.method_4736(var1, var2, var3, var5, var6, var12, var13, var4, var7, var8, false, var9, var11);
      }
   }

   // $FF: renamed from: x (int, int, int) void
   public void method_4808(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 != null) {
         for(int var5 = 0; var5 < var4.field_282 * 1720897143; ++var5) {
            class_261 var6 = var4.field_286[var5];
            if(class_182.method_3836(var6.field_2917 * 1142152799211342585L) && var6.field_2909 * 1674574095 == var2 && var6.field_2913 * 1202737381 == var3) {
               this.method_4738(var6);
               return;
            }
         }

      }
   }

   // $FF: renamed from: cr (int, int, int) void
   public void method_4809(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 != null) {
         var4.field_278 = null;
      }
   }

   // $FF: renamed from: cf (int, int, int) void
   public void method_4810(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 != null) {
         var4.field_278 = null;
      }
   }

   // $FF: renamed from: fx (int, int, int) boolean
   boolean method_4811(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < field_2825; ++var4) {
         class_247 var5 = field_2794[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if(var5.field_2738 * -2138961749 == 1) {
            var6 = var5.field_2732 * 818345769 - var1;
            if(var6 > 0) {
               var7 = var5.field_2741 * -567477573 + (var5.field_2740 * -2125693873 * var6 >> 8);
               var8 = var5.field_2728 * -1079151283 + (var5.field_2742 * -1471553415 * var6 >> 8);
               var9 = var5.field_2739 * -2104926250 + (var5.field_2727 * -757600537 * var6 >> 8);
               var10 = var5.field_2737 * -887795862 + (var5.field_2744 * -533190237 * var6 >> 8);
               if(var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field_2738 * -2138961749 == 2) {
            var6 = var1 - var5.field_2732 * 394935979;
            if(var6 > 0) {
               var7 = var5.field_2741 * -621751483 + (var5.field_2740 * -2125693873 * var6 >> 8);
               var8 = var5.field_2728 * 1703842397 + (var5.field_2742 * 1761408947 * var6 >> 8);
               var9 = var5.field_2739 * -189041849 + (var5.field_2727 * 536172955 * var6 >> 8);
               var10 = var5.field_2737 * 147529446 + (var5.field_2744 * 1163080095 * var6 >> 8);
               if(var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field_2738 * 1078587566 == 3) {
            var6 = var5.field_2741 * -621751483 - var3;
            if(var6 > 0) {
               var7 = var5.field_2732 * 900869050 + (var5.field_2743 * 2056008215 * var6 >> 8);
               var8 = var5.field_2733 * 1034901383 + (var5.field_2730 * 572310775 * var6 >> 8);
               var9 = var5.field_2739 * -189041849 + (var5.field_2727 * -1918348947 * var6 >> 8);
               var10 = var5.field_2737 * -1848491766 + (var5.field_2744 * -893876160 * var6 >> 8);
               if(var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field_2738 * 42063530 == 4) {
            var6 = var3 - var5.field_2741 * -621751483;
            if(var6 > 0) {
               var7 = var5.field_2732 * 818345769 + (var5.field_2743 * 2093839081 * var6 >> 8);
               var8 = var5.field_2733 * -635118225 + (var5.field_2730 * 2119292565 * var6 >> 8);
               var9 = var5.field_2739 * -2007684 + (var5.field_2727 * -1598010568 * var6 >> 8);
               var10 = var5.field_2737 * 1423545413 + (var5.field_2744 * -533190237 * var6 >> 8);
               if(var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field_2738 * -2138961749 == 5) {
            var6 = var2 - var5.field_2739 * -189041849;
            if(var6 > 0) {
               var7 = var5.field_2732 * 818345769 + (var5.field_2743 * -853135435 * var6 >> 8);
               var8 = var5.field_2733 * -2065396133 + (var5.field_2730 * -668340379 * var6 >> 8);
               var9 = var5.field_2741 * -621751483 + (var5.field_2740 * -642874264 * var6 >> 8);
               var10 = var5.field_2728 * 1012183657 + (var5.field_2742 * 616743598 * var6 >> 8);
               if(var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   // $FF: renamed from: cs (int, int, int) void
   public void method_4812(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 != null) {
         for(int var5 = 0; var5 < var4.field_282 * 1720897143; ++var5) {
            class_261 var6 = var4.field_286[var5];
            if(class_182.method_3836(var6.field_2917 * 1142152799211342585L) && var6.field_2909 * -1996140841 == var2 && var6.field_2913 * -1288535267 == var3) {
               this.method_4738(var6);
               return;
            }
         }

      }
   }

   // $FF: renamed from: f (int, int) void
   public void method_4813(int var1, int var2) {
      class_41 var3 = this.field_2787[0][var1][var2];

      for(int var4 = 0; var4 < 3; ++var4) {
         class_41 var5 = this.field_2787[var4][var1][var2] = this.field_2787[var4 + 1][var1][var2];
         if(var5 != null) {
            var5.field_274 -= -522170045;

            for(int var6 = 0; var6 < var5.field_282 * 1720897143; ++var6) {
               class_261 var7 = var5.field_286[var6];
               long var9 = 1142152799211342585L * var7.field_2917;
               int var11 = (int)(var9 >>> 14 & 3L);
               boolean var8 = 2 == var11;
               if(var8 && var7.field_2909 * 1674574095 == var1 && var7.field_2913 * 1202737381 == var2) {
                  var7.field_2918 -= -38016809;
               }
            }
         }
      }

      if(this.field_2787[0][var1][var2] == null) {
         class_41[] var10000 = this.field_2787[0][var1];
         class_41 var10002 = new class_41(0, var1, var2);
         var10000[var2] = var10002;
      }

      this.field_2787[0][var1][var2].field_292 = var3;
      this.field_2787[3][var1][var2] = null;
   }

   // $FF: renamed from: fc (int, int) int
   static final int method_4814(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & 896552305) + var1;
   }

   // $FF: renamed from: n (int) void
   public void method_4815(int var1) {
      this.field_2788 = var1;

      for(int var2 = 0; var2 < this.field_2784; ++var2) {
         for(int var3 = 0; var3 < this.field_2786; ++var3) {
            if(this.field_2787[var1][var2][var3] == null) {
               class_41[] var10000 = this.field_2787[var1][var2];
               class_41 var10002 = new class_41(var1, var2, var3);
               var10000[var3] = var10002;
            }
         }
      }

   }

   // $FF: renamed from: cj (int, int, int) void
   public void method_4816(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 != null) {
         var4.field_281 = null;
      }
   }

   // $FF: renamed from: cc (int, int, int) void
   public void method_4817(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 != null) {
         var4.field_281 = null;
      }
   }

   // $FF: renamed from: ab (int, int, int) long
   public long method_4818(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.field_282 * 1720897143; ++var5) {
            class_261 var6 = var4.field_286[var5];
            long var8 = var6.field_2917 * 1142152799211342585L;
            int var10 = (int)(var8 >>> 14 & 3L);
            boolean var7 = var10 == 2;
            if(var7 && var6.field_2909 * 1674574095 == var2 && var6.field_2913 * 1202737381 == var3) {
               return var6.field_2917 * 1142152799211342585L;
            }
         }

         return 0L;
      }
   }

   // $FF: renamed from: cz (int, int, int) hw
   public class_269 method_4819(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 == null?null:var4.field_277;
   }

   // $FF: renamed from: fw (int, int, int, int) boolean
   boolean method_4820(int var1, int var2, int var3, int var4) {
      if(!this.method_4771(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         return this.method_4775(var5 + 1, this.field_2826[var1][var2][var3] - var4, var6 + 1) && this.method_4775(var5 + 128 - 1, this.field_2826[var1][var2 + 1][var3] - var4, var6 + 1) && this.method_4775(var5 + 128 - 1, this.field_2826[var1][var2 + 1][var3 + 1] - var4, var6 + 128 - 1) && this.method_4775(var5 + 1, this.field_2826[var1][var2][var3 + 1] - var4, var6 + 128 - 1);
      }
   }

   // $FF: renamed from: ce (int, int, int) hw
   public class_269 method_4821(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 == null?null:var4.field_277;
   }

   // $FF: renamed from: ch (int, int, int) hw
   public class_269 method_4822(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 == null?null:var4.field_277;
   }

   // $FF: renamed from: cy (int, int, int) ho
   public class_265 method_4823(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 == null?null:var4.field_278;
   }

   // $FF: renamed from: av () boolean
   public static boolean method_4824() {
      return field_2782 && field_2817 != -1;
   }

   // $FF: renamed from: du (int, int, int) void
   public void method_4825(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_2783; ++var4) {
         for(int var5 = 0; var5 < this.field_2784; ++var5) {
            for(int var6 = 0; var6 < this.field_2786; ++var6) {
               class_41 var7 = this.field_2787[var4][var5][var6];
               if(var7 != null) {
                  class_269 var8 = var7.field_277;
                  class_93 var10;
                  if(var8 != null && var8.field_3178 instanceof class_93) {
                     class_93 var9 = (class_93)var8.field_3178;
                     this.method_4756(var9, var4, var5, var6, 1, 1);
                     if(var8.field_3175 instanceof class_93) {
                        var10 = (class_93)var8.field_3175;
                        this.method_4756(var10, var4, var5, var6, 1, 1);
                        class_93.method_1710(var9, var10, 0, 0, 0, false);
                        var8.field_3175 = var10.method_1711(var10.field_1009, var10.field_1010, var1, var2, var3);
                     }

                     var8.field_3178 = var9.method_1711(var9.field_1009, var9.field_1010, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.field_282 * 1720897143; ++var12) {
                     class_261 var14 = var7.field_286[var12];
                     if(var14 != null && var14.field_2915 instanceof class_93) {
                        class_93 var11 = (class_93)var14.field_2915;
                        this.method_4756(var11, var4, var5, var6, var14.field_2912 * -2078907755 - var14.field_2909 * 1674574095 + 1, var14.field_2914 * -129893675 - var14.field_2913 * 1202737381 + 1);
                        var14.field_2915 = var11.method_1711(var11.field_1009, var11.field_1010, var1, var2, var3);
                     }
                  }

                  class_248 var13 = var7.field_279;
                  if(var13 != null && var13.field_2749 instanceof class_93) {
                     var10 = (class_93)var13.field_2749;
                     this.method_4876(var10, var4, var5, var6);
                     var13.field_2749 = var10.method_1711(var10.field_1009, var10.field_1010, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: cl (int, int, int) go
   public class_248 method_4826(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 != null && var4.field_279 != null?var4.field_279:null;
   }

   // $FF: renamed from: da (int, int, int, long) int
   public int method_4827(int var1, int var2, int var3, long var4) {
      class_41 var6 = this.field_2787[var1][var2][var3];
      if(var6 == null) {
         return -1;
      } else if(var6.field_277 != null && var6.field_277.field_3169 * 1374506562499121997L == var4) {
         return var6.field_277.field_3177 * -1331667357 & 255;
      } else if(var6.field_278 != null && var6.field_278.field_3035 * 3146556658035252985L == var4) {
         return var6.field_278.field_3045 * -740686461 & 255;
      } else if(var6.field_279 != null && var6.field_279.field_2750 * 5096767537878498943L == var4) {
         return var6.field_279.field_2748 * -383801797 & 255;
      } else {
         for(int var7 = 0; var7 < var6.field_282 * 1720897143; ++var7) {
            if(var6.field_286[var7].field_2917 * 1142152799211342585L == var4) {
               return var6.field_286[var7].field_2905 * -2139353773 & 255;
            }
         }

         return -1;
      }
   }

   // $FF: renamed from: db (int, int, int) long
   public long method_4828(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 != null && var4.field_277 != null?var4.field_277.field_3169 * 1374506562499121997L:0L;
   }

   // $FF: renamed from: dz (int, int, int) long
   public long method_4829(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 != null && var4.field_277 != null?var4.field_277.field_3169 * 1374506562499121997L:0L;
   }

   // $FF: renamed from: dj (int, int, int) long
   public long method_4830(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 != null && var4.field_278 != null?var4.field_278.field_3035 * 3146556658035252985L:0L;
   }

   // $FF: renamed from: ck (int, int, int) void
   public void method_4831(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 != null) {
         var4.field_281 = null;
      }
   }

   // $FF: renamed from: di (int, int, int) long
   public long method_4832(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.field_282 * 1720897143; ++var5) {
            class_261 var6 = var4.field_286[var5];
            long var8 = var6.field_2917 * 1142152799211342585L;
            int var10 = (int)(var8 >>> 14 & 3L);
            boolean var7 = var10 == 2;
            if(var7 && var6.field_2909 * 618774770 == var2 && var6.field_2913 * -1176136315 == var3) {
               return var6.field_2917 * 1142152799211342585L;
            }
         }

         return 0L;
      }
   }

   // $FF: renamed from: dc (int, int, int) long
   public long method_4833(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 == null) {
         return 0L;
      } else {
         for(int var5 = 0; var5 < var4.field_282 * 1720897143; ++var5) {
            class_261 var6 = var4.field_286[var5];
            long var8 = var6.field_2917 * 1142152799211342585L;
            int var10 = (int)(var8 >>> 14 & 3L);
            boolean var7 = var10 == 2;
            if(var7 && var6.field_2909 * 1674574095 == var2 && var6.field_2913 * 1202737381 == var3) {
               return var6.field_2917 * 1142152799211342585L;
            }
         }

         return 0L;
      }
   }

   // $FF: renamed from: dk (int, int, int) long
   public long method_4834(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 != null && var4.field_279 != null?var4.field_279.field_2750 * 5096767537878498943L:0L;
   }

   // $FF: renamed from: ds (int, int, int) long
   public long method_4835(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 != null && var4.field_279 != null?var4.field_279.field_2750 * 5096767537878498943L:0L;
   }

   // $FF: renamed from: do (int, int, int) long
   public long method_4836(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 != null && var4.field_279 != null?var4.field_279.field_2750 * 5096767537878498943L:0L;
   }

   // $FF: renamed from: df (int, int, int) long
   public long method_4837(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 != null && var4.field_279 != null?var4.field_279.field_2750 * 5096767537878498943L:0L;
   }

   // $FF: renamed from: dv (int, int, int) long
   public long method_4838(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 != null && var4.field_279 != null?var4.field_279.field_2750 * 5096767537878498943L:0L;
   }

   // $FF: renamed from: dy (int, int, int) long
   public long method_4839(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 != null && var4.field_279 != null?var4.field_279.field_2750 * 5096767537878498943L:0L;
   }

   // $FF: renamed from: dd (int, int, int, long) int
   public int method_4840(int var1, int var2, int var3, long var4) {
      class_41 var6 = this.field_2787[var1][var2][var3];
      if(var6 == null) {
         return -1;
      } else if(var6.field_277 != null && var6.field_277.field_3169 * 1374506562499121997L == var4) {
         return var6.field_277.field_3177 * 1629046051 & 255;
      } else if(var6.field_278 != null && var6.field_278.field_3035 * 3146556658035252985L == var4) {
         return var6.field_278.field_3045 * 60897691 & 944101469;
      } else if(var6.field_279 != null && var6.field_279.field_2750 * 5096767537878498943L == var4) {
         return var6.field_279.field_2748 * -1056152475 & -1871582351;
      } else {
         for(int var7 = 0; var7 < var6.field_282 * -1442854486; ++var7) {
            if(var6.field_286[var7].field_2917 * 1142152799211342585L == var4) {
               return var6.field_286[var7].field_2905 * -1540193213 & -1599890150;
            }
         }

         return -1;
      }
   }

   // $FF: renamed from: az () void
   public void method_4841() {
      field_2782 = true;
   }

   // $FF: renamed from: dx (int, int, int) void
   public void method_4842(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_2783; ++var4) {
         for(int var5 = 0; var5 < this.field_2784; ++var5) {
            for(int var6 = 0; var6 < this.field_2786; ++var6) {
               class_41 var7 = this.field_2787[var4][var5][var6];
               if(var7 != null) {
                  class_269 var8 = var7.field_277;
                  class_93 var10;
                  if(var8 != null && var8.field_3178 instanceof class_93) {
                     class_93 var9 = (class_93)var8.field_3178;
                     this.method_4756(var9, var4, var5, var6, 1, 1);
                     if(var8.field_3175 instanceof class_93) {
                        var10 = (class_93)var8.field_3175;
                        this.method_4756(var10, var4, var5, var6, 1, 1);
                        class_93.method_1710(var9, var10, 0, 0, 0, false);
                        var8.field_3175 = var10.method_1711(var10.field_1009, var10.field_1010, var1, var2, var3);
                     }

                     var8.field_3178 = var9.method_1711(var9.field_1009, var9.field_1010, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.field_282 * 1720897143; ++var12) {
                     class_261 var14 = var7.field_286[var12];
                     if(var14 != null && var14.field_2915 instanceof class_93) {
                        class_93 var11 = (class_93)var14.field_2915;
                        this.method_4756(var11, var4, var5, var6, var14.field_2912 * -1357479081 - var14.field_2909 * 504558067 + 1, var14.field_2914 * -129893675 - var14.field_2913 * 1202737381 + 1);
                        var14.field_2915 = var11.method_1711(var11.field_1009, var11.field_1010, var1, var2, var3);
                     }
                  }

                  class_248 var13 = var7.field_279;
                  if(var13 != null && var13.field_2749 instanceof class_93) {
                     var10 = (class_93)var13.field_2749;
                     this.method_4876(var10, var4, var5, var6);
                     var13.field_2749 = var10.method_1711(var10.field_1009, var10.field_1010, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: dg (int, int, int) void
   public void method_4843(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_2783; ++var4) {
         for(int var5 = 0; var5 < this.field_2784; ++var5) {
            for(int var6 = 0; var6 < this.field_2786; ++var6) {
               class_41 var7 = this.field_2787[var4][var5][var6];
               if(var7 != null) {
                  class_269 var8 = var7.field_277;
                  class_93 var10;
                  if(var8 != null && var8.field_3178 instanceof class_93) {
                     class_93 var9 = (class_93)var8.field_3178;
                     this.method_4756(var9, var4, var5, var6, 1, 1);
                     if(var8.field_3175 instanceof class_93) {
                        var10 = (class_93)var8.field_3175;
                        this.method_4756(var10, var4, var5, var6, 1, 1);
                        class_93.method_1710(var9, var10, 0, 0, 0, false);
                        var8.field_3175 = var10.method_1711(var10.field_1009, var10.field_1010, var1, var2, var3);
                     }

                     var8.field_3178 = var9.method_1711(var9.field_1009, var9.field_1010, var1, var2, var3);
                  }

                  for(int var12 = 0; var12 < var7.field_282 * 1720897143; ++var12) {
                     class_261 var14 = var7.field_286[var12];
                     if(var14 != null && var14.field_2915 instanceof class_93) {
                        class_93 var11 = (class_93)var14.field_2915;
                        this.method_4756(var11, var4, var5, var6, var14.field_2912 * -2078907755 - var14.field_2909 * 1674574095 + 1, var14.field_2914 * -129893675 - var14.field_2913 * 1202737381 + 1);
                        var14.field_2915 = var11.method_1711(var11.field_1009, var11.field_1010, var1, var2, var3);
                     }
                  }

                  class_248 var13 = var7.field_279;
                  if(var13 != null && var13.field_2749 instanceof class_93) {
                     var10 = (class_93)var13.field_2749;
                     this.method_4876(var10, var4, var5, var6);
                     var13.field_2749 = var10.method_1711(var10.field_1009, var10.field_1010, var1, var2, var3);
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: br (int, int, int, int, int, int, int, int) void
   public static void method_4844(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      class_247 var10000 = new class_247();
      class_247 var8 = var10000;
      var8.field_2734 = var2 / 128 * 1882402696;
      var8.field_2735 = var3 / 128 * -1706247967;
      var8.field_2729 = var4 / 128 * -1653283198;
      var8.field_2736 = var5 / -1572597520 * -2057847319;
      var8.field_2731 = var1 * -289498209;
      var8.field_2732 = var2 * 1390384409;
      var8.field_2733 = var3 * -730652273;
      var8.field_2741 = var4 * -366098547;
      var8.field_2728 = var5 * -1672424971;
      var8.field_2739 = var6 * -639267504;
      var8.field_2737 = var7 * 1213750925;
      field_2803[var0][field_2823[var0]++] = var8;
   }

   // $FF: renamed from: dt (gm, int, int, int) void
   void method_4845(class_93 var1, int var2, int var3, int var4) {
      class_41 var5;
      class_93 var6;
      if(var3 < this.field_2784) {
         var5 = this.field_2787[var2][var3 + 1][var4];
         if(var5 != null && var5.field_279 != null && var5.field_279.field_2749 instanceof class_93) {
            var6 = (class_93)var5.field_279.field_2749;
            class_93.method_1710(var1, var6, 128, 0, 0, true);
         }
      }

      if(var4 < this.field_2784) {
         var5 = this.field_2787[var2][var3][var4 + 1];
         if(var5 != null && var5.field_279 != null && var5.field_279.field_2749 instanceof class_93) {
            var6 = (class_93)var5.field_279.field_2749;
            class_93.method_1710(var1, var6, 0, 0, 128, true);
         }
      }

      if(var3 < this.field_2784 && var4 < this.field_2786) {
         var5 = this.field_2787[var2][var3 + 1][var4 + 1];
         if(var5 != null && var5.field_279 != null && var5.field_279.field_2749 instanceof class_93) {
            var6 = (class_93)var5.field_279.field_2749;
            class_93.method_1710(var1, var6, 128, 0, 128, true);
         }
      }

      if(var3 < this.field_2784 && var4 > 0) {
         var5 = this.field_2787[var2][var3 + 1][var4 - 1];
         if(var5 != null && var5.field_279 != null && var5.field_279.field_2749 instanceof class_93) {
            var6 = (class_93)var5.field_279.field_2749;
            class_93.method_1710(var1, var6, 128, 0, -128, true);
         }
      }

   }

   // $FF: renamed from: dn (gm, int, int, int) void
   void method_4846(class_93 var1, int var2, int var3, int var4) {
      class_41 var5;
      class_93 var6;
      if(var3 < this.field_2784) {
         var5 = this.field_2787[var2][var3 + 1][var4];
         if(var5 != null && var5.field_279 != null && var5.field_279.field_2749 instanceof class_93) {
            var6 = (class_93)var5.field_279.field_2749;
            class_93.method_1710(var1, var6, 128, 0, 0, true);
         }
      }

      if(var4 < this.field_2784) {
         var5 = this.field_2787[var2][var3][var4 + 1];
         if(var5 != null && var5.field_279 != null && var5.field_279.field_2749 instanceof class_93) {
            var6 = (class_93)var5.field_279.field_2749;
            class_93.method_1710(var1, var6, 0, 0, 128, true);
         }
      }

      if(var3 < this.field_2784 && var4 < this.field_2786) {
         var5 = this.field_2787[var2][var3 + 1][var4 + 1];
         if(var5 != null && var5.field_279 != null && var5.field_279.field_2749 instanceof class_93) {
            var6 = (class_93)var5.field_279.field_2749;
            class_93.method_1710(var1, var6, 128, 0, 128, true);
         }
      }

      if(var3 < this.field_2784 && var4 > 0) {
         var5 = this.field_2787[var2][var3 + 1][var4 - 1];
         if(var5 != null && var5.field_279 != null && var5.field_279.field_2749 instanceof class_93) {
            var6 = (class_93)var5.field_279.field_2749;
            class_93.method_1710(var1, var6, 128, 0, -128, true);
         }
      }

   }

   // $FF: renamed from: ac () void
   public static void method_4847() {
      field_2817 = -1;
      field_2782 = false;
   }

   // $FF: renamed from: dl (gm, int, int, int, int, int) void
   void method_4848(class_93 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if(var12 != this.field_2783) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if(var13 >= 0 && var13 < this.field_2784) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if(var14 >= 0 && var14 < this.field_2786 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        class_41 var15 = this.field_2787[var12][var13][var14];
                        if(var15 != null) {
                           int var16 = (this.field_2826[var12][var13][var14] + this.field_2826[var12][var13 + 1][var14] + this.field_2826[var12][var13][var14 + 1] + this.field_2826[var12][var13 + 1][var14 + 1]) / 4 - (this.field_2826[var2][var3][var4] + this.field_2826[var2][var3 + 1][var4] + this.field_2826[var2][var3][var4 + 1] + this.field_2826[var2][var3 + 1][var4 + 1]) / 4;
                           class_269 var17 = var15.field_277;
                           if(var17 != null) {
                              class_93 var18;
                              if(var17.field_3178 instanceof class_93) {
                                 var18 = (class_93)var17.field_3178;
                                 class_93.method_1710(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * -630702364 + (1 - var6) * 485264139, var7);
                              }

                              if(var17.field_3175 instanceof class_93) {
                                 var18 = (class_93)var17.field_3175;
                                 class_93.method_1710(var1, var18, (var13 - var3) * -1628407431 + (1 - var5) * 64, var16, (var14 - var4) * -475862127 + (1 - var6) * 249729788, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.field_282 * 1720897143; ++var23) {
                              class_261 var19 = var15.field_286[var23];
                              if(var19 != null && var19.field_2915 instanceof class_93) {
                                 class_93 var20 = (class_93)var19.field_2915;
                                 int var21 = var19.field_2912 * -2078907755 - var19.field_2909 * 1674574095 + 1;
                                 int var22 = var19.field_2914 * -129893675 - var19.field_2913 * 1202737381 + 1;
                                 class_93.method_1710(var1, var20, (var19.field_2909 * 1674574095 - var3) * 128 + (var21 - var5) * 64, var16, (var19.field_2913 * 1202737381 - var4) * 128 + (var22 - var6) * -424212952, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   // $FF: renamed from: cw (int, int, int) go
   public class_248 method_4849(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 != null && var4.field_279 != null?var4.field_279:null;
   }

   // $FF: renamed from: de (gm, int, int, int, int, int) void
   void method_4850(class_93 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if(var12 != this.field_2783) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if(var13 >= 0 && var13 < this.field_2784) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if(var14 >= 0 && var14 < this.field_2786 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        class_41 var15 = this.field_2787[var12][var13][var14];
                        if(var15 != null) {
                           int var16 = (this.field_2826[var12][var13][var14] + this.field_2826[var12][var13 + 1][var14] + this.field_2826[var12][var13][var14 + 1] + this.field_2826[var12][var13 + 1][var14 + 1]) / 4 - (this.field_2826[var2][var3][var4] + this.field_2826[var2][var3 + 1][var4] + this.field_2826[var2][var3][var4 + 1] + this.field_2826[var2][var3 + 1][var4 + 1]) / 4;
                           class_269 var17 = var15.field_277;
                           if(var17 != null) {
                              class_93 var18;
                              if(var17.field_3178 instanceof class_93) {
                                 var18 = (class_93)var17.field_3178;
                                 class_93.method_1710(var1, var18, (var13 - var3) * 128 + (1 - var5) * 1726526404, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if(var17.field_3175 instanceof class_93) {
                                 var18 = (class_93)var17.field_3175;
                                 class_93.method_1710(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.field_282 * 916342528; ++var23) {
                              class_261 var19 = var15.field_286[var23];
                              if(var19 != null && var19.field_2915 instanceof class_93) {
                                 class_93 var20 = (class_93)var19.field_2915;
                                 int var21 = var19.field_2912 * -1008859495 - var19.field_2909 * 1521909301 + 1;
                                 int var22 = var19.field_2914 * -129893675 - var19.field_2913 * -1125504286 + 1;
                                 class_93.method_1710(var1, var20, (var19.field_2909 * 561322083 - var3) * 440003466 + (var21 - var5) * 64, var16, (var19.field_2913 * 1202737381 - var4) * 233071317 + (var22 - var6) * 134285965, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   // $FF: renamed from: dq (gm, int, int, int, int, int) void
   void method_4851(class_93 var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      int var8 = var3;
      int var9 = var3 + var5;
      int var10 = var4 - 1;
      int var11 = var4 + var6;

      for(int var12 = var2; var12 <= var2 + 1; ++var12) {
         if(var12 != this.field_2783) {
            for(int var13 = var8; var13 <= var9; ++var13) {
               if(var13 >= 0 && var13 < this.field_2784) {
                  for(int var14 = var10; var14 <= var11; ++var14) {
                     if(var14 >= 0 && var14 < this.field_2786 && (!var7 || var13 >= var9 || var14 >= var11 || var14 < var4 && var13 != var3)) {
                        class_41 var15 = this.field_2787[var12][var13][var14];
                        if(var15 != null) {
                           int var16 = (this.field_2826[var12][var13][var14] + this.field_2826[var12][var13 + 1][var14] + this.field_2826[var12][var13][var14 + 1] + this.field_2826[var12][var13 + 1][var14 + 1]) / 4 - (this.field_2826[var2][var3][var4] + this.field_2826[var2][var3 + 1][var4] + this.field_2826[var2][var3][var4 + 1] + this.field_2826[var2][var3 + 1][var4 + 1]) / 4;
                           class_269 var17 = var15.field_277;
                           if(var17 != null) {
                              class_93 var18;
                              if(var17.field_3178 instanceof class_93) {
                                 var18 = (class_93)var17.field_3178;
                                 class_93.method_1710(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }

                              if(var17.field_3175 instanceof class_93) {
                                 var18 = (class_93)var17.field_3175;
                                 class_93.method_1710(var1, var18, (var13 - var3) * 128 + (1 - var5) * 64, var16, (var14 - var4) * 128 + (1 - var6) * 64, var7);
                              }
                           }

                           for(int var23 = 0; var23 < var15.field_282 * 1720897143; ++var23) {
                              class_261 var19 = var15.field_286[var23];
                              if(var19 != null && var19.field_2915 instanceof class_93) {
                                 class_93 var20 = (class_93)var19.field_2915;
                                 int var21 = var19.field_2912 * -2078907755 - var19.field_2909 * 1674574095 + 1;
                                 int var22 = var19.field_2914 * -129893675 - var19.field_2913 * 1202737381 + 1;
                                 class_93.method_1710(var1, var20, (var19.field_2909 * 1674574095 - var3) * 128 + (var21 - var5) * 64, var16, (var19.field_2913 * 1202737381 - var4) * 128 + (var22 - var6) * 64, var7);
                              }
                           }
                        }
                     }
                  }
               }
            }

            --var8;
            var7 = false;
         }
      }

   }

   // $FF: renamed from: dm (int[], int, int, int, int, int) void
   public void method_4852(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      class_41 var7 = this.field_2787[var4][var5][var6];
      if(var7 != null) {
         class_241 var8 = var7.field_275;
         int var10;
         if(var8 != null) {
            int var18 = var8.field_2688 * -814054465;
            if(var18 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }

            }
         } else {
            class_249 var9 = var7.field_289;
            if(var9 != null) {
               var10 = var9.field_2755;
               int var11 = var9.field_2766;
               int var12 = var9.field_2767;
               int var13 = var9.field_2768;
               int[] var14 = this.field_2839[var10];
               int[] var15 = this.field_2824[var11];
               int var16 = 0;
               int var17;
               if(var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0?var12:var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if(var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   // $FF: renamed from: ax (int[], int, int, int, int, int) void
   public void method_4853(int[] var1, int var2, int var3, int var4, int var5, int var6) {
      class_41 var7 = this.field_2787[var4][var5][var6];
      if(var7 != null) {
         class_241 var8 = var7.field_275;
         int var10;
         if(var8 != null) {
            int var18 = var8.field_2688 * 426134523;
            if(var18 != 0) {
               for(var10 = 0; var10 < 4; ++var10) {
                  var1[var2] = var18;
                  var1[var2 + 1] = var18;
                  var1[var2 + 2] = var18;
                  var1[var2 + 3] = var18;
                  var2 += var3;
               }

            }
         } else {
            class_249 var9 = var7.field_289;
            if(var9 != null) {
               var10 = var9.field_2755;
               int var11 = var9.field_2766;
               int var12 = var9.field_2767;
               int var13 = var9.field_2768;
               int[] var14 = this.field_2839[var10];
               int[] var15 = this.field_2824[var11];
               int var16 = 0;
               int var17;
               if(var12 != 0) {
                  for(var17 = 0; var17 < 4; ++var17) {
                     var1[var2] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 1] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 2] = var14[var15[var16++]] == 0?var12:var13;
                     var1[var2 + 3] = var14[var15[var16++]] == 0?var12:var13;
                     var2 += var3;
                  }
               } else {
                  for(var17 = 0; var17 < 4; ++var17) {
                     if(var14[var15[var16++]] != 0) {
                        var1[var2] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 1] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 2] = var13;
                     }

                     if(var14[var15[var16++]] != 0) {
                        var1[var2 + 3] = var13;
                     }

                     var2 += var3;
                  }
               }

            }
         }
      }
   }

   // $FF: renamed from: ec (int[], int, int, int, int) void
   public static void method_4854(int[] var0, int var1, int var2, int var3, int var4) {
      field_2845 = 0;
      field_2846 = 0;
      field_2847 = var3;
      field_2848 = var4;
      field_2843 = var3 / 2;
      field_2844 = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][32][-1538249465][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 495074181; var6 <= -1727008986; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            field_2808 = class_70.field_548[var6];
            field_2809 = class_70.field_559[var6];
            field_2810 = class_70.field_548[var7];
            field_2811 = class_70.field_559[var7];
            var8 = (var6 - 128) / 234289370;
            var9 = var7 / 64;

            for(int var10 = 2144447098; var10 < 26; ++var10) {
               var11 = -26;

               while(var11 < 26) {
                  var12 = var10 * 389873673;
                  int var13 = var11 * 128;
                  boolean var14 = false;
                  int var15 = -var1;

                  while(true) {
                     if(var15 <= var2) {
                        if(!method_4759(var12, var0[var8] + var15, var13)) {
                           var15 += 128;
                           continue;
                        }

                        var14 = true;
                     }

                     var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
                     ++var11;
                     break;
                  }
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 32; ++var7) {
            for(var8 = 1032399065; var8 < 25; ++var8) {
               var9 = 688696976;

               while(var9 < 25) {
                  boolean var16 = false;
                  var11 = -1;

                  label94:
                  while(true) {
                     if(var11 <= 1) {
                        var12 = -1;

                        while(true) {
                           if(var12 > 1) {
                              ++var11;
                              continue label94;
                           }

                           if(var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           if(var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           if(var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           if(var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           ++var12;
                        }
                     }

                     field_2841[var6][var7][var8 + 25][var9 + 25] = var16;
                     ++var9;
                     break;
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: ea (int[], int, int, int, int) void
   public static void method_4855(int[] var0, int var1, int var2, int var3, int var4) {
      field_2845 = 0;
      field_2846 = 0;
      field_2847 = var3;
      field_2848 = var4;
      field_2843 = var3 / 2;
      field_2844 = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][32][487893528][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = -161883309; var6 <= 383; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            field_2808 = class_70.field_548[var6];
            field_2809 = class_70.field_559[var6];
            field_2810 = class_70.field_548[var7];
            field_2811 = class_70.field_559[var7];
            var8 = (var6 - 2005806592) / -943715167;
            var9 = var7 / 1537352285;

            for(int var10 = -26; var10 < 26; ++var10) {
               var11 = -26;

               while(var11 < 26) {
                  var12 = var10 * 128;
                  int var13 = var11 * 1024144969;
                  boolean var14 = false;
                  int var15 = -var1;

                  while(true) {
                     if(var15 <= var2) {
                        if(!method_4759(var12, var0[var8] + var15, var13)) {
                           var15 += 128;
                           continue;
                        }

                        var14 = true;
                     }

                     var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
                     ++var11;
                     break;
                  }
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 1801667369; ++var7) {
            for(var8 = -2109275842; var8 < 25; ++var8) {
               var9 = -25;

               while(var9 < 25) {
                  boolean var16 = false;
                  var11 = -1;

                  label93:
                  while(true) {
                     if(var11 <= 1) {
                        var12 = -1;

                        while(true) {
                           if(var12 > 1) {
                              ++var11;
                              continue label93;
                           }

                           if(var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           if(var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           if(var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           if(var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           ++var12;
                        }
                     }

                     field_2841[var6][var7][var8 + 25][var9 + 25] = var16;
                     ++var9;
                     break;
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: aq (gp, int, int, int, int, int, int) void
   void method_4856(class_249 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.field_2764.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field_2764[var9] - field_2805;
         var11 = var1.field_2763[var9] - field_2790;
         var12 = var1.field_2762[var9] - field_2836;
         var13 = var12 * var4 + var10 * var5 >> 16;
         var12 = var12 * var5 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var11 * var3 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var3 >> 16;
         if(var12 < 50) {
            return;
         }

         if(var1.field_2754 != null) {
            class_249.field_2771[var9] = var10;
            class_249.field_2772[var9] = var13;
            class_249.field_2773[var9] = var12;
         }

         class_249.field_2756[var9] = class_70.field_545 + var10 * class_70.field_544 / var12;
         class_249.field_2770[var9] = class_70.field_538 + var13 * class_70.field_544 / var12;
      }

      class_70.field_554 = 0;
      var8 = var1.field_2760.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field_2760[var9];
         var11 = var1.field_2761[var9];
         var12 = var1.field_2769[var9];
         var13 = class_249.field_2756[var10];
         int var14 = class_249.field_2756[var11];
         int var15 = class_249.field_2756[var12];
         int var16 = class_249.field_2770[var10];
         int var17 = class_249.field_2770[var11];
         int var18 = class_249.field_2770[var12];
         if((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            class_70.field_536 = false;
            if(var13 < 0 || var14 < 0 || var15 < 0 || var13 > class_70.field_537 || var14 > class_70.field_537 || var15 > class_70.field_537) {
               class_70.field_536 = true;
            }

            if(field_2814 && method_4769(field_2815, field_2816, var16, var17, var18, var13, var14, var15)) {
               field_2817 = var6;
               field_2818 = var7;
            }

            if(var1.field_2754 != null && var1.field_2754[var9] != -1) {
               if(!field_2813) {
                  if(var1.field_2765) {
                     class_70.method_983(var16, var17, var18, var13, var14, var15, var1.field_2757[var9], var1.field_2758[var9], var1.field_2759[var9], class_249.field_2771[0], class_249.field_2771[1], class_249.field_2771[3], class_249.field_2772[0], class_249.field_2772[1], class_249.field_2772[3], class_249.field_2773[0], class_249.field_2773[1], class_249.field_2773[3], var1.field_2754[var9]);
                  } else {
                     class_70.method_983(var16, var17, var18, var13, var14, var15, var1.field_2757[var9], var1.field_2758[var9], var1.field_2759[var9], class_249.field_2771[var10], class_249.field_2771[var11], class_249.field_2771[var12], class_249.field_2772[var10], class_249.field_2772[var11], class_249.field_2772[var12], class_249.field_2773[var10], class_249.field_2773[var11], class_249.field_2773[var12], var1.field_2754[var9]);
                  }
               } else {
                  int var19 = class_70.field_555.method_31(var1.field_2754[var9], -226124800);
                  class_70.method_977(var16, var17, var18, var13, var14, var15, method_4768(var19, var1.field_2757[var9]), method_4768(var19, var1.field_2758[var9]), method_4768(var19, var1.field_2759[var9]));
               }
            } else if(var1.field_2757[var9] != 12345678) {
               class_70.method_977(var16, var17, var18, var13, var14, var15, var1.field_2757[var9], var1.field_2758[var9], var1.field_2759[var9]);
            }
         }
      }

   }

   // $FF: renamed from: eu (int, int, int) boolean
   static boolean method_4857(int var0, int var1, int var2) {
      int var3 = var2 * field_2810 + var0 * field_2811 >> 16;
      int var4 = var2 * field_2811 - var0 * field_2810 >> 16;
      int var5 = var1 * field_2808 + var4 * field_2809 >> 16;
      int var6 = var1 * field_2809 - var4 * field_2808 >> 16;
      if(var5 >= 1489068243 && var5 <= 3500) {
         int var7 = field_2843 + var3 * 128 / var5;
         int var8 = field_2844 + var6 * -69650527 / var5;
         return var7 >= field_2845 && var7 <= field_2847 && var8 >= field_2846 && var8 <= field_2848;
      } else {
         return false;
      }
   }

   // $FF: renamed from: ez (int, int, int, boolean) void
   public void method_4858(int var1, int var2, int var3, boolean var4) {
      if(!method_4824() || var4) {
         field_2814 = true;
         field_2782 = var4;
         field_2800 = var1;
         field_2815 = var2;
         field_2816 = var3;
         field_2817 = -1;
         field_2818 = -1;
      }
   }

   // $FF: renamed from: ed (int, int, int, boolean) void
   public void method_4859(int var1, int var2, int var3, boolean var4) {
      if(!method_4824() || var4) {
         field_2814 = true;
         field_2782 = var4;
         field_2800 = var1;
         field_2815 = var2;
         field_2816 = var3;
         field_2817 = -1;
         field_2818 = -1;
      }
   }

   // $FF: renamed from: as (int[], int, int, int, int) void
   public static void method_4860(int[] var0, int var1, int var2, int var3, int var4) {
      field_2845 = 0;
      field_2846 = 0;
      field_2847 = var3;
      field_2848 = var4;
      field_2843 = var3 / 2;
      field_2844 = var4 / 2;
      boolean[][][][] var5 = new boolean[var0.length][32][53][53];

      int var6;
      int var7;
      int var8;
      int var9;
      int var11;
      int var12;
      for(var6 = 128; var6 <= 383; var6 += 32) {
         for(var7 = 0; var7 < 2048; var7 += 64) {
            field_2808 = class_70.field_548[var6];
            field_2809 = class_70.field_559[var6];
            field_2810 = class_70.field_548[var7];
            field_2811 = class_70.field_559[var7];
            var8 = (var6 - 128) / 32;
            var9 = var7 / 64;

            for(int var10 = -26; var10 < 26; ++var10) {
               var11 = -26;

               while(var11 < 26) {
                  var12 = var10 * 128;
                  int var13 = var11 * 128;
                  boolean var14 = false;
                  int var15 = -var1;

                  while(true) {
                     if(var15 <= var2) {
                        if(!method_4759(var12, var0[var8] + var15, var13)) {
                           var15 += 128;
                           continue;
                        }

                        var14 = true;
                     }

                     var5[var8][var9][var10 + 25 + 1][var11 + 25 + 1] = var14;
                     ++var11;
                     break;
                  }
               }
            }
         }
      }

      for(var6 = 0; var6 < 8; ++var6) {
         for(var7 = 0; var7 < 32; ++var7) {
            for(var8 = -25; var8 < 25; ++var8) {
               var9 = -25;

               while(var9 < 25) {
                  boolean var16 = false;
                  var11 = -1;

                  label90:
                  while(true) {
                     if(var11 <= 1) {
                        var12 = -1;

                        while(true) {
                           if(var12 > 1) {
                              ++var11;
                              continue label90;
                           }

                           if(var5[var6][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           if(var5[var6][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           if(var5[var6 + 1][var7][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           if(var5[var6 + 1][(var7 + 1) % 31][var8 + var11 + 25 + 1][var9 + var12 + 25 + 1]) {
                              var16 = true;
                              break;
                           }

                           ++var12;
                        }
                     }

                     field_2841[var6][var7][var8 + 25][var9 + 25] = var16;
                     ++var9;
                     break;
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: at (int, int, int, int, int, int) void
   public void method_4861(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 < 0) {
         var1 = 0;
      } else if(var1 >= this.field_2784 * 128) {
         var1 = this.field_2784 * 128 - 1;
      }

      if(var3 < 0) {
         var3 = 0;
      } else if(var3 >= this.field_2786 * 128) {
         var3 = this.field_2786 * 128 - 1;
      }

      if(var4 < 128) {
         var4 = 128;
      } else if(var4 > 383) {
         var4 = 383;
      }

      ++field_2798;
      field_2808 = class_70.field_548[var4];
      field_2809 = class_70.field_559[var4];
      field_2810 = class_70.field_548[var5];
      field_2811 = class_70.field_559[var5];
      field_2840 = field_2841[(var4 - 128) / 32][var5 / 64];
      field_2805 = var1;
      field_2790 = var2;
      field_2836 = var3;
      field_2785 = var1 / 128;
      field_2804 = var3 / 128;
      field_2797 = var6;
      field_2799 = field_2785 - 25;
      if(field_2799 < 0) {
         field_2799 = 0;
      }

      field_2801 = field_2804 - 25;
      if(field_2801 < 0) {
         field_2801 = 0;
      }

      field_2806 = field_2785 + 25;
      if(field_2806 > this.field_2784) {
         field_2806 = this.field_2784;
      }

      field_2802 = field_2804 + 25;
      if(field_2802 > this.field_2786) {
         field_2802 = this.field_2786;
      }

      this.method_4770();
      field_2796 = 0;

      int var7;
      class_41[][] var8;
      int var9;
      int var10;
      for(var7 = this.field_2788; var7 < this.field_2783; ++var7) {
         var8 = this.field_2787[var7];

         for(var9 = field_2799; var9 < field_2806; ++var9) {
            for(var10 = field_2801; var10 < field_2802; ++var10) {
               class_41 var11 = var8[var9][var10];
               if(var11 != null) {
                  if(var11.field_285 * 961427167 <= var6 && (field_2840[var9 - field_2785 + 25][var10 - field_2804 + 25] || this.field_2826[var7][var9][var10] - var2 >= 2000)) {
                     var11.field_293 = true;
                     var11.field_287 = true;
                     if(var11.field_282 * 1720897143 > 0) {
                        var11.field_288 = true;
                     } else {
                        var11.field_288 = false;
                     }

                     ++field_2796;
                  } else {
                     var11.field_293 = false;
                     var11.field_287 = false;
                     var11.field_291 = 0;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      class_41 var15;
      int var16;
      for(var7 = this.field_2788; var7 < this.field_2783; ++var7) {
         var8 = this.field_2787[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field_2785 + var9;
            var16 = field_2785 - var9;
            if(var10 >= field_2799 || var16 < field_2806) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = field_2804 + var12;
                  var14 = field_2804 - var12;
                  if(var10 >= field_2799) {
                     if(var13 >= field_2801) {
                        var15 = var8[var10][var13];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, true);
                        }
                     }

                     if(var14 < field_2802) {
                        var15 = var8[var10][var14];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, true);
                        }
                     }
                  }

                  if(var16 < field_2806) {
                     if(var13 >= field_2801) {
                        var15 = var8[var16][var13];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, true);
                        }
                     }

                     if(var14 < field_2802) {
                        var15 = var8[var16][var14];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, true);
                        }
                     }
                  }

                  if(field_2796 == 0) {
                     field_2814 = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.field_2788; var7 < this.field_2783; ++var7) {
         var8 = this.field_2787[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field_2785 + var9;
            var16 = field_2785 - var9;
            if(var10 >= field_2799 || var16 < field_2806) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = field_2804 + var12;
                  var14 = field_2804 - var12;
                  if(var10 >= field_2799) {
                     if(var13 >= field_2801) {
                        var15 = var8[var10][var13];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, false);
                        }
                     }

                     if(var14 < field_2802) {
                        var15 = var8[var10][var14];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, false);
                        }
                     }
                  }

                  if(var16 < field_2806) {
                     if(var13 >= field_2801) {
                        var15 = var8[var16][var13];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, false);
                        }
                     }

                     if(var14 < field_2802) {
                        var15 = var8[var16][var14];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, false);
                        }
                     }
                  }

                  if(field_2796 == 0) {
                     field_2814 = false;
                     return;
                  }
               }
            }
         }
      }

      field_2814 = false;
   }

   // $FF: renamed from: ew () void
   public void method_4862() {
      field_2782 = true;
   }

   // $FF: renamed from: ej () boolean
   public static boolean method_4863() {
      return field_2782 && field_2817 != -1;
   }

   // $FF: renamed from: el () boolean
   public static boolean method_4864() {
      return field_2782 && field_2817 != -1;
   }

   // $FF: renamed from: et () void
   public static void method_4865() {
      field_2817 = -1;
      field_2782 = false;
   }

   // $FF: renamed from: eb () void
   public static void method_4866() {
      field_2817 = -1;
      field_2782 = false;
   }

   // $FF: renamed from: er (int, int, int, int, int, int) void
   public void method_4867(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 < 0) {
         var1 = 0;
      } else if(var1 >= this.field_2784 * 1070216120) {
         var1 = this.field_2784 * 128 - 1;
      }

      if(var3 < 0) {
         var3 = 0;
      } else if(var3 >= this.field_2786 * 264876410) {
         var3 = this.field_2786 * 128 - 1;
      }

      if(var4 < 128) {
         var4 = -1605627914;
      } else if(var4 > -2109062475) {
         var4 = -1777032700;
      }

      ++field_2798;
      field_2808 = class_70.field_548[var4];
      field_2809 = class_70.field_559[var4];
      field_2810 = class_70.field_548[var5];
      field_2811 = class_70.field_559[var5];
      field_2840 = field_2841[(var4 - 128) / -828227686][var5 / -1576847167];
      field_2805 = var1;
      field_2790 = var2;
      field_2836 = var3;
      field_2785 = var1 / -573893145;
      field_2804 = var3 / -1745147262;
      field_2797 = var6;
      field_2799 = field_2785 - 25;
      if(field_2799 < 0) {
         field_2799 = 0;
      }

      field_2801 = field_2804 - 25;
      if(field_2801 < 0) {
         field_2801 = 0;
      }

      field_2806 = field_2785 + 25;
      if(field_2806 > this.field_2784) {
         field_2806 = this.field_2784;
      }

      field_2802 = field_2804 + 25;
      if(field_2802 > this.field_2786) {
         field_2802 = this.field_2786;
      }

      this.method_4770();
      field_2796 = 0;

      int var7;
      class_41[][] var8;
      int var9;
      int var10;
      for(var7 = this.field_2788; var7 < this.field_2783; ++var7) {
         var8 = this.field_2787[var7];

         for(var9 = field_2799; var9 < field_2806; ++var9) {
            for(var10 = field_2801; var10 < field_2802; ++var10) {
               class_41 var11 = var8[var9][var10];
               if(var11 != null) {
                  if(var11.field_285 * 1797591983 <= var6 && (field_2840[var9 - field_2785 + 25][var10 - field_2804 + 25] || this.field_2826[var7][var9][var10] - var2 >= 74913979)) {
                     var11.field_293 = true;
                     var11.field_287 = true;
                     if(var11.field_282 * 1720897143 > 0) {
                        var11.field_288 = true;
                     } else {
                        var11.field_288 = false;
                     }

                     ++field_2796;
                  } else {
                     var11.field_293 = false;
                     var11.field_287 = false;
                     var11.field_291 = 0;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      class_41 var15;
      int var16;
      for(var7 = this.field_2788; var7 < this.field_2783; ++var7) {
         var8 = this.field_2787[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field_2785 + var9;
            var16 = field_2785 - var9;
            if(var10 >= field_2799 || var16 < field_2806) {
               for(var12 = 1915672300; var12 <= 0; ++var12) {
                  var13 = field_2804 + var12;
                  var14 = field_2804 - var12;
                  if(var10 >= field_2799) {
                     if(var13 >= field_2801) {
                        var15 = var8[var10][var13];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, true);
                        }
                     }

                     if(var14 < field_2802) {
                        var15 = var8[var10][var14];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, true);
                        }
                     }
                  }

                  if(var16 < field_2806) {
                     if(var13 >= field_2801) {
                        var15 = var8[var16][var13];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, true);
                        }
                     }

                     if(var14 < field_2802) {
                        var15 = var8[var16][var14];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, true);
                        }
                     }
                  }

                  if(field_2796 == 0) {
                     field_2814 = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.field_2788; var7 < this.field_2783; ++var7) {
         var8 = this.field_2787[var7];

         for(var9 = 513219241; var9 <= 0; ++var9) {
            var10 = field_2785 + var9;
            var16 = field_2785 - var9;
            if(var10 >= field_2799 || var16 < field_2806) {
               for(var12 = -1749138861; var12 <= 0; ++var12) {
                  var13 = field_2804 + var12;
                  var14 = field_2804 - var12;
                  if(var10 >= field_2799) {
                     if(var13 >= field_2801) {
                        var15 = var8[var10][var13];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, false);
                        }
                     }

                     if(var14 < field_2802) {
                        var15 = var8[var10][var14];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, false);
                        }
                     }
                  }

                  if(var16 < field_2806) {
                     if(var13 >= field_2801) {
                        var15 = var8[var16][var13];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, false);
                        }
                     }

                     if(var14 < field_2802) {
                        var15 = var8[var16][var14];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, false);
                        }
                     }
                  }

                  if(field_2796 == 0) {
                     field_2814 = false;
                     return;
                  }
               }
            }
         }
      }

      field_2814 = false;
   }

   // $FF: renamed from: bp (int, int, int, int, gl, long, int) void
   public void method_4868(int var1, int var2, int var3, int var4, class_91 var5, long var6, int var8) {
      if(var5 != null) {
         class_248 var10000 = new class_248();
         class_248 var9 = var10000;
         var9.field_2749 = var5;
         var9.field_2747 = var2 * -1277333933 + 2058821130;
         var9.field_2746 = var3 * 413186775 + 1212597568;
         var9.field_2753 = var4 * 1219668101;
         var9.field_2750 = var6 * 840149604356866431L;
         var9.field_2748 = var8 * -1774496839;
         if(this.field_2787[var1][var2][var3] == null) {
            class_41[] var10 = this.field_2787[var1][var2];
            class_41 var10002 = new class_41(var1, var2, var3);
            var10[var3] = var10002;
         }

         this.field_2787[var1][var2][var3].field_279 = var9;
      }
   }

   // $FF: renamed from: ef (int, int, int, int, int, int) void
   public void method_4869(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 < 0) {
         var1 = 0;
      } else if(var1 >= this.field_2784 * 128) {
         var1 = this.field_2784 * 128 - 1;
      }

      if(var3 < 0) {
         var3 = 0;
      } else if(var3 >= this.field_2786 * 1459702857) {
         var3 = this.field_2786 * 107601299 - 1;
      }

      if(var4 < -633963217) {
         var4 = -762838955;
      } else if(var4 > 383) {
         var4 = -216192899;
      }

      ++field_2798;
      field_2808 = class_70.field_548[var4];
      field_2809 = class_70.field_559[var4];
      field_2810 = class_70.field_548[var5];
      field_2811 = class_70.field_559[var5];
      field_2840 = field_2841[(var4 - 128) / 1549917451][var5 / 317130852];
      field_2805 = var1;
      field_2790 = var2;
      field_2836 = var3;
      field_2785 = var1 / -2012385656;
      field_2804 = var3 / 128;
      field_2797 = var6;
      field_2799 = field_2785 - 25;
      if(field_2799 < 0) {
         field_2799 = 0;
      }

      field_2801 = field_2804 - 25;
      if(field_2801 < 0) {
         field_2801 = 0;
      }

      field_2806 = field_2785 + 25;
      if(field_2806 > this.field_2784) {
         field_2806 = this.field_2784;
      }

      field_2802 = field_2804 + 25;
      if(field_2802 > this.field_2786) {
         field_2802 = this.field_2786;
      }

      this.method_4770();
      field_2796 = 0;

      int var7;
      class_41[][] var8;
      int var9;
      int var10;
      for(var7 = this.field_2788; var7 < this.field_2783; ++var7) {
         var8 = this.field_2787[var7];

         for(var9 = field_2799; var9 < field_2806; ++var9) {
            for(var10 = field_2801; var10 < field_2802; ++var10) {
               class_41 var11 = var8[var9][var10];
               if(var11 != null) {
                  if(var11.field_285 * 961427167 <= var6 && (field_2840[var9 - field_2785 + 25][var10 - field_2804 + 25] || this.field_2826[var7][var9][var10] - var2 >= -853273881)) {
                     var11.field_293 = true;
                     var11.field_287 = true;
                     if(var11.field_282 * 41090360 > 0) {
                        var11.field_288 = true;
                     } else {
                        var11.field_288 = false;
                     }

                     ++field_2796;
                  } else {
                     var11.field_293 = false;
                     var11.field_287 = false;
                     var11.field_291 = 0;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      class_41 var15;
      int var16;
      for(var7 = this.field_2788; var7 < this.field_2783; ++var7) {
         var8 = this.field_2787[var7];

         for(var9 = 1877506363; var9 <= 0; ++var9) {
            var10 = field_2785 + var9;
            var16 = field_2785 - var9;
            if(var10 >= field_2799 || var16 < field_2806) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = field_2804 + var12;
                  var14 = field_2804 - var12;
                  if(var10 >= field_2799) {
                     if(var13 >= field_2801) {
                        var15 = var8[var10][var13];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, true);
                        }
                     }

                     if(var14 < field_2802) {
                        var15 = var8[var10][var14];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, true);
                        }
                     }
                  }

                  if(var16 < field_2806) {
                     if(var13 >= field_2801) {
                        var15 = var8[var16][var13];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, true);
                        }
                     }

                     if(var14 < field_2802) {
                        var15 = var8[var16][var14];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, true);
                        }
                     }
                  }

                  if(field_2796 == 0) {
                     field_2814 = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.field_2788; var7 < this.field_2783; ++var7) {
         var8 = this.field_2787[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field_2785 + var9;
            var16 = field_2785 - var9;
            if(var10 >= field_2799 || var16 < field_2806) {
               for(var12 = -878459372; var12 <= 0; ++var12) {
                  var13 = field_2804 + var12;
                  var14 = field_2804 - var12;
                  if(var10 >= field_2799) {
                     if(var13 >= field_2801) {
                        var15 = var8[var10][var13];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, false);
                        }
                     }

                     if(var14 < field_2802) {
                        var15 = var8[var10][var14];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, false);
                        }
                     }
                  }

                  if(var16 < field_2806) {
                     if(var13 >= field_2801) {
                        var15 = var8[var16][var13];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, false);
                        }
                     }

                     if(var14 < field_2802) {
                        var15 = var8[var16][var14];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, false);
                        }
                     }
                  }

                  if(field_2796 == 0) {
                     field_2814 = false;
                     return;
                  }
               }
            }
         }
      }

      field_2814 = false;
   }

   // $FF: renamed from: em (gx, boolean) void
   void method_4870(class_41 var1, boolean var2) {
      field_2827.method_5939(var1);

      while(true) {
         class_41 var3 = (class_41)field_2827.method_5974();
         if(var3 == null) {
            return;
         }

         if(var3.field_287) {
            int var4 = var3.field_272 * -509167035;
            int var5 = var3.field_273 * 950473561;
            int var6 = var3.field_274 * 952681323;
            int var7 = var3.field_276 * 1257822241;
            class_41[][] var8 = this.field_2787[var6];
            class_41 var9;
            class_269 var10;
            int var11;
            class_261 var12;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var21;
            boolean var22;
            class_41 var33;
            if(var3.field_293) {
               if(var2) {
                  if(var6 > 0) {
                     var9 = this.field_2787[var6 - 1][var4][var5];
                     if(var9 != null && var9.field_287) {
                        continue;
                     }
                  }

                  if(var4 <= field_2785 && var4 > field_2799) {
                     var9 = var8[var4 - 1][var5];
                     if(var9 != null && var9.field_287 && (var9.field_293 || (var3.field_284 * 1099123981 & 1) == 0)) {
                        continue;
                     }
                  }

                  if(var4 >= field_2785 && var4 < field_2806 - 1) {
                     var9 = var8[var4 + 1][var5];
                     if(var9 != null && var9.field_287 && (var9.field_293 || (var3.field_284 * 1099123981 & 4) == 0)) {
                        continue;
                     }
                  }

                  if(var5 <= field_2804 && var5 > field_2801) {
                     var9 = var8[var4][var5 - 1];
                     if(var9 != null && var9.field_287 && (var9.field_293 || (var3.field_284 * 1099123981 & 8) == 0)) {
                        continue;
                     }
                  }

                  if(var5 >= field_2804 && var5 < field_2802 - 1) {
                     var9 = var8[var4][var5 + 1];
                     if(var9 != null && var9.field_287 && (var9.field_293 || (var3.field_284 * 1099123981 & 2) == 0)) {
                        continue;
                     }
                  }
               } else {
                  var2 = true;
               }

               var3.field_293 = false;
               if(var3.field_292 != null) {
                  var9 = var3.field_292;
                  if(var9.field_275 != null) {
                     if(!this.method_4771(0, var4, var5)) {
                        this.method_4745(var9.field_275, 0, field_2808, field_2809, field_2810, field_2811, var4, var5);
                     }
                  } else if(var9.field_289 != null && !this.method_4771(0, var4, var5)) {
                     this.method_4856(var9.field_289, field_2808, field_2809, field_2810, field_2811, var4, var5);
                  }

                  var10 = var9.field_277;
                  if(var10 != null) {
                     var10.field_3178.method_1607(0, field_2808, field_2809, field_2810, field_2811, var10.field_3174 * 662711357 - field_2805, var10.field_3170 * -727989945 - field_2790, var10.field_3176 * -1127510877 - field_2836, var10.field_3169 * 1374506562499121997L);
                  }

                  for(var11 = 0; var11 < var9.field_282 * 1720897143; ++var11) {
                     var12 = var9.field_286[var11];
                     if(var12 != null) {
                        var12.field_2915.method_1607(var12.field_2911 * -202388443, field_2808, field_2809, field_2810, field_2811, var12.field_2910 * 1140262961 - field_2805, var12.field_2906 * -1917415421 - field_2790, var12.field_2908 * 364858457 - field_2836, var12.field_2917 * 1142152799211342585L);
                     }
                  }
               }

               var22 = false;
               if(var3.field_275 != null) {
                  if(!this.method_4771(var7, var4, var5)) {
                     var22 = true;
                     if(var3.field_275.field_2684 * 74746585 != 12345678 || field_2814 && var6 <= field_2800) {
                        this.method_4745(var3.field_275, var7, field_2808, field_2809, field_2810, field_2811, var4, var5);
                     }
                  }
               } else if(var3.field_289 != null && !this.method_4771(var7, var4, var5)) {
                  var22 = true;
                  this.method_4856(var3.field_289, field_2808, field_2809, field_2810, field_2811, var4, var5);
               }

               var21 = 0;
               var11 = 0;
               class_269 var23 = var3.field_277;
               class_265 var13 = var3.field_278;
               if(var23 != null || var13 != null) {
                  if(field_2785 == var4) {
                     ++var21;
                  } else if(field_2785 < var4) {
                     var21 += 2;
                  }

                  if(field_2804 == var5) {
                     var21 += 3;
                  } else if(field_2804 > var5) {
                     var21 += 6;
                  }

                  var11 = field_2828[var21];
                  var3.field_271 = field_2830[var21] * 495564059;
               }

               if(var23 != null) {
                  if((var23.field_3172 * 643320237 & field_2842[var21]) != 0) {
                     if(var23.field_3172 * 643320237 == 16) {
                        var3.field_291 = -1352508415;
                        var3.field_290 = field_2831[var21] * -1568837483;
                        var3.field_280 = -2035736443 - var3.field_290 * 1996560059;
                     } else if(var23.field_3172 * 643320237 == 32) {
                        var3.field_291 = 1589950466;
                        var3.field_290 = field_2832[var21] * -1568837483;
                        var3.field_280 = 223494410 - var3.field_290 * 1996560059;
                     } else if(var23.field_3172 * 643320237 == 64) {
                        var3.field_291 = -1115066364;
                        var3.field_290 = field_2795[var21] * -1568837483;
                        var3.field_280 = 446988820 - var3.field_290 * 1996560059;
                     } else {
                        var3.field_291 = 237442051;
                        var3.field_290 = field_2834[var21] * -1568837483;
                        var3.field_280 = -1812242033 - var3.field_290 * 1996560059;
                     }
                  } else {
                     var3.field_291 = 0;
                  }

                  if((var23.field_3172 * 643320237 & var11) != 0 && !this.method_4772(var7, var4, var5, var23.field_3172 * 643320237)) {
                     var23.field_3178.method_1607(0, field_2808, field_2809, field_2810, field_2811, var23.field_3174 * 662711357 - field_2805, var23.field_3170 * -727989945 - field_2790, var23.field_3176 * -1127510877 - field_2836, var23.field_3169 * 1374506562499121997L);
                  }

                  if((var23.field_3173 * 1924609359 & var11) != 0 && !this.method_4772(var7, var4, var5, var23.field_3173 * 1924609359)) {
                     var23.field_3175.method_1607(0, field_2808, field_2809, field_2810, field_2811, var23.field_3174 * 662711357 - field_2805, var23.field_3170 * -727989945 - field_2790, var23.field_3176 * -1127510877 - field_2836, var23.field_3169 * 1374506562499121997L);
                  }
               }

               if(var13 != null && !this.method_4773(var7, var4, var5, var13.field_3039.field_911 * 267422413)) {
                  if((var13.field_3038 * 1760283661 & var11) != 0) {
                     var13.field_3039.method_1607(0, field_2808, field_2809, field_2810, field_2811, var13.field_3036 * 1511932377 - field_2805 + var13.field_3040 * -2026318183, var13.field_3037 * -1988235731 - field_2790, var13.field_3042 * 750074813 - field_2836 + var13.field_3041 * 1292762417, var13.field_3035 * 3146556658035252985L);
                  } else if(var13.field_3038 * 1760283661 == 256) {
                     var14 = var13.field_3036 * 1511932377 - field_2805;
                     var15 = var13.field_3037 * -1988235731 - field_2790;
                     var16 = var13.field_3042 * 750074813 - field_2836;
                     var17 = var13.field_3044 * 1111812521;
                     if(var17 != 1 && var17 != 2) {
                        var18 = var14;
                     } else {
                        var18 = -var14;
                     }

                     int var19;
                     if(var17 != 2 && var17 != 3) {
                        var19 = var16;
                     } else {
                        var19 = -var16;
                     }

                     if(var19 < var18) {
                        var13.field_3039.method_1607(0, field_2808, field_2809, field_2810, field_2811, var14 + var13.field_3040 * -2026318183, var15, var16 + var13.field_3041 * 1292762417, var13.field_3035 * 3146556658035252985L);
                     } else if(var13.field_3043 != null) {
                        var13.field_3043.method_1607(0, field_2808, field_2809, field_2810, field_2811, var14, var15, var16, var13.field_3035 * 3146556658035252985L);
                     }
                  }
               }

               if(var22) {
                  class_248 var27 = var3.field_279;
                  if(var27 != null) {
                     var27.field_2749.method_1607(0, field_2808, field_2809, field_2810, field_2811, var27.field_2747 * -1864149275 - field_2805, var27.field_2753 * 859770957 - field_2790, var27.field_2746 * -1474470851 - field_2836, var27.field_2750 * 5096767537878498943L);
                  }

                  class_253 var31 = var3.field_281;
                  if(var31 != null && var31.field_2860 * 1688818251 == 0) {
                     if(var31.field_2864 != null) {
                        var31.field_2864.method_1607(0, field_2808, field_2809, field_2810, field_2811, var31.field_2861 * -840082071 - field_2805, var31.field_2867 * 1950267115 - field_2790, var31.field_2862 * -1958043433 - field_2836, var31.field_2866 * 8707211480451132889L);
                     }

                     if(var31.field_2865 != null) {
                        var31.field_2865.method_1607(0, field_2808, field_2809, field_2810, field_2811, var31.field_2861 * -840082071 - field_2805, var31.field_2867 * 1950267115 - field_2790, var31.field_2862 * -1958043433 - field_2836, var31.field_2866 * 8707211480451132889L);
                     }

                     if(var31.field_2863 != null) {
                        var31.field_2863.method_1607(0, field_2808, field_2809, field_2810, field_2811, var31.field_2861 * -840082071 - field_2805, var31.field_2867 * 1950267115 - field_2790, var31.field_2862 * -1958043433 - field_2836, var31.field_2866 * 8707211480451132889L);
                     }
                  }
               }

               var14 = var3.field_284 * 1099123981;
               if(var14 != 0) {
                  if(var4 < field_2785 && (var14 & 4) != 0) {
                     var33 = var8[var4 + 1][var5];
                     if(var33 != null && var33.field_287) {
                        field_2827.method_5939(var33);
                     }
                  }

                  if(var5 < field_2804 && (var14 & 2) != 0) {
                     var33 = var8[var4][var5 + 1];
                     if(var33 != null && var33.field_287) {
                        field_2827.method_5939(var33);
                     }
                  }

                  if(var4 > field_2785 && (var14 & 1) != 0) {
                     var33 = var8[var4 - 1][var5];
                     if(var33 != null && var33.field_287) {
                        field_2827.method_5939(var33);
                     }
                  }

                  if(var5 > field_2804 && (var14 & 8) != 0) {
                     var33 = var8[var4][var5 - 1];
                     if(var33 != null && var33.field_287) {
                        field_2827.method_5939(var33);
                     }
                  }
               }
            }

            if(var3.field_291 * 1695083523 != 0) {
               var22 = true;

               for(var21 = 0; var21 < var3.field_282 * 1720897143; ++var21) {
                  if(var3.field_286[var21].field_2907 * -137941941 != field_2798 && (var3.field_283[var21] & var3.field_291 * 1695083523) == var3.field_290 * 1060231869) {
                     var22 = false;
                     break;
                  }
               }

               if(var22) {
                  var10 = var3.field_277;
                  if(!this.method_4772(var7, var4, var5, var10.field_3172 * 643320237)) {
                     var10.field_3178.method_1607(0, field_2808, field_2809, field_2810, field_2811, var10.field_3174 * 662711357 - field_2805, var10.field_3170 * -727989945 - field_2790, var10.field_3176 * -1127510877 - field_2836, var10.field_3169 * 1374506562499121997L);
                  }

                  var3.field_291 = 0;
               }
            }

            int var24;
            int var26;
            if(var3.field_288) {
               try {
                  int var25 = var3.field_282 * 1720897143;
                  var3.field_288 = false;
                  var21 = 0;

                  label544:
                  for(var11 = 0; var11 < var25; ++var11) {
                     var12 = var3.field_286[var11];
                     if(var12.field_2907 * -137941941 != field_2798) {
                        for(var26 = var12.field_2909 * 1674574095; var26 <= var12.field_2912 * -2078907755; ++var26) {
                           for(var14 = var12.field_2913 * 1202737381; var14 <= var12.field_2914 * -129893675; ++var14) {
                              var33 = var8[var26][var14];
                              if(var33.field_293) {
                                 var3.field_288 = true;
                                 continue label544;
                              }

                              if(var33.field_291 * 1695083523 != 0) {
                                 var16 = 0;
                                 if(var26 > var12.field_2909 * 1674574095) {
                                    ++var16;
                                 }

                                 if(var26 < var12.field_2912 * -2078907755) {
                                    var16 += 4;
                                 }

                                 if(var14 > var12.field_2913 * 1202737381) {
                                    var16 += 8;
                                 }

                                 if(var14 < var12.field_2914 * -129893675) {
                                    var16 += 2;
                                 }

                                 if((var16 & var33.field_291 * 1695083523) == var3.field_280 * -726038297) {
                                    var3.field_288 = true;
                                    continue label544;
                                 }
                              }
                           }
                        }

                        field_2812[var21++] = var12;
                        var26 = field_2785 - var12.field_2909 * 1674574095;
                        var14 = var12.field_2912 * -2078907755 - field_2785;
                        if(var14 > var26) {
                           var26 = var14;
                        }

                        var15 = field_2804 - var12.field_2913 * 1202737381;
                        var16 = var12.field_2914 * -129893675 - field_2804;
                        if(var16 > var15) {
                           var12.field_2916 = (var26 + var16) * 1212965461;
                        } else {
                           var12.field_2916 = (var26 + var15) * 1212965461;
                        }
                     }
                  }

                  while(var21 > 0) {
                     var11 = -50;
                     var24 = -1;

                     for(var26 = 0; var26 < var21; ++var26) {
                        class_261 var34 = field_2812[var26];
                        if(var34.field_2907 * -137941941 != field_2798) {
                           if(var34.field_2916 * -327316739 > var11) {
                              var11 = var34.field_2916 * -327316739;
                              var24 = var26;
                           } else if(var34.field_2916 * -327316739 == var11) {
                              var15 = var34.field_2910 * 1140262961 - field_2805;
                              var16 = var34.field_2908 * 364858457 - field_2836;
                              var17 = field_2812[var24].field_2910 * 1140262961 - field_2805;
                              var18 = field_2812[var24].field_2908 * 364858457 - field_2836;
                              if(var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                 var24 = var26;
                              }
                           }
                        }
                     }

                     if(var24 == -1) {
                        break;
                     }

                     class_261 var35 = field_2812[var24];
                     var35.field_2907 = field_2798 * 230964579;
                     if(!this.method_4774(var7, var35.field_2909 * 1674574095, var35.field_2912 * -2078907755, var35.field_2913 * 1202737381, var35.field_2914 * -129893675, var35.field_2915.field_911 * 267422413)) {
                        var35.field_2915.method_1607(var35.field_2911 * -202388443, field_2808, field_2809, field_2810, field_2811, var35.field_2910 * 1140262961 - field_2805, var35.field_2906 * -1917415421 - field_2790, var35.field_2908 * 364858457 - field_2836, var35.field_2917 * 1142152799211342585L);
                     }

                     for(var14 = var35.field_2909 * 1674574095; var14 <= var35.field_2912 * -2078907755; ++var14) {
                        for(var15 = var35.field_2913 * 1202737381; var15 <= var35.field_2914 * -129893675; ++var15) {
                           class_41 var36 = var8[var14][var15];
                           if(var36.field_291 * 1695083523 != 0) {
                              field_2827.method_5939(var36);
                           } else if((var14 != var4 || var15 != var5) && var36.field_287) {
                              field_2827.method_5939(var36);
                           }
                        }
                     }
                  }

                  if(var3.field_288) {
                     continue;
                  }
               } catch (Exception var20) {
                  var3.field_288 = false;
               }
            }

            if(var3.field_287 && var3.field_291 * 1695083523 == 0) {
               if(var4 <= field_2785 && var4 > field_2799) {
                  var9 = var8[var4 - 1][var5];
                  if(var9 != null && var9.field_287) {
                     continue;
                  }
               }

               if(var4 >= field_2785 && var4 < field_2806 - 1) {
                  var9 = var8[var4 + 1][var5];
                  if(var9 != null && var9.field_287) {
                     continue;
                  }
               }

               if(var5 <= field_2804 && var5 > field_2801) {
                  var9 = var8[var4][var5 - 1];
                  if(var9 != null && var9.field_287) {
                     continue;
                  }
               }

               if(var5 >= field_2804 && var5 < field_2802 - 1) {
                  var9 = var8[var4][var5 + 1];
                  if(var9 != null && var9.field_287) {
                     continue;
                  }
               }

               var3.field_287 = false;
               --field_2796;
               class_253 var29 = var3.field_281;
               if(var29 != null && var29.field_2860 * 1688818251 != 0) {
                  if(var29.field_2864 != null) {
                     var29.field_2864.method_1607(0, field_2808, field_2809, field_2810, field_2811, var29.field_2861 * -840082071 - field_2805, var29.field_2867 * 1950267115 - field_2790 - var29.field_2860 * 1688818251, var29.field_2862 * -1958043433 - field_2836, var29.field_2866 * 8707211480451132889L);
                  }

                  if(var29.field_2865 != null) {
                     var29.field_2865.method_1607(0, field_2808, field_2809, field_2810, field_2811, var29.field_2861 * -840082071 - field_2805, var29.field_2867 * 1950267115 - field_2790 - var29.field_2860 * 1688818251, var29.field_2862 * -1958043433 - field_2836, var29.field_2866 * 8707211480451132889L);
                  }

                  if(var29.field_2863 != null) {
                     var29.field_2863.method_1607(0, field_2808, field_2809, field_2810, field_2811, var29.field_2861 * -840082071 - field_2805, var29.field_2867 * 1950267115 - field_2790 - var29.field_2860 * 1688818251, var29.field_2862 * -1958043433 - field_2836, var29.field_2866 * 8707211480451132889L);
                  }
               }

               if(var3.field_271 * 1501732115 != 0) {
                  class_265 var30 = var3.field_278;
                  if(var30 != null && !this.method_4773(var7, var4, var5, var30.field_3039.field_911 * 267422413)) {
                     if((var30.field_3038 * 1760283661 & var3.field_271 * 1501732115) != 0) {
                        var30.field_3039.method_1607(0, field_2808, field_2809, field_2810, field_2811, var30.field_3036 * 1511932377 - field_2805 + var30.field_3040 * -2026318183, var30.field_3037 * -1988235731 - field_2790, var30.field_3042 * 750074813 - field_2836 + var30.field_3041 * 1292762417, var30.field_3035 * 3146556658035252985L);
                     } else if(var30.field_3038 * 1760283661 == 256) {
                        var11 = var30.field_3036 * 1511932377 - field_2805;
                        var24 = var30.field_3037 * -1988235731 - field_2790;
                        var26 = var30.field_3042 * 750074813 - field_2836;
                        var14 = var30.field_3044 * 1111812521;
                        if(var14 != 1 && var14 != 2) {
                           var15 = var11;
                        } else {
                           var15 = -var11;
                        }

                        if(var14 != 2 && var14 != 3) {
                           var16 = var26;
                        } else {
                           var16 = -var26;
                        }

                        if(var16 >= var15) {
                           var30.field_3039.method_1607(0, field_2808, field_2809, field_2810, field_2811, var11 + var30.field_3040 * -2026318183, var24, var26 + var30.field_3041 * 1292762417, var30.field_3035 * 3146556658035252985L);
                        } else if(var30.field_3043 != null) {
                           var30.field_3043.method_1607(0, field_2808, field_2809, field_2810, field_2811, var11, var24, var26, var30.field_3035 * 3146556658035252985L);
                        }
                     }
                  }

                  class_269 var28 = var3.field_277;
                  if(var28 != null) {
                     if((var28.field_3173 * 1924609359 & var3.field_271 * 1501732115) != 0 && !this.method_4772(var7, var4, var5, var28.field_3173 * 1924609359)) {
                        var28.field_3175.method_1607(0, field_2808, field_2809, field_2810, field_2811, var28.field_3174 * 662711357 - field_2805, var28.field_3170 * -727989945 - field_2790, var28.field_3176 * -1127510877 - field_2836, var28.field_3169 * 1374506562499121997L);
                     }

                     if((var28.field_3172 * 643320237 & var3.field_271 * 1501732115) != 0 && !this.method_4772(var7, var4, var5, var28.field_3172 * 643320237)) {
                        var28.field_3178.method_1607(0, field_2808, field_2809, field_2810, field_2811, var28.field_3174 * 662711357 - field_2805, var28.field_3170 * -727989945 - field_2790, var28.field_3176 * -1127510877 - field_2836, var28.field_3169 * 1374506562499121997L);
                     }
                  }
               }

               class_41 var32;
               if(var6 < this.field_2783 - 1) {
                  var32 = this.field_2787[var6 + 1][var4][var5];
                  if(var32 != null && var32.field_287) {
                     field_2827.method_5939(var32);
                  }
               }

               if(var4 < field_2785) {
                  var32 = var8[var4 + 1][var5];
                  if(var32 != null && var32.field_287) {
                     field_2827.method_5939(var32);
                  }
               }

               if(var5 < field_2804) {
                  var32 = var8[var4][var5 + 1];
                  if(var32 != null && var32.field_287) {
                     field_2827.method_5939(var32);
                  }
               }

               if(var4 > field_2785) {
                  var32 = var8[var4 - 1][var5];
                  if(var32 != null && var32.field_287) {
                     field_2827.method_5939(var32);
                  }
               }

               if(var5 > field_2804) {
                  var32 = var8[var4][var5 - 1];
                  if(var32 != null && var32.field_287) {
                     field_2827.method_5939(var32);
                  }
               }
            }
         }
      }
   }

   // $FF: renamed from: en (int, int, int, int, int, int) void
   public void method_4871(int var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 < 0) {
         var1 = 0;
      } else if(var1 >= this.field_2784 * 128) {
         var1 = this.field_2784 * -1838423524 - 1;
      }

      if(var3 < 0) {
         var3 = 0;
      } else if(var3 >= this.field_2786 * 128) {
         var3 = this.field_2786 * -259703005 - 1;
      }

      if(var4 < 128) {
         var4 = -1413877713;
      } else if(var4 > 1853757247) {
         var4 = -1936875482;
      }

      ++field_2798;
      field_2808 = class_70.field_548[var4];
      field_2809 = class_70.field_559[var4];
      field_2810 = class_70.field_548[var5];
      field_2811 = class_70.field_559[var5];
      field_2840 = field_2841[(var4 - 128) / 1320370514][var5 / 1880759435];
      field_2805 = var1;
      field_2790 = var2;
      field_2836 = var3;
      field_2785 = var1 / 128;
      field_2804 = var3 / 128;
      field_2797 = var6;
      field_2799 = field_2785 - 25;
      if(field_2799 < 0) {
         field_2799 = 0;
      }

      field_2801 = field_2804 - 25;
      if(field_2801 < 0) {
         field_2801 = 0;
      }

      field_2806 = field_2785 + 25;
      if(field_2806 > this.field_2784) {
         field_2806 = this.field_2784;
      }

      field_2802 = field_2804 + 25;
      if(field_2802 > this.field_2786) {
         field_2802 = this.field_2786;
      }

      this.method_4770();
      field_2796 = 0;

      int var7;
      class_41[][] var8;
      int var9;
      int var10;
      for(var7 = this.field_2788; var7 < this.field_2783; ++var7) {
         var8 = this.field_2787[var7];

         for(var9 = field_2799; var9 < field_2806; ++var9) {
            for(var10 = field_2801; var10 < field_2802; ++var10) {
               class_41 var11 = var8[var9][var10];
               if(var11 != null) {
                  if(var11.field_285 * 961427167 <= var6 && (field_2840[var9 - field_2785 + 25][var10 - field_2804 + 25] || this.field_2826[var7][var9][var10] - var2 >= 2000)) {
                     var11.field_293 = true;
                     var11.field_287 = true;
                     if(var11.field_282 * 1720897143 > 0) {
                        var11.field_288 = true;
                     } else {
                        var11.field_288 = false;
                     }

                     ++field_2796;
                  } else {
                     var11.field_293 = false;
                     var11.field_287 = false;
                     var11.field_291 = 0;
                  }
               }
            }
         }
      }

      int var12;
      int var13;
      int var14;
      class_41 var15;
      int var16;
      for(var7 = this.field_2788; var7 < this.field_2783; ++var7) {
         var8 = this.field_2787[var7];

         for(var9 = -670788714; var9 <= 0; ++var9) {
            var10 = field_2785 + var9;
            var16 = field_2785 - var9;
            if(var10 >= field_2799 || var16 < field_2806) {
               for(var12 = -535984223; var12 <= 0; ++var12) {
                  var13 = field_2804 + var12;
                  var14 = field_2804 - var12;
                  if(var10 >= field_2799) {
                     if(var13 >= field_2801) {
                        var15 = var8[var10][var13];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, true);
                        }
                     }

                     if(var14 < field_2802) {
                        var15 = var8[var10][var14];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, true);
                        }
                     }
                  }

                  if(var16 < field_2806) {
                     if(var13 >= field_2801) {
                        var15 = var8[var16][var13];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, true);
                        }
                     }

                     if(var14 < field_2802) {
                        var15 = var8[var16][var14];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, true);
                        }
                     }
                  }

                  if(field_2796 == 0) {
                     field_2814 = false;
                     return;
                  }
               }
            }
         }
      }

      for(var7 = this.field_2788; var7 < this.field_2783; ++var7) {
         var8 = this.field_2787[var7];

         for(var9 = -25; var9 <= 0; ++var9) {
            var10 = field_2785 + var9;
            var16 = field_2785 - var9;
            if(var10 >= field_2799 || var16 < field_2806) {
               for(var12 = -25; var12 <= 0; ++var12) {
                  var13 = field_2804 + var12;
                  var14 = field_2804 - var12;
                  if(var10 >= field_2799) {
                     if(var13 >= field_2801) {
                        var15 = var8[var10][var13];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, false);
                        }
                     }

                     if(var14 < field_2802) {
                        var15 = var8[var10][var14];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, false);
                        }
                     }
                  }

                  if(var16 < field_2806) {
                     if(var13 >= field_2801) {
                        var15 = var8[var16][var13];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, false);
                        }
                     }

                     if(var14 < field_2802) {
                        var15 = var8[var16][var14];
                        if(var15 != null && var15.field_293) {
                           this.method_4765(var15, false);
                        }
                     }
                  }

                  if(field_2796 == 0) {
                     field_2814 = false;
                     return;
                  }
               }
            }
         }
      }

      field_2814 = false;
   }

   // $FF: renamed from: ey (ga, int, int, int, int, int, int, int) void
   void method_4872(class_241 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - field_2805;
      int var11;
      int var12 = var11 = (var8 << 7) - field_2836;
      int var13;
      int var14 = var13 = var10 + -494396339;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.field_2826[var2][var7][var8] - field_2790;
      int var18 = this.field_2826[var2][var7 + 1][var8] - field_2790;
      int var19 = this.field_2826[var2][var7 + 1][var8 + 1] - field_2790;
      int var20 = this.field_2826[var2][var7][var8 + 1] - field_2790;
      int var21 = var12 * var5 + var10 * var6 >> 16;
      var12 = var12 * var6 - var10 * var5 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var12 * var3 >> 16;
      var12 = var17 * var3 + var12 * var4 >> 16;
      var17 = var21;
      if(var12 >= 1153307148) {
         var21 = var11 * var5 + var14 * var6 >> 16;
         var11 = var11 * var6 - var14 * var5 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var11 * var3 >> 16;
         var11 = var18 * var3 + var11 * var4 >> 16;
         var18 = var21;
         if(var11 >= 50) {
            var21 = var16 * var5 + var13 * var6 >> 16;
            var16 = var16 * var6 - var13 * var5 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var16 * var3 >> 16;
            var16 = var19 * var3 + var16 * var4 >> 16;
            var19 = var21;
            if(var16 >= 1742362487) {
               var21 = var15 * var5 + var9 * var6 >> 16;
               var15 = var15 * var6 - var9 * var5 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var15 * var3 >> 16;
               var15 = var20 * var3 + var15 * var4 >> 16;
               if(var15 >= 477148418) {
                  int var22 = class_70.field_545 + var10 * class_70.field_544 / var12;
                  int var23 = class_70.field_538 + var17 * class_70.field_544 / var12;
                  int var24 = class_70.field_545 + var14 * class_70.field_544 / var11;
                  int var25 = class_70.field_538 + var18 * class_70.field_544 / var11;
                  int var26 = class_70.field_545 + var13 * class_70.field_544 / var16;
                  int var27 = class_70.field_538 + var19 * class_70.field_544 / var16;
                  int var28 = class_70.field_545 + var9 * class_70.field_544 / var15;
                  int var29 = class_70.field_538 + var21 * class_70.field_544 / var15;
                  class_70.field_554 = 0;
                  int var30;
                  if((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     class_70.field_536 = false;
                     if(var26 < 0 || var28 < 0 || var24 < 0 || var26 > class_70.field_537 || var28 > class_70.field_537 || var24 > class_70.field_537) {
                        class_70.field_536 = true;
                     }

                     if(field_2814 && method_4769(field_2815, field_2816, var27, var29, var25, var26, var28, var24)) {
                        field_2817 = var7;
                        field_2818 = var8;
                     }

                     if(var1.field_2686 * -1448645675 == -1) {
                        if(var1.field_2684 * 74746585 != 12345678) {
                           class_70.method_977(var27, var29, var25, var26, var28, var24, var1.field_2684 * 74746585, var1.field_2685 * -899678033, var1.field_2687 * -338901479);
                        }
                     } else if(!field_2813) {
                        if(var1.field_2683) {
                           class_70.method_983(var27, var29, var25, var26, var28, var24, var1.field_2684 * 74746585, var1.field_2685 * -1630451137, var1.field_2687 * -338901479, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field_2686 * -1463549511);
                        } else {
                           class_70.method_983(var27, var29, var25, var26, var28, var24, var1.field_2684 * 74746585, var1.field_2685 * -479703714, var1.field_2687 * 1025714355, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field_2686 * -80564939);
                        }
                     } else {
                        var30 = class_70.field_555.method_31(var1.field_2686 * -80564939, -215049913);
                        class_70.method_977(var27, var29, var25, var26, var28, var24, method_4768(var30, var1.field_2684 * 74746585), method_4768(var30, var1.field_2685 * -1630451137), method_4768(var30, var1.field_2687 * -338901479));
                     }
                  }

                  if((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     class_70.field_536 = false;
                     if(var22 < 0 || var24 < 0 || var28 < 0 || var22 > class_70.field_537 || var24 > class_70.field_537 || var28 > class_70.field_537) {
                        class_70.field_536 = true;
                     }

                     if(field_2814 && method_4769(field_2815, field_2816, var23, var25, var29, var22, var24, var28)) {
                        field_2817 = var7;
                        field_2818 = var8;
                     }

                     if(var1.field_2686 * -618753113 == -1) {
                        if(var1.field_2682 * 1657490379 != -740273691) {
                           class_70.method_977(var23, var25, var29, var22, var24, var28, var1.field_2682 * 1657490379, var1.field_2687 * -338901479, var1.field_2685 * -1630451137);
                        }
                     } else if(!field_2813) {
                        class_70.method_983(var23, var25, var29, var22, var24, var28, var1.field_2682 * 1657490379, var1.field_2687 * -338901479, var1.field_2685 * 580480511, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field_2686 * -53375557);
                     } else {
                        var30 = class_70.field_555.method_31(var1.field_2686 * 319161072, -1506311509);
                        class_70.method_977(var23, var25, var29, var22, var24, var28, method_4768(var30, var1.field_2682 * -2081139038), method_4768(var30, var1.field_2687 * -1407026602), method_4768(var30, var1.field_2685 * -1630451137));
                     }
                  }

               }
            }
         }
      }
   }

   // $FF: renamed from: ee (ga, int, int, int, int, int, int, int) void
   void method_4873(class_241 var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9;
      int var10 = var9 = (var7 << 7) - field_2805;
      int var11;
      int var12 = var11 = (var8 << 7) - field_2836;
      int var13;
      int var14 = var13 = var10 + 128;
      int var15;
      int var16 = var15 = var12 + 128;
      int var17 = this.field_2826[var2][var7][var8] - field_2790;
      int var18 = this.field_2826[var2][var7 + 1][var8] - field_2790;
      int var19 = this.field_2826[var2][var7 + 1][var8 + 1] - field_2790;
      int var20 = this.field_2826[var2][var7][var8 + 1] - field_2790;
      int var21 = var12 * var5 + var10 * var6 >> 16;
      var12 = var12 * var6 - var10 * var5 >> 16;
      var10 = var21;
      var21 = var17 * var4 - var12 * var3 >> 16;
      var12 = var17 * var3 + var12 * var4 >> 16;
      var17 = var21;
      if(var12 >= 50) {
         var21 = var11 * var5 + var14 * var6 >> 16;
         var11 = var11 * var6 - var14 * var5 >> 16;
         var14 = var21;
         var21 = var18 * var4 - var11 * var3 >> 16;
         var11 = var18 * var3 + var11 * var4 >> 16;
         var18 = var21;
         if(var11 >= 50) {
            var21 = var16 * var5 + var13 * var6 >> 16;
            var16 = var16 * var6 - var13 * var5 >> 16;
            var13 = var21;
            var21 = var19 * var4 - var16 * var3 >> 16;
            var16 = var19 * var3 + var16 * var4 >> 16;
            var19 = var21;
            if(var16 >= 50) {
               var21 = var15 * var5 + var9 * var6 >> 16;
               var15 = var15 * var6 - var9 * var5 >> 16;
               var9 = var21;
               var21 = var20 * var4 - var15 * var3 >> 16;
               var15 = var20 * var3 + var15 * var4 >> 16;
               if(var15 >= 50) {
                  int var22 = class_70.field_545 + var10 * class_70.field_544 / var12;
                  int var23 = class_70.field_538 + var17 * class_70.field_544 / var12;
                  int var24 = class_70.field_545 + var14 * class_70.field_544 / var11;
                  int var25 = class_70.field_538 + var18 * class_70.field_544 / var11;
                  int var26 = class_70.field_545 + var13 * class_70.field_544 / var16;
                  int var27 = class_70.field_538 + var19 * class_70.field_544 / var16;
                  int var28 = class_70.field_545 + var9 * class_70.field_544 / var15;
                  int var29 = class_70.field_538 + var21 * class_70.field_544 / var15;
                  class_70.field_554 = 0;
                  int var30;
                  if((var26 - var28) * (var25 - var29) - (var27 - var29) * (var24 - var28) > 0) {
                     class_70.field_536 = false;
                     if(var26 < 0 || var28 < 0 || var24 < 0 || var26 > class_70.field_537 || var28 > class_70.field_537 || var24 > class_70.field_537) {
                        class_70.field_536 = true;
                     }

                     if(field_2814 && method_4769(field_2815, field_2816, var27, var29, var25, var26, var28, var24)) {
                        field_2817 = var7;
                        field_2818 = var8;
                     }

                     if(var1.field_2686 * -80564939 == -1) {
                        if(var1.field_2684 * 74746585 != 12345678) {
                           class_70.method_977(var27, var29, var25, var26, var28, var24, var1.field_2684 * 74746585, var1.field_2685 * -1630451137, var1.field_2687 * -338901479);
                        }
                     } else if(!field_2813) {
                        if(var1.field_2683) {
                           class_70.method_983(var27, var29, var25, var26, var28, var24, var1.field_2684 * 74746585, var1.field_2685 * -1630451137, var1.field_2687 * -338901479, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field_2686 * -80564939);
                        } else {
                           class_70.method_983(var27, var29, var25, var26, var28, var24, var1.field_2684 * 74746585, var1.field_2685 * -1630451137, var1.field_2687 * -338901479, var13, var9, var14, var19, var21, var18, var16, var15, var11, var1.field_2686 * -80564939);
                        }
                     } else {
                        var30 = class_70.field_555.method_31(var1.field_2686 * -80564939, -386338223);
                        class_70.method_977(var27, var29, var25, var26, var28, var24, method_4768(var30, var1.field_2684 * 74746585), method_4768(var30, var1.field_2685 * -1630451137), method_4768(var30, var1.field_2687 * -338901479));
                     }
                  }

                  if((var22 - var24) * (var29 - var25) - (var23 - var25) * (var28 - var24) > 0) {
                     class_70.field_536 = false;
                     if(var22 < 0 || var24 < 0 || var28 < 0 || var22 > class_70.field_537 || var24 > class_70.field_537 || var28 > class_70.field_537) {
                        class_70.field_536 = true;
                     }

                     if(field_2814 && method_4769(field_2815, field_2816, var23, var25, var29, var22, var24, var28)) {
                        field_2817 = var7;
                        field_2818 = var8;
                     }

                     if(var1.field_2686 * -80564939 == -1) {
                        if(var1.field_2682 * 1657490379 != 12345678) {
                           class_70.method_977(var23, var25, var29, var22, var24, var28, var1.field_2682 * 1657490379, var1.field_2687 * -338901479, var1.field_2685 * -1630451137);
                        }
                     } else if(!field_2813) {
                        class_70.method_983(var23, var25, var29, var22, var24, var28, var1.field_2682 * 1657490379, var1.field_2687 * -338901479, var1.field_2685 * -1630451137, var10, var14, var9, var17, var18, var21, var12, var11, var15, var1.field_2686 * -80564939);
                     } else {
                        var30 = class_70.field_555.method_31(var1.field_2686 * -80564939, -1867006081);
                        class_70.method_977(var23, var25, var29, var22, var24, var28, method_4768(var30, var1.field_2682 * 1657490379), method_4768(var30, var1.field_2687 * -338901479), method_4768(var30, var1.field_2685 * -1630451137));
                     }
                  }

               }
            }
         }
      }
   }

   // $FF: renamed from: co (int, int, int) void
   public void method_4874(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 != null) {
         var4.field_281 = null;
      }
   }

   // $FF: renamed from: l (int, int, int, int, int, gl, int, long, boolean) boolean
   public boolean method_4875(int var1, int var2, int var3, int var4, int var5, class_91 var6, int var7, long var8, boolean var10) {
      if(var6 == null) {
         return true;
      } else {
         int var11 = var2 - var5;
         int var12 = var3 - var5;
         int var13 = var2 + var5;
         int var14 = var3 + var5;
         if(var10) {
            if(var7 > 640 && var7 < 1408) {
               var14 += 128;
            }

            if(var7 > 1152 && var7 < 1920) {
               var13 += 128;
            }

            if(var7 > 1664 || var7 < 384) {
               var12 -= 128;
            }

            if(var7 > 128 && var7 < 896) {
               var11 -= 128;
            }
         }

         var11 /= 128;
         var12 /= 128;
         var13 /= 128;
         var14 /= 128;
         return this.method_4736(var1, var11, var12, var13 - var11 + 1, var14 - var12 + 1, var2, var3, var4, var6, var7, true, var8, 0);
      }
   }

   // $FF: renamed from: ar (gm, int, int, int) void
   void method_4876(class_93 var1, int var2, int var3, int var4) {
      class_41 var5;
      class_93 var6;
      if(var3 < this.field_2784) {
         var5 = this.field_2787[var2][var3 + 1][var4];
         if(var5 != null && var5.field_279 != null && var5.field_279.field_2749 instanceof class_93) {
            var6 = (class_93)var5.field_279.field_2749;
            class_93.method_1710(var1, var6, 128, 0, 0, true);
         }
      }

      if(var4 < this.field_2784) {
         var5 = this.field_2787[var2][var3][var4 + 1];
         if(var5 != null && var5.field_279 != null && var5.field_279.field_2749 instanceof class_93) {
            var6 = (class_93)var5.field_279.field_2749;
            class_93.method_1710(var1, var6, 0, 0, 128, true);
         }
      }

      if(var3 < this.field_2784 && var4 < this.field_2786) {
         var5 = this.field_2787[var2][var3 + 1][var4 + 1];
         if(var5 != null && var5.field_279 != null && var5.field_279.field_2749 instanceof class_93) {
            var6 = (class_93)var5.field_279.field_2749;
            class_93.method_1710(var1, var6, 128, 0, 128, true);
         }
      }

      if(var3 < this.field_2784 && var4 > 0) {
         var5 = this.field_2787[var2][var3 + 1][var4 - 1];
         if(var5 != null && var5.field_279 != null && var5.field_279.field_2749 instanceof class_93) {
            var6 = (class_93)var5.field_279.field_2749;
            class_93.method_1710(var1, var6, 128, 0, -128, true);
         }
      }

   }

   // $FF: renamed from: ei (gp, int, int, int, int, int, int) void
   void method_4877(class_249 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.field_2764.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field_2764[var9] - field_2805;
         var11 = var1.field_2763[var9] - field_2790;
         var12 = var1.field_2762[var9] - field_2836;
         var13 = var12 * var4 + var10 * var5 >> 16;
         var12 = var12 * var5 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var11 * var3 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var3 >> 16;
         if(var12 < 50) {
            return;
         }

         if(var1.field_2754 != null) {
            class_249.field_2771[var9] = var10;
            class_249.field_2772[var9] = var13;
            class_249.field_2773[var9] = var12;
         }

         class_249.field_2756[var9] = class_70.field_545 + var10 * class_70.field_544 / var12;
         class_249.field_2770[var9] = class_70.field_538 + var13 * class_70.field_544 / var12;
      }

      class_70.field_554 = 0;
      var8 = var1.field_2760.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field_2760[var9];
         var11 = var1.field_2761[var9];
         var12 = var1.field_2769[var9];
         var13 = class_249.field_2756[var10];
         int var14 = class_249.field_2756[var11];
         int var15 = class_249.field_2756[var12];
         int var16 = class_249.field_2770[var10];
         int var17 = class_249.field_2770[var11];
         int var18 = class_249.field_2770[var12];
         if((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            class_70.field_536 = false;
            if(var13 < 0 || var14 < 0 || var15 < 0 || var13 > class_70.field_537 || var14 > class_70.field_537 || var15 > class_70.field_537) {
               class_70.field_536 = true;
            }

            if(field_2814 && method_4769(field_2815, field_2816, var16, var17, var18, var13, var14, var15)) {
               field_2817 = var6;
               field_2818 = var7;
            }

            if(var1.field_2754 != null && var1.field_2754[var9] != -1) {
               if(!field_2813) {
                  if(var1.field_2765) {
                     class_70.method_983(var16, var17, var18, var13, var14, var15, var1.field_2757[var9], var1.field_2758[var9], var1.field_2759[var9], class_249.field_2771[0], class_249.field_2771[1], class_249.field_2771[3], class_249.field_2772[0], class_249.field_2772[1], class_249.field_2772[3], class_249.field_2773[0], class_249.field_2773[1], class_249.field_2773[3], var1.field_2754[var9]);
                  } else {
                     class_70.method_983(var16, var17, var18, var13, var14, var15, var1.field_2757[var9], var1.field_2758[var9], var1.field_2759[var9], class_249.field_2771[var10], class_249.field_2771[var11], class_249.field_2771[var12], class_249.field_2772[var10], class_249.field_2772[var11], class_249.field_2772[var12], class_249.field_2773[var10], class_249.field_2773[var11], class_249.field_2773[var12], var1.field_2754[var9]);
                  }
               } else {
                  int var19 = class_70.field_555.method_31(var1.field_2754[var9], -1325000693);
                  class_70.method_977(var16, var17, var18, var13, var14, var15, method_4768(var19, var1.field_2757[var9]), method_4768(var19, var1.field_2758[var9]), method_4768(var19, var1.field_2759[var9]));
               }
            } else if(var1.field_2757[var9] != 12345678) {
               class_70.method_977(var16, var17, var18, var13, var14, var15, var1.field_2757[var9], var1.field_2758[var9], var1.field_2759[var9]);
            }
         }
      }

   }

   // $FF: renamed from: fz (int, int) int
   static final int method_4878(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 207114484;
      }

      return (var0 & 827783822) + var1;
   }

   // $FF: renamed from: dr (int, int, int) long
   public long method_4879(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 != null && var4.field_278 != null?var4.field_278.field_3035 * 3146556658035252985L:0L;
   }

   // $FF: renamed from: fa (int, int) int
   static final int method_4880(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   // $FF: renamed from: cn (int, int, int) void
   public void method_4881(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      if(var4 != null) {
         for(int var5 = 0; var5 < var4.field_282 * 1720897143; ++var5) {
            class_261 var6 = var4.field_286[var5];
            if(class_182.method_3836(var6.field_2917 * 1142152799211342585L) && var6.field_2909 * 1674574095 == var2 && var6.field_2913 * 1202737381 == var3) {
               this.method_4738(var6);
               return;
            }
         }

      }
   }

   // $FF: renamed from: fs (int, int, int, int, int, int, int, int) boolean
   static boolean method_4882(int var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 < var2 && var1 < var3 && var1 < var4) {
         return false;
      } else if(var1 > var2 && var1 > var3 && var1 > var4) {
         return false;
      } else if(var0 < var5 && var0 < var6 && var0 < var7) {
         return false;
      } else if(var0 > var5 && var0 > var6 && var0 > var7) {
         return false;
      } else {
         int var8 = (var1 - var2) * (var6 - var5) - (var0 - var5) * (var3 - var2);
         int var9 = (var1 - var3) * (var7 - var6) - (var0 - var6) * (var4 - var3);
         int var10 = (var1 - var4) * (var5 - var7) - (var0 - var7) * (var2 - var4);
         return var8 == 0?(var9 != 0?(var9 < 0?var10 <= 0:var10 >= 0):true):(var8 < 0?var9 <= 0 && var10 <= 0:var9 >= 0 && var10 >= 0);
      }
   }

   // $FF: renamed from: fp () void
   void method_4883() {
      int var1 = field_2823[field_2797];
      class_247[] var2 = field_2803[field_2797];
      field_2825 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         class_247 var4 = var2[var3];
         int var5;
         int var6;
         int var7;
         boolean var8;
         int var9;
         if(var4.field_2731 * -713034583 == 1) {
            var5 = var4.field_2734 * -69528584 - field_2785 + 25;
            if(var5 >= 0 && var5 <= -636204554) {
               var6 = var4.field_2729 * 725968227 - field_2804 + 25;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field_2736 * 1353247321 - field_2804 + 25;
               if(var7 > 806483194) {
                  var7 = 2014035210;
               }

               var8 = false;

               while(var6 <= var7) {
                  if(field_2840[var5][var6++]) {
                     var8 = true;
                     break;
                  }
               }

               if(var8) {
                  var9 = field_2805 - var4.field_2732 * 609464969;
                  if(var9 > 1861332197) {
                     var4.field_2738 = 861516291;
                  } else {
                     if(var9 >= -32) {
                        continue;
                     }

                     var4.field_2738 = 1516381964;
                     var9 = -var9;
                  }

                  var4.field_2740 = (var4.field_2741 * -1515558390 - field_2836 << 8) / var9 * 230234799;
                  var4.field_2742 = (var4.field_2728 * -2138830171 - field_2836 << 8) / var9 * 641817434;
                  var4.field_2727 = (var4.field_2739 * -189041849 - field_2790 << 8) / var9 * -597389745;
                  var4.field_2744 = (var4.field_2737 * -591491886 - field_2790 << 8) / var9 * -1479383167;
                  field_2794[field_2825++] = var4;
               }
            }
         } else if(var4.field_2731 * -72589942 == 2) {
            var5 = var4.field_2729 * 725968227 - field_2804 + 25;
            if(var5 >= 0 && var5 <= 50) {
               var6 = var4.field_2734 * -1269044325 - field_2785 + 25;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field_2735 * 1711970113 - field_2785 + 25;
               if(var7 > 50) {
                  var7 = 50;
               }

               var8 = false;

               while(var6 <= var7) {
                  if(field_2840[var6++][var5]) {
                     var8 = true;
                     break;
                  }
               }

               if(var8) {
                  var9 = field_2836 - var4.field_2741 * -621751483;
                  if(var9 > 1461293669) {
                     var4.field_2738 = -1692116673;
                  } else {
                     if(var9 >= -7202499) {
                        continue;
                     }

                     var4.field_2738 = -96914482;
                     var9 = -var9;
                  }

                  var4.field_2743 = (var4.field_2732 * -687557288 - field_2805 << 8) / var9 * -1314093411;
                  var4.field_2730 = (var4.field_2733 * -635118225 - field_2805 << 8) / var9 * -1547916691;
                  var4.field_2727 = (var4.field_2739 * -189041849 - field_2790 << 8) / var9 * -816579501;
                  var4.field_2744 = (var4.field_2737 * 1423545413 - field_2790 << 8) / var9 * -2111052051;
                  field_2794[field_2825++] = var4;
               }
            }
         } else if(var4.field_2731 * -614579338 == 4) {
            var5 = var4.field_2739 * -1193196387 - field_2790;
            if(var5 > -1953119970) {
               var6 = var4.field_2729 * 725968227 - field_2804 + 25;
               if(var6 < 0) {
                  var6 = 0;
               }

               var7 = var4.field_2736 * 1785790228 - field_2804 + 25;
               if(var7 > 50) {
                  var7 = 50;
               }

               if(var6 <= var7) {
                  int var13 = var4.field_2734 * -1269044325 - field_2785 + 25;
                  if(var13 < 0) {
                     var13 = 0;
                  }

                  var9 = var4.field_2735 * -386233567 - field_2785 + 25;
                  if(var9 > 50) {
                     var9 = 50;
                  }

                  boolean var10 = false;

                  label157:
                  for(int var11 = var13; var11 <= var9; ++var11) {
                     for(int var12 = var6; var12 <= var7; ++var12) {
                        if(field_2840[var11][var12]) {
                           var10 = true;
                           break label157;
                        }
                     }
                  }

                  if(var10) {
                     var4.field_2738 = 12614159;
                     var4.field_2743 = (var4.field_2732 * 818345769 - field_2805 << 8) / var5 * -1314093411;
                     var4.field_2730 = (var4.field_2733 * -635118225 - field_2805 << 8) / var5 * -1547916691;
                     var4.field_2740 = (var4.field_2741 * -1246134414 - field_2836 << 8) / var5 * 936380423;
                     var4.field_2742 = (var4.field_2728 * -969686438 - field_2836 << 8) / var5 * -260458965;
                     field_2794[field_2825++] = var4;
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: fe (int, int, int) boolean
   boolean method_4884(int var1, int var2, int var3) {
      int var4 = this.field_2791[var1][var2][var3];
      if(var4 == -field_2798) {
         return false;
      } else if(var4 == field_2798) {
         return true;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         if(this.method_4775(var5 + 1, this.field_2826[var1][var2][var3], var6 + 1) && this.method_4775(var5 + 128 - 1, this.field_2826[var1][var2 + 1][var3], var6 + 1) && this.method_4775(var5 + 128 - 1, this.field_2826[var1][var2 + 1][var3 + 1], var6 + 128 - 1) && this.method_4775(var5 + 1, this.field_2826[var1][var2][var3 + 1], var6 + 128 - 1)) {
            this.field_2791[var1][var2][var3] = field_2798;
            return true;
         } else {
            this.field_2791[var1][var2][var3] = -field_2798;
            return false;
         }
      }
   }

   // $FF: renamed from: es (gx, boolean) void
   void method_4885(class_41 var1, boolean var2) {
      field_2827.method_5939(var1);

      while(true) {
         class_41 var3 = (class_41)field_2827.method_5974();
         if(var3 == null) {
            return;
         }

         if(var3.field_287) {
            int var4 = var3.field_272 * -509167035;
            int var5 = var3.field_273 * 1628078579;
            int var6 = var3.field_274 * 952681323;
            int var7 = var3.field_276 * -1939651266;
            class_41[][] var8 = this.field_2787[var6];
            class_41 var9;
            class_269 var10;
            int var11;
            class_261 var12;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var21;
            boolean var22;
            class_41 var33;
            if(var3.field_293) {
               if(var2) {
                  if(var6 > 0) {
                     var9 = this.field_2787[var6 - 1][var4][var5];
                     if(var9 != null && var9.field_287) {
                        continue;
                     }
                  }

                  if(var4 <= field_2785 && var4 > field_2799) {
                     var9 = var8[var4 - 1][var5];
                     if(var9 != null && var9.field_287 && (var9.field_293 || (var3.field_284 * -1726756160 & 1) == 0)) {
                        continue;
                     }
                  }

                  if(var4 >= field_2785 && var4 < field_2806 - 1) {
                     var9 = var8[var4 + 1][var5];
                     if(var9 != null && var9.field_287 && (var9.field_293 || (var3.field_284 * -1681072837 & 4) == 0)) {
                        continue;
                     }
                  }

                  if(var5 <= field_2804 && var5 > field_2801) {
                     var9 = var8[var4][var5 - 1];
                     if(var9 != null && var9.field_287 && (var9.field_293 || (var3.field_284 * 1099123981 & 8) == 0)) {
                        continue;
                     }
                  }

                  if(var5 >= field_2804 && var5 < field_2802 - 1) {
                     var9 = var8[var4][var5 + 1];
                     if(var9 != null && var9.field_287 && (var9.field_293 || (var3.field_284 * -1461843299 & 2) == 0)) {
                        continue;
                     }
                  }
               } else {
                  var2 = true;
               }

               var3.field_293 = false;
               if(var3.field_292 != null) {
                  var9 = var3.field_292;
                  if(var9.field_275 != null) {
                     if(!this.method_4771(0, var4, var5)) {
                        this.method_4745(var9.field_275, 0, field_2808, field_2809, field_2810, field_2811, var4, var5);
                     }
                  } else if(var9.field_289 != null && !this.method_4771(0, var4, var5)) {
                     this.method_4856(var9.field_289, field_2808, field_2809, field_2810, field_2811, var4, var5);
                  }

                  var10 = var9.field_277;
                  if(var10 != null) {
                     var10.field_3178.method_1607(0, field_2808, field_2809, field_2810, field_2811, var10.field_3174 * 662711357 - field_2805, var10.field_3170 * -727989945 - field_2790, var10.field_3176 * -617434094 - field_2836, var10.field_3169 * 1374506562499121997L);
                  }

                  for(var11 = 0; var11 < var9.field_282 * 213623958; ++var11) {
                     var12 = var9.field_286[var11];
                     if(var12 != null) {
                        var12.field_2915.method_1607(var12.field_2911 * 2101040790, field_2808, field_2809, field_2810, field_2811, var12.field_2910 * -506668103 - field_2805, var12.field_2906 * -1917415421 - field_2790, var12.field_2908 * -1375528020 - field_2836, var12.field_2917 * 1142152799211342585L);
                     }
                  }
               }

               var22 = false;
               if(var3.field_275 != null) {
                  if(!this.method_4771(var7, var4, var5)) {
                     var22 = true;
                     if(var3.field_275.field_2684 * 2094671648 != -1541764659 || field_2814 && var6 <= field_2800) {
                        this.method_4745(var3.field_275, var7, field_2808, field_2809, field_2810, field_2811, var4, var5);
                     }
                  }
               } else if(var3.field_289 != null && !this.method_4771(var7, var4, var5)) {
                  var22 = true;
                  this.method_4856(var3.field_289, field_2808, field_2809, field_2810, field_2811, var4, var5);
               }

               var21 = 0;
               var11 = 0;
               class_269 var23 = var3.field_277;
               class_265 var13 = var3.field_278;
               if(var23 != null || var13 != null) {
                  if(field_2785 == var4) {
                     ++var21;
                  } else if(field_2785 < var4) {
                     var21 += 2;
                  }

                  if(field_2804 == var5) {
                     var21 += 3;
                  } else if(field_2804 > var5) {
                     var21 += 6;
                  }

                  var11 = field_2828[var21];
                  var3.field_271 = field_2830[var21] * 495564059;
               }

               if(var23 != null) {
                  if((var23.field_3172 * 797325937 & field_2842[var21]) != 0) {
                     if(var23.field_3172 * 643320237 == 16) {
                        var3.field_291 = -212858068;
                        var3.field_290 = field_2831[var21] * -1568837483;
                        var3.field_280 = -1461931424 - var3.field_290 * 1996560059;
                     } else if(var23.field_3172 * 643320237 == 371255509) {
                        var3.field_291 = -1581062335;
                        var3.field_290 = field_2832[var21] * -1568837483;
                        var3.field_280 = -1315151537 - var3.field_290 * 1996560059;
                     } else if(var23.field_3172 * 643320237 == -1089316337) {
                        var3.field_291 = -1115066364;
                        var3.field_290 = field_2795[var21] * -1568837483;
                        var3.field_280 = -526122855 - var3.field_290 * -1222552882;
                     } else {
                        var3.field_291 = -407195345;
                        var3.field_290 = field_2834[var21] * -304818150;
                        var3.field_280 = -1812242033 - var3.field_290 * 577166675;
                     }
                  } else {
                     var3.field_291 = 0;
                  }

                  if((var23.field_3172 * 812151977 & var11) != 0 && !this.method_4772(var7, var4, var5, var23.field_3172 * 643320237)) {
                     var23.field_3178.method_1607(0, field_2808, field_2809, field_2810, field_2811, var23.field_3174 * 662711357 - field_2805, var23.field_3170 * -727989945 - field_2790, var23.field_3176 * 1063327652 - field_2836, var23.field_3169 * 1374506562499121997L);
                  }

                  if((var23.field_3173 * 1924609359 & var11) != 0 && !this.method_4772(var7, var4, var5, var23.field_3173 * 1924609359)) {
                     var23.field_3175.method_1607(0, field_2808, field_2809, field_2810, field_2811, var23.field_3174 * 662711357 - field_2805, var23.field_3170 * 68878288 - field_2790, var23.field_3176 * -1127510877 - field_2836, var23.field_3169 * 1374506562499121997L);
                  }
               }

               if(var13 != null && !this.method_4773(var7, var4, var5, var13.field_3039.field_911 * 267422413)) {
                  if((var13.field_3038 * -735857732 & var11) != 0) {
                     var13.field_3039.method_1607(0, field_2808, field_2809, field_2810, field_2811, var13.field_3036 * 1511932377 - field_2805 + var13.field_3040 * -2026318183, var13.field_3037 * -1988235731 - field_2790, var13.field_3042 * 750074813 - field_2836 + var13.field_3041 * 1292762417, var13.field_3035 * 3146556658035252985L);
                  } else if(var13.field_3038 * -192127250 == 2005854060) {
                     var14 = var13.field_3036 * 1511932377 - field_2805;
                     var15 = var13.field_3037 * 773870582 - field_2790;
                     var16 = var13.field_3042 * 750074813 - field_2836;
                     var17 = var13.field_3044 * 1111812521;
                     if(var17 != 1 && var17 != 2) {
                        var18 = var14;
                     } else {
                        var18 = -var14;
                     }

                     int var19;
                     if(var17 != 2 && var17 != 3) {
                        var19 = var16;
                     } else {
                        var19 = -var16;
                     }

                     if(var19 < var18) {
                        var13.field_3039.method_1607(0, field_2808, field_2809, field_2810, field_2811, var14 + var13.field_3040 * -1150020828, var15, var16 + var13.field_3041 * 1292762417, var13.field_3035 * 3146556658035252985L);
                     } else if(var13.field_3043 != null) {
                        var13.field_3043.method_1607(0, field_2808, field_2809, field_2810, field_2811, var14, var15, var16, var13.field_3035 * 3146556658035252985L);
                     }
                  }
               }

               if(var22) {
                  class_248 var27 = var3.field_279;
                  if(var27 != null) {
                     var27.field_2749.method_1607(0, field_2808, field_2809, field_2810, field_2811, var27.field_2747 * -1864149275 - field_2805, var27.field_2753 * 1363658290 - field_2790, var27.field_2746 * -1474470851 - field_2836, var27.field_2750 * 5096767537878498943L);
                  }

                  class_253 var31 = var3.field_281;
                  if(var31 != null && var31.field_2860 * -2084535694 == 0) {
                     if(var31.field_2864 != null) {
                        var31.field_2864.method_1607(0, field_2808, field_2809, field_2810, field_2811, var31.field_2861 * -840082071 - field_2805, var31.field_2867 * 1950267115 - field_2790, var31.field_2862 * 489565823 - field_2836, var31.field_2866 * 8707211480451132889L);
                     }

                     if(var31.field_2865 != null) {
                        var31.field_2865.method_1607(0, field_2808, field_2809, field_2810, field_2811, var31.field_2861 * 1407614144 - field_2805, var31.field_2867 * 1950267115 - field_2790, var31.field_2862 * -1473523223 - field_2836, var31.field_2866 * 8707211480451132889L);
                     }

                     if(var31.field_2863 != null) {
                        var31.field_2863.method_1607(0, field_2808, field_2809, field_2810, field_2811, var31.field_2861 * -1580503998 - field_2805, var31.field_2867 * 491231308 - field_2790, var31.field_2862 * -1958043433 - field_2836, var31.field_2866 * 8707211480451132889L);
                     }
                  }
               }

               var14 = var3.field_284 * -1728125897;
               if(var14 != 0) {
                  if(var4 < field_2785 && (var14 & 4) != 0) {
                     var33 = var8[var4 + 1][var5];
                     if(var33 != null && var33.field_287) {
                        field_2827.method_5939(var33);
                     }
                  }

                  if(var5 < field_2804 && (var14 & 2) != 0) {
                     var33 = var8[var4][var5 + 1];
                     if(var33 != null && var33.field_287) {
                        field_2827.method_5939(var33);
                     }
                  }

                  if(var4 > field_2785 && (var14 & 1) != 0) {
                     var33 = var8[var4 - 1][var5];
                     if(var33 != null && var33.field_287) {
                        field_2827.method_5939(var33);
                     }
                  }

                  if(var5 > field_2804 && (var14 & 8) != 0) {
                     var33 = var8[var4][var5 - 1];
                     if(var33 != null && var33.field_287) {
                        field_2827.method_5939(var33);
                     }
                  }
               }
            }

            if(var3.field_291 * 1695083523 != 0) {
               var22 = true;

               for(var21 = 0; var21 < var3.field_282 * 1720897143; ++var21) {
                  if(var3.field_286[var21].field_2907 * -894271093 != field_2798 && (var3.field_283[var21] & var3.field_291 * 1695083523) == var3.field_290 * 502485384) {
                     var22 = false;
                     break;
                  }
               }

               if(var22) {
                  var10 = var3.field_277;
                  if(!this.method_4772(var7, var4, var5, var10.field_3172 * 643320237)) {
                     var10.field_3178.method_1607(0, field_2808, field_2809, field_2810, field_2811, var10.field_3174 * 1469779048 - field_2805, var10.field_3170 * -727989945 - field_2790, var10.field_3176 * 979477096 - field_2836, var10.field_3169 * 1374506562499121997L);
                  }

                  var3.field_291 = 0;
               }
            }

            int var24;
            int var26;
            if(var3.field_288) {
               try {
                  int var25 = var3.field_282 * 1581442020;
                  var3.field_288 = false;
                  var21 = 0;

                  label544:
                  for(var11 = 0; var11 < var25; ++var11) {
                     var12 = var3.field_286[var11];
                     if(var12.field_2907 * -137941941 != field_2798) {
                        for(var26 = var12.field_2909 * 1674574095; var26 <= var12.field_2912 * -589735975; ++var26) {
                           for(var14 = var12.field_2913 * 956271070; var14 <= var12.field_2914 * -243010100; ++var14) {
                              var33 = var8[var26][var14];
                              if(var33.field_293) {
                                 var3.field_288 = true;
                                 continue label544;
                              }

                              if(var33.field_291 * -1074988662 != 0) {
                                 var16 = 0;
                                 if(var26 > var12.field_2909 * 975546525) {
                                    ++var16;
                                 }

                                 if(var26 < var12.field_2912 * 1295885659) {
                                    var16 += 4;
                                 }

                                 if(var14 > var12.field_2913 * 396727299) {
                                    var16 += 8;
                                 }

                                 if(var14 < var12.field_2914 * -129893675) {
                                    var16 += 2;
                                 }

                                 if((var16 & var33.field_291 * 1008632385) == var3.field_280 * -726038297) {
                                    var3.field_288 = true;
                                    continue label544;
                                 }
                              }
                           }
                        }

                        field_2812[var21++] = var12;
                        var26 = field_2785 - var12.field_2909 * 1674574095;
                        var14 = var12.field_2912 * -1401585691 - field_2785;
                        if(var14 > var26) {
                           var26 = var14;
                        }

                        var15 = field_2804 - var12.field_2913 * -1306987369;
                        var16 = var12.field_2914 * -129893675 - field_2804;
                        if(var16 > var15) {
                           var12.field_2916 = (var26 + var16) * 1212965461;
                        } else {
                           var12.field_2916 = (var26 + var15) * 177721366;
                        }
                     }
                  }

                  while(var21 > 0) {
                     var11 = -1455887891;
                     var24 = -1;

                     for(var26 = 0; var26 < var21; ++var26) {
                        class_261 var34 = field_2812[var26];
                        if(var34.field_2907 * -137941941 != field_2798) {
                           if(var34.field_2916 * 1504761915 > var11) {
                              var11 = var34.field_2916 * -327316739;
                              var24 = var26;
                           } else if(var34.field_2916 * -327316739 == var11) {
                              var15 = var34.field_2910 * 874247885 - field_2805;
                              var16 = var34.field_2908 * -1894453494 - field_2836;
                              var17 = field_2812[var24].field_2910 * 477984630 - field_2805;
                              var18 = field_2812[var24].field_2908 * 1951447028 - field_2836;
                              if(var15 * var15 + var16 * var16 > var17 * var17 + var18 * var18) {
                                 var24 = var26;
                              }
                           }
                        }
                     }

                     if(var24 == -1) {
                        break;
                     }

                     class_261 var35 = field_2812[var24];
                     var35.field_2907 = field_2798 * 230964579;
                     if(!this.method_4774(var7, var35.field_2909 * 1674574095, var35.field_2912 * -2078907755, var35.field_2913 * 1202737381, var35.field_2914 * 1201187952, var35.field_2915.field_911 * 124840010)) {
                        var35.field_2915.method_1607(var35.field_2911 * -2128291791, field_2808, field_2809, field_2810, field_2811, var35.field_2910 * 1140262961 - field_2805, var35.field_2906 * -1131107730 - field_2790, var35.field_2908 * -74732244 - field_2836, var35.field_2917 * 1142152799211342585L);
                     }

                     for(var14 = var35.field_2909 * 804136738; var14 <= var35.field_2912 * -2078907755; ++var14) {
                        for(var15 = var35.field_2913 * 1202737381; var15 <= var35.field_2914 * 1618456445; ++var15) {
                           class_41 var36 = var8[var14][var15];
                           if(var36.field_291 * 1577643420 != 0) {
                              field_2827.method_5939(var36);
                           } else if((var14 != var4 || var15 != var5) && var36.field_287) {
                              field_2827.method_5939(var36);
                           }
                        }
                     }
                  }

                  if(var3.field_288) {
                     continue;
                  }
               } catch (Exception var20) {
                  var3.field_288 = false;
               }
            }

            if(var3.field_287 && var3.field_291 * 1030274927 == 0) {
               if(var4 <= field_2785 && var4 > field_2799) {
                  var9 = var8[var4 - 1][var5];
                  if(var9 != null && var9.field_287) {
                     continue;
                  }
               }

               if(var4 >= field_2785 && var4 < field_2806 - 1) {
                  var9 = var8[var4 + 1][var5];
                  if(var9 != null && var9.field_287) {
                     continue;
                  }
               }

               if(var5 <= field_2804 && var5 > field_2801) {
                  var9 = var8[var4][var5 - 1];
                  if(var9 != null && var9.field_287) {
                     continue;
                  }
               }

               if(var5 >= field_2804 && var5 < field_2802 - 1) {
                  var9 = var8[var4][var5 + 1];
                  if(var9 != null && var9.field_287) {
                     continue;
                  }
               }

               var3.field_287 = false;
               --field_2796;
               class_253 var29 = var3.field_281;
               if(var29 != null && var29.field_2860 * 1917841068 != 0) {
                  if(var29.field_2864 != null) {
                     var29.field_2864.method_1607(0, field_2808, field_2809, field_2810, field_2811, var29.field_2861 * -2082853453 - field_2805, var29.field_2867 * 1436406713 - field_2790 - var29.field_2860 * 1688818251, var29.field_2862 * -1698069250 - field_2836, var29.field_2866 * 8707211480451132889L);
                  }

                  if(var29.field_2865 != null) {
                     var29.field_2865.method_1607(0, field_2808, field_2809, field_2810, field_2811, var29.field_2861 * -79537240 - field_2805, var29.field_2867 * 373434898 - field_2790 - var29.field_2860 * -1990422941, var29.field_2862 * -1958043433 - field_2836, var29.field_2866 * 8707211480451132889L);
                  }

                  if(var29.field_2863 != null) {
                     var29.field_2863.method_1607(0, field_2808, field_2809, field_2810, field_2811, var29.field_2861 * -840082071 - field_2805, var29.field_2867 * 1950267115 - field_2790 - var29.field_2860 * 55109027, var29.field_2862 * -1746936127 - field_2836, var29.field_2866 * 8707211480451132889L);
                  }
               }

               if(var3.field_271 * 1543334420 != 0) {
                  class_265 var30 = var3.field_278;
                  if(var30 != null && !this.method_4773(var7, var4, var5, var30.field_3039.field_911 * 267422413)) {
                     if((var30.field_3038 * 1760283661 & var3.field_271 * 1501732115) != 0) {
                        var30.field_3039.method_1607(0, field_2808, field_2809, field_2810, field_2811, var30.field_3036 * -1684488155 - field_2805 + var30.field_3040 * -2026318183, var30.field_3037 * 940703607 - field_2790, var30.field_3042 * -249066591 - field_2836 + var30.field_3041 * 1292762417, var30.field_3035 * 3146556658035252985L);
                     } else if(var30.field_3038 * 1760283661 == 256) {
                        var11 = var30.field_3036 * 1511932377 - field_2805;
                        var24 = var30.field_3037 * -1988235731 - field_2790;
                        var26 = var30.field_3042 * 750074813 - field_2836;
                        var14 = var30.field_3044 * 1456044736;
                        if(var14 != 1 && var14 != 2) {
                           var15 = var11;
                        } else {
                           var15 = -var11;
                        }

                        if(var14 != 2 && var14 != 3) {
                           var16 = var26;
                        } else {
                           var16 = -var26;
                        }

                        if(var16 >= var15) {
                           var30.field_3039.method_1607(0, field_2808, field_2809, field_2810, field_2811, var11 + var30.field_3040 * -2026318183, var24, var26 + var30.field_3041 * -1210875703, var30.field_3035 * 3146556658035252985L);
                        } else if(var30.field_3043 != null) {
                           var30.field_3043.method_1607(0, field_2808, field_2809, field_2810, field_2811, var11, var24, var26, var30.field_3035 * 3146556658035252985L);
                        }
                     }
                  }

                  class_269 var28 = var3.field_277;
                  if(var28 != null) {
                     if((var28.field_3173 * 1924609359 & var3.field_271 * 1501732115) != 0 && !this.method_4772(var7, var4, var5, var28.field_3173 * 1992814933)) {
                        var28.field_3175.method_1607(0, field_2808, field_2809, field_2810, field_2811, var28.field_3174 * 662711357 - field_2805, var28.field_3170 * -1190551857 - field_2790, var28.field_3176 * -1127510877 - field_2836, var28.field_3169 * 1374506562499121997L);
                     }

                     if((var28.field_3172 * 556165651 & var3.field_271 * 1501732115) != 0 && !this.method_4772(var7, var4, var5, var28.field_3172 * 643320237)) {
                        var28.field_3178.method_1607(0, field_2808, field_2809, field_2810, field_2811, var28.field_3174 * -1799587694 - field_2805, var28.field_3170 * 1826327010 - field_2790, var28.field_3176 * 2017655507 - field_2836, var28.field_3169 * 1374506562499121997L);
                     }
                  }
               }

               class_41 var32;
               if(var6 < this.field_2783 - 1) {
                  var32 = this.field_2787[var6 + 1][var4][var5];
                  if(var32 != null && var32.field_287) {
                     field_2827.method_5939(var32);
                  }
               }

               if(var4 < field_2785) {
                  var32 = var8[var4 + 1][var5];
                  if(var32 != null && var32.field_287) {
                     field_2827.method_5939(var32);
                  }
               }

               if(var5 < field_2804) {
                  var32 = var8[var4][var5 + 1];
                  if(var32 != null && var32.field_287) {
                     field_2827.method_5939(var32);
                  }
               }

               if(var4 > field_2785) {
                  var32 = var8[var4 - 1][var5];
                  if(var32 != null && var32.field_287) {
                     field_2827.method_5939(var32);
                  }
               }

               if(var5 > field_2804) {
                  var32 = var8[var4][var5 - 1];
                  if(var32 != null && var32.field_287) {
                     field_2827.method_5939(var32);
                  }
               }
            }
         }
      }
   }

   // $FF: renamed from: fo (int, int, int, int) boolean
   boolean method_4886(int var1, int var2, int var3, int var4) {
      if(!this.method_4771(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field_2826[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if(var4 < 16) {
            if(var4 == 1) {
               if(var5 > field_2805) {
                  if(!this.method_4775(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method_4775(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method_4775(var5, var9, var6)) {
                  return false;
               }

               if(!this.method_4775(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 2) {
               if(var6 < field_2836) {
                  if(!this.method_4775(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method_4775(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method_4775(var5, var9, var6 + 128)) {
                  return false;
               }

               if(!this.method_4775(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 4) {
               if(var5 < field_2805) {
                  if(!this.method_4775(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method_4775(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method_4775(var5 + 128, var9, var6)) {
                  return false;
               }

               if(!this.method_4775(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 8) {
               if(var6 > field_2836) {
                  if(!this.method_4775(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method_4775(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if(!this.method_4775(var5, var9, var6)) {
                  return false;
               }

               if(!this.method_4775(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         return !this.method_4775(var5 + 64, var10, var6 + 64)?false:(var4 == 16?this.method_4775(var5, var9, var6 + 128):(var4 == 32?this.method_4775(var5 + 128, var9, var6 + 128):(var4 == 64?this.method_4775(var5 + 128, var9, var6):(var4 == 128?this.method_4775(var5, var9, var6):true))));
      }
   }

   // $FF: renamed from: fq (int, int, int, int) boolean
   boolean method_4887(int var1, int var2, int var3, int var4) {
      if(!this.method_4771(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field_2826[var1][var2][var3] - 1;
         int var8 = var7 - -1421186207;
         int var9 = var7 - -559191383;
         int var10 = var7 - 238;
         if(var4 < 16) {
            if(var4 == 1) {
               if(var5 > field_2805) {
                  if(!this.method_4775(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5, var7, var6 + -489254721)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method_4775(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5, var8, var6 + -1753283163)) {
                     return false;
                  }
               }

               if(!this.method_4775(var5, var9, var6)) {
                  return false;
               }

               if(!this.method_4775(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 2) {
               if(var6 < field_2836) {
                  if(!this.method_4775(var5, var7, var6 + 1601543577)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + -2113245643, var7, var6 + -1734309694)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method_4775(var5, var8, var6 + 1317905694)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method_4775(var5, var9, var6 + 128)) {
                  return false;
               }

               if(!this.method_4775(var5 + -1576794076, var9, var6 + 589045261)) {
                  return false;
               }

               return true;
            }

            if(var4 == 4) {
               if(var5 < field_2805) {
                  if(!this.method_4775(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method_4775(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + -1351718117, var8, var6 + -1676299673)) {
                     return false;
                  }
               }

               if(!this.method_4775(var5 + -1281536080, var9, var6)) {
                  return false;
               }

               if(!this.method_4775(var5 + -1150145197, var9, var6 + 932056312)) {
                  return false;
               }

               return true;
            }

            if(var4 == 8) {
               if(var6 > field_2836) {
                  if(!this.method_4775(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 1758040019, var7, var6)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method_4775(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if(!this.method_4775(var5, var9, var6)) {
                  return false;
               }

               if(!this.method_4775(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         return !this.method_4775(var5 + -1359956549, var10, var6 + 64)?false:(var4 == 16?this.method_4775(var5, var9, var6 + 1999464052):(var4 == 32?this.method_4775(var5 + 128, var9, var6 + -1030857595):(var4 == 1251616160?this.method_4775(var5 + 128, var9, var6):(var4 == 128?this.method_4775(var5, var9, var6):true))));
      }
   }

   // $FF: renamed from: ff (int, int, int, int) boolean
   boolean method_4888(int var1, int var2, int var3, int var4) {
      if(!this.method_4771(var1, var2, var3)) {
         return false;
      } else {
         int var5 = var2 << 7;
         int var6 = var3 << 7;
         int var7 = this.field_2826[var1][var2][var3] - 1;
         int var8 = var7 - 120;
         int var9 = var7 - 230;
         int var10 = var7 - 238;
         if(var4 < 16) {
            if(var4 == 1) {
               if(var5 > field_2805) {
                  if(!this.method_4775(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method_4775(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method_4775(var5, var9, var6)) {
                  return false;
               }

               if(!this.method_4775(var5, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 2) {
               if(var6 < field_2836) {
                  if(!this.method_4775(var5, var7, var6 + 128)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method_4775(var5, var8, var6 + 128)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method_4775(var5, var9, var6 + 128)) {
                  return false;
               }

               if(!this.method_4775(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 4) {
               if(var5 < field_2805) {
                  if(!this.method_4775(var5 + 128, var7, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var7, var6 + 128)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method_4775(var5 + 128, var8, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var8, var6 + 128)) {
                     return false;
                  }
               }

               if(!this.method_4775(var5 + 128, var9, var6)) {
                  return false;
               }

               if(!this.method_4775(var5 + 128, var9, var6 + 128)) {
                  return false;
               }

               return true;
            }

            if(var4 == 8) {
               if(var6 > field_2836) {
                  if(!this.method_4775(var5, var7, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var7, var6)) {
                     return false;
                  }
               }

               if(var1 > 0) {
                  if(!this.method_4775(var5, var8, var6)) {
                     return false;
                  }

                  if(!this.method_4775(var5 + 128, var8, var6)) {
                     return false;
                  }
               }

               if(!this.method_4775(var5, var9, var6)) {
                  return false;
               }

               if(!this.method_4775(var5 + 128, var9, var6)) {
                  return false;
               }

               return true;
            }
         }

         return !this.method_4775(var5 + 64, var10, var6 + 64)?false:(var4 == 16?this.method_4775(var5, var9, var6 + 128):(var4 == 32?this.method_4775(var5 + 128, var9, var6 + 128):(var4 == 64?this.method_4775(var5 + 128, var9, var6):(var4 == 128?this.method_4775(var5, var9, var6):true))));
      }
   }

   // $FF: renamed from: t (int, int, int) hw
   public class_269 method_4889(int var1, int var2, int var3) {
      class_41 var4 = this.field_2787[var1][var2][var3];
      return var4 == null?null:var4.field_277;
   }

   // $FF: renamed from: fj (int, int, int, int, int, int) boolean
   boolean method_4890(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if(var2 == var3 && var4 == var5) {
         if(!this.method_4771(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method_4775(var7 + 1, this.field_2826[var1][var2][var4] - var6, var8 + 1) && this.method_4775(var7 + 128 - 1, this.field_2826[var1][var2 + 1][var4] - var6, var8 + 1) && this.method_4775(var7 + 293019253 - 1, this.field_2826[var1][var2 + 1][var4 + 1] - var6, var8 + -468910529 - 1) && this.method_4775(var7 + 1, this.field_2826[var1][var2][var4 + 1] - var6, var8 + 978949037 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if(this.field_2791[var1][var7][var8] == -field_2798) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.field_2826[var1][var2][var4] - var6;
         if(!this.method_4775(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if(!this.method_4775(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if(!this.method_4775(var7, var9, var11)) {
                  return false;
               } else if(!this.method_4775(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   // $FF: renamed from: fg (int, int, int, int, int, int) boolean
   boolean method_4891(int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7;
      int var8;
      if(var2 == var3 && var4 == var5) {
         if(!this.method_4771(var1, var2, var4)) {
            return false;
         } else {
            var7 = var2 << 7;
            var8 = var4 << 7;
            return this.method_4775(var7 + 1, this.field_2826[var1][var2][var4] - var6, var8 + 1) && this.method_4775(var7 + 128 - 1, this.field_2826[var1][var2 + 1][var4] - var6, var8 + 1) && this.method_4775(var7 + 128 - 1, this.field_2826[var1][var2 + 1][var4 + 1] - var6, var8 + 128 - 1) && this.method_4775(var7 + 1, this.field_2826[var1][var2][var4 + 1] - var6, var8 + 128 - 1);
         }
      } else {
         for(var7 = var2; var7 <= var3; ++var7) {
            for(var8 = var4; var8 <= var5; ++var8) {
               if(this.field_2791[var1][var7][var8] == -field_2798) {
                  return false;
               }
            }
         }

         var7 = (var2 << 7) + 1;
         var8 = (var4 << 7) + 2;
         int var9 = this.field_2826[var1][var2][var4] - var6;
         if(!this.method_4775(var7, var9, var8)) {
            return false;
         } else {
            int var10 = (var3 << 7) - 1;
            if(!this.method_4775(var10, var9, var8)) {
               return false;
            } else {
               int var11 = (var5 << 7) - 1;
               if(!this.method_4775(var7, var9, var11)) {
                  return false;
               } else if(!this.method_4775(var10, var9, var11)) {
                  return false;
               } else {
                  return true;
               }
            }
         }
      }
   }

   // $FF: renamed from: eh (gp, int, int, int, int, int, int) void
   void method_4892(class_249 var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      int var8 = var1.field_2764.length;

      int var9;
      int var10;
      int var11;
      int var12;
      int var13;
      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field_2764[var9] - field_2805;
         var11 = var1.field_2763[var9] - field_2790;
         var12 = var1.field_2762[var9] - field_2836;
         var13 = var12 * var4 + var10 * var5 >> 16;
         var12 = var12 * var5 - var10 * var4 >> 16;
         var10 = var13;
         var13 = var11 * var3 - var12 * var2 >> 16;
         var12 = var11 * var2 + var12 * var3 >> 16;
         if(var12 < 1035218863) {
            return;
         }

         if(var1.field_2754 != null) {
            class_249.field_2771[var9] = var10;
            class_249.field_2772[var9] = var13;
            class_249.field_2773[var9] = var12;
         }

         class_249.field_2756[var9] = class_70.field_545 + var10 * class_70.field_544 / var12;
         class_249.field_2770[var9] = class_70.field_538 + var13 * class_70.field_544 / var12;
      }

      class_70.field_554 = 0;
      var8 = var1.field_2760.length;

      for(var9 = 0; var9 < var8; ++var9) {
         var10 = var1.field_2760[var9];
         var11 = var1.field_2761[var9];
         var12 = var1.field_2769[var9];
         var13 = class_249.field_2756[var10];
         int var14 = class_249.field_2756[var11];
         int var15 = class_249.field_2756[var12];
         int var16 = class_249.field_2770[var10];
         int var17 = class_249.field_2770[var11];
         int var18 = class_249.field_2770[var12];
         if((var13 - var14) * (var18 - var17) - (var16 - var17) * (var15 - var14) > 0) {
            class_70.field_536 = false;
            if(var13 < 0 || var14 < 0 || var15 < 0 || var13 > class_70.field_537 || var14 > class_70.field_537 || var15 > class_70.field_537) {
               class_70.field_536 = true;
            }

            if(field_2814 && method_4769(field_2815, field_2816, var16, var17, var18, var13, var14, var15)) {
               field_2817 = var6;
               field_2818 = var7;
            }

            if(var1.field_2754 != null && var1.field_2754[var9] != -1) {
               if(!field_2813) {
                  if(var1.field_2765) {
                     class_70.method_983(var16, var17, var18, var13, var14, var15, var1.field_2757[var9], var1.field_2758[var9], var1.field_2759[var9], class_249.field_2771[0], class_249.field_2771[1], class_249.field_2771[3], class_249.field_2772[0], class_249.field_2772[1], class_249.field_2772[3], class_249.field_2773[0], class_249.field_2773[1], class_249.field_2773[3], var1.field_2754[var9]);
                  } else {
                     class_70.method_983(var16, var17, var18, var13, var14, var15, var1.field_2757[var9], var1.field_2758[var9], var1.field_2759[var9], class_249.field_2771[var10], class_249.field_2771[var11], class_249.field_2771[var12], class_249.field_2772[var10], class_249.field_2772[var11], class_249.field_2772[var12], class_249.field_2773[var10], class_249.field_2773[var11], class_249.field_2773[var12], var1.field_2754[var9]);
                  }
               } else {
                  int var19 = class_70.field_555.method_31(var1.field_2754[var9], 1511364258);
                  class_70.method_977(var16, var17, var18, var13, var14, var15, method_4768(var19, var1.field_2757[var9]), method_4768(var19, var1.field_2758[var9]), method_4768(var19, var1.field_2759[var9]));
               }
            } else if(var1.field_2757[var9] != -444413565) {
               class_70.method_977(var16, var17, var18, var13, var14, var15, var1.field_2757[var9], var1.field_2758[var9], var1.field_2759[var9]);
            }
         }
      }

   }

   // $FF: renamed from: fy (int, int, int) boolean
   boolean method_4893(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < field_2825; ++var4) {
         class_247 var5 = field_2794[var4];
         int var6;
         int var7;
         int var8;
         int var9;
         int var10;
         if(var5.field_2738 * 431106327 == 1) {
            var6 = var5.field_2732 * 818345769 - var1;
            if(var6 > 0) {
               var7 = var5.field_2741 * 2065590642 + (var5.field_2740 * -2125693873 * var6 >> 8);
               var8 = var5.field_2728 * 1703842397 + (var5.field_2742 * 1761408947 * var6 >> 8);
               var9 = var5.field_2739 * 1844441330 + (var5.field_2727 * 536172955 * var6 >> 8);
               var10 = var5.field_2737 * 1423545413 + (var5.field_2744 * -533190237 * var6 >> 8);
               if(var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field_2738 * 593390562 == 2) {
            var6 = var1 - var5.field_2732 * 818345769;
            if(var6 > 0) {
               var7 = var5.field_2741 * 1526949186 + (var5.field_2740 * -2125693873 * var6 >> 8);
               var8 = var5.field_2728 * 1703842397 + (var5.field_2742 * 1583949197 * var6 >> 8);
               var9 = var5.field_2739 * -189041849 + (var5.field_2727 * 278019312 * var6 >> 8);
               var10 = var5.field_2737 * 1539529972 + (var5.field_2744 * -533190237 * var6 >> 8);
               if(var3 >= var7 && var3 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field_2738 * -2138961749 == 3) {
            var6 = var5.field_2741 * -1692901726 - var3;
            if(var6 > 0) {
               var7 = var5.field_2732 * 1572673842 + (var5.field_2743 * -853135435 * var6 >> 8);
               var8 = var5.field_2733 * 812903140 + (var5.field_2730 * -717590101 * var6 >> 8);
               var9 = var5.field_2739 * 1678509488 + (var5.field_2727 * 536172955 * var6 >> 8);
               var10 = var5.field_2737 * 1423545413 + (var5.field_2744 * -533190237 * var6 >> 8);
               if(var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field_2738 * -2138961749 == 4) {
            var6 = var3 - var5.field_2741 * 1972385881;
            if(var6 > 0) {
               var7 = var5.field_2732 * 818345769 + (var5.field_2743 * -1880438408 * var6 >> 8);
               var8 = var5.field_2733 * -618413144 + (var5.field_2730 * -1619867384 * var6 >> 8);
               var9 = var5.field_2739 * -189041849 + (var5.field_2727 * 223268636 * var6 >> 8);
               var10 = var5.field_2737 * 1423545413 + (var5.field_2744 * -533190237 * var6 >> 8);
               if(var1 >= var7 && var1 <= var8 && var2 >= var9 && var2 <= var10) {
                  return true;
               }
            }
         } else if(var5.field_2738 * -2138961749 == 5) {
            var6 = var2 - var5.field_2739 * -223217242;
            if(var6 > 0) {
               var7 = var5.field_2732 * -1632690394 + (var5.field_2743 * -1745853628 * var6 >> 8);
               var8 = var5.field_2733 * 456809643 + (var5.field_2730 * -1592753816 * var6 >> 8);
               var9 = var5.field_2741 * -621751483 + (var5.field_2740 * -1134649193 * var6 >> 8);
               var10 = var5.field_2728 * -2135539077 + (var5.field_2742 * 1761408947 * var6 >> 8);
               if(var1 >= var7 && var1 <= var8 && var3 >= var9 && var3 <= var10) {
                  return true;
               }
            }
         }
      }

      return false;
   }

   // $FF: renamed from: ex (int, int, int, boolean) void
   public void method_4894(int var1, int var2, int var3, boolean var4) {
      if(!method_4824() || var4) {
         field_2814 = true;
         field_2782 = var4;
         field_2800 = var1;
         field_2815 = var2;
         field_2816 = var3;
         field_2817 = -1;
         field_2818 = -1;
      }
   }
}
