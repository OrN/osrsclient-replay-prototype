import java.util.Random;

// $FF: renamed from: kc
public abstract class class_68 extends class_65 {

   // $FF: renamed from: j int[]
   int[] field_511;
   // $FF: renamed from: v byte[][]
   byte[][] field_512;
   // $FF: renamed from: f int[]
   int[] field_513;
   // $FF: renamed from: l int
   static int field_514;
   // $FF: renamed from: p int[]
   int[] field_515;
   // $FF: renamed from: o int
   static int field_516;
   // $FF: renamed from: a int
   static int field_517;
   // $FF: renamed from: b int
   public int field_518;
   // $FF: renamed from: d int
   public int field_519;
   // $FF: renamed from: n int[]
   int[] field_520;
   // $FF: renamed from: u byte[]
   byte[] field_521;
   // $FF: renamed from: r int
   public int field_522;
   // $FF: renamed from: x int
   static int field_523;
   // $FF: renamed from: y int[]
   int[] field_524;
   // $FF: renamed from: e int
   static int field_525;
   // $FF: renamed from: g int
   static int field_526;
   // $FF: renamed from: s op[]
   public static class_66[] field_527;
   // $FF: renamed from: k int
   static int field_528;
   // $FF: renamed from: m int
   static int field_529;
   // $FF: renamed from: c int
   static int field_530;
   // $FF: renamed from: z java.util.Random
   static Random field_531;
   // $FF: renamed from: w java.lang.String[]
   static String[] field_532;


