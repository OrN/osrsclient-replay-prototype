import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.Transferable;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

// $FF: renamed from: ff
public final class class_221 {

   // $FF: renamed from: s jv
   final class_306 field_2500;
   // $FF: renamed from: n boolean
   boolean field_2501;
   // $FF: renamed from: f gz
   class_231 field_2502;
   // $FF: renamed from: b op[]
   class_66[] field_2503;
   // $FF: renamed from: p java.util.HashMap
   HashMap field_2504;
   // $FF: renamed from: c int
   int field_2505;
   // $FF: renamed from: r java.util.HashMap
   HashMap field_2506;
   // $FF: renamed from: j fq[][]
   class_233[][] field_2507;
   // $FF: renamed from: o int
   int field_2508;
   // $FF: renamed from: v boolean
   boolean field_2509;
   // $FF: renamed from: y oh
   class_67 field_2510;
   // $FF: renamed from: l int
   int field_2511;
   // $FF: renamed from: u java.util.HashMap
   final HashMap field_2512;
   // $FF: renamed from: d jv
   final class_306 field_2513;
   // $FF: renamed from: e int
   int field_2514;
   // $FF: renamed from: g int
   public int field_2515;
   // $FF: renamed from: dp jp
   static class_307 field_2516;


   // $FF: renamed from: g () void
   public final void method_4237() {
      this.field_2504 = null;
   }

   // $FF: renamed from: v (jv, java.lang.String, boolean, byte) void
   public void method_4238(class_306 var1, String var2, boolean var3, byte var4) {
      try {
         if(this.field_2501) {
            if(var4 == 0) {
               throw new IllegalStateException();
            }
         } else {
            this.field_2509 = false;
            this.field_2501 = true;
            System.nanoTime();
            int var5 = var1.method_5399(class_254.field_2874.field_2873, -1103829848);
            int var6 = var1.method_5400(var5, var2, -1234442515);
            class_28 var10000 = new class_28(var1.method_5384(class_254.field_2874.field_2873, var2, -438637203));
            class_28 var7 = var10000;
            var10000 = new class_28(var1.method_5384(class_254.field_2869.field_2873, var2, -696480148));
            class_28 var8 = var10000;
            System.nanoTime();
            System.nanoTime();
            class_231 var10001 = new class_231();
            this.field_2502 = var10001;

            try {
               this.field_2502.method_4428(var7, var8, var6, var3, 1129445653);
            } catch (IllegalStateException var17) {
               return;
            }

            this.field_2502.method_4380(1494845552);
            this.field_2502.method_4381(266140389);
            this.field_2502.method_4366(-251218942);
            this.field_2511 = this.field_2502.method_4376(1057202329) * 810825536;
            this.field_2508 = this.field_2502.method_4378((byte)-44) * 2042332736;
            this.field_2505 = (this.field_2502.method_4424(-1999024779) - this.field_2502.method_4376(1057202329) + 1) * -31867200;
            this.field_2514 = (this.field_2502.method_4402(916220483) - this.field_2502.method_4378((byte)-13) + 1) * 1725863232;
            int var9 = this.field_2502.method_4424(-599457129) - this.field_2502.method_4376(1057202329) + 1;
            int var10 = this.field_2502.method_4402(-1584717972) - this.field_2502.method_4378((byte)-57) + 1;
            System.nanoTime();
            System.nanoTime();
            class_233.field_2604.method_5008();
            this.field_2507 = new class_233[var9][var10];
            Iterator var11 = this.field_2502.field_2593.iterator();

            class_233 var10002;
            class_233[] var22;
            while(var11.hasNext()) {
               if(var4 == 0) {
                  return;
               }

               class_228 var12 = (class_228)var11.next();
               int var13 = var12.field_2547 * 1253594293;
               int var14 = 174092143 * var12.field_2548;
               int var15 = var13 - this.field_2502.method_4376(1057202329);
               int var16 = var14 - this.field_2502.method_4378((byte)-115);
               var22 = this.field_2507[var15];
               var10002 = new class_233(var13, var14, this.field_2502.method_4374(897083194), this.field_2512);
               var22[var16] = var10002;
               this.field_2507[var15][var16].method_4459(var12, this.field_2502.field_2592, -1081431828);
            }

            for(int var19 = 0; var19 < var9; ++var19) {
               if(var4 == 0) {
                  return;
               }

               for(int var21 = 0; var21 < var10; ++var21) {
                  if(var4 == 0) {
                     throw new IllegalStateException();
                  }

                  if(this.field_2507[var19][var21] == null) {
                     if(var4 == 0) {
                        return;
                     }

                     var22 = this.field_2507[var19];
                     var10002 = new class_233(this.field_2502.method_4376(1057202329) + var19, this.field_2502.method_4378((byte)-49) + var21, this.field_2502.method_4374(705494109), this.field_2512);
                     var22[var21] = var10002;
                     this.field_2507[var19][var21].method_4460(this.field_2502.field_2590, this.field_2502.field_2592, -1864841845);
                  }
               }
            }

            System.nanoTime();
            System.nanoTime();
            if(var1.method_5420(class_254.field_2871.field_2873, var2, (byte)0)) {
               if(var4 == 0) {
                  throw new IllegalStateException();
               }

               byte[] var20 = var1.method_5384(class_254.field_2871.field_2873, var2, -115713332);
               this.field_2510 = class_86.method_1480(var20, (byte)64);
            }

            System.nanoTime();
            var1.method_5395((byte)2);
            var1.method_5450((byte)120);
            this.field_2509 = true;
         }
      } catch (RuntimeException var18) {
         throw class_223.method_4281(var18, "ff.v(" + ')');
      }
   }

