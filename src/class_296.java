import java.util.HashMap;

// $FF: renamed from: je
public class class_296 {

   // $FF: renamed from: n li
   class_351 field_3351;
   // $FF: renamed from: v java.util.HashMap
   final HashMap field_3352;
   // $FF: renamed from: f int[]
   int[] field_3353;
   // $FF: renamed from: y int[]
   int[] field_3354;
   // $FF: renamed from: p int
   int field_3355;


   // $FF: renamed from: v (int, int) void
   void method_5318(int var1, int var2) {
      try {
         int var3 = 1 + 2 * var1;
         double var5 = (double)((float)var1 / 3.0F);
         int var7 = 1 + 2 * var1;
         double[] var8 = new double[var7];
         int var9 = -var1;

         for(int var10 = 0; var9 <= var1; ++var10) {
            if(var2 >= 395499296) {
               throw new IllegalStateException();
            }

            var8[var10] = class_124.method_2282((double)var9, 0.0D, var5);
            ++var9;
         }

         double[] var16 = var8;
         double var17 = var8[var1] * var8[var1];
         int[] var18 = new int[var3 * var3];
         boolean var11 = false;

         for(int var12 = 0; var12 < var3; ++var12) {
            if(var2 >= 395499296) {
               throw new IllegalStateException();
            }

            for(int var13 = 0; var13 < var3; ++var13) {
               if(var2 >= 395499296) {
                  return;
               }

               int var14 = var18[var12 * var3 + var13] = (int)(var16[var13] * var16[var12] / var17 * 256.0D);
               if(!var11) {
                  if(var2 >= 395499296) {
                     throw new IllegalStateException();
                  }

                  if(var14 > 0) {
                     var11 = true;
                  }
               }
            }
         }

         class_67 var10000 = new class_67(var18, var3, var3);
         class_67 var19 = var10000;
         this.field_3352.put(Integer.valueOf(var1), var19);
      } catch (RuntimeException var15) {
         throw class_223.method_4281(var15, "je.v(" + ')');
      }
   }