   // $FF: renamed from: n (byte[], int, int, int, int, int, int) void
   abstract void method_859(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   // $FF: renamed from: <init> (byte[]) void
   class_68(byte[] var1) {
      this.field_512 = new byte[256][];
      this.field_522 = 0;
      this.method_915(var1);
   }

   // $FF: renamed from: ab (java.lang.String, int, int) void
   void method_861(String var1, int var2, int var3) {
      var3 -= this.field_522;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if(var1.charAt(var6) != 0) {
            char var7 = (char)(ServerOpcode.method_4995(var1.charAt(var6), (byte)72) & 255);
            if(var7 == 60) {
               var4 = var6;
            } else {
               int var9;
               if(var7 == 62 && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if(var8.equals("lt")) {
                     var7 = 60;
                  } else {
                     if(!var8.equals("gt")) {
                        if(var8.startsWith("img=")) {
                           try {
                              var9 = class_168.method_3609(var8.substring(4));
                              class_66 var13 = field_527[var9];
                              var13.draw(var2, var3 + this.field_522 - var13.field_494);
                              var2 += var13.field_497;
                              var5 = -1;
                           } catch (Exception var11) {
                              ;
                           }
                        } else {
                           this.method_879(var8);
                        }
                        continue;
                     }

                     var7 = 62;
                  }
               }

               if(var7 == 160) {
                  var7 = 32;
               }

               if(var4 == -1) {
                  if(this.field_521 != null && var5 != -1) {
                     var2 += this.field_521[(var5 << 8) + var7];
                  }

                  int var12 = this.field_513[var7];
                  var9 = this.field_524[var7];
                  if(var7 != 32) {
                     if(field_528 == 256) {
                        if(field_525 != -1) {
                           method_960(this.field_512[var7], var2 + this.field_515[var7] + 1, var3 + this.field_511[var7] + 1, var12, var9, field_525);
                        }

                        this.method_889(this.field_512[var7], var2 + this.field_515[var7], var3 + this.field_511[var7], var12, var9, field_517);
                     } else {
                        if(field_525 != -1) {
                           method_887(this.field_512[var7], var2 + this.field_515[var7] + 1, var3 + this.field_511[var7] + 1, var12, var9, field_525, field_528);
                        }

                        this.method_859(this.field_512[var7], var2 + this.field_515[var7], var3 + this.field_511[var7], var12, var9, field_517, field_528);
                     }
                  } else if(field_529 > 0) {
                     field_523 += field_529;
                     var2 += field_523 >> 8;
                     field_523 &= 255;
                  }

                  int var10 = this.field_520[var7];
                  if(field_514 != -1) {
                     method_726(var2, var3 + (int)((double)this.field_522 * 0.7D), var10, field_514);
                  }

                  if(field_516 != -1) {
                     method_726(var2, var3 + this.field_522 + 1, var10, field_516);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   // $FF: renamed from: s (byte[][], byte[][], int[], int[], int[], int, int) int
   static int method_862(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if(var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if(var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if(var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if(var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   // $FF: renamed from: u (char) int
   int method_863(char var1) {
      if(var1 == 160) {
         var1 = 32;
      }

      return this.field_520[ServerOpcode.method_4995(var1, (byte)72) & 255];
   }

   // $FF: renamed from: bq (java.lang.String, int, int, int, int) void
   public void method_864(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method_878(var4, var5);
         this.method_861(var1, var2, var3);
      }
   }

   // $FF: renamed from: o (java.lang.String, int[], java.lang.String[]) int
   public int method_865(String var1, int[] var2, String[] var3) {
      if(var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if(var15 == 60) {
               var10 = var14;
            } else {
               if(var15 == 62 && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if(var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if(var16.equals("lt")) {
                     var4 += this.method_863('<');
                     if(this.field_521 != null && var11 != -1) {
                        var4 += this.field_521[(var11 << 8) + 60];
                     }

                     var11 = 60;
                  } else if(var16.equals("gt")) {
                     var4 += this.method_863('>');
                     if(this.field_521 != null && var11 != -1) {
                        var4 += this.field_521[(var11 << 8) + 62];
                     }

                     var11 = 62;
                  } else if(var16.startsWith("img=")) {
                     try {
                        int var17 = class_168.method_3609(var16.substring(4));
                        var4 += field_527[var17].field_497;
                        var11 = 0;
                     } catch (Exception var18) {
                        ;
                     }
                  }

                  var15 = 0;
               }

               if(var10 == -1) {
                  if(var15 != 0) {
                     var6.append(var15);
                     var4 += this.method_863(var15);
                     if(this.field_521 != null && var11 != -1) {
                        var4 += this.field_521[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if(var15 == 32) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if(var2 != null && var4 > var2[var12 < var2.length?var12:var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if(var15 == 45) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var19 = var6.toString();
         if(var19.length() > var5) {
            var3[var12++] = var19.substring(var5, var19.length());
         }

         return var12;
      }
   }

   // $FF: renamed from: c (java.lang.String, int) int
   public int method_866(String var1, int var2) {
      int var3 = this.method_865(var1, new int[]{var2}, field_532);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.method_885(field_532[var5]);
         if(var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   // $FF: renamed from: e (java.lang.String, int) int
   public int method_867(String var1, int var2) {
      return this.method_865(var1, new int[]{var2}, field_532);
   }

   // $FF: renamed from: g (java.lang.String) java.lang.String
   public static String method_868(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if(var4 == 60 || var4 == 62) {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for(int var7 = 0; var7 < var1; ++var7) {
         char var5 = var0.charAt(var7);
         if(var5 == 60) {
            var6.append("<lt>");
         } else if(var5 == 62) {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   // $FF: renamed from: a (java.lang.String, int, int, int, int) void
   public void method_869(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method_878(var4, var5);
         this.method_861(var1, var2, var3);
      }
   }

   // $FF: renamed from: k (java.lang.String, int, int, int, int, int) void
   public void method_870(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method_878(var4, var5);
         field_528 = var6;
         this.method_861(var1, var2, var3);
      }
   }

   // $FF: renamed from: aj (byte[]) void
   void method_871(byte[] var1) {
      this.field_520 = new int[1487080880];
      int var2;
      if(var1.length == 257) {
         for(var2 = 0; var2 < this.field_520.length; ++var2) {
            this.field_520[var2] = var1[var2] & 255;
         }

         this.field_522 = var1[892811538] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.field_520[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[1817148298];

         int var5;
         for(var5 = 0; var5 < 641229788; ++var5) {
            var10[var5] = var1[var2++] & 1351248368;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & -88846098;
         }

         byte[][] var11 = new byte[256][];

         int var8;
         for(int var6 = 0; var6 < 425682594; ++var6) {
            var11[var6] = new byte[var10[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = var7;
            }
         }

         byte[][] var12 = new byte[-2032113998][];

         int var13;
         for(var13 = 0; var13 < -1754600846; ++var13) {
            var12[var13] = new byte[var10[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var12[var13].length; ++var9) {
               var14 += var1[var2++];
               var12[var13][var9] = var14;
            }
         }

         this.field_521 = new byte[-1548843832];

         for(var13 = 0; var13 < 256; ++var13) {
            if(var13 != 32 && var13 != 160) {
               for(var8 = 0; var8 < -1208667255; ++var8) {
                  if(var8 != 549538921 && var8 != -1846287223) {
                     this.field_521[(var13 << 8) + var8] = (byte)method_862(var11, var12, var4, this.field_520, var10, var13, var8);
                  }
               }
            }
         }

         this.field_522 = var4[32] + var10[32];
      }

   }

   // $FF: renamed from: x (java.lang.String, int, int, int, int) void
   public void method_872(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method_878(var4, var5);
         this.method_861(var1, var2 - this.method_885(var1) / 2, var3);
      }
   }

   // $FF: renamed from: bo (java.lang.String, int, int, int, int, int) void
   public void method_873(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method_878(var4, var5);
         int[] var7 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method_900(var1, var2 - this.method_885(var1) / 2, var3, (int[])null, var7);
      }
   }

   // $FF: renamed from: cy (int[], byte[], int, int, int, int, int, int, int) void
   static void method_874(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: ac (char) int
   int method_875(char var1) {
      if(var1 == 160) {
         var1 = 32;
      }

      return this.field_520[ServerOpcode.method_4995(var1, (byte)23) & 255];
   }

   // $FF: renamed from: h (java.lang.String, int, int, int, int, int, int) void
   public void method_876(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 != null) {
         this.method_878(var4, var5);
         double var8 = 7.0D - (double)var7 / 8.0D;
         if(var8 < 0.0D) {
            var8 = 0.0D;
         }

         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
         }

         this.method_900(var1, var2 - this.method_885(var1) / 2, var3, (int[])null, var10);
      }
   }

   // $FF: renamed from: q (java.lang.String, int, int, int, int, int) void
   public void method_877(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method_878(var4, var5);
         field_531.setSeed((long)var6);
         field_528 = 192 + (field_531.nextInt() & 31);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if((field_531.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.method_900(var1, var2, var3, var7, (int[])null);
      }
   }

   // $FF: renamed from: i (int, int) void
   void method_878(int var1, int var2) {
      field_514 = -1;
      field_516 = -1;
      field_530 = var2;
      field_525 = var2;
      field_526 = var1;
      field_517 = var1;
      field_528 = 256;
      field_529 = 0;
      field_523 = 0;
   }

   // $FF: renamed from: ae (java.lang.String) void
   void method_879(String var1) {
      try {
         int var2;
         String var3;
         if(var1.startsWith("col=")) {
            var3 = var1.substring(4);
            var2 = class_176.method_3747(var3, 16, true, (byte)71);
            field_517 = var2;
         } else if(var1.equals("/col")) {
            field_517 = field_526;
         } else if(var1.startsWith("str=")) {
            var3 = var1.substring(4);
            var2 = class_176.method_3747(var3, 16, true, (byte)-111);
            field_514 = var2;
         } else if(var1.equals("str")) {
            field_514 = 8388608;
         } else if(var1.equals("/str")) {
            field_514 = -1;
         } else if(var1.startsWith("u=")) {
            var3 = var1.substring(2);
            var2 = class_176.method_3747(var3, 16, true, (byte)28);
            field_516 = var2;
         } else if(var1.equals("u")) {
            field_516 = 0;
         } else if(var1.equals("/u")) {
            field_516 = -1;
         } else if(var1.startsWith("shad=")) {
            var3 = var1.substring(5);
            var2 = class_176.method_3747(var3, 16, true, (byte)-76);
            field_525 = var2;
         } else if(var1.equals("shad")) {
            field_525 = 0;
         } else if(var1.equals("/shad")) {
            field_525 = field_530;
         } else if(var1.equals("br")) {
            this.method_878(field_526, field_530);
         }
      } catch (Exception var4) {
         ;
      }

   }

   // $FF: renamed from: cd (java.lang.String, int, int, int, int, int) void
   public void method_880(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method_878(var4, var5);
         field_531.setSeed((long)var6);
         field_528 = 192 + (field_531.nextInt() & -1995134872);
         int[] var7 = new int[var1.length()];
         int var8 = 0;

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = var8;
            if((field_531.nextInt() & 3) == 0) {
               ++var8;
            }
         }

         this.method_900(var1, var2, var3, var7, (int[])null);
      }
   }

   // $FF: renamed from: <init> (byte[], int[], int[], int[], int[], int[], byte[][]) void
   class_68(byte[] var1, int[] var2, int[] var3, int[] var4, int[] var5, byte[][] var7) {
      super();
      this.field_512 = new byte[256][];
      this.field_522 = 0;
      this.field_515 = var2;
      this.field_511 = var3;
      this.field_513 = var4;
      this.field_524 = var5;
      this.method_915(var1);
      this.field_512 = var7;
      int var8 = Integer.MAX_VALUE;
      int var9 = Integer.MIN_VALUE;

      for(int var10 = 0; var10 < 256; ++var10) {
         if(this.field_511[var10] < var8 && this.field_524[var10] != 0) {
            var8 = this.field_511[var10];
         }

         if(this.field_511[var10] + this.field_524[var10] > var9) {
            var9 = this.field_511[var10] + this.field_524[var10];
         }
      }

      this.field_518 = this.field_522 - var8;
      this.field_519 = var9 - this.field_522;
   }

   // $FF: renamed from: cq (java.lang.String, int) void
   void method_882(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if(var6 == -1169985325) {
            var4 = true;
         } else if(var6 == -1724628294) {
            var4 = false;
         } else if(!var4 && var6 == -852655188) {
            ++var3;
         }
      }

      if(var3 > 0) {
         field_529 = (var2 - this.method_885(var1) << 8) / var3;
      }

   }

   // $FF: renamed from: av (byte[][], byte[][], int[], int[], int[], int, int) int
   static int method_883(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if(var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if(var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if(var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if(var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   // $FF: renamed from: z (java.lang.String, int, int, int, int, int, int, int, int, int) int
   public int drawString(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(var1 == null) {
         return 0;
      } else {
         this.method_878(var6, var7);
         if(var10 == 0) {
            var10 = this.field_522;
         }

         int[] var11 = new int[]{var4};
         if(var5 < this.field_518 + this.field_519 + var10 && var5 < var10 + var10) {
            var11 = null;
         }

         int var12 = this.method_865(var1, var11, field_532);
         if(var9 == 3 && var12 == 1) {
            var9 = 1;
         }

         int var13;
         int var14;
         if(var9 == 0) {
            var13 = var3 + this.field_518;
         } else if(var9 == 1) {
            var13 = var3 + this.field_518 + (var5 - this.field_518 - this.field_519 - (var12 - 1) * var10) / 2;
         } else if(var9 == 2) {
            var13 = var3 + var5 - this.field_519 - (var12 - 1) * var10;
         } else {
            var14 = (var5 - this.field_518 - this.field_519 - (var12 - 1) * var10) / (var12 + 1);
            if(var14 < 0) {
               var14 = 0;
            }

            var13 = var3 + this.field_518 + var14;
            var10 += var14;
         }

         for(var14 = 0; var14 < var12; ++var14) {
            if(var8 == 0) {
               this.method_861(field_532[var14], var2, var13);
            } else if(var8 == 1) {
               this.method_861(field_532[var14], var2 + (var4 - this.method_885(field_532[var14])) / 2, var13);
            } else if(var8 == 2) {
               this.method_861(field_532[var14], var2 + var4 - this.method_885(field_532[var14]), var13);
            } else if(var14 == var12 - 1) {
               this.method_861(field_532[var14], var2, var13);
            } else {
               this.method_943(field_532[var14], var4);
               this.method_861(field_532[var14], var2, var13);
               field_529 = 0;
            }

            var13 += var10;
         }

         return var12;
      }
   }

   // $FF: renamed from: l (java.lang.String) int
   public int method_885(String var1) {
      if(var1 == null) {
         return 0;
      } else {
         int var2 = -1;
         int var3 = -1;
         int var4 = 0;

         for(int var5 = 0; var5 < var1.length(); ++var5) {
            char var6 = var1.charAt(var5);
            if(var6 == 60) {
               var2 = var5;
            } else {
               if(var6 == 62 && var2 != -1) {
                  String var7 = var1.substring(var2 + 1, var5);
                  var2 = -1;
                  if(var7.equals("lt")) {
                     var6 = 60;
                  } else {
                     if(!var7.equals("gt")) {
                        if(var7.startsWith("img=")) {
                           try {
                              int var8 = class_168.method_3609(var7.substring(4));
                              var4 += field_527[var8].field_497;
                              var3 = -1;
                           } catch (Exception var9) {
                              ;
                           }
                        }
                        continue;
                     }

                     var6 = 62;
                  }
               }

               if(var6 == 160) {
                  var6 = 32;
               }

               if(var2 == -1) {
                  var4 += this.field_520[(char)(ServerOpcode.method_4995(var6, (byte)53) & 255)];
                  if(this.field_521 != null && var3 != -1) {
                     var4 += this.field_521[(var3 << 8) + var6];
                  }

                  var3 = var6;
               }
            }
         }

         return var4;
      }
   }

   // $FF: renamed from: ai (int[], byte[], int, int, int, int, int, int, int) void
   static void method_886(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: ar (byte[], int, int, int, int, int, int) void
   static void method_887(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * field_484;
      int var8 = field_484 - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if(var2 < field_487) {
         var11 = field_487 - var2;
         var4 -= var11;
         var2 = field_487;
         var10 += var11 * var3;
         var7 += var11 * field_484;
      }

      if(var2 + var4 > field_485) {
         var4 -= var2 + var4 - field_485;
      }

      if(var1 < field_489) {
         var11 = field_489 - var1;
         var3 -= var11;
         var1 = field_489;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if(var1 + var3 > field_488) {
         var11 = var1 + var3 - field_488;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if(var3 > 0 && var4 > 0) {
         method_888(field_490, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   // $FF: renamed from: ag (int[], byte[], int, int, int, int, int, int, int, int) void
   static void method_888(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & '\uff00') * var9 & 16711680) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: <clinit> () void
   static {
      field_514 = -1;
      field_516 = -1;
      field_530 = -1;
      field_525 = -1;
      field_526 = 0;
      field_517 = 0;
      field_528 = 256;
      field_529 = 0;
      field_523 = 0;
      field_531 = new Random();
      field_532 = new String[100];
   }

   // $FF: renamed from: v (byte[], int, int, int, int, int) void
   abstract void method_889(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   // $FF: renamed from: y (byte[], int, int, int, int, int) void
   abstract void method_890(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   // $FF: renamed from: p (byte[], int, int, int, int, int) void
   abstract void method_891(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   // $FF: renamed from: ax (byte[]) void
   void method_892(byte[] var1) {
      this.field_520 = new int[256];
      int var2;
      if(var1.length == -1791453116) {
         for(var2 = 0; var2 < this.field_520.length; ++var2) {
            this.field_520[var2] = var1[var2] & 255;
         }

         this.field_522 = var1[256] & 1274473840;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < -1388280430; ++var3) {
            this.field_520[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[1457076105];

         int var5;
         for(var5 = 0; var5 < -1483268636; ++var5) {
            var10[var5] = var1[var2++] & -528361325;
         }

         for(var5 = 0; var5 < 191687187; ++var5) {
            var4[var5] = var1[var2++] & 2023248539;
         }

         byte[][] var11 = new byte[256][];

         int var8;
         for(int var6 = 0; var6 < 753012838; ++var6) {
            var11[var6] = new byte[var10[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = var7;
            }
         }

         byte[][] var12 = new byte[256][];

         int var13;
         for(var13 = 0; var13 < 877488148; ++var13) {
            var12[var13] = new byte[var10[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var12[var13].length; ++var9) {
               var14 += var1[var2++];
               var12[var13][var9] = var14;
            }
         }

         this.field_521 = new byte[65536];

         for(var13 = 0; var13 < 256; ++var13) {
            if(var13 != -1421994841 && var13 != 160) {
               for(var8 = 0; var8 < 1868646793; ++var8) {
                  if(var8 != 919822088 && var8 != 160) {
                     this.field_521[(var13 << 8) + var8] = (byte)method_862(var11, var12, var4, this.field_520, var10, var13, var8);
                  }
               }
            }
         }

         this.field_522 = var4[32] + var10[262259355];
      }

   }

   // $FF: renamed from: as (byte[]) void
   void method_893(byte[] var1) {
      this.field_520 = new int[256];
      int var2;
      if(var1.length == 257) {
         for(var2 = 0; var2 < this.field_520.length; ++var2) {
            this.field_520[var2] = var1[var2] & 255;
         }

         this.field_522 = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.field_520[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var11 = new byte[256][];

         int var8;
         for(int var6 = 0; var6 < 256; ++var6) {
            var11[var6] = new byte[var10[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = var7;
            }
         }

         byte[][] var12 = new byte[256][];

         int var13;
         for(var13 = 0; var13 < 256; ++var13) {
            var12[var13] = new byte[var10[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var12[var13].length; ++var9) {
               var14 += var1[var2++];
               var12[var13][var9] = var14;
            }
         }

         this.field_521 = new byte[65536];

         for(var13 = 0; var13 < 256; ++var13) {
            if(var13 != 32 && var13 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if(var8 != 32 && var8 != 160) {
                     this.field_521[(var13 << 8) + var8] = (byte)method_862(var11, var12, var4, this.field_520, var10, var13, var8);
                  }
               }
            }
         }

         this.field_522 = var4[32] + var10[32];
      }

   }

   // $FF: renamed from: cj (byte[], int, int, int, int, int) void
   static void method_894(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * field_484;
      int var7 = field_484 - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if(var2 < field_487) {
         var10 = field_487 - var2;
         var4 -= var10;
         var2 = field_487;
         var9 += var10 * var3;
         var6 += var10 * field_484;
      }

      if(var2 + var4 > field_485) {
         var4 -= var2 + var4 - field_485;
      }

      if(var1 < field_489) {
         var10 = field_489 - var1;
         var3 -= var10;
         var1 = field_489;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if(var1 + var3 > field_488) {
         var10 = var1 + var3 - field_488;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if(var3 > 0 && var4 > 0) {
         method_886(field_490, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   // $FF: renamed from: am (byte[][], byte[][], int[], int[], int[], int, int) int
   static int method_895(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if(var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if(var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if(var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if(var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   // $FF: renamed from: az (byte[][], byte[][], int[], int[], int[], int, int) int
   static int method_896(byte[][] var0, byte[][] var1, int[] var2, int[] var3, int[] var4, int var5, int var6) {
      int var7 = var2[var5];
      int var8 = var7 + var4[var5];
      int var9 = var2[var6];
      int var10 = var9 + var4[var6];
      int var11 = var7;
      if(var9 > var7) {
         var11 = var9;
      }

      int var12 = var8;
      if(var10 < var8) {
         var12 = var10;
      }

      int var13 = var3[var5];
      if(var3[var6] < var13) {
         var13 = var3[var6];
      }

      byte[] var14 = var1[var5];
      byte[] var15 = var0[var6];
      int var16 = var11 - var7;
      int var17 = var11 - var9;

      for(int var18 = var11; var18 < var12; ++var18) {
         int var19 = var14[var16++] + var15[var17++];
         if(var19 < var13) {
            var13 = var19;
         }
      }

      return -var13;
   }

   // $FF: renamed from: an (java.lang.String) java.lang.String
   public static String method_897(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if(var4 == 60 || var4 == 62) {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for(int var7 = 0; var7 < var1; ++var7) {
         char var5 = var0.charAt(var7);
         if(var5 == 60) {
            var6.append("<lt>");
         } else if(var5 == 62) {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   // $FF: renamed from: w (java.lang.String, int, int, int, int, int) void
   public void method_898(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method_878(var4, var5);
         int[] var7 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method_900(var1, var2 - this.method_885(var1) / 2, var3, (int[])null, var7);
      }
   }

   // $FF: renamed from: at (char) int
   int method_899(char var1) {
      if(var1 == 160) {
         var1 = 32;
      }

      return this.field_520[ServerOpcode.method_4995(var1, (byte)66) & 255];
   }

   // $FF: renamed from: al (java.lang.String, int, int, int[], int[]) void
   void method_900(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.field_522;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if(var1.charAt(var9) != 0) {
            char var10 = (char)(ServerOpcode.method_4995(var1.charAt(var9), (byte)103) & 255);
            if(var10 == 60) {
               var6 = var9;
            } else {
               int var12;
               int var13;
               int var14;
               if(var10 == 62 && var6 != -1) {
                  String var11 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if(var11.equals("lt")) {
                     var10 = 60;
                  } else {
                     if(!var11.equals("gt")) {
                        if(var11.startsWith("img=")) {
                           try {
                              if(var4 != null) {
                                 var12 = var4[var8];
                              } else {
                                 var12 = 0;
                              }

                              if(var5 != null) {
                                 var13 = var5[var8];
                              } else {
                                 var13 = 0;
                              }

                              ++var8;
                              var14 = class_168.method_3609(var11.substring(4));
                              class_66 var18 = field_527[var14];
                              var18.draw(var2 + var12, var3 + this.field_522 - var18.field_494 + var13);
                              var2 += var18.field_497;
                              var7 = -1;
                           } catch (Exception var16) {
                              ;
                           }
                        } else {
                           this.method_879(var11);
                        }
                        continue;
                     }

                     var10 = 62;
                  }
               }

               if(var10 == 160) {
                  var10 = 32;
               }

               if(var6 == -1) {
                  if(this.field_521 != null && var7 != -1) {
                     var2 += this.field_521[(var7 << 8) + var10];
                  }

                  int var17 = this.field_513[var10];
                  var12 = this.field_524[var10];
                  if(var4 != null) {
                     var13 = var4[var8];
                  } else {
                     var13 = 0;
                  }

                  if(var5 != null) {
                     var14 = var5[var8];
                  } else {
                     var14 = 0;
                  }

                  ++var8;
                  if(var10 != 32) {
                     if(field_528 == 256) {
                        if(field_525 != -1) {
                           method_960(this.field_512[var10], var2 + this.field_515[var10] + 1 + var13, var3 + this.field_511[var10] + 1 + var14, var17, var12, field_525);
                        }

                        this.method_889(this.field_512[var10], var2 + this.field_515[var10] + var13, var3 + this.field_511[var10] + var14, var17, var12, field_517);
                     } else {
                        if(field_525 != -1) {
                           method_887(this.field_512[var10], var2 + this.field_515[var10] + 1 + var13, var3 + this.field_511[var10] + 1 + var14, var17, var12, field_525, field_528);
                        }

                        this.method_859(this.field_512[var10], var2 + this.field_515[var10] + var13, var3 + this.field_511[var10] + var14, var17, var12, field_517, field_528);
                     }
                  } else if(field_529 > 0) {
                     field_523 += field_529;
                     var2 += field_523 >> 8;
                     field_523 &= 255;
                  }

                  int var15 = this.field_520[var10];
                  if(field_514 != -1) {
                     method_726(var2, var3 + (int)((double)this.field_522 * 0.7D), var15, field_514);
                  }

                  if(field_516 != -1) {
                     method_726(var2, var3 + this.field_522, var15, field_516);
                  }

                  var2 += var15;
                  var7 = var10;
               }
            }
         }
      }

   }

   // $FF: renamed from: ao (char) int
   int method_901(char var1) {
      if(var1 == 160) {
         var1 = 32;
      }

      return this.field_520[ServerOpcode.method_4995(var1, (byte)20) & -302010459];
   }

   // $FF: renamed from: aq (java.lang.String, int[], java.lang.String[]) int
   public int method_902(String var1, int[] var2, String[] var3) {
      if(var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(100);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         char var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if(var15 == 60) {
               var10 = var14;
            } else {
               if(var15 == 62 && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append('>');
                  if(var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if(var16.equals("lt")) {
                     var4 += this.method_863('<');
                     if(this.field_521 != null && var11 != -1) {
                        var4 += this.field_521[(var11 << 8) + 60];
                     }

                     var11 = 60;
                  } else if(var16.equals("gt")) {
                     var4 += this.method_863('>');
                     if(this.field_521 != null && var11 != -1) {
                        var4 += this.field_521[(var11 << 8) + 62];
                     }

                     var11 = 62;
                  } else if(var16.startsWith("img=")) {
                     try {
                        int var17 = class_168.method_3609(var16.substring(4));
                        var4 += field_527[var17].field_497;
                        var11 = 0;
                     } catch (Exception var18) {
                        ;
                     }
                  }

                  var15 = 0;
               }

               if(var10 == -1) {
                  if(var15 != 0) {
                     var6.append(var15);
                     var4 += this.method_863(var15);
                     if(this.field_521 != null && var11 != -1) {
                        var4 += this.field_521[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if(var15 == 32) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if(var2 != null && var4 > var2[var12 < var2.length?var12:var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if(var15 == 45) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var19 = var6.toString();
         if(var19.length() > var5) {
            var3[var12++] = var19.substring(var5, var19.length());
         }

         return var12;
      }
   }

   // $FF: renamed from: cg (java.lang.String, int, int, int[], int[]) void
   void method_903(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.field_522;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if(var1.charAt(var9) != 0) {
            char var10 = (char)(ServerOpcode.method_4995(var1.charAt(var9), (byte)74) & 255);
            if(var10 == 60) {
               var6 = var9;
            } else {
               int var12;
               int var13;
               int var14;
               if(var10 == 62 && var6 != -1) {
                  String var11 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if(var11.equals("lt")) {
                     var10 = 60;
                  } else {
                     if(!var11.equals("gt")) {
                        if(var11.startsWith("img=")) {
                           try {
                              if(var4 != null) {
                                 var12 = var4[var8];
                              } else {
                                 var12 = 0;
                              }

                              if(var5 != null) {
                                 var13 = var5[var8];
                              } else {
                                 var13 = 0;
                              }

                              ++var8;
                              var14 = class_168.method_3609(var11.substring(4));
                              class_66 var18 = field_527[var14];
                              var18.draw(var2 + var12, var3 + this.field_522 - var18.field_494 + var13);
                              var2 += var18.field_497;
                              var7 = -1;
                           } catch (Exception var16) {
                              ;
                           }
                        } else {
                           this.method_879(var11);
                        }
                        continue;
                     }

                     var10 = 62;
                  }
               }

               if(var10 == 160) {
                  var10 = 32;
               }

               if(var6 == -1) {
                  if(this.field_521 != null && var7 != -1) {
                     var2 += this.field_521[(var7 << 8) + var10];
                  }

                  int var17 = this.field_513[var10];
                  var12 = this.field_524[var10];
                  if(var4 != null) {
                     var13 = var4[var8];
                  } else {
                     var13 = 0;
                  }

                  if(var5 != null) {
                     var14 = var5[var8];
                  } else {
                     var14 = 0;
                  }

                  ++var8;
                  if(var10 != 32) {
                     if(field_528 == 256) {
                        if(field_525 != -1) {
                           method_960(this.field_512[var10], var2 + this.field_515[var10] + 1 + var13, var3 + this.field_511[var10] + 1 + var14, var17, var12, field_525);
                        }

                        this.method_889(this.field_512[var10], var2 + this.field_515[var10] + var13, var3 + this.field_511[var10] + var14, var17, var12, field_517);
                     } else {
                        if(field_525 != -1) {
                           method_887(this.field_512[var10], var2 + this.field_515[var10] + 1 + var13, var3 + this.field_511[var10] + 1 + var14, var17, var12, field_525, field_528);
                        }

                        this.method_859(this.field_512[var10], var2 + this.field_515[var10] + var13, var3 + this.field_511[var10] + var14, var17, var12, field_517, field_528);
                     }
                  } else if(field_529 > 0) {
                     field_523 += field_529;
                     var2 += field_523 >> 8;
                     field_523 &= 255;
                  }

                  int var15 = this.field_520[var10];
                  if(field_514 != -1) {
                     method_726(var2, var3 + (int)((double)this.field_522 * 0.7D), var15, field_514);
                  }

                  if(field_516 != -1) {
                     method_726(var2, var3 + this.field_522, var15, field_516);
                  }

                  var2 += var15;
                  var7 = var10;
               }
            }
         }
      }

   }

   // $FF: renamed from: af (java.lang.String, int[], java.lang.String[]) int
   public int method_904(String var1, int[] var2, String[] var3) {
      if(var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(-246875013);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         int var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if(var15 == 60) {
               var10 = var14;
            } else {
               if(var15 == -1293316326 && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append((char)611099944);
                  if(var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if(var16.equals("lt")) {
                     var4 += this.method_863((char)117935131);
                     if(this.field_521 != null && var11 != -1) {
                        var4 += this.field_521[(var11 << 8) + -1337246083];
                     }

                     var11 = -1092854438;
                  } else if(var16.equals("gt")) {
                     var4 += this.method_863('>');
                     if(this.field_521 != null && var11 != -1) {
                        var4 += this.field_521[(var11 << 8) + 62];
                     }

                     var11 = 62;
                  } else if(var16.startsWith("img=")) {
                     try {
                        int var17 = class_168.method_3609(var16.substring(4));
                        var4 += field_527[var17].field_497;
                        var11 = 0;
                     } catch (Exception var18) {
                        ;
                     }
                  }

                  var15 = 0;
               }

               if(var10 == -1) {
                  if(var15 != 0) {
                     var6.append(var15);
                     var4 += this.method_863(var15);
                     if(this.field_521 != null && var11 != -1) {
                        var4 += this.field_521[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if(var15 == 994699904) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if(var2 != null && var4 > var2[var12 < var2.length?var12:var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if(var15 == -1833946753) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var19 = var6.toString();
         if(var19.length() > var5) {
            var3[var12++] = var19.substring(var5, var19.length());
         }

         return var12;
      }
   }

   // $FF: renamed from: ak (java.lang.String, int) int
   public int method_905(String var1, int var2) {
      int var3 = this.method_865(var1, new int[]{var2}, field_532);
      int var4 = 0;

      for(int var5 = 0; var5 < var3; ++var5) {
         int var6 = this.method_885(field_532[var5]);
         if(var6 > var4) {
            var4 = var6;
         }
      }

      return var4;
   }

   // $FF: renamed from: ay (java.lang.String, int) int
   public int method_906(String var1, int var2) {
      return this.method_865(var1, new int[]{var2}, field_532);
   }

   // $FF: renamed from: cc (byte[], int, int, int, int, int) void
   static void method_907(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * field_484;
      int var7 = field_484 - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if(var2 < field_487) {
         var10 = field_487 - var2;
         var4 -= var10;
         var2 = field_487;
         var9 += var10 * var3;
         var6 += var10 * field_484;
      }

      if(var2 + var4 > field_485) {
         var4 -= var2 + var4 - field_485;
      }

      if(var1 < field_489) {
         var10 = field_489 - var1;
         var3 -= var10;
         var1 = field_489;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if(var1 + var3 > field_488) {
         var10 = var1 + var3 - field_488;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if(var3 > 0 && var4 > 0) {
         method_886(field_490, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   // $FF: renamed from: au (java.lang.String, int) int
   public int method_908(String var1, int var2) {
      return this.method_865(var1, new int[]{var2}, field_532);
   }

   // $FF: renamed from: bj (java.lang.String, int, int, int, int) void
   public void method_909(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method_878(var4, var5);
         this.method_861(var1, var2 - this.method_885(var1) / 2, var3);
      }
   }

   // $FF: renamed from: bd (java.lang.String) java.lang.String
   public static String method_910(String var0) {
      int var1 = var0.length();
      int var2 = 0;

      for(int var3 = 0; var3 < var1; ++var3) {
         char var4 = var0.charAt(var3);
         if(var4 == 60 || var4 == 62) {
            var2 += 3;
         }
      }

      StringBuilder var6 = new StringBuilder(var1 + var2);

      for(int var7 = 0; var7 < var1; ++var7) {
         char var5 = var0.charAt(var7);
         if(var5 == 60) {
            var6.append("<lt>");
         } else if(var5 == 62) {
            var6.append("<gt>");
         } else {
            var6.append(var5);
         }
      }

      return var6.toString();
   }

   // $FF: renamed from: bt (java.lang.String, int, int, int, int) void
   public void method_911(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method_878(var4, var5);
         this.method_861(var1, var2, var3);
      }
   }

   // $FF: renamed from: co (java.lang.String, int, int, int[], int[]) void
   void method_912(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.field_522;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if(var1.charAt(var9) != 0) {
            int var10 = (char)(ServerOpcode.method_4995(var1.charAt(var9), (byte)82) & 255);
            if(var10 == 60) {
               var6 = var9;
            } else {
               int var12;
               int var13;
               int var14;
               if(var10 == 62 && var6 != -1) {
                  String var11 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if(var11.equals("lt")) {
                     var10 = -746174052;
                  } else {
                     if(!var11.equals("gt")) {
                        if(var11.startsWith("img=")) {
                           try {
                              if(var4 != null) {
                                 var12 = var4[var8];
                              } else {
                                 var12 = 0;
                              }

                              if(var5 != null) {
                                 var13 = var5[var8];
                              } else {
                                 var13 = 0;
                              }

                              ++var8;
                              var14 = class_168.method_3609(var11.substring(4));
                              class_66 var18 = field_527[var14];
                              var18.draw(var2 + var12, var3 + this.field_522 - var18.field_494 + var13);
                              var2 += var18.field_497;
                              var7 = -1;
                           } catch (Exception var16) {
                              ;
                           }
                        } else {
                           this.method_879(var11);
                        }
                        continue;
                     }

                     var10 = 62;
                  }
               }

               if(var10 == -614810198) {
                  var10 = 32;
               }

               if(var6 == -1) {
                  if(this.field_521 != null && var7 != -1) {
                     var2 += this.field_521[(var7 << 8) + var10];
                  }

                  int var17 = this.field_513[var10];
                  var12 = this.field_524[var10];
                  if(var4 != null) {
                     var13 = var4[var8];
                  } else {
                     var13 = 0;
                  }

                  if(var5 != null) {
                     var14 = var5[var8];
                  } else {
                     var14 = 0;
                  }

                  ++var8;
                  if(var10 != -35605309) {
                     if(field_528 == 256) {
                        if(field_525 != -1) {
                           method_960(this.field_512[var10], var2 + this.field_515[var10] + 1 + var13, var3 + this.field_511[var10] + 1 + var14, var17, var12, field_525);
                        }

                        this.method_889(this.field_512[var10], var2 + this.field_515[var10] + var13, var3 + this.field_511[var10] + var14, var17, var12, field_517);
                     } else {
                        if(field_525 != -1) {
                           method_887(this.field_512[var10], var2 + this.field_515[var10] + 1 + var13, var3 + this.field_511[var10] + 1 + var14, var17, var12, field_525, field_528);
                        }

                        this.method_859(this.field_512[var10], var2 + this.field_515[var10] + var13, var3 + this.field_511[var10] + var14, var17, var12, field_517, field_528);
                     }
                  } else if(field_529 > 0) {
                     field_523 += field_529;
                     var2 += field_523 >> 8;
                     field_523 &= -1890008253;
                  }

                  int var15 = this.field_520[var10];
                  if(field_514 != -1) {
                     method_726(var2, var3 + (int)((double)this.field_522 * 0.7D), var15, field_514);
                  }

                  if(field_516 != -1) {
                     method_726(var2, var3 + this.field_522, var15, field_516);
                  }

                  var2 += var15;
                  var7 = var10;
               }
            }
         }
      }

   }

   // $FF: renamed from: bu (java.lang.String, int, int, int, int) void
   public void method_913(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method_878(var4, var5);
         this.method_861(var1, var2, var3);
      }
   }

   // $FF: renamed from: bl (java.lang.String, int, int, int, int, int) void
   public void method_914(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method_878(var4, var5);
         field_528 = var6;
         this.method_861(var1, var2, var3);
      }
   }

   // $FF: renamed from: d (byte[]) void
   void method_915(byte[] var1) {
      this.field_520 = new int[256];
      int var2;
      if(var1.length == 257) {
         for(var2 = 0; var2 < this.field_520.length; ++var2) {
            this.field_520[var2] = var1[var2] & 255;
         }

         this.field_522 = var1[256] & 255;
      } else {
         var2 = 0;

         for(int var3 = 0; var3 < 256; ++var3) {
            this.field_520[var3] = var1[var2++] & 255;
         }

         int[] var10 = new int[256];
         int[] var4 = new int[256];

         int var5;
         for(var5 = 0; var5 < 256; ++var5) {
            var10[var5] = var1[var2++] & 255;
         }

         for(var5 = 0; var5 < 256; ++var5) {
            var4[var5] = var1[var2++] & 255;
         }

         byte[][] var11 = new byte[256][];

         int var8;
         for(int var6 = 0; var6 < 256; ++var6) {
            var11[var6] = new byte[var10[var6]];
            byte var7 = 0;

            for(var8 = 0; var8 < var11[var6].length; ++var8) {
               var7 += var1[var2++];
               var11[var6][var8] = var7;
            }
         }

         byte[][] var12 = new byte[256][];

         int var13;
         for(var13 = 0; var13 < 256; ++var13) {
            var12[var13] = new byte[var10[var13]];
            byte var14 = 0;

            for(int var9 = 0; var9 < var12[var13].length; ++var9) {
               var14 += var1[var2++];
               var12[var13][var9] = var14;
            }
         }

         this.field_521 = new byte[65536];

         for(var13 = 0; var13 < 256; ++var13) {
            if(var13 != 32 && var13 != 160) {
               for(var8 = 0; var8 < 256; ++var8) {
                  if(var8 != 32 && var8 != 160) {
                     this.field_521[(var13 << 8) + var8] = (byte)method_862(var11, var12, var4, this.field_520, var10, var13, var8);
                  }
               }
            }
         }

         this.field_522 = var4[32] + var10[32];
      }

   }

   // $FF: renamed from: bm (java.lang.String, int, int, int, int, int) void
   public void method_916(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method_878(var4, var5);
         field_528 = var6;
         this.method_861(var1, var2, var3);
      }
   }

   // $FF: renamed from: aa (java.lang.String, int) int
   public int method_917(String var1, int var2) {
      return this.method_865(var1, new int[]{var2}, field_532);
   }

   // $FF: renamed from: bh (java.lang.String, int, int, int, int) void
   public void method_918(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method_878(var4, var5);
         this.method_861(var1, var2 - this.method_885(var1), var3);
      }
   }

   // $FF: renamed from: bs (java.lang.String, int, int, int, int) void
   public void method_919(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method_878(var4, var5);
         this.method_861(var1, var2 - this.method_885(var1), var3);
      }
   }

   // $FF: renamed from: bz (java.lang.String, int, int, int, int, int) void
   public void method_920(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method_878(var4, var5);
         field_528 = var6;
         this.method_861(var1, var2, var3);
      }
   }

   // $FF: renamed from: bf (java.lang.String, int, int, int, int) void
   public void method_921(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method_878(var4, var5);
         this.method_861(var1, var2 - this.method_885(var1) / 2, var3);
      }
   }

   // $FF: renamed from: ba (java.lang.String, int, int, int, int) void
   public void method_922(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method_878(var4, var5);
         this.method_861(var1, var2 - this.method_885(var1) / 2, var3);
      }
   }

   // $FF: renamed from: be (java.lang.String, int, int, int, int) void
   public void method_923(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method_878(var4, var5);
         this.method_861(var1, var2 - this.method_885(var1) / 2, var3);
      }
   }

   // $FF: renamed from: bb (java.lang.String, int, int, int, int, int) void
   public void method_924(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method_878(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method_900(var1, var2 - this.method_885(var1) / 2, var3, var7, var8);
      }
   }

   // $FF: renamed from: bx (java.lang.String, int, int, int, int, int, int, int, int, int) int
   public int method_925(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(var1 == null) {
         return 0;
      } else {
         this.method_878(var6, var7);
         if(var10 == 0) {
            var10 = this.field_522;
         }

         int[] var11 = new int[]{var4};
         if(var5 < this.field_518 + this.field_519 + var10 && var5 < var10 + var10) {
            var11 = null;
         }

         int var12 = this.method_865(var1, var11, field_532);
         if(var9 == 3 && var12 == 1) {
            var9 = 1;
         }

         int var13;
         int var14;
         if(var9 == 0) {
            var13 = var3 + this.field_518;
         } else if(var9 == 1) {
            var13 = var3 + this.field_518 + (var5 - this.field_518 - this.field_519 - (var12 - 1) * var10) / 2;
         } else if(var9 == 2) {
            var13 = var3 + var5 - this.field_519 - (var12 - 1) * var10;
         } else {
            var14 = (var5 - this.field_518 - this.field_519 - (var12 - 1) * var10) / (var12 + 1);
            if(var14 < 0) {
               var14 = 0;
            }

            var13 = var3 + this.field_518 + var14;
            var10 += var14;
         }

         for(var14 = 0; var14 < var12; ++var14) {
            if(var8 == 0) {
               this.method_861(field_532[var14], var2, var13);
            } else if(var8 == 1) {
               this.method_861(field_532[var14], var2 + (var4 - this.method_885(field_532[var14])) / 2, var13);
            } else if(var8 == 2) {
               this.method_861(field_532[var14], var2 + var4 - this.method_885(field_532[var14]), var13);
            } else if(var14 == var12 - 1) {
               this.method_861(field_532[var14], var2, var13);
            } else {
               this.method_943(field_532[var14], var4);
               this.method_861(field_532[var14], var2, var13);
               field_529 = 0;
            }

            var13 += var10;
         }

         return var12;
      }
   }

   // $FF: renamed from: bp (java.lang.String, int, int, int, int, int, int, int, int, int) int
   public int method_926(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(var1 == null) {
         return 0;
      } else {
         this.method_878(var6, var7);
         if(var10 == 0) {
            var10 = this.field_522;
         }

         int[] var11 = new int[]{var4};
         if(var5 < this.field_518 + this.field_519 + var10 && var5 < var10 + var10) {
            var11 = null;
         }

         int var12 = this.method_865(var1, var11, field_532);
         if(var9 == 3 && var12 == 1) {
            var9 = 1;
         }

         int var13;
         int var14;
         if(var9 == 0) {
            var13 = var3 + this.field_518;
         } else if(var9 == 1) {
            var13 = var3 + this.field_518 + (var5 - this.field_518 - this.field_519 - (var12 - 1) * var10) / 2;
         } else if(var9 == 2) {
            var13 = var3 + var5 - this.field_519 - (var12 - 1) * var10;
         } else {
            var14 = (var5 - this.field_518 - this.field_519 - (var12 - 1) * var10) / (var12 + 1);
            if(var14 < 0) {
               var14 = 0;
            }

            var13 = var3 + this.field_518 + var14;
            var10 += var14;
         }

         for(var14 = 0; var14 < var12; ++var14) {
            if(var8 == 0) {
               this.method_861(field_532[var14], var2, var13);
            } else if(var8 == 1) {
               this.method_861(field_532[var14], var2 + (var4 - this.method_885(field_532[var14])) / 2, var13);
            } else if(var8 == 2) {
               this.method_861(field_532[var14], var2 + var4 - this.method_885(field_532[var14]), var13);
            } else if(var14 == var12 - 1) {
               this.method_861(field_532[var14], var2, var13);
            } else {
               this.method_943(field_532[var14], var4);
               this.method_861(field_532[var14], var2, var13);
               field_529 = 0;
            }

            var13 += var10;
         }

         return var12;
      }
   }

   // $FF: renamed from: bn (java.lang.String, int, int, int, int, int, int, int, int, int) int
   public int method_927(String var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      if(var1 == null) {
         return 0;
      } else {
         this.method_878(var6, var7);
         if(var10 == 0) {
            var10 = this.field_522;
         }

         int[] var11 = new int[]{var4};
         if(var5 < this.field_518 + this.field_519 + var10 && var5 < var10 + var10) {
            var11 = null;
         }

         int var12 = this.method_865(var1, var11, field_532);
         if(var9 == 3 && var12 == 1) {
            var9 = 1;
         }

         int var13;
         int var14;
         if(var9 == 0) {
            var13 = var3 + this.field_518;
         } else if(var9 == 1) {
            var13 = var3 + this.field_518 + (var5 - this.field_518 - this.field_519 - (var12 - 1) * var10) / 2;
         } else if(var9 == 2) {
            var13 = var3 + var5 - this.field_519 - (var12 - 1) * var10;
         } else {
            var14 = (var5 - this.field_518 - this.field_519 - (var12 - 1) * var10) / (var12 + 1);
            if(var14 < 0) {
               var14 = 0;
            }

            var13 = var3 + this.field_518 + var14;
            var10 += var14;
         }

         for(var14 = 0; var14 < var12; ++var14) {
            if(var8 == 0) {
               this.method_861(field_532[var14], var2, var13);
            } else if(var8 == 1) {
               this.method_861(field_532[var14], var2 + (var4 - this.method_885(field_532[var14])) / 2, var13);
            } else if(var8 == 2) {
               this.method_861(field_532[var14], var2 + var4 - this.method_885(field_532[var14]), var13);
            } else if(var14 == var12 - 1) {
               this.method_861(field_532[var14], var2, var13);
            } else {
               this.method_943(field_532[var14], var4);
               this.method_861(field_532[var14], var2, var13);
               field_529 = 0;
            }

            var13 += var10;
         }

         return var12;
      }
   }

   // $FF: renamed from: cr (java.lang.String, int, int) void
   void method_928(String var1, int var2, int var3) {
      var3 -= this.field_522;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if(var1.charAt(var6) != 0) {
            char var7 = (char)(ServerOpcode.method_4995(var1.charAt(var6), (byte)52) & -192136235);
            if(var7 == -1652918222) {
               var4 = var6;
            } else {
               int var9;
               if(var7 == 62 && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if(var8.equals("lt")) {
                     var7 = 60;
                  } else {
                     if(!var8.equals("gt")) {
                        if(var8.startsWith("img=")) {
                           try {
                              var9 = class_168.method_3609(var8.substring(4));
                              class_66 var13 = field_527[var9];
                              var13.draw(var2, var3 + this.field_522 - var13.field_494);
                              var2 += var13.field_497;
                              var5 = -1;
                           } catch (Exception var11) {
                              ;
                           }
                        } else {
                           this.method_879(var8);
                        }
                        continue;
                     }

                     var7 = 62;
                  }
               }

               if(var7 == 929487725) {
                  var7 = 32;
               }

               if(var4 == -1) {
                  if(this.field_521 != null && var5 != -1) {
                     var2 += this.field_521[(var5 << 8) + var7];
                  }

                  int var12 = this.field_513[var7];
                  var9 = this.field_524[var7];
                  if(var7 != -724859444) {
                     if(field_528 == 256) {
                        if(field_525 != -1) {
                           method_960(this.field_512[var7], var2 + this.field_515[var7] + 1, var3 + this.field_511[var7] + 1, var12, var9, field_525);
                        }

                        this.method_889(this.field_512[var7], var2 + this.field_515[var7], var3 + this.field_511[var7], var12, var9, field_517);
                     } else {
                        if(field_525 != -1) {
                           method_887(this.field_512[var7], var2 + this.field_515[var7] + 1, var3 + this.field_511[var7] + 1, var12, var9, field_525, field_528);
                        }

                        this.method_859(this.field_512[var7], var2 + this.field_515[var7], var3 + this.field_511[var7], var12, var9, field_517, field_528);
                     }
                  } else if(field_529 > 0) {
                     field_523 += field_529;
                     var2 += field_523 >> 8;
                     field_523 &= 255;
                  }

                  int var10 = this.field_520[var7];
                  if(field_514 != -1) {
                     method_726(var2, var3 + (int)((double)this.field_522 * 0.7D), var10, field_514);
                  }

                  if(field_516 != -1) {
                     method_726(var2, var3 + this.field_522 + 1, var10, field_516);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   // $FF: renamed from: bw (java.lang.String, int, int, int, int, int) void
   public void method_929(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method_878(var4, var5);
         int[] var7 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method_900(var1, var2 - this.method_885(var1) / 2, var3, (int[])null, var7);
      }
   }

   // $FF: renamed from: bi (java.lang.String, int, int, int, int, int) void
   public void method_930(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method_878(var4, var5);
         int[] var7 = new int[var1.length()];

         for(int var8 = 0; var8 < var1.length(); ++var8) {
            var7[var8] = (int)(Math.sin((double)var8 / 2.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method_900(var1, var2 - this.method_885(var1) / 2, var3, (int[])null, var7);
      }
   }

   // $FF: renamed from: t (java.lang.String, int, int, int, int, int) void
   public void method_931(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method_878(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method_900(var1, var2 - this.method_885(var1) / 2, var3, var7, var8);
      }
   }

   // $FF: renamed from: bk (java.lang.String, int, int, int, int, int) void
   public void method_932(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method_878(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method_900(var1, var2 - this.method_885(var1) / 2, var3, var7, var8);
      }
   }

   // $FF: renamed from: bg (java.lang.String, int, int, int, int, int) void
   public void method_933(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method_878(var4, var5);
         int[] var7 = new int[var1.length()];
         int[] var8 = new int[var1.length()];

         for(int var9 = 0; var9 < var1.length(); ++var9) {
            var7[var9] = (int)(Math.sin((double)var9 / 5.0D + (double)var6 / 5.0D) * 5.0D);
            var8[var9] = (int)(Math.sin((double)var9 / 3.0D + (double)var6 / 5.0D) * 5.0D);
         }

         this.method_900(var1, var2 - this.method_885(var1) / 2, var3, var7, var8);
      }
   }

   // $FF: renamed from: bv (java.lang.String, int, int, int, int, int) void
   public void method_934(String var1, int var2, int var3, int var4, int var5, int var6) {
      if(var1 != null) {
         this.method_878(var4, var5);
         field_528 = var6;
         this.method_861(var1, var2, var3);
      }
   }

   // $FF: renamed from: bc (java.lang.String, int, int, int, int, int, int) void
   public void method_935(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 != null) {
         this.method_878(var4, var5);
         double var8 = 7.0D - (double)var7 / 8.0D;
         if(var8 < 0.0D) {
            var8 = 0.0D;
         }

         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
         }

         this.method_900(var1, var2 - this.method_885(var1) / 2, var3, (int[])null, var10);
      }
   }

   // $FF: renamed from: ci (java.lang.String, int) void
   void method_936(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if(var6 == 60) {
            var4 = true;
         } else if(var6 == 62) {
            var4 = false;
         } else if(!var4 && var6 == 32) {
            ++var3;
         }
      }

      if(var3 > 0) {
         field_529 = (var2 - this.method_885(var1) << 8) / var3;
      }

   }

   // $FF: renamed from: f (byte[], int, int, int, int, int) void
   abstract void method_937(byte[] var1, int var2, int var3, int var4, int var5, int var6);

   // $FF: renamed from: cx (int[], byte[], int, int, int, int, int, int, int) void
   static void method_938(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: cp (java.lang.String) void
   void method_939(String var1) {
      try {
         int var2;
         String var3;
         if(var1.startsWith("col=")) {
            var3 = var1.substring(4);
            var2 = class_176.method_3747(var3, 16, true, (byte)48);
            field_517 = var2;
         } else if(var1.equals("/col")) {
            field_517 = field_526;
         } else if(var1.startsWith("str=")) {
            var3 = var1.substring(4);
            var2 = class_176.method_3747(var3, 16, true, (byte)6);
            field_514 = var2;
         } else if(var1.equals("str")) {
            field_514 = 8388608;
         } else if(var1.equals("/str")) {
            field_514 = -1;
         } else if(var1.startsWith("u=")) {
            var3 = var1.substring(2);
            var2 = class_176.method_3747(var3, 16, true, (byte)16);
            field_516 = var2;
         } else if(var1.equals("u")) {
            field_516 = 0;
         } else if(var1.equals("/u")) {
            field_516 = -1;
         } else if(var1.startsWith("shad=")) {
            var3 = var1.substring(5);
            var2 = class_176.method_3747(var3, 16, true, (byte)106);
            field_525 = var2;
         } else if(var1.equals("shad")) {
            field_525 = 0;
         } else if(var1.equals("/shad")) {
            field_525 = field_530;
         } else if(var1.equals("br")) {
            this.method_878(field_526, field_530);
         }
      } catch (Exception var4) {
         ;
      }

   }

   // $FF: renamed from: ce (int[], byte[], int, int, int, int, int, int, int) void
   static void method_940(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: by (java.lang.String, int, int, int, int, int, int) void
   public void method_941(String var1, int var2, int var3, int var4, int var5, int var6, int var7) {
      if(var1 != null) {
         this.method_878(var4, var5);
         double var8 = 7.0D - (double)var7 / 8.0D;
         if(var8 < 0.0D) {
            var8 = 0.0D;
         }

         int[] var10 = new int[var1.length()];

         for(int var11 = 0; var11 < var1.length(); ++var11) {
            var10[var11] = (int)(Math.sin((double)var11 / 1.5D + (double)var6 / 1.0D) * var8);
         }

         this.method_900(var1, var2 - this.method_885(var1) / 2, var3, (int[])null, var10);
      }
   }

   // $FF: renamed from: cm (int, int) void
   void method_942(int var1, int var2) {
      field_514 = -1;
      field_516 = -1;
      field_530 = var2;
      field_525 = var2;
      field_526 = var1;
      field_517 = var1;
      field_528 = 256;
      field_529 = 0;
      field_523 = 0;
   }

   // $FF: renamed from: ap (java.lang.String, int) void
   void method_943(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if(var6 == 60) {
            var4 = true;
         } else if(var6 == 62) {
            var4 = false;
         } else if(!var4 && var6 == 32) {
            ++var3;
         }
      }

      if(var3 > 0) {
         field_529 = (var2 - this.method_885(var1) << 8) / var3;
      }

   }

   // $FF: renamed from: cf (java.lang.String, int, int) void
   void method_944(String var1, int var2, int var3) {
      var3 -= this.field_522;
      int var4 = -1;
      int var5 = -1;

      for(int var6 = 0; var6 < var1.length(); ++var6) {
         if(var1.charAt(var6) != 0) {
            int var7 = (char)(ServerOpcode.method_4995(var1.charAt(var6), (byte)94) & 255);
            if(var7 == 60) {
               var4 = var6;
            } else {
               int var9;
               if(var7 == -2014936117 && var4 != -1) {
                  String var8 = var1.substring(var4 + 1, var6);
                  var4 = -1;
                  if(var8.equals("lt")) {
                     var7 = 60;
                  } else {
                     if(!var8.equals("gt")) {
                        if(var8.startsWith("img=")) {
                           try {
                              var9 = class_168.method_3609(var8.substring(4));
                              class_66 var13 = field_527[var9];
                              var13.draw(var2, var3 + this.field_522 - var13.field_494);
                              var2 += var13.field_497;
                              var5 = -1;
                           } catch (Exception var11) {
                              ;
                           }
                        } else {
                           this.method_879(var8);
                        }
                        continue;
                     }

                     var7 = 720751233;
                  }
               }

               if(var7 == -204251756) {
                  var7 = 1318763504;
               }

               if(var4 == -1) {
                  if(this.field_521 != null && var5 != -1) {
                     var2 += this.field_521[(var5 << 8) + var7];
                  }

                  int var12 = this.field_513[var7];
                  var9 = this.field_524[var7];
                  if(var7 != -1365538118) {
                     if(field_528 == 1624831104) {
                        if(field_525 != -1) {
                           method_960(this.field_512[var7], var2 + this.field_515[var7] + 1, var3 + this.field_511[var7] + 1, var12, var9, field_525);
                        }

                        this.method_889(this.field_512[var7], var2 + this.field_515[var7], var3 + this.field_511[var7], var12, var9, field_517);
                     } else {
                        if(field_525 != -1) {
                           method_887(this.field_512[var7], var2 + this.field_515[var7] + 1, var3 + this.field_511[var7] + 1, var12, var9, field_525, field_528);
                        }

                        this.method_859(this.field_512[var7], var2 + this.field_515[var7], var3 + this.field_511[var7], var12, var9, field_517, field_528);
                     }
                  } else if(field_529 > 0) {
                     field_523 += field_529;
                     var2 += field_523 >> 8;
                     field_523 &= 255;
                  }

                  int var10 = this.field_520[var7];
                  if(field_514 != -1) {
                     method_726(var2, var3 + (int)((double)this.field_522 * 0.7D), var10, field_514);
                  }

                  if(field_516 != -1) {
                     method_726(var2, var3 + this.field_522 + 1, var10, field_516);
                  }

                  var2 += var10;
                  var5 = var7;
               }
            }
         }
      }

   }

   // $FF: renamed from: cn (java.lang.String, int, int, int[], int[]) void
   void method_945(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.field_522;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if(var1.charAt(var9) != 0) {
            int var10 = (char)(ServerOpcode.method_4995(var1.charAt(var9), (byte)36) & -797627950);
            if(var10 == -830228515) {
               var6 = var9;
            } else {
               int var12;
               int var13;
               int var14;
               if(var10 == -2016062372 && var6 != -1) {
                  String var11 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if(var11.equals("lt")) {
                     var10 = 60;
                  } else {
                     if(!var11.equals("gt")) {
                        if(var11.startsWith("img=")) {
                           try {
                              if(var4 != null) {
                                 var12 = var4[var8];
                              } else {
                                 var12 = 0;
                              }

                              if(var5 != null) {
                                 var13 = var5[var8];
                              } else {
                                 var13 = 0;
                              }

                              ++var8;
                              var14 = class_168.method_3609(var11.substring(4));
                              class_66 var18 = field_527[var14];
                              var18.draw(var2 + var12, var3 + this.field_522 - var18.field_494 + var13);
                              var2 += var18.field_497;
                              var7 = -1;
                           } catch (Exception var16) {
                              ;
                           }
                        } else {
                           this.method_879(var11);
                        }
                        continue;
                     }

                     var10 = 1877446387;
                  }
               }

               if(var10 == 160) {
                  var10 = 32;
               }

               if(var6 == -1) {
                  if(this.field_521 != null && var7 != -1) {
                     var2 += this.field_521[(var7 << 8) + var10];
                  }

                  int var17 = this.field_513[var10];
                  var12 = this.field_524[var10];
                  if(var4 != null) {
                     var13 = var4[var8];
                  } else {
                     var13 = 0;
                  }

                  if(var5 != null) {
                     var14 = var5[var8];
                  } else {
                     var14 = 0;
                  }

                  ++var8;
                  if(var10 != -1982637141) {
                     if(field_528 == 256) {
                        if(field_525 != -1) {
                           method_960(this.field_512[var10], var2 + this.field_515[var10] + 1 + var13, var3 + this.field_511[var10] + 1 + var14, var17, var12, field_525);
                        }

                        this.method_889(this.field_512[var10], var2 + this.field_515[var10] + var13, var3 + this.field_511[var10] + var14, var17, var12, field_517);
                     } else {
                        if(field_525 != -1) {
                           method_887(this.field_512[var10], var2 + this.field_515[var10] + 1 + var13, var3 + this.field_511[var10] + 1 + var14, var17, var12, field_525, field_528);
                        }

                        this.method_859(this.field_512[var10], var2 + this.field_515[var10] + var13, var3 + this.field_511[var10] + var14, var17, var12, field_517, field_528);
                     }
                  } else if(field_529 > 0) {
                     field_523 += field_529;
                     var2 += field_523 >> 8;
                     field_523 &= 255;
                  }

                  int var15 = this.field_520[var10];
                  if(field_514 != -1) {
                     method_726(var2, var3 + (int)((double)this.field_522 * 0.7D), var15, field_514);
                  }

                  if(field_516 != -1) {
                     method_726(var2, var3 + this.field_522, var15, field_516);
                  }

                  var2 += var15;
                  var7 = var10;
               }
            }
         }
      }

   }

   // $FF: renamed from: cs (java.lang.String, int, int, int[], int[]) void
   void method_946(String var1, int var2, int var3, int[] var4, int[] var5) {
      var3 -= this.field_522;
      int var6 = -1;
      int var7 = -1;
      int var8 = 0;

      for(int var9 = 0; var9 < var1.length(); ++var9) {
         if(var1.charAt(var9) != 0) {
            int var10 = (char)(ServerOpcode.method_4995(var1.charAt(var9), (byte)22) & 255);
            if(var10 == 60) {
               var6 = var9;
            } else {
               int var12;
               int var13;
               int var14;
               if(var10 == 62 && var6 != -1) {
                  String var11 = var1.substring(var6 + 1, var9);
                  var6 = -1;
                  if(var11.equals("lt")) {
                     var10 = 1168122681;
                  } else {
                     if(!var11.equals("gt")) {
                        if(var11.startsWith("img=")) {
                           try {
                              if(var4 != null) {
                                 var12 = var4[var8];
                              } else {
                                 var12 = 0;
                              }

                              if(var5 != null) {
                                 var13 = var5[var8];
                              } else {
                                 var13 = 0;
                              }

                              ++var8;
                              var14 = class_168.method_3609(var11.substring(4));
                              class_66 var18 = field_527[var14];
                              var18.draw(var2 + var12, var3 + this.field_522 - var18.field_494 + var13);
                              var2 += var18.field_497;
                              var7 = -1;
                           } catch (Exception var16) {
                              ;
                           }
                        } else {
                           this.method_879(var11);
                        }
                        continue;
                     }

                     var10 = 1391749799;
                  }
               }

               if(var10 == 1657421891) {
                  var10 = -706860755;
               }

               if(var6 == -1) {
                  if(this.field_521 != null && var7 != -1) {
                     var2 += this.field_521[(var7 << 8) + var10];
                  }

                  int var17 = this.field_513[var10];
                  var12 = this.field_524[var10];
                  if(var4 != null) {
                     var13 = var4[var8];
                  } else {
                     var13 = 0;
                  }

                  if(var5 != null) {
                     var14 = var5[var8];
                  } else {
                     var14 = 0;
                  }

                  ++var8;
                  if(var10 != 32) {
                     if(field_528 == -1414443536) {
                        if(field_525 != -1) {
                           method_960(this.field_512[var10], var2 + this.field_515[var10] + 1 + var13, var3 + this.field_511[var10] + 1 + var14, var17, var12, field_525);
                        }

                        this.method_889(this.field_512[var10], var2 + this.field_515[var10] + var13, var3 + this.field_511[var10] + var14, var17, var12, field_517);
                     } else {
                        if(field_525 != -1) {
                           method_887(this.field_512[var10], var2 + this.field_515[var10] + 1 + var13, var3 + this.field_511[var10] + 1 + var14, var17, var12, field_525, field_528);
                        }

                        this.method_859(this.field_512[var10], var2 + this.field_515[var10] + var13, var3 + this.field_511[var10] + var14, var17, var12, field_517, field_528);
                     }
                  } else if(field_529 > 0) {
                     field_523 += field_529;
                     var2 += field_523 >> 8;
                     field_523 &= 255;
                  }

                  int var15 = this.field_520[var10];
                  if(field_514 != -1) {
                     method_726(var2, var3 + (int)((double)this.field_522 * 0.7D), var15, field_514);
                  }

                  if(field_516 != -1) {
                     method_726(var2, var3 + this.field_522, var15, field_516);
                  }

                  var2 += var15;
                  var7 = var10;
               }
            }
         }
      }

   }

   // $FF: renamed from: m (java.lang.String, int, int, int, int) void
   public void method_947(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method_878(var4, var5);
         this.method_861(var1, var2 - this.method_885(var1), var3);
      }
   }

   // $FF: renamed from: ct (java.lang.String, int) void
   void method_948(String var1, int var2) {
      int var3 = 0;
      boolean var4 = false;

      for(int var5 = 0; var5 < var1.length(); ++var5) {
         char var6 = var1.charAt(var5);
         if(var6 == -458044407) {
            var4 = true;
         } else if(var6 == 62) {
            var4 = false;
         } else if(!var4 && var6 == 32) {
            ++var3;
         }
      }

      if(var3 > 0) {
         field_529 = (var2 - this.method_885(var1) << 8) / var3;
      }

   }

   // $FF: renamed from: j (byte[], int, int, int, int, int, int) void
   abstract void method_949(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   // $FF: renamed from: r (byte[], int, int, int, int, int, int) void
   abstract void method_950(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   // $FF: renamed from: b (byte[], int, int, int, int, int, int) void
   abstract void method_951(byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7);

   // $FF: renamed from: ck (byte[], int, int, int, int, int) void
   static void method_952(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * field_484;
      int var7 = field_484 - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if(var2 < field_487) {
         var10 = field_487 - var2;
         var4 -= var10;
         var2 = field_487;
         var9 += var10 * var3;
         var6 += var10 * field_484;
      }

      if(var2 + var4 > field_485) {
         var4 -= var2 + var4 - field_485;
      }

      if(var1 < field_489) {
         var10 = field_489 - var1;
         var3 -= var10;
         var1 = field_489;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if(var1 + var3 > field_488) {
         var10 = var1 + var3 - field_488;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if(var3 > 0 && var4 > 0) {
         method_886(field_490, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   // $FF: renamed from: aw (java.lang.String, int[], java.lang.String[]) int
   public int method_953(String var1, int[] var2, String[] var3) {
      if(var1 == null) {
         return 0;
      } else {
         int var4 = 0;
         int var5 = 0;
         StringBuilder var6 = new StringBuilder(-1134524508);
         int var7 = -1;
         int var8 = 0;
         byte var9 = 0;
         int var10 = -1;
         int var11 = 0;
         int var12 = 0;
         int var13 = var1.length();

         for(int var14 = 0; var14 < var13; ++var14) {
            char var15 = var1.charAt(var14);
            if(var15 == 1510159476) {
               var10 = var14;
            } else {
               if(var15 == 62 && var10 != -1) {
                  String var16 = var1.substring(var10 + 1, var14);
                  var10 = -1;
                  var6.append('<');
                  var6.append(var16);
                  var6.append((char)-1863136549);
                  if(var16.equals("br")) {
                     var3[var12] = var6.toString().substring(var5, var6.length());
                     ++var12;
                     var5 = var6.length();
                     var4 = 0;
                     var7 = -1;
                     var11 = 0;
                  } else if(var16.equals("lt")) {
                     var4 += this.method_863('<');
                     if(this.field_521 != null && var11 != -1) {
                        var4 += this.field_521[(var11 << 8) + 60];
                     }

                     var11 = -278398517;
                  } else if(var16.equals("gt")) {
                     var4 += this.method_863('>');
                     if(this.field_521 != null && var11 != -1) {
                        var4 += this.field_521[(var11 << 8) + 62];
                     }

                     var11 = 62;
                  } else if(var16.startsWith("img=")) {
                     try {
                        int var17 = class_168.method_3609(var16.substring(4));
                        var4 += field_527[var17].field_497;
                        var11 = 0;
                     } catch (Exception var18) {
                        ;
                     }
                  }

                  var15 = 0;
               }

               if(var10 == -1) {
                  if(var15 != 0) {
                     var6.append(var15);
                     var4 += this.method_863(var15);
                     if(this.field_521 != null && var11 != -1) {
                        var4 += this.field_521[(var11 << 8) + var15];
                     }

                     var11 = var15;
                  }

                  if(var15 == -1212993454) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 1;
                  }

                  if(var2 != null && var4 > var2[var12 < var2.length?var12:var2.length - 1] && var7 >= 0) {
                     var3[var12] = var6.toString().substring(var5, var7 - var9);
                     ++var12;
                     var5 = var7;
                     var7 = -1;
                     var4 -= var8;
                     var11 = 0;
                  }

                  if(var15 == 2088873648) {
                     var7 = var6.length();
                     var8 = var4;
                     var9 = 0;
                  }
               }
            }
         }

         String var19 = var6.toString();
         if(var19.length() > var5) {
            var3[var12++] = var19.substring(var5, var19.length());
         }

         return var12;
      }
   }

   // $FF: renamed from: br (java.lang.String, int, int, int, int) void
   public void method_954(String var1, int var2, int var3, int var4, int var5) {
      if(var1 != null) {
         this.method_878(var4, var5);
         this.method_861(var1, var2 - this.method_885(var1), var3);
      }
   }

   // $FF: renamed from: cu (byte[], int, int, int, int, int) void
   static void method_955(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * field_484;
      int var7 = field_484 - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if(var2 < field_487) {
         var10 = field_487 - var2;
         var4 -= var10;
         var2 = field_487;
         var9 += var10 * var3;
         var6 += var10 * field_484;
      }

      if(var2 + var4 > field_485) {
         var4 -= var2 + var4 - field_485;
      }

      if(var1 < field_489) {
         var10 = field_489 - var1;
         var3 -= var10;
         var1 = field_489;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if(var1 + var3 > field_488) {
         var10 = var1 + var3 - field_488;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if(var3 > 0 && var4 > 0) {
         method_886(field_490, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   // $FF: renamed from: cz (int[], byte[], int, int, int, int, int, int, int) void
   static void method_956(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: cb (int[], byte[], int, int, int, int, int, int, int) void
   static void method_957(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: ah (char) int
   int method_958(char var1) {
      if(var1 == 160) {
         var1 = 32;
      }

      return this.field_520[ServerOpcode.method_4995(var1, (byte)72) & 255];
   }

   // $FF: renamed from: ch (int[], byte[], int, int, int, int, int, int, int) void
   static void method_959(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int var9 = -(var5 >> 2);
      var5 = -(var5 & 3);

      for(int var10 = -var6; var10 < 0; ++var10) {
         int var11;
         for(var11 = var9; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }

            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         for(var11 = var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               var0[var4++] = var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: ad (byte[], int, int, int, int, int) void
   static void method_960(byte[] var0, int var1, int var2, int var3, int var4, int var5) {
      int var6 = var1 + var2 * field_484;
      int var7 = field_484 - var3;
      int var8 = 0;
      int var9 = 0;
      int var10;
      if(var2 < field_487) {
         var10 = field_487 - var2;
         var4 -= var10;
         var2 = field_487;
         var9 += var10 * var3;
         var6 += var10 * field_484;
      }

      if(var2 + var4 > field_485) {
         var4 -= var2 + var4 - field_485;
      }

      if(var1 < field_489) {
         var10 = field_489 - var1;
         var3 -= var10;
         var1 = field_489;
         var9 += var10;
         var6 += var10;
         var8 += var10;
         var7 += var10;
      }

      if(var1 + var3 > field_488) {
         var10 = var1 + var3 - field_488;
         var3 -= var10;
         var8 += var10;
         var7 += var10;
      }

      if(var3 > 0 && var4 > 0) {
         method_886(field_490, var0, var5, var9, var6, var3, var4, var7, var8);
      }
   }

   // $FF: renamed from: cv (int, int) void
   void method_961(int var1, int var2) {
      field_514 = -1;
      field_516 = -1;
      field_530 = var2;
      field_525 = var2;
      field_526 = var1;
      field_517 = var1;
      field_528 = 256;
      field_529 = 0;
      field_523 = 0;
   }

   // $FF: renamed from: ca (byte[], int, int, int, int, int, int) void
   static void method_962(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * field_484;
      int var8 = field_484 - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if(var2 < field_487) {
         var11 = field_487 - var2;
         var4 -= var11;
         var2 = field_487;
         var10 += var11 * var3;
         var7 += var11 * field_484;
      }

      if(var2 + var4 > field_485) {
         var4 -= var2 + var4 - field_485;
      }

      if(var1 < field_489) {
         var11 = field_489 - var1;
         var3 -= var11;
         var1 = field_489;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if(var1 + var3 > field_488) {
         var11 = var1 + var3 - field_488;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if(var3 > 0 && var4 > 0) {
         method_888(field_490, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   // $FF: renamed from: cl (byte[], int, int, int, int, int, int) void
   static void method_963(byte[] var0, int var1, int var2, int var3, int var4, int var5, int var6) {
      int var7 = var1 + var2 * field_484;
      int var8 = field_484 - var3;
      int var9 = 0;
      int var10 = 0;
      int var11;
      if(var2 < field_487) {
         var11 = field_487 - var2;
         var4 -= var11;
         var2 = field_487;
         var10 += var11 * var3;
         var7 += var11 * field_484;
      }

      if(var2 + var4 > field_485) {
         var4 -= var2 + var4 - field_485;
      }

      if(var1 < field_489) {
         var11 = field_489 - var1;
         var3 -= var11;
         var1 = field_489;
         var10 += var11;
         var7 += var11;
         var9 += var11;
         var8 += var11;
      }

      if(var1 + var3 > field_488) {
         var11 = var1 + var3 - field_488;
         var3 -= var11;
         var9 += var11;
         var8 += var11;
      }

      if(var3 > 0 && var4 > 0) {
         method_888(field_490, var0, var5, var10, var7, var3, var4, var8, var9, var6);
      }
   }

   // $FF: renamed from: cw (int[], byte[], int, int, int, int, int, int, int, int) void
   static void method_964(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & '\uff00') * var9 & 16711680) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: db (int[], byte[], int, int, int, int, int, int, int, int) void
   static void method_965(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & 1605043100) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
      var9 = 2091307153 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 16711935) * var9 & -1498011210) + ((var12 & '\uff00') * var9 & -2006254564) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }

   // $FF: renamed from: dz (int[], byte[], int, int, int, int, int, int, int, int) void
   static void method_966(int[] var0, byte[] var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      var2 = ((var2 & 16711935) * var9 & -16711936) + ((var2 & '\uff00') * var9 & 16711680) >> 8;
      var9 = 256 - var9;

      for(int var10 = -var6; var10 < 0; ++var10) {
         for(int var11 = -var5; var11 < 0; ++var11) {
            if(var1[var3++] != 0) {
               int var12 = var0[var4];
               var0[var4++] = (((var12 & 16711935) * var9 & -16711936) + ((var12 & '\uff00') * var9 & 16711680) >> 8) + var2;
            } else {
               ++var4;
            }
         }

         var4 += var7;
         var3 += var8;
      }

   }
}