   // $FF: renamed from: n (short) void
   public final void method_4239(short var1) {
      try {
         this.field_2504 = null;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ff.n(" + ')');
      }
   }

   // $FF: renamed from: f (int, int, int, int, int, int, int, int, int) void
   public final void method_4240(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9) {
      try {
         int[] var10 = class_65.field_490;
         int var11 = class_65.field_484;
         int var12 = class_65.field_486;
         int[] var13 = new int[4];
         class_65.method_655(var13);
         class_236 var14 = this.method_4241(var1, var2, var3, var4, (byte)-71);
         float var15 = this.method_4254(var7 - var5, var3 - var1, (byte)20);
         int var16 = (int)Math.ceil((double)var15);
         this.field_2515 = var16 * 545133851;
         if(!this.field_2506.containsKey(Integer.valueOf(var16))) {
            if(var9 == -677324931) {
               throw new IllegalStateException();
            }

            class_242 var10000 = new class_242(var16);
            class_242 var17 = var10000;
            var17.method_4678((byte)123);
            this.field_2506.put(Integer.valueOf(var16), var17);
         }

         int var25 = var14.field_2637 * 1091176811 + 1906627729 * var14.field_2633 - 1;
         int var18 = var14.field_2634 * 946840675 + var14.field_2636 * -1404335247 - 1;

         int var19;
         int var20;
         for(var19 = var14.field_2633 * 1906627729; var19 <= var25; ++var19) {
            if(var9 == -677324931) {
               return;
            }

            for(var20 = -1404335247 * var14.field_2636; var20 <= var18; ++var20) {
               if(var9 == -677324931) {
                  throw new IllegalStateException();
               }

               this.field_2507[var19][var20].method_4467(var16, (class_242)this.field_2506.get(Integer.valueOf(var16)), this.field_2503, this.field_2513, this.field_2500, -1087727229);
            }
         }

         class_65.method_656(var10, var11, var12);
         class_65.method_690(var13);
         var19 = (int)(var15 * 64.0F);
         var20 = var1 + this.field_2511 * 758122357;
         int var21 = var2 + this.field_2508 * 197299753;

         for(int var22 = 1906627729 * var14.field_2633; var22 < 1091176811 * var14.field_2637 + var14.field_2633 * 1906627729; ++var22) {
            if(var9 == -677324931) {
               throw new IllegalStateException();
            }

            for(int var23 = -1404335247 * var14.field_2636; var23 < 946840675 * var14.field_2634 + var14.field_2636 * -1404335247; ++var23) {
               if(var9 == -677324931) {
                  throw new IllegalStateException();
               }

               this.field_2507[var22][var23].method_4458(var5 + var19 * (-533628608 * this.field_2507[var22][var23].field_2607 - var20) / 64, var8 - var19 * (this.field_2507[var22][var23].field_2609 * -773876672 - var21 + 64) / 64, var19, 125158399);
            }
         }

      } catch (RuntimeException var24) {
         throw class_223.method_4281(var24, "ff.f(" + ')');
      }
   }

   // $FF: renamed from: r (int, int, int, int, byte) fu
   class_236 method_4241(int var1, int var2, int var3, int var4, byte var5) {
      try {
         class_236 var10000 = new class_236(this);
         class_236 var6 = var10000;
         int var7 = this.field_2511 * 758122357 + var1;
         int var8 = var2 + this.field_2508 * 197299753;
         int var9 = var3 + this.field_2511 * 758122357;
         int var10 = this.field_2508 * 197299753 + var4;
         int var11 = var7 / 64;
         int var12 = var8 / 64;
         int var13 = var9 / 64;
         int var14 = var10 / 64;
         var6.field_2637 = (1 + (var13 - var11)) * -1942758589;
         var6.field_2634 = 1785199947 * (1 + (var14 - var12));
         var6.field_2633 = (var11 - this.field_2502.method_4376(1057202329)) * -134124431;
         var6.field_2636 = (var12 - this.field_2502.method_4378((byte)-126)) * 1321325969;
         if(var6.field_2633 * 1906627729 < 0) {
            if(var5 >= 0) {
               throw new IllegalStateException();
            }

            var6.field_2637 += var6.field_2633 * 1692314867;
            var6.field_2633 = 0;
         }

         if(var6.field_2633 * 1906627729 > this.field_2507.length - 1091176811 * var6.field_2637) {
            if(var5 >= 0) {
               throw new IllegalStateException();
            }

            var6.field_2637 = (this.field_2507.length - 1906627729 * var6.field_2633) * -1942758589;
         }

         if(-1404335247 * var6.field_2636 < 0) {
            if(var5 >= 0) {
               throw new IllegalStateException();
            }

            var6.field_2634 += var6.field_2636 * 124225307;
            var6.field_2636 = 0;
         }

         if(var6.field_2636 * -1404335247 > this.field_2507[0].length - var6.field_2634 * 946840675) {
            if(var5 >= 0) {
               throw new IllegalStateException();
            }

            var6.field_2634 = (this.field_2507[0].length - -1404335247 * var6.field_2636) * 1785199947;
         }

         var6.field_2637 = Math.min(1091176811 * var6.field_2637, this.field_2507.length) * -1942758589;
         var6.field_2634 = Math.min(946840675 * var6.field_2634, this.field_2507[0].length) * 1785199947;
         return var6;
      } catch (RuntimeException var15) {
         throw class_223.method_4281(var15, "ff.r(" + ')');
      }
   }

   // $FF: renamed from: p (int, int, int, int, java.util.HashSet, int, int, int) void
   public void method_4242(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7, int var8) {
      try {
         if(null == this.field_2510) {
            if(var8 != -397966592) {
               throw new IllegalStateException();
            }
         } else {
            this.field_2510.method_769(var1, var2, var3, var4);
            if(var6 > 0) {
               if(var8 != -397966592) {
                  return;
               }

               if(var6 % var7 < var7 / 2) {
                  if(null == this.field_2504) {
                     if(var8 != -397966592) {
                        throw new IllegalStateException();
                     }

                     this.method_4247(582634997);
                  }

                  Iterator var9 = var5.iterator();

                  while(var9.hasNext()) {
                     if(var8 != -397966592) {
                        throw new IllegalStateException();
                     }

                     int var10 = ((Integer)var9.next()).intValue();
                     List var11 = (List)this.field_2504.get(Integer.valueOf(var10));
                     if(var11 != null) {
                        Iterator var12 = var11.iterator();

                        while(var12.hasNext()) {
                           if(var8 != -397966592) {
                              throw new IllegalStateException();
                           }

                           class_218 var13 = (class_218)var12.next();
                           int var14 = (var13.field_2482.field_3236 * -2092998769 - this.field_2511 * 758122357) * var3 / (274838579 * this.field_2505);
                           int var15 = var4 - (349527629 * var13.field_2482.field_3235 - this.field_2508 * 197299753) * var4 / (this.field_2514 * 1210430205);
                           class_65.method_677(var1 + var14, var2 + var15, 2, 16776960, 256);
                        }
                     }
                  }

                  return;
               }

               if(var8 != -397966592) {
                  return;
               }
            }

         }
      } catch (RuntimeException var16) {
         throw class_223.method_4281(var16, "ff.p(" + ')');
      }
   }

   // $FF: renamed from: ap () java.util.HashMap
   public HashMap method_4243() {
      this.method_4247(-2050160121);
      return this.field_2504;
   }

   // $FF: renamed from: j (int, int, int, int, int, int, int, int, int, int, int) java.util.List
   public List method_4244(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11) {
      try {
         LinkedList var12 = new LinkedList();
         if(!this.field_2509) {
            return var12;
         } else {
            class_236 var13 = this.method_4241(var1, var2, var3, var4, (byte)-6);
            float var14 = this.method_4254(var7, var3 - var1, (byte)20);
            int var15 = (int)(var14 * 64.0F);
            int var16 = var1 + 758122357 * this.field_2511;
            int var17 = var2 + 197299753 * this.field_2508;

            for(int var18 = 1906627729 * var13.field_2633; var18 < var13.field_2633 * 1906627729 + var13.field_2637 * 1091176811; ++var18) {
               if(var11 <= 16777215) {
                  throw new IllegalStateException();
               }

               for(int var19 = -1404335247 * var13.field_2636; var19 < var13.field_2636 * -1404335247 + var13.field_2634 * 946840675; ++var19) {
                  if(var11 <= 16777215) {
                     throw new IllegalStateException();
                  }

                  List var20 = this.field_2507[var18][var19].method_4489((this.field_2507[var18][var19].field_2607 * -533628608 - var16) * var15 / 64 + var5, var6 + var8 - (-773876672 * this.field_2507[var18][var19].field_2609 - var17 + 64) * var15 / 64, var15, var9, var10, -183202693);
                  if(!var20.isEmpty()) {
                     if(var11 <= 16777215) {
                        throw new IllegalStateException();
                     }

                     var12.addAll(var20);
                  }
               }
            }

            return var12;
         }
      } catch (RuntimeException var21) {
         throw class_223.method_4281(var21, "ff.j(" + ')');
      }
   }

   // $FF: renamed from: b (int) boolean
   public boolean method_4245(int var1) {
      try {
         return this.field_2509;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ff.b(" + ')');
      }
   }

   // $FF: renamed from: d (int) java.util.HashMap
   public HashMap method_4246(int var1) {
      try {
         this.method_4247(365934980);
         return this.field_2504;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ff.d(" + ')');
      }
   }

   // $FF: renamed from: s (int) void
   void method_4247(int var1) {
      try {
         if(this.field_2504 == null) {
            if(var1 >= 1219799062) {
               return;
            }

            this.field_2504 = new HashMap();
         }

         this.field_2504.clear();

         for(int var2 = 0; var2 < this.field_2507.length; ++var2) {
            if(var1 >= 1219799062) {
               throw new IllegalStateException();
            }

            for(int var3 = 0; var3 < this.field_2507[var2].length; ++var3) {
               if(var1 >= 1219799062) {
                  return;
               }

               List var4 = this.field_2507[var2][var3].method_4539(-983336809);
               Iterator var5 = var4.iterator();

               while(var5.hasNext()) {
                  if(var1 >= 1219799062) {
                     return;
                  }

                  class_218 var6 = (class_218)var5.next();
                  if(!var6.method_4209(2093989240)) {
                     if(var1 >= 1219799062) {
                        throw new IllegalStateException();
                     }
                  } else {
                     int var7 = var6.method_4205(2147460179);
                     if(!this.field_2504.containsKey(Integer.valueOf(var7))) {
                        if(var1 >= 1219799062) {
                           return;
                        }

                        LinkedList var8 = new LinkedList();
                        var8.add(var6);
                        this.field_2504.put(Integer.valueOf(var7), var8);
                     } else {
                        List var10 = (List)this.field_2504.get(Integer.valueOf(var7));
                        var10.add(var6);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9, "ff.s(" + ')');
      }
   }

   // $FF: renamed from: z (int, int, int, int, java.util.HashSet, int, int) void
   public void method_4248(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if(null != this.field_2510) {
         this.field_2510.method_769(var1, var2, var3, var4);
         if(var6 > 0 && var6 % var7 < var7 / 2) {
            if(null == this.field_2504) {
               this.method_4247(-793208700);
            }

            Iterator var8 = var5.iterator();

            while(var8.hasNext()) {
               int var9 = ((Integer)var8.next()).intValue();
               List var10 = (List)this.field_2504.get(Integer.valueOf(var9));
               if(var10 != null) {
                  Iterator var11 = var10.iterator();

                  while(var11.hasNext()) {
                     class_218 var12 = (class_218)var11.next();
                     int var13 = (var12.field_2482.field_3236 * -2092998769 - this.field_2511 * 758122357) * var3 / (274838579 * this.field_2505);
                     int var14 = var4 - (349527629 * var12.field_2482.field_3235 - this.field_2508 * 197299753) * var4 / (this.field_2514 * 1210430205);
                     class_65.method_677(var1 + var13, var2 + var14, 2, 16776960, 256);
                  }
               }
            }

         }
      }
   }

   // $FF: renamed from: l (jv, java.lang.String, boolean) void
   public void method_4249(class_306 var1, String var2, boolean var3) {
      if(!this.field_2501) {
         this.field_2509 = false;
         this.field_2501 = true;
         System.nanoTime();
         int var4 = var1.method_5399(class_254.field_2874.field_2873, -817001760);
         int var5 = var1.method_5400(var4, var2, -484818046);
         class_28 var10000 = new class_28(var1.method_5384(class_254.field_2874.field_2873, var2, -953770850));
         class_28 var6 = var10000;
         var10000 = new class_28(var1.method_5384(class_254.field_2869.field_2873, var2, 241463841));
         class_28 var7 = var10000;
         System.nanoTime();
         System.nanoTime();
         class_231 var10001 = new class_231();
         this.field_2502 = var10001;

         try {
            this.field_2502.method_4428(var6, var7, var5, var3, 1257066399);
         } catch (IllegalStateException var16) {
            return;
         }

         this.field_2502.method_4380(1531278993);
         this.field_2502.method_4381(553996304);
         this.field_2502.method_4366(-1085758755);
         this.field_2511 = this.field_2502.method_4376(1057202329) * 810825536;
         this.field_2508 = this.field_2502.method_4378((byte)-16) * 2042332736;
         this.field_2505 = (this.field_2502.method_4424(555784175) - this.field_2502.method_4376(1057202329) + 1) * -31867200;
         this.field_2514 = (this.field_2502.method_4402(370510533) - this.field_2502.method_4378((byte)-86) + 1) * 1725863232;
         int var8 = this.field_2502.method_4424(-133042283) - this.field_2502.method_4376(1057202329) + 1;
         int var9 = this.field_2502.method_4402(-2086747212) - this.field_2502.method_4378((byte)-101) + 1;
         System.nanoTime();
         System.nanoTime();
         class_233.field_2604.method_5008();
         this.field_2507 = new class_233[var8][var9];
         Iterator var10 = this.field_2502.field_2593.iterator();

         class_233 var10002;
         class_233[] var20;
         while(var10.hasNext()) {
            class_228 var11 = (class_228)var10.next();
            int var12 = var11.field_2547 * 1253594293;
            int var13 = 174092143 * var11.field_2548;
            int var14 = var12 - this.field_2502.method_4376(1057202329);
            int var15 = var13 - this.field_2502.method_4378((byte)-82);
            var20 = this.field_2507[var14];
            var10002 = new class_233(var12, var13, this.field_2502.method_4374(508426374), this.field_2512);
            var20[var15] = var10002;
            this.field_2507[var14][var15].method_4459(var11, this.field_2502.field_2592, -1081431828);
         }

         for(int var17 = 0; var17 < var8; ++var17) {
            for(int var19 = 0; var19 < var9; ++var19) {
               if(this.field_2507[var17][var19] == null) {
                  var20 = this.field_2507[var17];
                  var10002 = new class_233(this.field_2502.method_4376(1057202329) + var17, this.field_2502.method_4378((byte)-86) + var19, this.field_2502.method_4374(-478030224), this.field_2512);
                  var20[var19] = var10002;
                  this.field_2507[var17][var19].method_4460(this.field_2502.field_2590, this.field_2502.field_2592, 3672672);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if(var1.method_5420(class_254.field_2871.field_2873, var2, (byte)0)) {
            byte[] var18 = var1.method_5384(class_254.field_2871.field_2873, var2, -371372716);
            this.field_2510 = class_86.method_1480(var18, (byte)7);
         }

         System.nanoTime();
         var1.method_5395((byte)2);
         var1.method_5450((byte)106);
         this.field_2509 = true;
      }
   }

   // $FF: renamed from: i () boolean
   public boolean method_4250() {
      return this.field_2509;
   }

   // $FF: renamed from: q (int, int, int, int) fu
   class_236 method_4251(int var1, int var2, int var3, int var4) {
      class_236 var10000 = new class_236(this);
      class_236 var5 = var10000;
      int var6 = this.field_2511 * 758122357 + var1;
      int var7 = var2 + this.field_2508 * 197299753;
      int var8 = var3 + this.field_2511 * 747227289;
      int var9 = this.field_2508 * 527468487 + var4;
      int var10 = var6 / 1375484848;
      int var11 = var7 / -2058532147;
      int var12 = var8 / -1465159787;
      int var13 = var9 / 294260991;
      var5.field_2637 = (1 + (var12 - var10)) * -780253878;
      var5.field_2634 = 1785199947 * (1 + (var13 - var11));
      var5.field_2633 = (var10 - this.field_2502.method_4376(1057202329)) * -134124431;
      var5.field_2636 = (var11 - this.field_2502.method_4378((byte)-83)) * 1321325969;
      if(var5.field_2633 * -1136111273 < 0) {
         var5.field_2637 += var5.field_2633 * 1692314867;
         var5.field_2633 = 0;
      }

      if(var5.field_2633 * 1906627729 > this.field_2507.length - 1091176811 * var5.field_2637) {
         var5.field_2637 = (this.field_2507.length - 493966345 * var5.field_2633) * -1942758589;
      }

      if(-1404335247 * var5.field_2636 < 0) {
         var5.field_2634 += var5.field_2636 * 124225307;
         var5.field_2636 = 0;
      }

      if(var5.field_2636 * 640444439 > this.field_2507[0].length - var5.field_2634 * 2042716047) {
         var5.field_2634 = (this.field_2507[0].length - 2010650900 * var5.field_2636) * 1785199947;
      }

      var5.field_2637 = Math.min(379158902 * var5.field_2637, this.field_2507.length) * -1942758589;
      var5.field_2634 = Math.min(-375484457 * var5.field_2634, this.field_2507[0].length) * 1785199947;
      return var5;
   }

   // $FF: renamed from: e () void
   public final void method_4252() {
      this.field_2504 = null;
   }

   // $FF: renamed from: y (int, int, int, int, int, int, int, int, java.util.HashSet, java.util.HashSet, int, int, boolean, int) void
   public final void method_4253(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13, int var14) {
      try {
         class_236 var15 = this.method_4241(var1, var2, var3, var4, (byte)-82);
         float var16 = this.method_4254(var7 - var5, var3 - var1, (byte)20);
         int var17 = (int)(var16 * 64.0F);
         int var18 = 758122357 * this.field_2511 + var1;
         int var19 = var2 + 197299753 * this.field_2508;

         int var20;
         int var21;
         for(var20 = 1906627729 * var15.field_2633; var20 < var15.field_2633 * 1906627729 + var15.field_2637 * 1091176811; ++var20) {
            if(var14 != -1554077956) {
               throw new IllegalStateException();
            }

            for(var21 = var15.field_2636 * -1404335247; var21 < 946840675 * var15.field_2634 + -1404335247 * var15.field_2636; ++var21) {
               if(var13) {
                  if(var14 != -1554077956) {
                     throw new IllegalStateException();
                  }

                  this.field_2507[var20][var21].method_4463((short)16083);
               }

               this.field_2507[var20][var21].method_4483(var17 * (-533628608 * this.field_2507[var20][var21].field_2607 - var18) / 64 + var5, var8 - (this.field_2507[var20][var21].field_2609 * -773876672 - var19 + 64) * var17 / 64, var17, var9, 1432505674);
            }
         }

         if(var10 != null && var11 > 0) {
            if(var14 != -1554077956) {
               return;
            }

            for(var20 = 1906627729 * var15.field_2633; var20 < var15.field_2637 * 1091176811 + var15.field_2633 * 1906627729; ++var20) {
               if(var14 != -1554077956) {
                  return;
               }

               for(var21 = var15.field_2636 * -1404335247; var21 < 946840675 * var15.field_2634 + -1404335247 * var15.field_2636; ++var21) {
                  if(var14 != -1554077956) {
                     return;
                  }

                  this.field_2507[var20][var21].method_4469(var10, var11, var12, 685193317);
               }
            }
         }

      } catch (RuntimeException var22) {
         throw class_223.method_4281(var22, "ff.y(" + ')');
      }
   }

   // $FF: renamed from: u (int, int, byte) float
   float method_4254(int var1, int var2, byte var3) {
      try {
         float var4 = (float)var1 / (float)var2;
         if(var4 > 8.0F) {
            if(var3 != 20) {
               throw new IllegalStateException();
            } else {
               return 8.0F;
            }
         } else if(var4 < 1.0F) {
            if(var3 != 20) {
               throw new IllegalStateException();
            } else {
               return 1.0F;
            }
         } else {
            int var5 = Math.round(var4);
            if(Math.abs((float)var5 - var4) < 0.05F) {
               if(var3 != 20) {
                  throw new IllegalStateException();
               } else {
                  return (float)var5;
               }
            } else {
               return var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "ff.u(" + ')');
      }
   }

   // $FF: renamed from: k (int, int, int, int, int, int, int, int) void
   public final void method_4255(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = class_65.field_490;
      int var10 = class_65.field_484;
      int var11 = class_65.field_486;
      int[] var12 = new int[4];
      class_65.method_655(var12);
      class_236 var13 = this.method_4241(var1, var2, var3, var4, (byte)-112);
      float var14 = this.method_4254(var7 - var5, var3 - var1, (byte)20);
      int var15 = (int)Math.ceil((double)var14);
      this.field_2515 = var15 * 545133851;
      if(!this.field_2506.containsKey(Integer.valueOf(var15))) {
         class_242 var10000 = new class_242(var15);
         class_242 var16 = var10000;
         var16.method_4678((byte)13);
         this.field_2506.put(Integer.valueOf(var15), var16);
      }

      int var23 = var13.field_2637 * 1109738944 + 1512695473 * var13.field_2633 - 1;
      int var17 = var13.field_2634 * 241503091 + var13.field_2636 * -1404335247 - 1;

      int var18;
      int var19;
      for(var18 = var13.field_2633 * 1906627729; var18 <= var23; ++var18) {
         for(var19 = 1357447846 * var13.field_2636; var19 <= var17; ++var19) {
            this.field_2507[var18][var19].method_4467(var15, (class_242)this.field_2506.get(Integer.valueOf(var15)), this.field_2503, this.field_2513, this.field_2500, -1087727229);
         }
      }

      class_65.method_656(var9, var10, var11);
      class_65.method_690(var12);
      var18 = (int)(var14 * 64.0F);
      var19 = var1 + this.field_2511 * 758122357;
      int var20 = var2 + this.field_2508 * 197299753;

      for(int var21 = -1474833537 * var13.field_2633; var21 < 1091176811 * var13.field_2637 + var13.field_2633 * 1906627729; ++var21) {
         for(int var22 = -1404335247 * var13.field_2636; var22 < 647581658 * var13.field_2634 + var13.field_2636 * -1404335247; ++var22) {
            this.field_2507[var21][var22].method_4458(var5 + var18 * (60131409 * this.field_2507[var21][var22].field_2607 - var19) / -549100383, var8 - var18 * (this.field_2507[var21][var22].field_2609 * -773876672 - var20 + 64) / 64, var18, -1763898372);
         }
      }

   }

   // $FF: renamed from: m (int, int, int, int, int, int, int, int) void
   public final void method_4256(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      int[] var9 = class_65.field_490;
      int var10 = class_65.field_484;
      int var11 = class_65.field_486;
      int[] var12 = new int[4];
      class_65.method_655(var12);
      class_236 var13 = this.method_4241(var1, var2, var3, var4, (byte)-23);
      float var14 = this.method_4254(var7 - var5, var3 - var1, (byte)20);
      int var15 = (int)Math.ceil((double)var14);
      this.field_2515 = var15 * 410177791;
      if(!this.field_2506.containsKey(Integer.valueOf(var15))) {
         class_242 var10000 = new class_242(var15);
         class_242 var16 = var10000;
         var16.method_4678((byte)103);
         this.field_2506.put(Integer.valueOf(var15), var16);
      }

      int var23 = var13.field_2637 * 1091176811 + 1906627729 * var13.field_2633 - 1;
      int var17 = var13.field_2634 * -750027730 + var13.field_2636 * -1404335247 - 1;

      int var18;
      int var19;
      for(var18 = var13.field_2633 * 1906627729; var18 <= var23; ++var18) {
         for(var19 = -1404335247 * var13.field_2636; var19 <= var17; ++var19) {
            this.field_2507[var18][var19].method_4467(var15, (class_242)this.field_2506.get(Integer.valueOf(var15)), this.field_2503, this.field_2513, this.field_2500, -1087727229);
         }
      }

      class_65.method_656(var9, var10, var11);
      class_65.method_690(var12);
      var18 = (int)(var14 * 64.0F);
      var19 = var1 + this.field_2511 * 1051506884;
      int var20 = var2 + this.field_2508 * 197299753;

      for(int var21 = 1906627729 * var13.field_2633; var21 < 1091176811 * var13.field_2637 + var13.field_2633 * 319137739; ++var21) {
         for(int var22 = 162367286 * var13.field_2636; var22 < 946840675 * var13.field_2634 + var13.field_2636 * 7563193; ++var22) {
            this.field_2507[var21][var22].method_4458(var5 + var18 * (986251823 * this.field_2507[var21][var22].field_2607 - var19) / 64, var8 - var18 * (this.field_2507[var21][var22].field_2609 * -1016632603 - var20 + 939355060) / 64, var18, 933887268);
         }
      }

   }

   // $FF: renamed from: x (int, int, int, int, int, int, int, int, java.util.HashSet, java.util.HashSet, int, int, boolean) void
   public final void method_4257(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, HashSet var9, HashSet var10, int var11, int var12, boolean var13) {
      class_236 var14 = this.method_4241(var1, var2, var3, var4, (byte)-65);
      float var15 = this.method_4254(var7 - var5, var3 - var1, (byte)20);
      int var16 = (int)(var15 * 64.0F);
      int var17 = 758122357 * this.field_2511 + var1;
      int var18 = var2 + 197299753 * this.field_2508;

      int var19;
      int var20;
      for(var19 = -1469712855 * var14.field_2633; var19 < var14.field_2633 * 650674216 + var14.field_2637 * 1091176811; ++var19) {
         for(var20 = var14.field_2636 * 980653743; var20 < 946840675 * var14.field_2634 + -1833621582 * var14.field_2636; ++var20) {
            if(var13) {
               this.field_2507[var19][var20].method_4463((short)8407);
            }

            this.field_2507[var19][var20].method_4483(var16 * (45752107 * this.field_2507[var19][var20].field_2607 - var17) / 64 + var5, var8 - (this.field_2507[var19][var20].field_2609 * -773876672 - var18 + -1900124249) * var16 / 64, var16, var9, 1118864530);
         }
      }

      if(var10 != null && var11 > 0) {
         for(var19 = 1906627729 * var14.field_2633; var19 < var14.field_2637 * 1091176811 + var14.field_2633 * 1906627729; ++var19) {
            for(var20 = var14.field_2636 * -1404335247; var20 < 946840675 * var14.field_2634 + -1404335247 * var14.field_2636; ++var20) {
               this.field_2507[var19][var20].method_4469(var10, var11, var12, 685193317);
            }
         }
      }

   }

   // $FF: renamed from: a () void
   public final void method_4258() {
      this.field_2504 = null;
   }

   // $FF: renamed from: w (int, int, int, int, java.util.HashSet, int, int) void
   public void method_4259(int var1, int var2, int var3, int var4, HashSet var5, int var6, int var7) {
      if(null != this.field_2510) {
         this.field_2510.method_769(var1, var2, var3, var4);
         if(var6 > 0 && var6 % var7 < var7 / 2) {
            if(null == this.field_2504) {
               this.method_4247(755140836);
            }

            Iterator var8 = var5.iterator();

            while(var8.hasNext()) {
               int var9 = ((Integer)var8.next()).intValue();
               List var10 = (List)this.field_2504.get(Integer.valueOf(var9));
               if(var10 != null) {
                  Iterator var11 = var10.iterator();

                  while(var11.hasNext()) {
                     class_218 var12 = (class_218)var11.next();
                     int var13 = (var12.field_2482.field_3236 * 288100681 - this.field_2511 * -2036247389) * var3 / (-255296458 * this.field_2505);
                     int var14 = var4 - (1908404696 * var12.field_2482.field_3235 - this.field_2508 * 534338023) * var4 / (this.field_2514 * 1882013113);
                     class_65.method_677(var1 + var13, var2 + var14, 2, -868336896, 1699137405);
                  }
               }
            }

         }
      }
   }

   // $FF: renamed from: t (int, int, int, int, int, int, int, int, int, int) java.util.List
   public List method_4260(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10) {
      LinkedList var11 = new LinkedList();
      if(!this.field_2509) {
         return var11;
      } else {
         class_236 var12 = this.method_4241(var1, var2, var3, var4, (byte)-126);
         float var13 = this.method_4254(var7, var3 - var1, (byte)20);
         int var14 = (int)(var13 * 64.0F);
         int var15 = var1 + 758122357 * this.field_2511;
         int var16 = var2 + 197299753 * this.field_2508;

         for(int var17 = 1906627729 * var12.field_2633; var17 < var12.field_2633 * 1906627729 + var12.field_2637 * 1091176811; ++var17) {
            for(int var18 = -1404335247 * var12.field_2636; var18 < var12.field_2636 * -1404335247 + var12.field_2634 * 946840675; ++var18) {
               List var19 = this.field_2507[var17][var18].method_4489((this.field_2507[var17][var18].field_2607 * -533628608 - var15) * var14 / 64 + var5, var6 + var8 - (-773876672 * this.field_2507[var17][var18].field_2609 - var16 + 64) * var14 / 64, var14, var9, var10, 100011899);
               if(!var19.isEmpty()) {
                  var11.addAll(var19);
               }
            }
         }

         return var11;
      }
   }

   // $FF: renamed from: h (int, int, int, int) fu
   class_236 method_4261(int var1, int var2, int var3, int var4) {
      class_236 var10000 = new class_236(this);
      class_236 var5 = var10000;
      int var6 = this.field_2511 * 621200992 + var1;
      int var7 = var2 + this.field_2508 * 197299753;
      int var8 = var3 + this.field_2511 * 1217772986;
      int var9 = this.field_2508 * 197299753 + var4;
      int var10 = var6 / 64;
      int var11 = var7 / 64;
      int var12 = var8 / -1627428626;
      int var13 = var9 / 64;
      var5.field_2637 = (1 + (var12 - var10)) * -1942758589;
      var5.field_2634 = 1024641108 * (1 + (var13 - var11));
      var5.field_2633 = (var10 - this.field_2502.method_4376(1057202329)) * -1956143082;
      var5.field_2636 = (var11 - this.field_2502.method_4378((byte)-78)) * 1321325969;
      if(var5.field_2633 * -782226782 < 0) {
         var5.field_2637 += var5.field_2633 * 2019779609;
         var5.field_2633 = 0;
      }

      if(var5.field_2633 * -1834648338 > this.field_2507.length - 1917571077 * var5.field_2637) {
         var5.field_2637 = (this.field_2507.length - -959500645 * var5.field_2633) * -1942758589;
      }

      if(-1404335247 * var5.field_2636 < 0) {
         var5.field_2634 += var5.field_2636 * 1283784340;
         var5.field_2636 = 0;
      }

      if(var5.field_2636 * 983744919 > this.field_2507[0].length - var5.field_2634 * 946840675) {
         var5.field_2634 = (this.field_2507[0].length - 480080798 * var5.field_2636) * 236610106;
      }

      var5.field_2637 = Math.min(1091176811 * var5.field_2637, this.field_2507.length) * 1442161026;
      var5.field_2634 = Math.min(946840675 * var5.field_2634, this.field_2507[0].length) * 1785199947;
      return var5;
   }

   // $FF: renamed from: ae () boolean
   public boolean method_4262() {
      return this.field_2509;
   }

   // $FF: renamed from: ad () void
   void method_4263() {
      if(this.field_2504 == null) {
         this.field_2504 = new HashMap();
      }

      this.field_2504.clear();

      for(int var1 = 0; var1 < this.field_2507.length; ++var1) {
         for(int var2 = 0; var2 < this.field_2507[var1].length; ++var2) {
            List var3 = this.field_2507[var1][var2].method_4539(1497746675);
            Iterator var4 = var3.iterator();

            while(var4.hasNext()) {
               class_218 var5 = (class_218)var4.next();
               if(var5.method_4209(-92677166)) {
                  int var6 = var5.method_4205(2146724285);
                  if(!this.field_2504.containsKey(Integer.valueOf(var6))) {
                     LinkedList var7 = new LinkedList();
                     var7.add(var5);
                     this.field_2504.put(Integer.valueOf(var6), var7);
                  } else {
                     List var8 = (List)this.field_2504.get(Integer.valueOf(var6));
                     var8.add(var5);
                  }
               }
            }
         }
      }

   }

   // $FF: renamed from: o (jv, java.lang.String, boolean) void
   public void method_4264(class_306 var1, String var2, boolean var3) {
      if(!this.field_2501) {
         this.field_2509 = false;
         this.field_2501 = true;
         System.nanoTime();
         int var4 = var1.method_5399(class_254.field_2874.field_2873, -316455879);
         int var5 = var1.method_5400(var4, var2, 943290661);
         class_28 var10000 = new class_28(var1.method_5384(class_254.field_2874.field_2873, var2, -1093632981));
         class_28 var6 = var10000;
         var10000 = new class_28(var1.method_5384(class_254.field_2869.field_2873, var2, -1017412788));
         class_28 var7 = var10000;
         System.nanoTime();
         System.nanoTime();
         class_231 var10001 = new class_231();
         this.field_2502 = var10001;

         try {
            this.field_2502.method_4428(var6, var7, var5, var3, 1184231408);
         } catch (IllegalStateException var16) {
            return;
         }

         this.field_2502.method_4380(1436711024);
         this.field_2502.method_4381(1859650989);
         this.field_2502.method_4366(-1148621824);
         this.field_2511 = this.field_2502.method_4376(1057202329) * 810825536;
         this.field_2508 = this.field_2502.method_4378((byte)-32) * 2042332736;
         this.field_2505 = (this.field_2502.method_4424(888310846) - this.field_2502.method_4376(1057202329) + 1) * -31867200;
         this.field_2514 = (this.field_2502.method_4402(-768331926) - this.field_2502.method_4378((byte)-5) + 1) * 1725863232;
         int var8 = this.field_2502.method_4424(23904820) - this.field_2502.method_4376(1057202329) + 1;
         int var9 = this.field_2502.method_4402(-574299403) - this.field_2502.method_4378((byte)-116) + 1;
         System.nanoTime();
         System.nanoTime();
         class_233.field_2604.method_5008();
         this.field_2507 = new class_233[var8][var9];
         Iterator var10 = this.field_2502.field_2593.iterator();

         class_233 var10002;
         class_233[] var20;
         while(var10.hasNext()) {
            class_228 var11 = (class_228)var10.next();
            int var12 = var11.field_2547 * 1253594293;
            int var13 = 174092143 * var11.field_2548;
            int var14 = var12 - this.field_2502.method_4376(1057202329);
            int var15 = var13 - this.field_2502.method_4378((byte)-104);
            var20 = this.field_2507[var14];
            var10002 = new class_233(var12, var13, this.field_2502.method_4374(-1646270210), this.field_2512);
            var20[var15] = var10002;
            this.field_2507[var14][var15].method_4459(var11, this.field_2502.field_2592, -1081431828);
         }

         for(int var17 = 0; var17 < var8; ++var17) {
            for(int var19 = 0; var19 < var9; ++var19) {
               if(this.field_2507[var17][var19] == null) {
                  var20 = this.field_2507[var17];
                  var10002 = new class_233(this.field_2502.method_4376(1057202329) + var17, this.field_2502.method_4378((byte)-4) + var19, this.field_2502.method_4374(-2116038412), this.field_2512);
                  var20[var19] = var10002;
                  this.field_2507[var17][var19].method_4460(this.field_2502.field_2590, this.field_2502.field_2592, 469971373);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if(var1.method_5420(class_254.field_2871.field_2873, var2, (byte)0)) {
            byte[] var18 = var1.method_5384(class_254.field_2871.field_2873, var2, -2098077985);
            this.field_2510 = class_86.method_1480(var18, (byte)100);
         }

         System.nanoTime();
         var1.method_5395((byte)2);
         var1.method_5450((byte)72);
         this.field_2509 = true;
      }
   }

   // $FF: renamed from: c (jv, java.lang.String, boolean) void
   public void method_4265(class_306 var1, String var2, boolean var3) {
      if(!this.field_2501) {
         this.field_2509 = false;
         this.field_2501 = true;
         System.nanoTime();
         int var4 = var1.method_5399(class_254.field_2874.field_2873, -1061591117);
         int var5 = var1.method_5400(var4, var2, -510590976);
         class_28 var10000 = new class_28(var1.method_5384(class_254.field_2874.field_2873, var2, -1274781898));
         class_28 var6 = var10000;
         var10000 = new class_28(var1.method_5384(class_254.field_2869.field_2873, var2, 188226648));
         class_28 var7 = var10000;
         System.nanoTime();
         System.nanoTime();
         class_231 var10001 = new class_231();
         this.field_2502 = var10001;

         try {
            this.field_2502.method_4428(var6, var7, var5, var3, -252091495);
         } catch (IllegalStateException var16) {
            return;
         }

         this.field_2502.method_4380(1610732952);
         this.field_2502.method_4381(-1771889400);
         this.field_2502.method_4366(-1404998336);
         this.field_2511 = this.field_2502.method_4376(1057202329) * 1693200959;
         this.field_2508 = this.field_2502.method_4378((byte)-115) * 629118582;
         this.field_2505 = (this.field_2502.method_4424(-309406320) - this.field_2502.method_4376(1057202329) + 1) * 2134394157;
         this.field_2514 = (this.field_2502.method_4402(-1394748336) - this.field_2502.method_4378((byte)-28) + 1) * 1725863232;
         int var8 = this.field_2502.method_4424(-1191155007) - this.field_2502.method_4376(1057202329) + 1;
         int var9 = this.field_2502.method_4402(1819571585) - this.field_2502.method_4378((byte)-128) + 1;
         System.nanoTime();
         System.nanoTime();
         class_233.field_2604.method_5008();
         this.field_2507 = new class_233[var8][var9];
         Iterator var10 = this.field_2502.field_2593.iterator();

         class_233 var10002;
         class_233[] var20;
         while(var10.hasNext()) {
            class_228 var11 = (class_228)var10.next();
            int var12 = var11.field_2547 * -18732758;
            int var13 = 174092143 * var11.field_2548;
            int var14 = var12 - this.field_2502.method_4376(1057202329);
            int var15 = var13 - this.field_2502.method_4378((byte)-17);
            var20 = this.field_2507[var14];
            var10002 = new class_233(var12, var13, this.field_2502.method_4374(182052305), this.field_2512);
            var20[var15] = var10002;
            this.field_2507[var14][var15].method_4459(var11, this.field_2502.field_2592, -1081431828);
         }

         for(int var17 = 0; var17 < var8; ++var17) {
            for(int var19 = 0; var19 < var9; ++var19) {
               if(this.field_2507[var17][var19] == null) {
                  var20 = this.field_2507[var17];
                  var10002 = new class_233(this.field_2502.method_4376(1057202329) + var17, this.field_2502.method_4378((byte)-69) + var19, this.field_2502.method_4374(-1696939924), this.field_2512);
                  var20[var19] = var10002;
                  this.field_2507[var17][var19].method_4460(this.field_2502.field_2590, this.field_2502.field_2592, 498636166);
               }
            }
         }

         System.nanoTime();
         System.nanoTime();
         if(var1.method_5420(class_254.field_2871.field_2873, var2, (byte)0)) {
            byte[] var18 = var1.method_5384(class_254.field_2871.field_2873, var2, 993607425);
            this.field_2510 = class_86.method_1480(var18, (byte)13);
         }

         System.nanoTime();
         var1.method_5395((byte)2);
         var1.method_5450((byte)63);
         this.field_2509 = true;
      }
   }

   // $FF: renamed from: ab () java.util.HashMap
   public HashMap method_4266() {
      this.method_4247(679037735);
      return this.field_2504;
   }

   // $FF: renamed from: al () java.util.HashMap
   public HashMap method_4267() {
      this.method_4247(-1360960934);
      return this.field_2504;
   }

   // $FF: renamed from: <init> (op[], java.util.HashMap, jv, jv) void
   public class_221(class_66[] var1, HashMap var2, class_306 var3, class_306 var4) {
      super();
      try {
         this.field_2509 = false;
         this.field_2501 = false;
         this.field_2506 = new HashMap();
         this.field_2515 = 0;
         this.field_2503 = var1;
         this.field_2512 = var2;
         this.field_2513 = var3;
         this.field_2500 = var4;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "ff.<init>(" + ')');
      }
   }

   // $FF: renamed from: ai (int, int) float
   float method_4269(int var1, int var2) {
      float var3 = (float)var1 / (float)var2;
      if(var3 > 8.0F) {
         return 8.0F;
      } else if(var3 < 1.0F) {
         return 1.0F;
      } else {
         int var4 = Math.round(var3);
         return Math.abs((float)var4 - var3) < 0.05F?(float)var4:var3;
      }
   }

   // $FF: renamed from: s (java.lang.String, byte) void
   static final void method_4270(String var0, byte var1) {
      try {
         StringBuilder var10000 = (new StringBuilder()).append(var0);
         class_305 var10001 = (class_305)null;
         String var2 = var10000.append(class_305.field_3505).toString();
         class_149.method_3135(30, "", var2, -1399523869);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "ff.s(" + ')');
      }
   }

   // $FF: renamed from: jv (io[], int, int, int, int, int, int, int, int) void
   static final void method_4271(class_37[] var0, int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8) {
      try {
         for(int var9 = 0; var9 < var0.length; ++var9) {
            if(var8 != 1695957245) {
               throw new IllegalStateException();
            }

            class_37 var10 = var0[var9];
            if(null == var10) {
               if(var8 != 1695957245) {
                  return;
               }
            } else if(var10.field_152 * -1338646279 != var1) {
               if(var8 != 1695957245) {
                  throw new IllegalStateException();
               }
            } else {
               if(var10.field_100 && var10.field_103 * 1659206769 != 0) {
                  if(var8 != 1695957245) {
                     return;
                  }

                  if(!var10.field_187) {
                     if(var8 != 1695957245) {
                        return;
                     }

                     if(class_112.method_2236(var10, 2134922571) == 0) {
                        if(var8 != 1695957245) {
                           return;
                        }

                        if(var10 != client.field_1591) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(1338 != -1245218361 * var10.field_207) {
                              if(var8 != 1695957245) {
                                 return;
                              }
                              continue;
                           }
                        }
                     }
                  }
               }

               if(var10.field_100) {
                  if(var8 != 1695957245) {
                     throw new IllegalStateException();
                  }

                  if(class_76.method_1197(var10, 2130552221)) {
                     continue;
                  }
               } else if(1659206769 * var10.field_103 == 0) {
                  if(var8 != 1695957245) {
                     throw new IllegalStateException();
                  }

                  if(var10 != class_149.field_1893) {
                     if(var8 != 1695957245) {
                        return;
                     }

                     if(class_76.method_1197(var10, 2130552221)) {
                        continue;
                     }
                  }
               }

               int var11 = var6 + 1347538309 * var10.field_114;
               int var12 = var7 + var10.field_115 * -2036682047;
               int var13;
               int var14;
               int var15;
               int var16;
               int var18;
               int var19;
               if(var10.field_103 * 1659206769 == 2) {
                  if(var8 != 1695957245) {
                     return;
                  }

                  var13 = var2;
                  var14 = var3;
                  var15 = var4;
                  var16 = var5;
               } else {
                  int var10000;
                  int var17;
                  if(1659206769 * var10.field_103 == 9) {
                     if(var8 != 1695957245) {
                        return;
                     }

                     var17 = var11;
                     var18 = var12;
                     var19 = var11 + 1163271639 * var10.field_104;
                     int var20 = var12 + var10.field_117 * -571887853;
                     if(var19 < var11) {
                        var17 = var19;
                        var19 = var11;
                     }

                     if(var20 < var12) {
                        if(var8 != 1695957245) {
                           return;
                        }

                        var18 = var20;
                        var20 = var12;
                     }

                     ++var19;
                     ++var20;
                     if(var17 > var2) {
                        if(var8 != 1695957245) {
                           throw new IllegalStateException();
                        }

                        var10000 = var17;
                     } else {
                        var10000 = var2;
                     }

                     var13 = var10000;
                     if(var18 > var3) {
                        if(var8 != 1695957245) {
                           throw new IllegalStateException();
                        }

                        var10000 = var18;
                     } else {
                        var10000 = var3;
                     }

                     var14 = var10000;
                     if(var19 < var4) {
                        if(var8 != 1695957245) {
                           throw new IllegalStateException();
                        }

                        var10000 = var19;
                     } else {
                        var10000 = var4;
                     }

                     var15 = var10000;
                     if(var20 < var5) {
                        if(var8 != 1695957245) {
                           return;
                        }

                        var10000 = var20;
                     } else {
                        var10000 = var5;
                     }

                     var16 = var10000;
                  } else {
                     var17 = var11 + 1163271639 * var10.field_104;
                     var18 = var12 + var10.field_117 * -571887853;
                     if(var11 > var2) {
                        if(var8 != 1695957245) {
                           return;
                        }

                        var10000 = var11;
                     } else {
                        var10000 = var2;
                     }

                     var13 = var10000;
                     if(var12 > var3) {
                        if(var8 != 1695957245) {
                           throw new IllegalStateException();
                        }

                        var10000 = var12;
                     } else {
                        var10000 = var3;
                     }

                     var14 = var10000;
                     if(var17 < var4) {
                        if(var8 != 1695957245) {
                           return;
                        }

                        var10000 = var17;
                     } else {
                        var10000 = var4;
                     }

                     var15 = var10000;
                     if(var18 < var5) {
                        if(var8 != 1695957245) {
                           throw new IllegalStateException();
                        }

                        var10000 = var18;
                     } else {
                        var10000 = var5;
                     }

                     var16 = var10000;
                  }
               }

               if(var10 == client.field_1590) {
                  if(var8 != 1695957245) {
                     throw new IllegalStateException();
                  }

                  client.field_1598 = true;
                  client.field_1630 = var11 * -1494694337;
                  client.field_1580 = 24188671 * var12;
               }

               boolean var28 = false;
               if(var10.field_175) {
                  if(var8 != 1695957245) {
                     throw new IllegalStateException();
                  }

                  switch(-907665653 * client.field_1579) {
                  case 0:
                     var28 = true;
                  case 1:
                  default:
                     break;
                  case 2:
                     if(-1722455647 * var10.field_101 >>> 16 == client.field_1581 * 1274187443) {
                        if(var8 != 1695957245) {
                           return;
                        }

                        var28 = true;
                     }
                     break;
                  case 3:
                     if(var10.field_101 * -1722455647 == 1274187443 * client.field_1581) {
                        if(var8 != 1695957245) {
                           throw new IllegalStateException();
                        }

                        var28 = true;
                     }
                  }
               }

               if(!var28) {
                  if(var8 != 1695957245) {
                     return;
                  }

                  if(var10.field_100) {
                     if(var8 != 1695957245) {
                        throw new IllegalStateException();
                     }

                     if(var13 >= var15) {
                        continue;
                     }

                     if(var8 != 1695957245) {
                        throw new IllegalStateException();
                     }

                     if(var14 >= var16) {
                        if(var8 != 1695957245) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }
                  }
               }

               if(var10.field_100) {
                  class_45 var29;
                  if(var10.field_243) {
                     if(var8 != 1695957245) {
                        throw new IllegalStateException();
                     }

                     if(-678881683 * class_131.field_1722 >= var13 && class_131.field_1703 * 1903378733 >= var14) {
                        if(var8 != 1695957245) {
                           throw new IllegalStateException();
                        }

                        if(-678881683 * class_131.field_1722 < var15) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(1903378733 * class_131.field_1703 < var16) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              for(var29 = (class_45)client.field_1576.method_5944(); null != var29; var29 = (class_45)client.field_1576.method_5972()) {
                                 if(var8 != 1695957245) {
                                    return;
                                 }

                                 if(var29.field_331) {
                                    if(var8 != 1695957245) {
                                       throw new IllegalStateException();
                                    }

                                    var29.method_108();
                                    var29.field_332.field_234 = false;
                                 }
                              }

                              if(class_98.field_1137 * -371192105 == 0) {
                                 if(var8 != 1695957245) {
                                    throw new IllegalStateException();
                                 }

                                 client.field_1590 = null;
                                 client.field_1591 = null;
                              }

                              if(!client.field_1553) {
                                 class_208.method_4150(-586606589);
                              }
                           }
                        }
                     }
                  } else if(var10.field_244) {
                     if(var8 != 1695957245) {
                        return;
                     }

                     if(class_131.field_1722 * -678881683 >= var13) {
                        if(var8 != 1695957245) {
                           throw new IllegalStateException();
                        }

                        if(class_131.field_1703 * 1903378733 >= var14) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(class_131.field_1722 * -678881683 < var15 && 1903378733 * class_131.field_1703 < var16) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              for(var29 = (class_45)client.field_1576.method_5944(); var29 != null; var29 = (class_45)client.field_1576.method_5972()) {
                                 if(var8 != 1695957245) {
                                    return;
                                 }

                                 if(var29.field_331) {
                                    if(var8 != 1695957245) {
                                       return;
                                    }

                                    if(var29.field_337 == var29.field_332.field_208) {
                                       if(var8 != 1695957245) {
                                          throw new IllegalStateException();
                                       }

                                       var29.method_108();
                                    }
                                 }
                              }
                           }
                        }
                     }
                  }
               }

               var18 = -678881683 * class_131.field_1722;
               var19 = 1903378733 * class_131.field_1703;
               if(-265253353 * class_131.field_1717 != 0) {
                  var18 = 1003938789 * class_131.field_1701;
                  var19 = class_131.field_1711 * 339791065;
               }

               boolean var39;
               label1491: {
                  if(var18 >= var13) {
                     if(var8 != 1695957245) {
                        throw new IllegalStateException();
                     }

                     if(var19 >= var14) {
                        if(var8 != 1695957245) {
                           throw new IllegalStateException();
                        }

                        if(var18 < var15) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(var19 < var16) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              var39 = true;
                              break label1491;
                           }
                        }
                     }
                  }

                  var39 = false;
               }

               boolean var30 = var39;
               if(1337 == var10.field_207 * -1245218361) {
                  if(!client.field_1577 && !client.field_1553 && var30) {
                     if(var8 != 1695957245) {
                        throw new IllegalStateException();
                     }

                     class_167.method_3608(var18, var19, var13, var14, -1987725219);
                  }
               } else if(-1245218361 * var10.field_207 == 1338) {
                  if(var8 != 1695957245) {
                     throw new IllegalStateException();
                  }

                  class_153.method_3243(var10, var11, var12, 1981003125);
               } else {
                  if(1400 == var10.field_207 * -1245218361) {
                     if(var8 != 1695957245) {
                        throw new IllegalStateException();
                     }

                     class_287.field_3278.method_6449(class_131.field_1722 * -678881683, 1903378733 * class_131.field_1703, var30, var11, var12, 1163271639 * var10.field_104, -571887853 * var10.field_117, -814941662);
                  }

                  if(!client.field_1553) {
                     if(var8 != 1695957245) {
                        throw new IllegalStateException();
                     }

                     if(var30) {
                        if(var8 != 1695957245) {
                           throw new IllegalStateException();
                        }

                        if(var10.field_207 * -1245218361 == 1400) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           class_287.field_3278.method_6359(var11, var12, var10.field_104 * 1163271639, var10.field_117 * -571887853, var18, var19, -2083431744);
                        } else {
                           class_46.method_537(var10, var18 - var11, var19 - var12, -190288118);
                        }
                     }
                  }

                  boolean var22;
                  int var24;
                  if(var28) {
                     for(int var21 = 0; var21 < var10.field_176.length; ++var21) {
                        var22 = false;
                        boolean var23 = false;
                        if(!var22) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(null != var10.field_176[var21]) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              for(var24 = 0; var24 < var10.field_176[var21].length; ++var24) {
                                 if(var8 != 1695957245) {
                                    throw new IllegalStateException();
                                 }

                                 boolean var25 = false;
                                 if(null != var10.field_155) {
                                    if(var8 != 1695957245) {
                                       throw new IllegalStateException();
                                    }

                                    var25 = class_145.field_1840[var10.field_176[var21][var24]];
                                 }

                                 if(!class_99.method_1814(var10.field_176[var21][var24], (byte)3)) {
                                    if(var8 != 1695957245) {
                                       throw new IllegalStateException();
                                    }

                                    if(!var25) {
                                       continue;
                                    }

                                    if(var8 != 1695957245) {
                                       return;
                                    }
                                 }

                                 var22 = true;
                                 if(null != var10.field_155) {
                                    if(var8 != 1695957245) {
                                       throw new IllegalStateException();
                                    }

                                    if(var10.field_155[var21] > client.field_1425 * -1702273423) {
                                       break;
                                    }

                                    if(var8 != 1695957245) {
                                       throw new IllegalStateException();
                                    }
                                 }

                                 byte var26 = var10.field_177[var21][var24];
                                 if(0 != var26) {
                                    if(var8 != 1695957245) {
                                       throw new IllegalStateException();
                                    }

                                    if(0 != (var26 & 8)) {
                                       if(var8 != 1695957245) {
                                          throw new IllegalStateException();
                                       }

                                       if(class_145.field_1840[86]) {
                                          continue;
                                       }

                                       if(var8 != 1695957245) {
                                          throw new IllegalStateException();
                                       }

                                       if(class_145.field_1840[82]) {
                                          continue;
                                       }

                                       if(var8 != 1695957245) {
                                          throw new IllegalStateException();
                                       }

                                       if(class_145.field_1840[81]) {
                                          continue;
                                       }
                                    }

                                    if((var26 & 2) != 0) {
                                       if(var8 != 1695957245) {
                                          return;
                                       }

                                       if(!class_145.field_1840[86]) {
                                          if(var8 != 1695957245) {
                                             throw new IllegalStateException();
                                          }
                                          continue;
                                       }
                                    }

                                    if(0 != (var26 & 1)) {
                                       if(var8 != 1695957245) {
                                          throw new IllegalStateException();
                                       }

                                       if(!class_145.field_1840[82]) {
                                          if(var8 != 1695957245) {
                                             throw new IllegalStateException();
                                          }
                                          continue;
                                       }
                                    }

                                    if(0 != (var26 & 4)) {
                                       if(var8 != 1695957245) {
                                          return;
                                       }

                                       if(!class_145.field_1840[81]) {
                                          if(var8 != 1695957245) {
                                             throw new IllegalStateException();
                                          }
                                          continue;
                                       }
                                    }
                                 }

                                 var23 = true;
                                 break;
                              }
                           }
                        }

                        if(var23) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(var21 < 10) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              class_382.method_6682(1 + var21, -1722455647 * var10.field_101, var10.field_102 * 41180389, var10.field_229 * 539336237, "", 98799399);
                           } else if(10 == var21) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              class_54.method_583(-1370378668);
                              class_162.method_3415(-1722455647 * var10.field_101, 41180389 * var10.field_102, class_196.method_3989(class_112.method_2236(var10, 2133450322), (byte)-41), 539336237 * var10.field_229, -2147472010);
                              client.field_1575 = class_269.method_5039(var10, 1267634256);
                              if(null == client.field_1575) {
                                 if(var8 != 1695957245) {
                                    throw new IllegalStateException();
                                 }

                                 client.field_1575 = class_305.field_3410;
                              }

                              client.field_1545 = var10.field_91 + class_136.method_2958(16777215, -1966582053);
                           }

                           var24 = var10.field_178[var21];
                           if(null == var10.field_155) {
                              if(var8 != 1695957245) {
                                 return;
                              }

                              var10.field_155 = new int[var10.field_176.length];
                           }

                           if(null == var10.field_222) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              var10.field_222 = new int[var10.field_176.length];
                           }

                           if(var24 != 0) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              if(0 == var10.field_155[var21]) {
                                 if(var8 != 1695957245) {
                                    return;
                                 }

                                 var10.field_155[var21] = client.field_1425 * -1702273423 + var24 + var10.field_222[var21];
                              } else {
                                 var10.field_155[var21] = client.field_1425 * -1702273423 + var24;
                              }
                           } else {
                              var10.field_155[var21] = Integer.MAX_VALUE;
                           }
                        }

                        if(!var22) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(var10.field_155 != null) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              var10.field_155[var21] = 0;
                           }
                        }
                     }
                  }