   // $FF: renamed from: o (int, int, oh, float) void
   public final void method_5319(int var1, int var2, class_67 var3, float var4) {
      int var5 = (int)(18.0F * var4);
      class_67 var6 = this.method_5320(var5, -1959245210);
      int var7 = 1 + 2 * var5;
      class_351 var10000 = new class_351(0, 0, var3.field_508, var3.field_500);
      class_351 var8 = var10000;
      var10000 = new class_351(0, 0);
      class_351 var9 = var10000;
      this.field_3351.method_6210(var7, var7, 284108596);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < 686309897 * this.field_3355; ++var10) {
         var11 = this.field_3353[var10];
         var12 = this.field_3354[var10];
         int var13 = (int)((float)(var11 - var1) * var4) - var5;
         int var14 = (int)((float)var3.field_500 - var4 * (float)(var12 - var2)) - var5;
         this.field_3351.method_6209(var13, var14, 906846377);
         this.field_3351.method_6207(var8, var9, (byte)-95);
         this.method_5323(var6, var3, var9, 528376815);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.field_502.length; ++var10) {
         if(0 == var3.field_502[var10]) {
            var3.field_502[var10] = -16777216;
         } else {
            var11 = (var3.field_502[var10] + 64 - 1) / 256;
            if(var11 <= 0) {
               var3.field_502[var10] = -16777216;
            } else {
               if(var11 > class_234.field_2624.length) {
                  var11 = class_234.field_2624.length;
               }

               var12 = class_234.field_2624[var11 - 1];
               var3.field_502[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   // $FF: renamed from: n (int, int) oh
   class_67 method_5320(int var1, int var2) {
      try {
         if(!this.field_3352.containsKey(Integer.valueOf(var1))) {
            if(var2 >= 63311321) {
               throw new IllegalStateException();
            }

            this.method_5318(var1, -969189545);
         }

         return (class_67)this.field_3352.get(Integer.valueOf(var1));
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "je.n(" + ')');
      }
   }

   // $FF: renamed from: p (int, int, oh, float, int) void
   public final void method_5321(int var1, int var2, class_67 var3, float var4, int var5) {
      try {
         int var6 = (int)(18.0F * var4);
         class_67 var7 = this.method_5320(var6, -158733567);
         int var8 = 1 + 2 * var6;
         class_351 var10000 = new class_351(0, 0, var3.field_508, var3.field_500);
         class_351 var9 = var10000;
         var10000 = new class_351(0, 0);
         class_351 var10 = var10000;
         this.field_3351.method_6210(var8, var8, 566817349);
         System.nanoTime();

         int var11;
         int var12;
         int var13;
         for(var11 = 0; var11 < 686309897 * this.field_3355; ++var11) {
            if(var5 >= 133462604) {
               throw new IllegalStateException();
            }

            var12 = this.field_3353[var11];
            var13 = this.field_3354[var11];
            int var14 = (int)((float)(var12 - var1) * var4) - var6;
            int var15 = (int)((float)var3.field_500 - var4 * (float)(var13 - var2)) - var6;
            this.field_3351.method_6209(var14, var15, 961693590);
            this.field_3351.method_6207(var9, var10, (byte)-80);
            this.method_5323(var7, var3, var10, 1348286634);
         }

         System.nanoTime();
         System.nanoTime();

         for(var11 = 0; var11 < var3.field_502.length; ++var11) {
            if(0 == var3.field_502[var11]) {
               if(var5 >= 133462604) {
                  return;
               }

               var3.field_502[var11] = -16777216;
            } else {
               var12 = (var3.field_502[var11] + 64 - 1) / 256;
               if(var12 <= 0) {
                  if(var5 >= 133462604) {
                     throw new IllegalStateException();
                  }

                  var3.field_502[var11] = -16777216;
               } else {
                  if(var12 > class_234.field_2624.length) {
                     if(var5 >= 133462604) {
                        return;
                     }

                     var12 = class_234.field_2624.length;
                  }

                  var13 = class_234.field_2624[var12 - 1];
                  var3.field_502[var11] = -16777216 | var13;
               }
            }
         }

         System.nanoTime();
      } catch (RuntimeException var16) {
         throw class_223.method_4281(var16, "je.p(" + ')');
      }
   }

   // $FF: renamed from: f (int, int, byte) void
   public final void method_5322(int var1, int var2, byte var3) {
      try {
         if(686309897 * this.field_3355 >= this.field_3353.length) {
            if(var3 == 1) {
               throw new IllegalStateException();
            }
         } else {
            this.field_3353[this.field_3355 * 686309897] = var1;
            this.field_3354[this.field_3355 * 686309897] = var2;
            this.field_3355 += 845278265;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "je.f(" + ')');
      }
   }

   // $FF: renamed from: j (oh, oh, li, int) void
   void method_5323(class_67 var1, class_67 var2, class_351 var3, int var4) {
      try {
         if(0 != -250215195 * var3.field_3947) {
            if(var4 == '\ufffd') {
               throw new IllegalStateException();
            }

            if(var3.field_3948 * 1839374135 != 0) {
               int var5 = 0;
               int var6 = 0;
               if(var3.field_3946 * -1774637825 == 0) {
                  if(var4 == '\ufffd') {
                     return;
                  }

                  var5 = var1.field_508 - var3.field_3947 * -250215195;
               }

               if(0 == var3.field_3945 * 47432047) {
                  if(var4 == '\ufffd') {
                     return;
                  }

                  var6 = var1.field_500 - 1839374135 * var3.field_3948;
               }

               int var7 = var5 + var1.field_508 * var6;
               int var8 = var2.field_508 * var3.field_3945 * 47432047 + var3.field_3946 * -1774637825;

               for(int var9 = 0; var9 < 1839374135 * var3.field_3948; ++var9) {
                  if(var4 == '\ufffd') {
                     throw new IllegalStateException();
                  }

                  for(int var10 = 0; var10 < -250215195 * var3.field_3947; ++var10) {
                     if(var4 == '\ufffd') {
                        throw new IllegalStateException();
                     }

                     int var10001 = var8++;
                     var2.field_502[var10001] += var1.field_502[var7++];
                  }

                  var7 += var1.field_508 - -250215195 * var3.field_3947;
                  var8 += var2.field_508 - -250215195 * var3.field_3947;
               }

               return;
            }

            if(var4 == '\ufffd') {
               throw new IllegalStateException();
            }
         }

      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11, "je.j(" + ')');
      }
   }

   // $FF: renamed from: b (int) void
   void method_5324(int var1) {
      int var2 = 1 + 2 * var1;
      double var4 = (double)((float)var1 / 3.0F);
      int var6 = 1 + 2 * var1;
      double[] var7 = new double[var6];
      int var8 = -var1;

      for(int var9 = 0; var8 <= var1; ++var9) {
         var7[var9] = class_124.method_2282((double)var8, 0.0D, var4);
         ++var8;
      }

      double[] var14 = var7;
      double var15 = var7[var1] * var7[var1];
      int[] var16 = new int[var2 * var2];
      boolean var10 = false;

      for(int var11 = 0; var11 < var2; ++var11) {
         for(int var12 = 0; var12 < var2; ++var12) {
            int var13 = var16[var11 * var2 + var12] = (int)(var14[var12] * var14[var11] / var15 * 256.0D);
            if(!var10 && var13 > 0) {
               var10 = true;
            }
         }
      }

      class_67 var10000 = new class_67(var16, var2, var2);
      class_67 var17 = var10000;
      this.field_3352.put(Integer.valueOf(var1), var17);
   }

   // $FF: renamed from: r (int) void
   void method_5325(int var1) {
      int var2 = 1 + 2 * var1;
      double var4 = (double)((float)var1 / 3.0F);
      int var6 = 1 + 2 * var1;
      double[] var7 = new double[var6];
      int var8 = -var1;

      for(int var9 = 0; var8 <= var1; ++var9) {
         var7[var9] = class_124.method_2282((double)var8, 0.0D, var4);
         ++var8;
      }

      double[] var14 = var7;
      double var15 = var7[var1] * var7[var1];
      int[] var16 = new int[var2 * var2];
      boolean var10 = false;

      for(int var11 = 0; var11 < var2; ++var11) {
         for(int var12 = 0; var12 < var2; ++var12) {
            int var13 = var16[var11 * var2 + var12] = (int)(var14[var12] * var14[var11] / var15 * 256.0D);
            if(!var10 && var13 > 0) {
               var10 = true;
            }
         }
      }

      class_67 var10000 = new class_67(var16, var2, var2);
      class_67 var17 = var10000;
      this.field_3352.put(Integer.valueOf(var1), var17);
   }

   // $FF: renamed from: e (oh, oh, li) void
   void method_5326(class_67 var1, class_67 var2, class_351 var3) {
      if(0 != 1956110119 * var3.field_3947 && var3.field_3948 * -1644249955 != 0) {
         int var4 = 0;
         int var5 = 0;
         if(var3.field_3946 * -1774637825 == 0) {
            var4 = var1.field_508 - var3.field_3947 * -250215195;
         }

         if(0 == var3.field_3945 * 1141710075) {
            var5 = var1.field_500 - 1839374135 * var3.field_3948;
         }

         int var6 = var4 + var1.field_508 * var5;
         int var7 = var2.field_508 * var3.field_3945 * 623968053 + var3.field_3946 * -876411192;

         for(int var8 = 0; var8 < 1610085864 * var3.field_3948; ++var8) {
            for(int var9 = 0; var9 < -250215195 * var3.field_3947; ++var9) {
               int var10001 = var7++;
               var2.field_502[var10001] += var1.field_502[var6++];
            }

            var6 += var1.field_508 - 1031358902 * var3.field_3947;
            var7 += var2.field_508 - -261289937 * var3.field_3947;
         }

      }
   }

   // $FF: renamed from: d (int) oh
   class_67 method_5327(int var1) {
      if(!this.field_3352.containsKey(Integer.valueOf(var1))) {
         this.method_5318(var1, -17287398);
      }

      return (class_67)this.field_3352.get(Integer.valueOf(var1));
   }

   // $FF: renamed from: s (int) oh
   class_67 method_5328(int var1) {
      if(!this.field_3352.containsKey(Integer.valueOf(var1))) {
         this.method_5318(var1, 180564756);
      }

      return (class_67)this.field_3352.get(Integer.valueOf(var1));
   }

   // $FF: renamed from: u (int) oh
   class_67 method_5329(int var1) {
      if(!this.field_3352.containsKey(Integer.valueOf(var1))) {
         this.method_5318(var1, -1898235279);
      }

      return (class_67)this.field_3352.get(Integer.valueOf(var1));
   }

   // $FF: renamed from: l () void
   public final void method_5330() {
      this.field_3355 = 0;
   }

   // $FF: renamed from: y (int) void
   public final void method_5331(int var1) {
      try {
         this.field_3355 = 0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "je.y(" + ')');
      }
   }

   // $FF: renamed from: c (int, int, oh, float) void
   public final void method_5332(int var1, int var2, class_67 var3, float var4) {
      int var5 = (int)(18.0F * var4);
      class_67 var6 = this.method_5320(var5, -216292220);
      int var7 = 1 + 2 * var5;
      class_351 var10000 = new class_351(0, 0, var3.field_508, var3.field_500);
      class_351 var8 = var10000;
      var10000 = new class_351(0, 0);
      class_351 var9 = var10000;
      this.field_3351.method_6210(var7, var7, 1487102328);
      System.nanoTime();

      int var10;
      int var11;
      int var12;
      for(var10 = 0; var10 < 686309897 * this.field_3355; ++var10) {
         var11 = this.field_3353[var10];
         var12 = this.field_3354[var10];
         int var13 = (int)((float)(var11 - var1) * var4) - var5;
         int var14 = (int)((float)var3.field_500 - var4 * (float)(var12 - var2)) - var5;
         this.field_3351.method_6209(var13, var14, 631205785);
         this.field_3351.method_6207(var8, var9, (byte)-104);
         this.method_5323(var6, var3, var9, 594501823);
      }

      System.nanoTime();
      System.nanoTime();

      for(var10 = 0; var10 < var3.field_502.length; ++var10) {
         if(0 == var3.field_502[var10]) {
            var3.field_502[var10] = -16777216;
         } else {
            var11 = (var3.field_502[var10] + 64 - 1) / 256;
            if(var11 <= 0) {
               var3.field_502[var10] = -16777216;
            } else {
               if(var11 > class_234.field_2624.length) {
                  var11 = class_234.field_2624.length;
               }

               var12 = class_234.field_2624[var11 - 1];
               var3.field_502[var10] = -16777216 | var12;
            }
         }
      }

      System.nanoTime();
   }

   // $FF: renamed from: <init> () void
   public class_296() {
      super();
      try {
         this.field_3352 = new HashMap();
         class_351 var10001 = new class_351(0, 0);
         this.field_3351 = var10001;
         this.field_3353 = new int[2048];
         this.field_3354 = new int[2048];
         this.field_3355 = 0;
         class_234.field_2624 = new int[2000];
         int var1 = 0;
         int var2 = 240;

         int var4;
         for(byte var3 = 12; var1 < 16; var2 -= var3) {
            var4 = class_233.method_4569((double)((float)var2 / 360.0F), 0.9998999834060669D, (double)(0.075F + (float)var1 * 0.425F / 16.0F));
            class_234.field_2624[var1] = var4;
            ++var1;
         }

         var2 = 48;

         for(int var7 = var2 / 6; var1 < class_234.field_2624.length; var2 -= var7) {
            var4 = 2 * var1;

            for(int var5 = class_233.method_4569((double)((float)var2 / 360.0F), 0.9998999834060669D, 0.5D); var1 < var4 && var1 < class_234.field_2624.length; ++var1) {
               class_234.field_2624[var1] = var5;
            }
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "je.<init>(" + ')');
      }
   }

   // $FF: renamed from: g (oh, oh, li) void
   void method_5334(class_67 var1, class_67 var2, class_351 var3) {
      if(0 != -233149526 * var3.field_3947 && var3.field_3948 * 1157533902 != 0) {
         int var4 = 0;
         int var5 = 0;
         if(var3.field_3946 * 310146780 == 0) {
            var4 = var1.field_508 - var3.field_3947 * -250215195;
         }

         if(0 == var3.field_3945 * -1948095553) {
            var5 = var1.field_500 - 807387112 * var3.field_3948;
         }

         int var6 = var4 + var1.field_508 * var5;
         int var7 = var2.field_508 * var3.field_3945 * 47432047 + var3.field_3946 * -1774637825;

         for(int var8 = 0; var8 < 1839374135 * var3.field_3948; ++var8) {
            for(int var9 = 0; var9 < 1549129162 * var3.field_3947; ++var9) {
               int var10001 = var7++;
               var2.field_502[var10001] += var1.field_502[var6++];
            }

            var6 += var1.field_508 - -677324931 * var3.field_3947;
            var7 += var2.field_508 - -250215195 * var3.field_3947;
         }

      }
   }

   // $FF: renamed from: a (oh, oh, li) void
   void method_5335(class_67 var1, class_67 var2, class_351 var3) {
      if(0 != -250215195 * var3.field_3947 && var3.field_3948 * 1839374135 != 0) {
         int var4 = 0;
         int var5 = 0;
         if(var3.field_3946 * -1774637825 == 0) {
            var4 = var1.field_508 - var3.field_3947 * -250215195;
         }

         if(0 == var3.field_3945 * 47432047) {
            var5 = var1.field_500 - 1839374135 * var3.field_3948;
         }

         int var6 = var4 + var1.field_508 * var5;
         int var7 = var2.field_508 * var3.field_3945 * 47432047 + var3.field_3946 * -1774637825;

         for(int var8 = 0; var8 < 1839374135 * var3.field_3948; ++var8) {
            for(int var9 = 0; var9 < -250215195 * var3.field_3947; ++var9) {
               int var10001 = var7++;
               var2.field_502[var10001] += var1.field_502[var6++];
            }

            var6 += var1.field_508 - -250215195 * var3.field_3947;
            var7 += var2.field_508 - -250215195 * var3.field_3947;
         }

      }
   }
}
