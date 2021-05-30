import java.util.Iterator;
import java.util.LinkedList;

// $FF: renamed from: fo
public class class_230 {

   // $FF: renamed from: b int
   int field_2575;
   // $FF: renamed from: hb oh[]
   static class_67[] field_2576;
   // $FF: renamed from: f java.lang.String
   String field_2577;
   // $FF: renamed from: y int
   int field_2578;
   // $FF: renamed from: p int
   int field_2579;
   // $FF: renamed from: j ii
   class_280 field_2580;
   // $FF: renamed from: v int
   int field_2581;
   // $FF: renamed from: s int
   int field_2582;
   // $FF: renamed from: d int
   int field_2583;
   // $FF: renamed from: r int
   int field_2584;
   // $FF: renamed from: u boolean
   boolean field_2585;
   // $FF: renamed from: l java.util.LinkedList
   LinkedList field_2586;
   // $FF: renamed from: n java.lang.String
   String field_2587;
   // $FF: renamed from: k int
   static final int field_2588 = 15;
   // $FF: renamed from: ag int
   static final int field_2589 = 39;


   // $FF: renamed from: ay () int
   public int method_4362() {
      return this.field_2584 * -214984287;
   }

   // $FF: renamed from: v (nd, int, int) void
   public void method_4363(class_28 var1, int var2, int var3) {
      try {
         this.field_2581 = 1914980669 * var2;
         this.field_2587 = var1.method_139(-391631059);
         this.field_2577 = var1.method_139(-391631059);
         class_280 var10001 = new class_280(var1.method_135((byte)-25));
         this.field_2580 = var10001;
         this.field_2578 = var1.method_135((byte)-57) * 476314275;
         var1.method_130(336075111);
         boolean var7;
         if(var1.method_130(709485545) == 1) {
            if(var3 >= -1808739745) {
               throw new IllegalStateException();
            }

            var7 = true;
         } else {
            var7 = false;
         }

         this.field_2585 = var7;
         this.field_2579 = var1.method_130(1555669374) * 1699709445;
         int var4 = var1.method_130(1133149132);
         this.field_2586 = new LinkedList();

         for(int var5 = 0; var5 < var4; ++var5) {
            if(var3 >= -1808739745) {
               throw new IllegalStateException();
            }

            this.field_2586.add(this.method_4364(var1, 2132246021));
         }

         this.method_4369(-1729266298);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "fo.v(" + ')');
      }
   }

   // $FF: renamed from: n (nd, int) gi
   class_6 method_4364(class_28 var1, int var2) {
      try {
         int var3 = var1.method_130(1081858090);
         class_238[] var4 = new class_238[]{class_238.field_2647, class_238.field_2649, class_238.field_2648, class_238.field_2646};
         class_238 var5 = (class_238)class_197.method_4016(var4, var3, -611336247);
         Object var6 = null;
         switch(var5.field_2650 * -694186145) {
         case 0:
            class_216 var10 = new class_216();
            var6 = var10;
            break;
         case 1:
            class_239 var9 = new class_239();
            var6 = var9;
            break;
         case 2:
            class_244 var8 = new class_244();
            var6 = var8;
            break;
         case 3:
            class_224 var10000 = new class_224();
            var6 = var10000;
            break;
         default:
            throw new IllegalStateException("");
         }

         ((class_6)var6).method_15(var1, -1138667895);
         return (class_6)var6;
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "fo.n(" + ')');
      }
   }

   // $FF: renamed from: bm () int
   public int method_4365() {
      return -1820038389 * this.field_2580.field_3234;
   }

   // $FF: renamed from: x (int) int
   public int method_4366(int var1) {
      try {
         return this.field_2580.field_3235 * 349527629;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fo.x(" + ')');
      }
   }

   // $FF: renamed from: p (int, int, int, byte) int[]
   public int[] method_4367(int var1, int var2, int var3, byte var4) {
      try {
         Iterator var5 = this.field_2586.iterator();

         class_6 var6;
         do {
            if(!var5.hasNext()) {
               return null;
            }

            if(var4 >= 41) {
               throw new IllegalStateException();
            }

            var6 = (class_6)var5.next();
         } while(!var6.method_23(var1, var2, var3, 264048682));

         if(var4 >= 41) {
            throw new IllegalStateException();
         } else {
            return var6.method_13(var1, var2, var3, 1943891890);
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "fo.p(" + ')');
      }
   }

   // $FF: renamed from: bv () int
   public int method_4368() {
      return -1820038389 * this.field_2580.field_3234;
   }

   // $FF: renamed from: r (int) void
   void method_4369(int var1) {
      try {
         Iterator var2 = this.field_2586.iterator();

         while(var2.hasNext()) {
            if(var1 >= -1700415935) {
               return;
            }

            class_6 var3 = (class_6)var2.next();
            var3.method_16(this, 1120913212);
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "fo.r(" + ')');
      }
   }

   // $FF: renamed from: b (int) int
   public int method_4370(int var1) {
      try {
         return this.field_2581 * -1076767211;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fo.b(" + ')');
      }
   }

   // $FF: renamed from: d (byte) boolean
   public boolean method_4371(byte var1) {
      try {
         return this.field_2585;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fo.d(" + ')');
      }
   }

   // $FF: renamed from: s (byte) java.lang.String
   public String method_4372(byte var1) {
      try {
         return this.field_2587;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fo.s(" + ')');
      }
   }

   // $FF: renamed from: aj () boolean
   public boolean method_4373() {
      return this.field_2585;
   }

   // $FF: renamed from: l (int) int
   int method_4374(int var1) {
      try {
         return this.field_2578 * -1286502133;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fo.l(" + ')');
      }
   }

   // $FF: renamed from: o (int) int
   public int method_4375(int var1) {
      try {
         return -1817380147 * this.field_2579;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fo.o(" + ')');
      }
   }

   // $FF: renamed from: c (int) int
   public int method_4376(int var1) {
      try {
         return this.field_2584 * -214984287;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fo.c(" + ')');
      }
   }

   // $FF: renamed from: at () int
   int method_4377() {
      return this.field_2578 * -1286502133;
   }

   // $FF: renamed from: g (byte) int
   public int method_4378(byte var1) {
      try {
         return this.field_2583 * -1153356879;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fo.g(" + ')');
      }
   }

   // $FF: renamed from: ai () int
   public int method_4379() {
      return this.field_2581 * -1076767211;
   }

   // $FF: renamed from: k (int) int
   public int method_4380(int var1) {
      try {
         return this.field_2580.field_3236 * -2092998769;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fo.k(" + ')');
      }
   }

   // $FF: renamed from: m (int) int
   public int method_4381(int var1) {
      try {
         return -1820038389 * this.field_2580.field_3234;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fo.m(" + ')');
      }
   }

   // $FF: renamed from: q (int, int, int) boolean
   public boolean method_4382(int var1, int var2, int var3) {
      Iterator var4 = this.field_2586.iterator();

      class_6 var5;
      do {
         if(!var4.hasNext()) {
            return false;
         }

         var5 = (class_6)var4.next();
      } while(!var5.method_23(var1, var2, var3, 264048682));

      return true;
   }

   // $FF: renamed from: i (int, int, int) boolean
   public boolean method_4383(int var1, int var2, int var3) {
      Iterator var4 = this.field_2586.iterator();

      class_6 var5;
      do {
         if(!var4.hasNext()) {
            return false;
         }

         var5 = (class_6)var4.next();
      } while(!var5.method_23(var1, var2, var3, 264048682));

      return true;
   }

   // $FF: renamed from: w (nd) gi
   class_6 method_4384(class_28 var1) {
      int var2 = var1.method_130(-876321394);
      class_238[] var3 = new class_238[]{class_238.field_2647, class_238.field_2649, class_238.field_2648, class_238.field_2646};
      class_238 var4 = (class_238)class_197.method_4016(var3, var2, -611336247);
      Object var5 = null;
      switch(var4.field_2650 * -694186145) {
      case 0:
         class_216 var8 = new class_216();
         var5 = var8;
         break;
      case 1:
         class_239 var7 = new class_239();
         var5 = var7;
         break;
      case 2:
         class_244 var6 = new class_244();
         var5 = var6;
         break;
      case 3:
         class_224 var10000 = new class_224();
         var5 = var10000;
         break;
      default:
         throw new IllegalStateException("");
      }

      ((class_6)var5).method_15(var1, -1138667895);
      return (class_6)var5;
   }

   // $FF: renamed from: t (nd) gi
   class_6 method_4385(class_28 var1) {
      int var2 = var1.method_130(-2093598417);
      class_238[] var3 = new class_238[]{class_238.field_2647, class_238.field_2649, class_238.field_2648, class_238.field_2646};
      class_238 var4 = (class_238)class_197.method_4016(var3, var2, -611336247);
      Object var5 = null;
      switch(var4.field_2650 * -694186145) {
      case 0:
         class_216 var8 = new class_216();
         var5 = var8;
         break;
      case 1:
         class_239 var7 = new class_239();
         var5 = var7;
         break;
      case 2:
         class_244 var6 = new class_244();
         var5 = var6;
         break;
      case 3:
         class_224 var10000 = new class_224();
         var5 = var10000;
         break;
      default:
         throw new IllegalStateException("");
      }

      ((class_6)var5).method_15(var1, -1138667895);
      return (class_6)var5;
   }

   // $FF: renamed from: h (nd) gi
   class_6 method_4386(class_28 var1) {
      int var2 = var1.method_130(819788546);
      class_238[] var3 = new class_238[]{class_238.field_2647, class_238.field_2649, class_238.field_2648, class_238.field_2646};
      class_238 var4 = (class_238)class_197.method_4016(var3, var2, -611336247);
      Object var5 = null;
      switch(var4.field_2650 * -694186145) {
      case 0:
         class_216 var8 = new class_216();
         var5 = var8;
         break;
      case 1:
         class_239 var7 = new class_239();
         var5 = var7;
         break;
      case 2:
         class_244 var6 = new class_244();
         var5 = var6;
         break;
      case 3:
         class_224 var10000 = new class_224();
         var5 = var10000;
         break;
      default:
         throw new IllegalStateException("");
      }

      ((class_6)var5).method_15(var1, -1138667895);
      return (class_6)var5;
   }

   // $FF: renamed from: y (int, int, int) boolean
   public boolean method_4387(int var1, int var2, int var3) {
      try {
         int var4 = var1 / 64;
         int var5 = var2 / 64;
         if(var4 >= -214984287 * this.field_2584) {
            if(var3 == 1948718574) {
               throw new IllegalStateException();
            }

            if(var4 <= 1975622015 * this.field_2575) {
               if(var5 >= -1153356879 * this.field_2583) {
                  if(var3 == 1948718574) {
                     throw new IllegalStateException();
                  }

                  if(var5 <= this.field_2582 * 1020551999) {
                     Iterator var6 = this.field_2586.iterator();

                     class_6 var7;
                     do {
                        if(!var6.hasNext()) {
                           return false;
                        }

                        if(var3 == 1948718574) {
                           throw new IllegalStateException();
                        }

                        var7 = (class_6)var6.next();
                     } while(!var7.method_14(var1, var2, (byte)-77));

                     if(var3 == 1948718574) {
                        throw new IllegalStateException();
                     }

                     return true;
                  }

                  if(var3 == 1948718574) {
                     throw new IllegalStateException();
                  }
               }

               return false;
            }

            if(var3 == 1948718574) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var8) {
         throw class_223.method_4281(var8, "fo.y(" + ')');
      }
   }

   // $FF: renamed from: f (int, int, int, int) boolean
   public boolean method_4388(int var1, int var2, int var3, int var4) {
      try {
         Iterator var5 = this.field_2586.iterator();

         class_6 var6;
         do {
            if(!var5.hasNext()) {
               return false;
            }

            var6 = (class_6)var5.next();
         } while(!var6.method_23(var1, var2, var3, 264048682));

         if(var4 >= -1263379098) {
            throw new IllegalStateException();
         } else {
            return true;
         }
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "fo.f(" + ')');
      }
   }

   // $FF: renamed from: ae (int, int) boolean
   public boolean method_4389(int var1, int var2) {
      int var3 = var1 / 64;
      int var4 = var2 / 64;
      if(var3 >= -214984287 * this.field_2584 && var3 <= -289399208 * this.field_2575) {
         if(var4 >= -1153356879 * this.field_2583 && var4 <= this.field_2582 * -852228233) {
            Iterator var5 = this.field_2586.iterator();

            class_6 var6;
            do {
               if(!var5.hasNext()) {
                  return false;
               }

               var6 = (class_6)var5.next();
            } while(!var6.method_14(var1, var2, (byte)-97));

            return true;
         } else {
            return false;
         }
      } else {
         return false;
      }
   }

   // $FF: renamed from: ap (int, int, int) int[]
   public int[] method_4390(int var1, int var2, int var3) {
      Iterator var4 = this.field_2586.iterator();

      class_6 var5;
      do {
         if(!var4.hasNext()) {
            return null;
         }

         var5 = (class_6)var4.next();
      } while(!var5.method_23(var1, var2, var3, 264048682));

      return var5.method_13(var1, var2, var3, 1943891890);
   }

   // $FF: renamed from: ab (int, int, int) int[]
   public int[] method_4391(int var1, int var2, int var3) {
      Iterator var4 = this.field_2586.iterator();

      class_6 var5;
      do {
         if(!var4.hasNext()) {
            return null;
         }

         var5 = (class_6)var4.next();
      } while(!var5.method_23(var1, var2, var3, 264048682));

      return var5.method_13(var1, var2, var3, 1943891890);
   }

   // $FF: renamed from: ac () java.lang.String
   public String method_4392() {
      return this.field_2577;
   }

   // $FF: renamed from: ad () void
   void method_4393() {
      Iterator var1 = this.field_2586.iterator();

      while(var1.hasNext()) {
         class_6 var2 = (class_6)var1.next();
         var2.method_16(this, -1431620033);
      }

   }

   // $FF: renamed from: z (byte) ii
   public class_280 method_4394(byte var1) {
      try {
         class_280 var10000 = new class_280(this.field_2580);
         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fo.z(" + ')');
      }
   }

   // $FF: renamed from: ar () int
   public int method_4395() {
      return this.field_2581 * 720587867;
   }

   // $FF: renamed from: ax () boolean
   public boolean method_4396() {
      return this.field_2585;
   }

   // $FF: renamed from: al (int, int, int) int[]
   public int[] method_4397(int var1, int var2, int var3) {
      Iterator var4 = this.field_2586.iterator();

      class_6 var5;
      do {
         if(!var4.hasNext()) {
            return null;
         }

         var5 = (class_6)var4.next();
      } while(!var5.method_23(var1, var2, var3, 264048682));

      return var5.method_13(var1, var2, var3, 1943891890);
   }

   // $FF: renamed from: as () boolean
   public boolean method_4398() {
      return this.field_2585;
   }

   // $FF: renamed from: j (int, int, int) ii
   public class_280 method_4399(int var1, int var2, int var3) {
      try {
         Iterator var4 = this.field_2586.iterator();

         class_6 var5;
         do {
            if(!var4.hasNext()) {
               return null;
            }

            if(var3 >= 305040792) {
               throw new IllegalStateException();
            }

            var5 = (class_6)var4.next();
         } while(!var5.method_14(var1, var2, (byte)-11));

         return var5.method_29(var1, var2, 691158162);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "fo.j(" + ')');
      }
   }

   // $FF: renamed from: am () java.lang.String
   public String method_4400() {
      return this.field_2587;
   }

   // $FF: renamed from: az () java.lang.String
   public String method_4401() {
      return this.field_2577;
   }

   // $FF: renamed from: a (int) int
   public int method_4402(int var1) {
      try {
         return this.field_2582 * 1020551999;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fo.a(" + ')');
      }
   }

   // $FF: renamed from: av () java.lang.String
   public String method_4403() {
      return this.field_2577;
   }

   // $FF: renamed from: <init> () void
   public class_230() {
      super();
      this.field_2581 = -1914980669;
      this.field_2578 = -476314275;
      this.field_2579 = -1699709445;
      this.field_2580 = null;
      this.field_2584 = 60388767;
      this.field_2575 = 0;
      this.field_2583 = 1636287151;
      this.field_2582 = 0;
      this.field_2585 = false;
   }

   // $FF: renamed from: bq () int
   public int method_4405() {
      return this.field_2582 * 1020551999;
   }

   // $FF: renamed from: ao () int
   public int method_4406() {
      return -1817380147 * this.field_2579;
   }

   // $FF: renamed from: aq () int
   public int method_4407() {
      return -1817380147 * this.field_2579;
   }

   // $FF: renamed from: aw () int
   public int method_4408() {
      return -1817380147 * this.field_2579;
   }

   // $FF: renamed from: af () int
   public int method_4409() {
      return this.field_2584 * 1199044722;
   }

   // $FF: renamed from: ak () int
   public int method_4410() {
      return this.field_2584 * -214984287;
   }

   // $FF: renamed from: bs () int
   public int method_4411() {
      return this.field_2580.field_3235 * 349527629;
   }

   // $FF: renamed from: ag () boolean
   public boolean method_4412() {
      return this.field_2585;
   }

   // $FF: renamed from: au () int
   public int method_4413() {
      return -1006731425 * this.field_2575;
   }

   // $FF: renamed from: an () int
   public int method_4414() {
      return 1975622015 * this.field_2575;
   }

   // $FF: renamed from: br () int
   public int method_4415() {
      return this.field_2580.field_3235 * 349527629;
   }

   // $FF: renamed from: bt () int
   public int method_4416() {
      return this.field_2582 * 1020551999;
   }

   // $FF: renamed from: aa () int
   public int method_4417() {
      return this.field_2584 * 603975825;
   }

   // $FF: renamed from: bu () int
   public int method_4418() {
      return this.field_2580.field_3236 * -2092998769;
   }

   // $FF: renamed from: bl () int
   public int method_4419() {
      return -1820038389 * this.field_2580.field_3234;
   }

   // $FF: renamed from: u (int) java.lang.String
   public String method_4420(int var1) {
      try {
         return this.field_2577;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fo.u(" + ')');
      }
   }

   // $FF: renamed from: ah () int
   int method_4421() {
      return this.field_2578 * -1286502133;
   }

   // $FF: renamed from: bz () int
   public int method_4422() {
      return this.field_2580.field_3235 * 349527629;
   }

   // $FF: renamed from: bh () int
   public int method_4423() {
      return this.field_2580.field_3235 * 349527629;
   }

   // $FF: renamed from: e (int) int
   public int method_4424(int var1) {
      try {
         return 1975622015 * this.field_2575;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fo.e(" + ')');
      }
   }

   // $FF: renamed from: bd () int
   public int method_4425() {
      return this.field_2583 * -2005403877;
   }

   // $FF: renamed from: bf () ii
   public class_280 method_4426() {
      class_280 var10000 = new class_280(this.field_2580);
      return var10000;
   }
}