                  if(var10.field_100) {
                     if(var8 != 1695957245) {
                        throw new IllegalStateException();
                     }

                     label1418: {
                        if(class_131.field_1722 * -678881683 >= var13) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(1903378733 * class_131.field_1703 >= var14) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              if(-678881683 * class_131.field_1722 < var15) {
                                 if(var8 != 1695957245) {
                                    throw new IllegalStateException();
                                 }

                                 if(1903378733 * class_131.field_1703 < var16) {
                                    if(var8 != 1695957245) {
                                       throw new IllegalStateException();
                                    }

                                    var30 = true;
                                    break label1418;
                                 }
                              }
                           }
                        }

                        var30 = false;
                     }

                     boolean var31;
                     label1408: {
                        var31 = false;
                        if(1 != 97210001 * class_131.field_1709) {
                           if(client.field_1441) {
                              break label1408;
                           }

                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(4 != class_131.field_1709 * 97210001) {
                              break label1408;
                           }

                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }
                        }

                        if(var30) {
                           var31 = true;
                        }
                     }

                     label1399: {
                        var22 = false;
                        if(class_131.field_1717 * -265253353 != 1) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(client.field_1441 || -265253353 * class_131.field_1717 != 4) {
                              break label1399;
                           }

                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }
                        }

                        if(1003938789 * class_131.field_1701 >= var13) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(339791065 * class_131.field_1711 >= var14) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              if(class_131.field_1701 * 1003938789 < var15 && class_131.field_1711 * 339791065 < var16) {
                                 if(var8 != 1695957245) {
                                    return;
                                 }

                                 var22 = true;
                              }
                           }
                        }
                     }

                     if(var22) {
                        class_84.method_1426(var10, 1003938789 * class_131.field_1701 - var11, class_131.field_1711 * 339791065 - var12, (byte)8);
                     }

                     if(-1245218361 * var10.field_207 == 1400) {
                        if(var8 != 1695957245) {
                           throw new IllegalStateException();
                        }

                        class_287.field_3278.method_6418(var18, var19, var30 & var31, var30 & var22, -882854276);
                     }

                     if(client.field_1590 != null && var10 != client.field_1590 && var30) {
                        if(var8 != 1695957245) {
                           throw new IllegalStateException();
                        }

                        if(class_222.method_4276(class_112.method_2236(var10, 2143166588), 1604021821)) {
                           if(var8 != 1695957245) {
                              return;
                           }

                           client.field_1594 = var10;
                        }
                     }

                     if(var10 == client.field_1591) {
                        if(var8 != 1695957245) {
                           return;
                        }

                        client.field_1595 = true;
                        client.field_1516 = var11 * 329210625;
                        client.field_1597 = -1479343893 * var12;
                     }

                     if(var10.field_187) {
                        if(var8 != 1695957245) {
                           throw new IllegalStateException();
                        }

                        class_45 var33;
                        class_45 var40;
                        if(var30) {
                           if(var8 != 1695957245) {
                              return;
                           }

                           if(1005623717 * client.field_1619 != 0) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              if(var10.field_208 != null) {
                                 if(var8 != 1695957245) {
                                    throw new IllegalStateException();
                                 }

                                 var40 = new class_45();
                                 var33 = var40;
                                 var33.field_331 = true;
                                 var33.field_332 = var10;
                                 var33.field_334 = client.field_1619 * -1052423951;
                                 var33.field_337 = var10.field_208;
                                 client.field_1576.method_5939(var33);
                              }
                           }
                        }

                        label1382: {
                           if(null == client.field_1590) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              if(class_90.field_900 == null) {
                                 if(var8 != 1695957245) {
                                    throw new IllegalStateException();
                                 }

                                 if(!client.field_1553) {
                                    break label1382;
                                 }

                                 if(var8 != 1695957245) {
                                    throw new IllegalStateException();
                                 }
                              }
                           }

                           var22 = false;
                           var31 = false;
                           var30 = false;
                        }

                        if(!var10.field_235) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(var22) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              var10.field_235 = true;
                              if(null != var10.field_120) {
                                 if(var8 != 1695957245) {
                                    throw new IllegalStateException();
                                 }

                                 var40 = new class_45();
                                 var33 = var40;
                                 var33.field_331 = true;
                                 var33.field_332 = var10;
                                 var33.field_333 = -861910615 * (1003938789 * class_131.field_1701 - var11);
                                 var33.field_334 = (339791065 * class_131.field_1711 - var12) * -1799481251;
                                 var33.field_337 = var10.field_120;
                                 client.field_1576.method_5939(var33);
                              }
                           }
                        }

                        if(var10.field_235) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(var31) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              if(null != var10.field_190) {
                                 if(var8 != 1695957245) {
                                    throw new IllegalStateException();
                                 }

                                 var40 = new class_45();
                                 var33 = var40;
                                 var33.field_331 = true;
                                 var33.field_332 = var10;
                                 var33.field_333 = -861910615 * (class_131.field_1722 * -678881683 - var11);
                                 var33.field_334 = (class_131.field_1703 * 1903378733 - var12) * -1799481251;
                                 var33.field_337 = var10.field_190;
                                 client.field_1576.method_5939(var33);
                              }
                           }
                        }

                        if(var10.field_235) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(!var31) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              var10.field_235 = false;
                              if(var10.field_191 != null) {
                                 var40 = new class_45();
                                 var33 = var40;
                                 var33.field_331 = true;
                                 var33.field_332 = var10;
                                 var33.field_333 = (class_131.field_1722 * -678881683 - var11) * -861910615;
                                 var33.field_334 = -1799481251 * (1903378733 * class_131.field_1703 - var12);
                                 var33.field_337 = var10.field_191;
                                 client.field_1622.method_5939(var33);
                              }
                           }
                        }

                        if(var31 && var10.field_192 != null) {
                           var40 = new class_45();
                           var33 = var40;
                           var33.field_331 = true;
                           var33.field_332 = var10;
                           var33.field_333 = (-678881683 * class_131.field_1722 - var11) * -861910615;
                           var33.field_334 = (1903378733 * class_131.field_1703 - var12) * -1799481251;
                           var33.field_337 = var10.field_192;
                           client.field_1576.method_5939(var33);
                        }

                        if(!var10.field_234 && var30) {
                           var10.field_234 = true;
                           if(null != var10.field_213) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              var40 = new class_45();
                              var33 = var40;
                              var33.field_331 = true;
                              var33.field_332 = var10;
                              var33.field_333 = (class_131.field_1722 * -678881683 - var11) * -861910615;
                              var33.field_334 = -1799481251 * (class_131.field_1703 * 1903378733 - var12);
                              var33.field_337 = var10.field_213;
                              client.field_1576.method_5939(var33);
                           }
                        }

                        if(var10.field_234) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(var30) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              if(null != var10.field_194) {
                                 if(var8 != 1695957245) {
                                    return;
                                 }

                                 var40 = new class_45();
                                 var33 = var40;
                                 var33.field_331 = true;
                                 var33.field_332 = var10;
                                 var33.field_333 = (-678881683 * class_131.field_1722 - var11) * -861910615;
                                 var33.field_334 = -1799481251 * (1903378733 * class_131.field_1703 - var12);
                                 var33.field_337 = var10.field_194;
                                 client.field_1576.method_5939(var33);
                              }
                           }
                        }

                        if(var10.field_234) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(!var30) {
                              if(var8 != 1695957245) {
                                 return;
                              }

                              var10.field_234 = false;
                              if(var10.field_195 != null) {
                                 if(var8 != 1695957245) {
                                    throw new IllegalStateException();
                                 }

                                 var40 = new class_45();
                                 var33 = var40;
                                 var33.field_331 = true;
                                 var33.field_332 = var10;
                                 var33.field_333 = (class_131.field_1722 * -678881683 - var11) * -861910615;
                                 var33.field_334 = -1799481251 * (class_131.field_1703 * 1903378733 - var12);
                                 var33.field_337 = var10.field_195;
                                 client.field_1622.method_5939(var33);
                              }
                           }
                        }

                        if(null != var10.field_168) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           var40 = new class_45();
                           var33 = var40;
                           var33.field_332 = var10;
                           var33.field_337 = var10.field_168;
                           client.field_1428.method_5939(var33);
                        }

                        int var35;
                        class_45 var37;
                        int var38;
                        if(null != var10.field_200) {
                           if(var8 != 1695957245) {
                              return;
                           }

                           if(client.field_1439 * 1149971569 > var10.field_133 * 1932726993) {
                              label1357: {
                                 if(var10.field_201 != null) {
                                    if(var8 != 1695957245) {
                                       throw new IllegalStateException();
                                    }

                                    if(client.field_1439 * 1149971569 - var10.field_133 * 1932726993 <= 32) {
                                       var38 = 1932726993 * var10.field_133;

                                       while(true) {
                                          if(var38 >= client.field_1439 * 1149971569) {
                                             break label1357;
                                          }

                                          if(var8 != 1695957245) {
                                             throw new IllegalStateException();
                                          }

                                          var24 = client.field_1603[var38 & 31];

                                          for(var35 = 0; var35 < var10.field_201.length; ++var35) {
                                             if(var8 != 1695957245) {
                                                return;
                                             }

                                             if(var24 == var10.field_201[var35]) {
                                                if(var8 != 1695957245) {
                                                   throw new IllegalStateException();
                                                }

                                                var40 = new class_45();
                                                var37 = var40;
                                                var37.field_332 = var10;
                                                var37.field_337 = var10.field_200;
                                                client.field_1576.method_5939(var37);
                                                break label1357;
                                             }
                                          }

                                          ++var38;
                                       }
                                    }
                                 }

                                 var40 = new class_45();
                                 var33 = var40;
                                 var33.field_332 = var10;
                                 var33.field_337 = var10.field_200;
                                 client.field_1576.method_5939(var33);
                              }

                              var10.field_133 = client.field_1439 * 1799792545;
                           }
                        }

                        if(var10.field_202 != null) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(102304557 * client.field_1606 > 822217447 * var10.field_238) {
                              if(var8 != 1695957245) {
                                 return;
                              }

                              label1332: {
                                 if(null != var10.field_166) {
                                    if(var8 != 1695957245) {
                                       throw new IllegalStateException();
                                    }

                                    if(client.field_1606 * 102304557 - var10.field_238 * 822217447 <= 32) {
                                       var38 = 822217447 * var10.field_238;

                                       while(true) {
                                          if(var38 >= client.field_1606 * 102304557) {
                                             break label1332;
                                          }

                                          var24 = client.field_1658[var38 & 31];

                                          for(var35 = 0; var35 < var10.field_166.length; ++var35) {
                                             if(var10.field_166[var35] == var24) {
                                                if(var8 != 1695957245) {
                                                   throw new IllegalStateException();
                                                }

                                                var40 = new class_45();
                                                var37 = var40;
                                                var37.field_332 = var10;
                                                var37.field_337 = var10.field_202;
                                                client.field_1576.method_5939(var37);
                                                break label1332;
                                             }
                                          }

                                          ++var38;
                                       }
                                    }

                                    if(var8 != 1695957245) {
                                       throw new IllegalStateException();
                                    }
                                 }

                                 var40 = new class_45();
                                 var33 = var40;
                                 var33.field_332 = var10;
                                 var33.field_337 = var10.field_202;
                                 client.field_1576.method_5939(var33);
                              }

                              var10.field_238 = -46421301 * client.field_1606;
                           }
                        }

                        if(null != var10.field_204) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(client.field_1608 * 28091927 > var10.field_239 * -437140673) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              label1309: {
                                 if(null != var10.field_149) {
                                    if(var8 != 1695957245) {
                                       throw new IllegalStateException();
                                    }

                                    if(client.field_1608 * 28091927 - var10.field_239 * -437140673 <= 32) {
                                       var38 = -437140673 * var10.field_239;

                                       while(true) {
                                          if(var38 >= 28091927 * client.field_1608) {
                                             break label1309;
                                          }

                                          if(var8 != 1695957245) {
                                             throw new IllegalStateException();
                                          }

                                          var24 = client.field_1450[var38 & 31];

                                          for(var35 = 0; var35 < var10.field_149.length; ++var35) {
                                             if(var10.field_149[var35] == var24) {
                                                if(var8 != 1695957245) {
                                                   throw new IllegalStateException();
                                                }

                                                var40 = new class_45();
                                                var37 = var40;
                                                var37.field_332 = var10;
                                                var37.field_337 = var10.field_204;
                                                client.field_1576.method_5939(var37);
                                                break label1309;
                                             }
                                          }

                                          ++var38;
                                       }
                                    }

                                    if(var8 != 1695957245) {
                                       return;
                                    }
                                 }

                                 var40 = new class_45();
                                 var33 = var40;
                                 var33.field_332 = var10;
                                 var33.field_337 = var10.field_204;
                                 client.field_1576.method_5939(var33);
                              }

                              var10.field_239 = 1770020649 * client.field_1608;
                           }
                        }

                        if(client.field_1611 * 1908476521 > var10.field_247 * -772300497) {
                           if(var8 != 1695957245) {
                              return;
                           }

                           if(var10.field_209 != null) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              var40 = new class_45();
                              var33 = var40;
                              var33.field_332 = var10;
                              var33.field_337 = var10.field_209;
                              client.field_1576.method_5939(var33);
                           }
                        }

                        if(client.field_1612 * 56143531 > var10.field_247 * -772300497) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(var10.field_211 != null) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              var40 = new class_45();
                              var33 = var40;
                              var33.field_332 = var10;
                              var33.field_337 = var10.field_211;
                              client.field_1576.method_5939(var33);
                           }
                        }

                        if(client.field_1620 * 1400025619 > -772300497 * var10.field_247) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(var10.field_212 != null) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              var40 = new class_45();
                              var33 = var40;
                              var33.field_332 = var10;
                              var33.field_337 = var10.field_212;
                              client.field_1576.method_5939(var33);
                           }
                        }

                        if(client.field_1430 * -1827987357 > -772300497 * var10.field_247 && var10.field_186 != null) {
                           var40 = new class_45();
                           var33 = var40;
                           var33.field_332 = var10;
                           var33.field_337 = var10.field_186;
                           client.field_1576.method_5939(var33);
                        }

                        if(-31959039 * client.field_1615 > -772300497 * var10.field_247) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(null != var10.field_214) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              var40 = new class_45();
                              var33 = var40;
                              var33.field_332 = var10;
                              var33.field_337 = var10.field_214;
                              client.field_1576.method_5939(var33);
                           }
                        }

                        if(client.field_1616 * 77736245 > -772300497 * var10.field_247) {
                           if(var8 != 1695957245) {
                              return;
                           }

                           if(var10.field_237 != null) {
                              var40 = new class_45();
                              var33 = var40;
                              var33.field_332 = var10;
                              var33.field_337 = var10.field_237;
                              client.field_1576.method_5939(var33);
                           }
                        }

                        if(-194606347 * client.field_1524 > -772300497 * var10.field_247) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(null != var10.field_220) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              var40 = new class_45();
                              var33 = var40;
                              var33.field_332 = var10;
                              var33.field_337 = var10.field_220;
                              client.field_1576.method_5939(var33);
                           }
                        }

                        if(client.field_1435 * 1047300925 > var10.field_247 * -772300497) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(null != var10.field_215) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              var40 = new class_45();
                              var33 = var40;
                              var33.field_332 = var10;
                              var33.field_337 = var10.field_215;
                              client.field_1576.method_5939(var33);
                           }
                        }

                        var10.field_247 = client.field_1602 * 2050250907;
                        if(null != var10.field_210) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           for(var38 = 0; var38 < client.field_1582 * 2087031963; ++var38) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              var40 = new class_45();
                              class_45 var36 = var40;
                              var36.field_332 = var10;
                              var36.field_342 = client.field_1644[var38] * -525569217;
                              var36.field_330 = client.field_1643[var38] * -1535269925;
                              var36.field_337 = var10.field_210;
                              client.field_1576.method_5939(var36);
                           }
                        }
                     }
                  }

                  if(!var10.field_100) {
                     if(var8 != 1695957245) {
                        return;
                     }

                     if(client.field_1590 != null) {
                        continue;
                     }

                     if(var8 != 1695957245) {
                        throw new IllegalStateException();
                     }

                     if(null != class_90.field_900) {
                        continue;
                     }

                     if(var8 != 1695957245) {
                        throw new IllegalStateException();
                     }

                     if(client.field_1553) {
                        if(var8 != 1695957245) {
                           throw new IllegalStateException();
                        }
                        continue;
                     }

                     label1261: {
                        if(var10.field_165 * 898412889 < 0) {
                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }

                           if(0 == -744384901 * var10.field_128) {
                              break label1261;
                           }

                           if(var8 != 1695957245) {
                              throw new IllegalStateException();
                           }
                        }

                        if(-678881683 * class_131.field_1722 >= var13 && 1903378733 * class_131.field_1703 >= var14) {
                           if(var8 != 1695957245) {
                              return;
                           }

                           if(-678881683 * class_131.field_1722 < var15) {
                              if(var8 != 1695957245) {
                                 return;
                              }

                              if(class_131.field_1703 * 1903378733 < var16) {
                                 if(var8 != 1695957245) {
                                    throw new IllegalStateException();
                                 }

                                 if(898412889 * var10.field_165 >= 0) {
                                    if(var8 != 1695957245) {
                                       return;
                                    }

                                    class_149.field_1893 = var0[898412889 * var10.field_165];
                                 } else {
                                    class_149.field_1893 = var10;
                                 }
                              }
                           }
                        }
                     }

                     if(var10.field_103 * 1659206769 == 8) {
                        if(var8 != 1695957245) {
                           throw new IllegalStateException();
                        }

                        if(-678881683 * class_131.field_1722 >= var13) {
                           if(var8 != 1695957245) {
                              return;
                           }

                           if(class_131.field_1703 * 1903378733 >= var14) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              if(-678881683 * class_131.field_1722 < var15) {
                                 if(var8 != 1695957245) {
                                    throw new IllegalStateException();
                                 }

                                 if(1903378733 * class_131.field_1703 < var16) {
                                    if(var8 != 1695957245) {
                                       return;
                                    }

                                    class_58.field_467 = var10;
                                 }
                              }
                           }
                        }
                     }

                     if(1577090123 * var10.field_125 > var10.field_117 * -571887853) {
                        if(var8 != 1695957245) {
                           throw new IllegalStateException();
                        }

                        class_352.method_6230(var10, var11 + 1163271639 * var10.field_104, var12, -571887853 * var10.field_117, 1577090123 * var10.field_125, class_131.field_1722 * -678881683, 1903378733 * class_131.field_1703, 584848260);
                     }
                  }

                  if(0 == 1659206769 * var10.field_103) {
                     if(var8 != 1695957245) {
                        throw new IllegalStateException();
                     }

                     method_4271(var0, var10.field_101 * -1722455647, var13, var14, var15, var16, var11 - var10.field_122 * -1662391635, var12 - var10.field_123 * 1974901921, 1695957245);
                     if(null != var10.field_233) {
                        method_4271(var10.field_233, var10.field_101 * -1722455647, var13, var14, var15, var16, var11 - var10.field_122 * -1662391635, var12 - 1974901921 * var10.field_123, 1695957245);
                     }

                     class_48 var32 = (class_48)client.field_1578.method_6523((long)(var10.field_101 * -1722455647));
                     if(var32 != null) {
                        if(0 == var32.field_354 * 1329352515) {
                           if(var8 != 1695957245) {
                              return;
                           }

                           if(-678881683 * class_131.field_1722 >= var13) {
                              if(var8 != 1695957245) {
                                 throw new IllegalStateException();
                              }

                              if(1903378733 * class_131.field_1703 >= var14) {
                                 if(var8 != 1695957245) {
                                    return;
                                 }

                                 if(class_131.field_1722 * -678881683 < var15) {
                                    if(var8 != 1695957245) {
                                       throw new IllegalStateException();
                                    }

                                    if(class_131.field_1703 * 1903378733 < var16) {
                                       if(var8 != 1695957245) {
                                          return;
                                       }

                                       if(!client.field_1553) {
                                          if(var8 != 1695957245) {
                                             return;
                                          }

                                          for(class_45 var34 = (class_45)client.field_1576.method_5944(); null != var34; var34 = (class_45)client.field_1576.method_5972()) {
                                             if(var34.field_331) {
                                                if(var8 != 1695957245) {
                                                   return;
                                                }

                                                var34.method_108();
                                                var34.field_332.field_234 = false;
                                             }
                                          }

                                          if(0 == -371192105 * class_98.field_1137) {
                                             client.field_1590 = null;
                                             client.field_1591 = null;
                                          }

                                          if(!client.field_1553) {
                                             if(var8 != 1695957245) {
                                                throw new IllegalStateException();
                                             }

                                             class_208.method_4150(-1555577320);
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        class_137.method_2966(897280301 * var32.field_353, var13, var14, var15, var16, var11, var12, (byte)14);
                     }
                  }
               }
            }
         }

      } catch (RuntimeException var27) {
         throw class_223.method_4281(var27, "ff.jv(" + ')');
      }
   }

   // $FF: renamed from: j (af, byte) void
   static void method_4272(GameApplet var0, byte var1) {
      try {
         if(class_177.field_2202) {
            if(var1 == 1) {
               throw new IllegalStateException();
            } else {
               class_52.method_573(var0, (byte)-93);
            }
         } else {
            boolean var10001;
            label1794: {
               if(1 != class_131.field_1717 * -265253353) {
                  if(var1 == 1) {
                     throw new IllegalStateException();
                  }

                  if(client.field_1441) {
                     break label1794;
                  }

                  if(var1 == 1) {
                     throw new IllegalStateException();
                  }

                  if(class_131.field_1717 * -265253353 != 4) {
                     break label1794;
                  }

                  if(var1 == 1) {
                     throw new IllegalStateException();
                  }
               }

               if(1003938789 * class_131.field_1701 >= 751544539 * class_177.field_2183 + 765 - 50) {
                  if(var1 == 1) {
                     throw new IllegalStateException();
                  }

                  if(339791065 * class_131.field_1711 >= 453) {
                     if(var1 == 1) {
                        throw new IllegalStateException();
                     }

                     if(!class_87.field_852.field_2118) {
                        if(var1 == 1) {
                           throw new IllegalStateException();
                        }

                        var10001 = true;
                     } else {
                        var10001 = false;
                     }

                     class_87.field_852.field_2118 = var10001;
                     class_94.method_1771(-1655147086);
                     if(!class_87.field_852.field_2118) {
                        if(var1 == 1) {
                           throw new IllegalStateException();
                        }

                        class_307 var2 = class_194.field_2307;
                        int var3 = var2.method_5399("scape main", -1575580840);
                        int var4 = var2.method_5400(var3, "", 1997157248);
                        class_162.method_3399(var2, var3, var4, 255, false, 1103817184);
                     } else {
                        class_198.field_2339.method_1962(-1687162029);
                        class_270.field_3180 = 1262412465;
                        class_271.field_3186 = null;
                     }
                  }
               }
            }

            if(client.field_1421 * -888167097 == 5) {
               if(var1 == 1) {
                  throw new IllegalStateException();
               }
            } else {
               if(class_177.field_2210 * -6552387078387254053L == -1L) {
                  if(var1 == 1) {
                     throw new IllegalStateException();
                  }

                  class_177.field_2210 = (class_87.method_1516((byte)1) + 1000L) * -5255609284130545837L;
               }

               long var25;
               boolean var26;
               label1781: {
                  var25 = class_87.method_1516((byte)1);
                  if(client.field_1690 != null) {
                     if(-1953954605 * client.field_1488 < client.field_1690.size()) {
                        while(client.field_1488 * -1953954605 < client.field_1690.size()) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           class_169 var5 = (class_169)client.field_1690.get(client.field_1488 * -1953954605);
                           if(!var5.method_3615((byte)14)) {
                              var26 = false;
                              break label1781;
                           }

                           client.field_1488 += -2012351653;
                        }

                        var26 = true;
                        break label1781;
                     }

                     if(var1 == 1) {
                        throw new IllegalStateException();
                     }
                  }

                  var26 = true;
               }

               if(var26) {
                  if(var1 == 1) {
                     return;
                  }

                  if(-1L == class_177.field_2182 * 6302773758436356871L) {
                     if(var1 == 1) {
                        throw new IllegalStateException();
                     }

                     class_177.field_2182 = 5452267809792871095L * var25;
                     if(6302773758436356871L * class_177.field_2182 > class_177.field_2210 * -6552387078387254053L) {
                        if(var1 == 1) {
                           return;
                        }

                        class_177.field_2210 = -3815381335724612539L * class_177.field_2182;
                     }
                  }
               }

               if(10 != -888167097 * client.field_1421) {
                  if(var1 == 1) {
                     throw new IllegalStateException();
                  }

                  if(-888167097 * client.field_1421 != 11) {
                     if(var1 == 1) {
                        throw new IllegalStateException();
                     }

                     return;
                  }
               }

               int var27;
               if(class_324.field_3815 == class_387.field_4226) {
                  if(var1 == 1) {
                     return;
                  }

                  label1762: {
                     if(1 != class_131.field_1717 * -265253353) {
                        if(var1 == 1) {
                           return;
                        }

                        if(client.field_1441 || class_131.field_1717 * -265253353 != 4) {
                           break label1762;
                        }

                        if(var1 == 1) {
                           throw new IllegalStateException();
                        }
                     }

                     var27 = 5 + 751544539 * class_177.field_2183;
                     short var6 = 463;
                     byte var7 = 100;
                     byte var8 = 35;
                     if(class_131.field_1701 * 1003938789 >= var27) {
                        if(var1 == 1) {
                           return;
                        }

                        if(class_131.field_1701 * 1003938789 <= var27 + var7) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           if(339791065 * class_131.field_1711 >= var6) {
                              if(var1 == 1) {
                                 return;
                              }

                              if(339791065 * class_131.field_1711 <= var6 + var8) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 class_89.method_1588(-1858038859);
                                 return;
                              }
                           }
                        }
                     }
                  }

                  if(null != class_192.field_2298) {
                     if(var1 == 1) {
                        throw new IllegalStateException();
                     }

                     class_89.method_1588(-1858038859);
                  }
               }

               var27 = class_131.field_1717 * -265253353;
               int var28 = class_131.field_1701 * 1003938789;
               int var29 = class_131.field_1711 * 339791065;
               if(var27 == 0) {
                  if(var1 == 1) {
                     return;
                  }

                  var28 = class_131.field_1722 * -678881683;
                  var29 = class_131.field_1703 * 1903378733;
               }

               if(!client.field_1441) {
                  if(var1 == 1) {
                     return;
                  }

                  if(4 == var27) {
                     if(var1 == 1) {
                        throw new IllegalStateException();
                     }

                     var27 = 1;
                  }
               }

               int var9;
               short var10;
               if(0 == -677995589 * class_177.field_2194) {
                  if(var1 == 1) {
                     throw new IllegalStateException();
                  }

                  boolean var30 = false;

                  while(class_178.method_3800(-1385459044)) {
                     if(var1 == 1) {
                        return;
                     }

                     if(class_80.field_752 * 644081785 == 84) {
                        var30 = true;
                     }
                  }

                  var9 = class_204.field_2391 * 2097206533 - 80;
                  var10 = 291;
                  if(1 == var27) {
                     if(var1 == 1) {
                        throw new IllegalStateException();
                     }

                     if(var28 >= var9 - 75) {
                        if(var1 == 1) {
                           throw new IllegalStateException();
                        }

                        if(var28 <= var9 + 75) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           if(var29 >= var10 - 20) {
                              if(var1 == 1) {
                                 return;
                              }

                              if(var29 <= var10 + 20) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 class_195.method_3988(class_83.method_1409("secure", true, -1936080360) + "m=account-creation/g=oldscape/create_account_funnel.ws", true, false, -1331673664);
                              }
                           }
                        }
                     }
                  }

                  label1806: {
                     var9 = 80 + class_204.field_2391 * 2097206533;
                     if(1 == var27) {
                        if(var1 == 1) {
                           throw new IllegalStateException();
                        }

                        if(var28 >= var9 - 75) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           if(var28 <= 75 + var9) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var29 >= var10 - 20 && var29 <= var10 + 20) {
                                 break label1806;
                              }
                           }
                        }
                     }

                     if(!var30) {
                        return;
                     }

                     if(var1 == 1) {
                        throw new IllegalStateException();
                     }
                  }

                  if((client.field_1414 * 1088533541 & 33554432) != 0) {
                     class_177.field_2191 = "";
                     class_177.field_2196 = class_305.field_3630;
                     class_177.field_2197 = class_305.field_3534;
                     class_177.field_2213 = class_305.field_3697;
                     class_177.field_2194 = 2078798195;
                     if(client.field_1453) {
                        if(var1 == 1) {
                           return;
                        }

                        if(null != class_177.field_2200) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           if(class_177.field_2200.length() > 0) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              class_177.field_2204 = 129356965;
                              return;
                           }
                        }
                     }

                     class_177.field_2204 = 0;
                  } else if(0 != (1088533541 * client.field_1414 & 4)) {
                     if(var1 == 1) {
                        throw new IllegalStateException();
                     }

                     if(0 != (client.field_1414 * 1088533541 & 1024)) {
                        if(var1 == 1) {
                           throw new IllegalStateException();
                        }

                        class_177.field_2196 = class_305.field_3504;
                        class_177.field_2197 = class_305.field_3609;
                        class_177.field_2213 = class_305.field_3629;
                     } else {
                        class_177.field_2196 = class_305.field_3583;
                        class_177.field_2197 = class_305.field_3622;
                        class_177.field_2213 = class_305.field_3507;
                     }

                     class_177.field_2191 = class_305.field_3586;
                     class_177.field_2194 = 2078798195;
                     if(client.field_1453) {
                        if(var1 == 1) {
                           throw new IllegalStateException();
                        }

                        if(null != class_177.field_2200) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           if(class_177.field_2200.length() > 0) {
                              class_177.field_2204 = 129356965;
                              return;
                           }
                        }
                     }

                     class_177.field_2204 = 0;
                  } else if((client.field_1414 * 1088533541 & 1024) != 0) {
                     if(var1 == 1) {
                        return;
                     }

                     class_177.field_2196 = class_305.field_3624;
                     class_177.field_2197 = class_305.field_3580;
                     class_177.field_2213 = class_305.field_3626;
                     class_177.field_2191 = class_305.field_3586;
                     class_177.field_2194 = 2078798195;
                     if(client.field_1453) {
                        if(var1 == 1) {
                           throw new IllegalStateException();
                        }

                        if(class_177.field_2200 != null && class_177.field_2200.length() > 0) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           class_177.field_2204 = 129356965;
                           return;
                        }
                     }

                     class_177.field_2204 = 0;
                  } else {
                     class_178.method_3797(false, (byte)78);
                  }
               } else {
                  int var31;
                  short var33;
                  if(class_177.field_2194 * -677995589 == 1) {
                     if(var1 == 1) {
                        return;
                     }

                     while(class_178.method_3800(-1385459044)) {
                        if(class_80.field_752 * 644081785 == 84) {
                           if(var1 == 1) {
                              return;
                           }

                           class_178.method_3797(false, (byte)66);
                        } else if(644081785 * class_80.field_752 == 13) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           class_177.field_2194 = 0;
                        }
                     }

                     var31 = class_204.field_2391 * 2097206533 - 80;
                     var33 = 321;
                     if(1 == var27) {
                        if(var1 == 1) {
                           throw new IllegalStateException();
                        }

                        if(var28 >= var31 - 75 && var28 <= 75 + var31) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           if(var29 >= var33 - 20) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var29 <= var33 + 20) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 class_178.method_3797(false, (byte)74);
                              }
                           }
                        }
                     }

                     var31 = 80 + 2097206533 * class_204.field_2391;
                     if(var27 == 1) {
                        if(var1 == 1) {
                           throw new IllegalStateException();
                        }

                        if(var28 >= var31 - 75) {
                           if(var1 == 1) {
                              return;
                           }

                           if(var28 <= 75 + var31) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var29 >= var33 - 20 && var29 <= var33 + 20) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 class_177.field_2194 = 0;
                              }
                           }
                        }
                     }
                  } else {
                     boolean var10000;
                     short var32;
                     boolean var35;
                     int var38;
                     if(class_177.field_2194 * -677995589 == 2) {
                        if(var1 == 1) {
                           throw new IllegalStateException();
                        }

                        var32 = 201;
                        var31 = var32 + 52;
                        if(1 == var27) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           if(var29 >= var31 - 12) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var29 < 2 + var31) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 class_177.field_2204 = 0;
                              }
                           }
                        }

                        var31 += 15;
                        if(var27 == 1) {
                           if(var1 == 1) {
                              return;
                           }

                           if(var29 >= var31 - 12) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var29 < var31 + 2) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 class_177.field_2204 = 129356965;
                              }
                           }
                        }

                        var31 += 15;
                        var32 = 361;
                        if(class_96.field_1062 != null) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           var9 = -250215195 * class_96.field_1062.field_3947 / 2;
                           if(1 == var27) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var28 >= -1774637825 * class_96.field_1062.field_3946 - var9) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(var28 <= var9 + class_96.field_1062.field_3946 * -1774637825) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    if(var29 >= var32 - 15) {
                                       if(var1 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       if(var29 < var32) {
                                          switch(-519325819 * class_177.field_2199) {
                                          case 1:
                                             class_299.method_5348(class_305.field_3669, class_305.field_3670, class_305.field_3641, (byte)-74);
                                             class_177.field_2194 = 1804056383;
                                             return;
                                          case 2:
                                             class_195.method_3988("https://support.runescape.com/hc/en-gb", true, false, -1494615877);
                                          }
                                       }
                                    }
                                 }
                              }
                           }
                        }

                        var9 = class_204.field_2391 * 2097206533 - 80;
                        var10 = 321;
                        if(var27 == 1 && var28 >= var9 - 75) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           if(var28 <= var9 + 75) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var29 >= var10 - 20) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(var29 <= 20 + var10) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    class_177.field_2200 = class_177.field_2200.trim();
                                    if(class_177.field_2200.length() == 0) {
                                       if(var1 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       class_299.method_5348(class_305.field_3522, class_305.field_3458, class_305.field_3524, (byte)-60);
                                       return;
                                    }

                                    if(class_177.field_2212.length() == 0) {
                                       if(var1 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       class_299.method_5348(class_305.field_3435, class_305.field_3526, class_305.field_3527, (byte)-103);
                                       return;
                                    }

                                    class_299.method_5348(class_305.field_3635, class_305.field_3430, class_305.field_3637, (byte)-111);
                                    class_89.method_1578(false, (byte)-21);
                                    class_53.method_579(20, (byte)0);
                                    return;
                                 }
                              }
                           }
                        }

                        var9 = class_177.field_2189 * 2130552221 + 180 + 80;
                        if(1 == var27) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           if(var28 >= var9 - 75) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var28 <= 75 + var9) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(var29 >= var10 - 20 && var29 <= var10 + 20) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    class_177.field_2194 = 0;
                                    class_177.field_2200 = "";
                                    class_177.field_2212 = "";
                                    class_54.field_405 = 0;
                                    class_282.field_3249 = "";
                                    class_177.field_2203 = true;
                                 }
                              }
                           }
                        }

                        label1654: {
                           var9 = -117 + 2097206533 * class_204.field_2391;
                           var10 = 277;
                           if(var28 >= var9) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var28 < 1049112805 * class_43.field_311 + var9 && var29 >= var10 && var29 < var10 + class_220.field_2491 * -1028024263) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                                 break label1654;
                              }
                           }

                           var10000 = false;
                        }

                        class_177.field_2201 = var10000;
                        if(1 == var27) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           if(class_177.field_2201) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(!client.field_1453) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 var10000 = true;
                              } else {
                                 var10000 = false;
                              }

                              client.field_1453 = var10000;
                              if(!client.field_1453) {
                                 if(var1 == 1) {
                                    return;
                                 }

                                 if(null != class_87.field_852.field_2120) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    class_87.field_852.field_2120 = null;
                                    class_94.method_1771(-1202671302);
                                 }
                              }
                           }
                        }

                        label1645: {
                           var9 = class_204.field_2391 * 2097206533 + 24;
                           var10 = 277;
                           if(var28 >= var9) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var28 < class_43.field_311 * 1049112805 + var9) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(var29 >= var10) {
                                    if(var1 == 1) {
                                       return;
                                    }

                                    if(var29 < -1028024263 * class_220.field_2491 + var10) {
                                       if(var1 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       var10000 = true;
                                       break label1645;
                                    }
                                 }
                              }
                           }

                           var10000 = false;
                        }

                        class_177.field_2207 = var10000;
                        if(var27 == 1) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           if(class_177.field_2207) {
                              if(var1 == 1) {
                                 return;
                              }

                              if(!class_87.field_852.field_2123) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 var10001 = true;
                              } else {
                                 var10001 = false;
                              }

                              class_87.field_852.field_2123 = var10001;
                              if(!class_87.field_852.field_2123) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 class_177.field_2200 = "";
                                 class_87.field_852.field_2120 = null;
                                 if(client.field_1453 && null != class_177.field_2200 && class_177.field_2200.length() > 0) {
                                    if(var1 == 1) {
                                       return;
                                    }

                                    class_177.field_2204 = 129356965;
                                 } else {
                                    class_177.field_2204 = 0;
                                 }
                              }

                              class_94.method_1771(-1919231938);
                           }
                        }

                        label1746:
                        while(class_178.method_3800(-1385459044)) {
                           if(13 == 644081785 * class_80.field_752) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              class_177.field_2194 = 0;
                              class_177.field_2200 = "";
                              class_177.field_2212 = "";
                              class_54.field_405 = 0;
                              class_282.field_3249 = "";
                              class_177.field_2203 = true;
                           } else if(-1482820819 * class_177.field_2204 == 0) {
                              if(var1 == 1) {
                                 return;
                              }

                              char var37 = class_283.field_3253;
                              var38 = 0;

                              while(true) {
                                 if(var38 < class_177.field_2198.length()) {
                                    if(var1 == 1) {
                                       return;
                                    }

                                    if(var37 != class_177.field_2198.charAt(var38)) {
                                       ++var38;
                                       continue;
                                    }
                                 }

                                 if(class_80.field_752 * 644081785 == 85) {
                                    if(var1 == 1) {
                                       return;
                                    }

                                    if(class_177.field_2200.length() > 0) {
                                       if(var1 == 1) {
                                          return;
                                       }

                                       class_177.field_2200 = class_177.field_2200.substring(0, class_177.field_2200.length() - 1);
                                    }
                                 }

                                 label1538: {
                                    if(644081785 * class_80.field_752 != 84) {
                                       if(80 != class_80.field_752 * 644081785) {
                                          break label1538;
                                       }

                                       if(var1 == 1) {
                                          throw new IllegalStateException();
                                       }
                                    }

                                    class_177.field_2204 = 129356965;
                                 }

                                 if(class_141.method_3049(class_283.field_3253, 228217886) && class_177.field_2200.length() < 320) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    class_177.field_2200 = class_177.field_2200 + class_283.field_3253;
                                 }
                                 break;
                              }
                           } else if(-1482820819 * class_177.field_2204 == 1) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              label1818: {
                                 if(class_80.field_752 * 644081785 == 85) {
                                    if(var1 == 1) {
                                       return;
                                    }

                                    if(class_177.field_2212.length() > 0) {
                                       if(var1 == 1) {
                                          return;
                                       }

                                       class_177.field_2212 = class_177.field_2212.substring(0, class_177.field_2212.length() - 1);
                                       break label1818;
                                    }
                                 }

                                 if(84 != class_80.field_752 * 644081785) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    if(644081785 * class_80.field_752 != 80) {
                                       break label1818;
                                    }

                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }
                                 }

                                 class_177.field_2204 = 0;
                                 if(84 == class_80.field_752 * 644081785) {
                                    if(var1 == 1) {
                                       return;
                                    }

                                    class_177.field_2200 = class_177.field_2200.trim();
                                    if(class_177.field_2200.length() == 0) {
                                       class_299.method_5348(class_305.field_3522, class_305.field_3458, class_305.field_3524, (byte)-125);
                                       return;
                                    }

                                    if(class_177.field_2212.length() == 0) {
                                       if(var1 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       class_299.method_5348(class_305.field_3435, class_305.field_3526, class_305.field_3527, (byte)-75);
                                       return;
                                    }

                                    class_299.method_5348(class_305.field_3635, class_305.field_3430, class_305.field_3637, (byte)-23);
                                    class_89.method_1578(false, (byte)21);
                                    class_53.method_579(20, (byte)0);
                                    return;
                                 }
                              }

                              label1740: {
                                 if(!class_145.field_1840[82]) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    if(!class_145.field_1840[87]) {
                                       break label1740;
                                    }
                                 }

                                 if(644081785 * class_80.field_752 == 67) {
                                    if(var1 == 1) {
                                       return;
                                    }

                                    Clipboard var11 = Toolkit.getDefaultToolkit().getSystemClipboard();
                                    Transferable var12 = var11.getContents(class_121.field_1337);
                                    int var13 = 20 - class_177.field_2212.length();
                                    if(var13 <= 0) {
                                       continue;
                                    }

                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    try {
                                       String var14 = (String)var12.getTransferData(DataFlavor.stringFlavor);
                                       int var15 = Math.min(var13, var14.length());
                                       int var16 = 0;

                                       while(true) {
                                          if(var16 < var15) {
                                             if(var1 == 1) {
                                                throw new IllegalStateException();
                                             }

                                             boolean var17;
                                             label1609: {
                                                label1857: {
                                                   char var18 = var14.charAt(var16);
                                                   if(var18 >= 32) {
                                                      if(var1 == 1) {
                                                         return;
                                                      }

                                                      if(var18 < 127) {
                                                         break label1857;
                                                      }

                                                      if(var1 == 1) {
                                                         return;
                                                      }
                                                   }

                                                   if(var18 > 127) {
                                                      if(var1 == 1) {
                                                         throw new IllegalStateException();
                                                      }

                                                      if(var18 < 160) {
                                                         break label1857;
                                                      }

                                                      if(var1 == 1) {
                                                         throw new IllegalStateException();
                                                      }
                                                   }

                                                   if(var18 > 160) {
                                                      if(var1 == 1) {
                                                         throw new IllegalStateException();
                                                      }

                                                      if(var18 <= 255) {
                                                         if(var1 == 1) {
                                                            throw new IllegalStateException();
                                                         }
                                                         break label1857;
                                                      }
                                                   }

                                                   if(0 != var18) {
                                                      char[] var19 = class_337.field_3881;

                                                      for(int var20 = 0; var20 < var19.length; ++var20) {
                                                         if(var1 == 1) {
                                                            throw new IllegalStateException();
                                                         }

                                                         char var21 = var19[var20];
                                                         if(var21 == var18) {
                                                            if(var1 == 1) {
                                                               throw new IllegalStateException();
                                                            }

                                                            var17 = true;
                                                            break label1609;
                                                         }
                                                      }
                                                   }

                                                   var17 = false;
                                                   break label1609;
                                                }

                                                var17 = true;
                                             }

                                             if(var17 && class_141.method_3049(var14.charAt(var16), -1712683154)) {
                                                ++var16;
                                                continue;
                                             }

                                             class_177.field_2194 = 1941427289;
                                             return;
                                          }

                                          class_177.field_2212 = class_177.field_2212 + var14.substring(0, var15);
                                          continue label1746;
                                       }
                                    } catch (UnsupportedFlavorException var22) {
                                       ;
                                    } catch (IOException var23) {
                                       ;
                                    }
                                    continue;
                                 }
                              }

                              label1577: {
                                 label1828: {
                                    char var36 = class_283.field_3253;
                                    if(var36 >= 32) {
                                       if(var1 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       if(var36 < 127) {
                                          break label1828;
                                       }
                                    }

                                    if(var36 > 127) {
                                       if(var1 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       if(var36 < 160) {
                                          break label1828;
                                       }

                                       if(var1 == 1) {
                                          return;
                                       }
                                    }

                                    if(var36 > 160) {
                                       if(var1 == 1) {
                                          return;
                                       }

                                       if(var36 <= 255) {
                                          if(var1 == 1) {
                                             throw new IllegalStateException();
                                          }
                                          break label1828;
                                       }
                                    }

                                    if(var36 != 0) {
                                       if(var1 == 1) {
                                          return;
                                       }

                                       char[] var40 = class_337.field_3881;

                                       for(int var41 = 0; var41 < var40.length; ++var41) {
                                          if(var1 == 1) {
                                             return;
                                          }

                                          char var43 = var40[var41];
                                          if(var36 == var43) {
                                             if(var1 == 1) {
                                                return;
                                             }

                                             var35 = true;
                                             break label1577;
                                          }
                                       }
                                    }

                                    var35 = false;
                                    break label1577;
                                 }

                                 var35 = true;
                              }

                              if(var35 && class_141.method_3049(class_283.field_3253, -255742222)) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(class_177.field_2212.length() < 20) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    class_177.field_2212 = class_177.field_2212 + class_283.field_3253;
                                 }
                              }
                           }
                        }
                     } else if(class_177.field_2194 * -677995589 == 3) {
                        if(var1 == 1) {
                           throw new IllegalStateException();
                        }

                        var31 = 2130552221 * class_177.field_2189 + 180;
                        var33 = 276;
                        if(1 == var27) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           if(var28 >= var31 - 75 && var28 <= 75 + var31) {
                              if(var1 == 1) {
                                 return;
                              }

                              if(var29 >= var33 - 20) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(var29 <= 20 + var33) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    class_178.method_3797(false, (byte)56);
                                 }
                              }
                           }
                        }

                        var31 = 2130552221 * class_177.field_2189 + 180;
                        var33 = 326;
                        if(1 == var27) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           if(var28 >= var31 - 75) {
                              if(var1 == 1) {
                                 return;
                              }

                              if(var28 <= 75 + var31) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(var29 >= var33 - 20) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    if(var29 <= var33 + 20) {
                                       if(var1 == 1) {
                                          return;
                                       }

                                       class_299.method_5348(class_305.field_3669, class_305.field_3670, class_305.field_3641, (byte)-66);
                                       class_177.field_2194 = 1804056383;
                                       return;
                                    }
                                 }
                              }
                           }
                        }
                     } else {
                        int var39;
                        if(4 == class_177.field_2194 * -677995589) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           var31 = 180 + class_177.field_2189 * 2130552221 - 80;
                           var33 = 321;
                           if(1 == var27) {
                              if(var1 == 1) {
                                 return;
                              }

                              if(var28 >= var31 - 75) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(var28 <= var31 + 75) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    if(var29 >= var33 - 20) {
                                       if(var1 == 1) {
                                          return;
                                       }

                                       if(var29 <= var33 + 20) {
                                          if(var1 == 1) {
                                             return;
                                          }

                                          class_282.field_3249.trim();
                                          if(class_282.field_3249.length() != 6) {
                                             class_299.method_5348(class_305.field_3441, class_305.field_3442, class_305.field_3443, (byte)-103);
                                             return;
                                          }

                                          class_54.field_405 = Integer.parseInt(class_282.field_3249) * -2113447877;
                                          class_282.field_3249 = "";
                                          class_89.method_1578(true, (byte)-103);
                                          class_299.method_5348(class_305.field_3635, class_305.field_3430, class_305.field_3637, (byte)-9);
                                          class_53.method_579(20, (byte)0);
                                          return;
                                       }
                                    }
                                 }
                              }
                           }

                           if(var27 == 1) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var28 >= 180 + class_177.field_2189 * 2130552221 - 9) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(var28 <= 180 + class_177.field_2189 * 2130552221 + 130 && var29 >= 263) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    if(var29 <= 296) {
                                       if(var1 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       if(!class_177.field_2203) {
                                          if(var1 == 1) {
                                             throw new IllegalStateException();
                                          }

                                          var10000 = true;
                                       } else {
                                          var10000 = false;
                                       }

                                       class_177.field_2203 = var10000;
                                    }
                                 }
                              }
                           }

                           if(var27 == 1) {
                              if(var1 == 1) {
                                 return;
                              }

                              if(var28 >= 2130552221 * class_177.field_2189 + 180 - 34) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(var28 <= 34 + 180 + class_177.field_2189 * 2130552221) {
                                    if(var1 == 1) {
                                       return;
                                    }

                                    if(var29 >= 351) {
                                       if(var1 == 1) {
                                          return;
                                       }

                                       if(var29 <= 363) {
                                          if(var1 == 1) {
                                             return;
                                          }

                                          class_195.method_3988(class_83.method_1409("secure", true, -1592438201) + "m=totp-authenticator/disableTOTPRequest", true, false, 1700252306);
                                       }
                                    }
                                 }
                              }
                           }

                           var31 = 80 + 2130552221 * class_177.field_2189 + 180;
                           if(1 == var27) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var28 >= var31 - 75) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(var28 <= 75 + var31) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    if(var29 >= var33 - 20) {
                                       if(var1 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       if(var29 <= 20 + var33) {
                                          if(var1 == 1) {
                                             throw new IllegalStateException();
                                          }

                                          class_177.field_2194 = 0;
                                          class_177.field_2200 = "";
                                          class_177.field_2212 = "";
                                          class_54.field_405 = 0;
                                          class_282.field_3249 = "";
                                       }
                                    }
                                 }
                              }
                           }

                           while(class_178.method_3800(-1385459044)) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              boolean var34 = false;

                              for(var39 = 0; var39 < class_177.field_2211.length(); ++var39) {
                                 if(class_283.field_3253 == class_177.field_2211.charAt(var39)) {
                                    if(var1 == 1) {
                                       return;
                                    }

                                    var34 = true;
                                    break;
                                 }
                              }

                              if(13 == 644081785 * class_80.field_752) {
                                 if(var1 == 1) {
                                    return;
                                 }

                                 class_177.field_2194 = 0;
                                 class_177.field_2200 = "";
                                 class_177.field_2212 = "";
                                 class_54.field_405 = 0;
                                 class_282.field_3249 = "";
                              } else {
                                 if(85 == class_80.field_752 * 644081785) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    if(class_282.field_3249.length() > 0) {
                                       if(var1 == 1) {
                                          return;
                                       }

                                       class_282.field_3249 = class_282.field_3249.substring(0, class_282.field_3249.length() - 1);
                                    }
                                 }

                                 if(84 == 644081785 * class_80.field_752) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    class_282.field_3249.trim();
                                    if(class_282.field_3249.length() != 6) {
                                       if(var1 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       class_299.method_5348(class_305.field_3441, class_305.field_3442, class_305.field_3443, (byte)-125);
                                       return;
                                    }

                                    class_54.field_405 = Integer.parseInt(class_282.field_3249) * -2113447877;
                                    class_282.field_3249 = "";
                                    class_89.method_1578(true, (byte)-1);
                                    class_299.method_5348(class_305.field_3635, class_305.field_3430, class_305.field_3637, (byte)-53);
                                    class_53.method_579(20, (byte)0);
                                    return;
                                 }

                                 if(var34) {
                                    if(var1 == 1) {
                                       return;
                                    }

                                    if(class_282.field_3249.length() < 6) {
                                       class_282.field_3249 = class_282.field_3249 + class_283.field_3253;
                                    }
                                 }
                              }
                           }
                        } else if(class_177.field_2194 * -677995589 == 5) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           var31 = 180 + 2130552221 * class_177.field_2189 - 80;
                           var33 = 321;
                           if(var27 == 1) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var28 >= var31 - 75 && var28 <= var31 + 75 && var29 >= var33 - 20 && var29 <= 20 + var33) {
                                 class_341.method_6049(-1024085126);
                                 return;
                              }
                           }

                           var31 = 80 + 180 + class_177.field_2189 * 2130552221;
                           if(1 == var27) {
                              if(var1 == 1) {
                                 return;
                              }

                              if(var28 >= var31 - 75 && var28 <= 75 + var31) {
                                 if(var1 == 1) {
                                    return;
                                 }

                                 if(var29 >= var33 - 20 && var29 <= 20 + var33) {
                                    class_178.method_3797(true, (byte)125);
                                 }
                              }
                           }

                           var10 = 361;
                           if(class_151.field_1909 != null) {
                              if(var1 == 1) {
                                 return;
                              }

                              var39 = class_151.field_1909.field_3947 * -250215195 / 2;
                              if(1 == var27) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(var28 >= class_151.field_1909.field_3946 * -1774637825 - var39) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    if(var28 <= var39 + -1774637825 * class_151.field_1909.field_3946) {
                                       if(var1 == 1) {
                                          return;
                                       }

                                       if(var29 >= var10 - 15) {
                                          if(var1 == 1) {
                                             throw new IllegalStateException();
                                          }

                                          if(var29 < var10) {
                                             if(var1 == 1) {
                                                throw new IllegalStateException();
                                             }

                                             class_195.method_3988(class_83.method_1409("secure", true, -73445229) + "m=weblogin/g=oldscape/cant_log_in", true, false, 429904283);
                                          }
                                       }
                                    }
                                 }
                              }
                           }

                           while(class_178.method_3800(-1385459044)) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              var35 = false;

                              for(var38 = 0; var38 < class_177.field_2198.length(); ++var38) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(class_283.field_3253 == class_177.field_2198.charAt(var38)) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    var35 = true;
                                    break;
                                 }
                              }

                              if(13 == 644081785 * class_80.field_752) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 class_178.method_3797(true, (byte)68);
                              } else {
                                 if(class_80.field_752 * 644081785 == 85 && class_177.field_2200.length() > 0) {
                                    class_177.field_2200 = class_177.field_2200.substring(0, class_177.field_2200.length() - 1);
                                 }

                                 if(644081785 * class_80.field_752 == 84) {
                                    class_341.method_6049(-1024085126);
                                    return;
                                 }

                                 if(var35) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    if(class_177.field_2200.length() < 320) {
                                       if(var1 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       class_177.field_2200 = class_177.field_2200 + class_283.field_3253;
                                    }
                                 }
                              }
                           }
                        } else if(-677995589 * class_177.field_2194 == 6) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           while(class_178.method_3800(-1385459044)) {
                              if(644081785 * class_80.field_752 != 84) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(13 != 644081785 * class_80.field_752) {
                                    continue;
                                 }

                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }
                              }

                              class_178.method_3797(true, (byte)78);
                           }

                           var32 = 321;
                           if(var27 == 1) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var29 >= var32 - 20 && var29 <= 20 + var32) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 class_178.method_3797(true, (byte)88);
                              }
                           }
                        } else if(7 == class_177.field_2194 * -677995589) {
                           var31 = class_177.field_2189 * 2130552221 + 180 - 80;
                           var33 = 321;
                           if(1 == var27) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var28 >= var31 - 75) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(var28 <= var31 + 75 && var29 >= var33 - 20) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    if(var29 <= 20 + var33) {
                                       class_195.method_3988(class_83.method_1409("secure", true, 348637301) + "m=dob/set_dob.ws", true, false, -796568451);
                                       class_299.method_5348(class_305.field_3666, class_305.field_3628, class_305.field_3668, (byte)-18);
                                       class_177.field_2194 = -412112718;
                                       return;
                                    }
                                 }
                              }
                           }

                           var31 = 180 + 2130552221 * class_177.field_2189 + 80;
                           if(var27 == 1) {
                              if(var1 == 1) {
                                 return;
                              }

                              if(var28 >= var31 - 75) {
                                 if(var1 == 1) {
                                    return;
                                 }

                                 if(var28 <= 75 + var31) {
                                    if(var1 == 1) {
                                       return;
                                    }

                                    if(var29 >= var33 - 20) {
                                       if(var1 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       if(var29 <= 20 + var33) {
                                          if(var1 == 1) {
                                             return;
                                          }

                                          class_178.method_3797(true, (byte)85);
                                       }
                                    }
                                 }
                              }
                           }
                        } else if(8 == class_177.field_2194 * -677995589) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           var31 = 180 + class_177.field_2189 * 2130552221 - 80;
                           var33 = 321;
                           if(var27 == 1) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var28 >= var31 - 75) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(var28 <= 75 + var31) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    if(var29 >= var33 - 20) {
                                       if(var1 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       if(var29 <= var33 + 20) {
                                          if(var1 == 1) {
                                             throw new IllegalStateException();
                                          }

                                          class_195.method_3988("https://www.jagex.com/terms/privacy", true, false, 1007000975);
                                          class_299.method_5348(class_305.field_3666, class_305.field_3628, class_305.field_3668, (byte)-105);
                                          class_177.field_2194 = -412112718;
                                          return;
                                       }
                                    }
                                 }
                              }
                           }

                           var31 = 180 + 2130552221 * class_177.field_2189 + 80;
                           if(1 == var27) {
                              if(var1 == 1) {
                                 return;
                              }

                              if(var28 >= var31 - 75) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(var28 <= 75 + var31) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    if(var29 >= var33 - 20) {
                                       if(var1 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       if(var29 <= var33 + 20) {
                                          if(var1 == 1) {
                                             return;
                                          }

                                          class_178.method_3797(true, (byte)63);
                                       }
                                    }
                                 }
                              }
                           }
                        } else if(12 == -677995589 * class_177.field_2194) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           String var42 = "";
                           switch(-162991545 * class_177.field_2192) {
                           case 0:
                              var42 = "https://support.runescape.com/hc/en-gb/articles/115002238729-Account-Bans";
                              break;
                           case 1:
                              var42 = "https://support.runescape.com/hc/en-gb/articles/206103939-My-account-is-locked";
                              break;
                           default:
                              class_178.method_3797(false, (byte)100);
                           }

                           var9 = 2130552221 * class_177.field_2189 + 180;
                           var10 = 276;
                           if(var27 == 1) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var28 >= var9 - 75 && var28 <= var9 + 75) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(var29 >= var10 - 20) {
                                    if(var1 == 1) {
                                       throw new IllegalStateException();
                                    }

                                    if(var29 <= var10 + 20) {
                                       if(var1 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       class_195.method_3988(var42, true, false, 145508550);
                                       class_299.method_5348(class_305.field_3666, class_305.field_3628, class_305.field_3668, (byte)-17);
                                       class_177.field_2194 = -412112718;
                                       return;
                                    }
                                 }
                              }
                           }

                           var9 = 180 + 2130552221 * class_177.field_2189;
                           var10 = 326;
                           if(var27 == 1) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var28 >= var9 - 75) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(var28 <= var9 + 75) {
                                    if(var1 == 1) {
                                       return;
                                    }

                                    if(var29 >= var10 - 20) {
                                       if(var1 == 1) {
                                          throw new IllegalStateException();
                                       }

                                       if(var29 <= var10 + 20) {
                                          if(var1 == 1) {
                                             throw new IllegalStateException();
                                          }

                                          class_178.method_3797(false, (byte)111);
                                       }
                                    }
                                 }
                              }
                           }
                        } else if(class_177.field_2194 * -677995589 == 24) {
                           if(var1 == 1) {
                              throw new IllegalStateException();
                           }

                           var31 = class_177.field_2189 * 2130552221 + 180;
                           var33 = 301;
                           if(var27 == 1 && var28 >= var31 - 75) {
                              if(var1 == 1) {
                                 throw new IllegalStateException();
                              }

                              if(var28 <= 75 + var31) {
                                 if(var1 == 1) {
                                    throw new IllegalStateException();
                                 }

                                 if(var29 >= var33 - 20 && var29 <= var33 + 20) {
                                    if(var1 == 1) {
                                       return;
                                    }

                                    class_178.method_3797(false, (byte)67);
                                 }
                              }
                           }
                        }
                     }
                  }
               }

            }
         }
      } catch (RuntimeException var24) {
         throw class_223.method_4281(var24, "ff.j(" + ')');
      }
   }
}
