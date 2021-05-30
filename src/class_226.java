import java.util.LinkedList;

// $FF: renamed from: fm
public abstract class class_226 {

   // $FF: renamed from: p int
   int field_2545;
   // $FF: renamed from: a fh[][][][]
   class_223[][][][] field_2546;
   // $FF: renamed from: r int
   int field_2547;
   // $FF: renamed from: b int
   int field_2548;
   // $FF: renamed from: d int
   int field_2549;
   // $FF: renamed from: s int
   int field_2550;
   // $FF: renamed from: bd int
   public static final int field_2551 = 67;
   // $FF: renamed from: j int
   int field_2552;
   // $FF: renamed from: o short[][][]
   short[][][] field_2553;
   // $FF: renamed from: c short[][][]
   short[][][] field_2554;
   // $FF: renamed from: g byte[][][]
   byte[][][] field_2555;
   // $FF: renamed from: l int
   int field_2556;
   // $FF: renamed from: e byte[][][]
   byte[][][] field_2557;
   // $FF: renamed from: k boolean
   boolean field_2558;
   // $FF: renamed from: m boolean
   boolean field_2559;
   // $FF: renamed from: u int
   int field_2560;


   // $FF: renamed from: ab (int) void
   void method_4291(int var1) {
      try {
         this.field_2553 = (short[][][])null;
         this.field_2554 = (short[][][])null;
         this.field_2557 = (byte[][][])null;
         this.field_2555 = (byte[][][])null;
         this.field_2546 = (class_223[][][][])null;
         this.field_2558 = false;
         this.field_2559 = false;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fm.ab(" + ')');
      }
   }

   // $FF: renamed from: ae (byte) boolean
   boolean method_4292(byte var1) {
      try {
         boolean var10000;
         if(this.field_2558) {
            if(var1 != 25) {
               throw new IllegalStateException();
            }

            if(this.field_2559) {
               if(var1 != 25) {
                  throw new IllegalStateException();
               }

               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fm.ae(" + ')');
      }
   }

   // $FF: renamed from: ap (jv, int) void
   void method_4293(class_306 var1, int var2) {
      try {
         if(!this.method_4292((byte)25)) {
            byte[] var3 = var1.method_5381(-630921225 * this.field_2560, -373998791 * this.field_2556, -26460885);
            if(null != var3) {
               if(var2 >= -1541751261) {
                  throw new IllegalStateException();
               }

               class_28 var10001 = new class_28(var3);
               this.method_4306(var10001, 1223315238);
               this.field_2558 = true;
               this.field_2559 = true;
            }

         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "fm.ap(" + ')');
      }
   }

   // $FF: renamed from: as () boolean
   boolean method_4294() {
      return this.field_2558 && this.field_2559;
   }

   // $FF: renamed from: al (int, int, nd, int) void
   void method_4295(int var1, int var2, class_28 var3, int var4) {
      try {
         int var5 = var3.method_130(-2084060017);
         if(0 == var5) {
            if(var4 == -1087727229) {
               throw new IllegalStateException();
            }
         } else {
            if((var5 & 1) != 0) {
               if(var4 == -1087727229) {
                  return;
               }

               this.method_4296(var1, var2, var3, var5, -300212411);
            } else {
               this.method_4317(var1, var2, var3, var5, -2123814102);
            }

         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "fm.al(" + ')');
      }
   }

   // $FF: renamed from: ad (int, int, nd, int, int) void
   void method_4296(int var1, int var2, class_28 var3, int var4, int var5) {
      try {
         boolean var10000;
         if((var4 & 2) != 0) {
            if(var5 != -300212411) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var6 = var10000;
         if(var6) {
            this.field_2554[0][var1][var2] = (short)var3.method_130(1987031144);
         }

         this.field_2553[0][var1][var2] = (short)var3.method_130(109820437);
      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "fm.ad(" + ')');
      }
   }

   // $FF: renamed from: bt () int
   int method_4297() {
      return this.field_2548 * 174092143;
   }

   // $FF: renamed from: <init> () void
   class_226() {
      super();
      try {
         this.field_2560 = -30935495;
         this.field_2556 = 836156663;
         new LinkedList();
         this.field_2558 = false;
         this.field_2559 = false;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "fm.<init>(" + ')');
      }
   }

   // $FF: renamed from: ax () boolean
   boolean method_4299() {
      return this.field_2558 && this.field_2559;
   }

   // $FF: renamed from: ar (int) int
   int method_4300(int var1) {
      try {
         return this.field_2547 * 1253594293;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fm.ar(" + ')');
      }
   }

   // $FF: renamed from: j (nd) void
   abstract void method_4301(class_28 var1);

   // $FF: renamed from: ag (byte) int
   int method_4302(byte var1) {
      try {
         return this.field_2548 * 174092143;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "fm.ag(" + ')');
      }
   }

   // $FF: renamed from: bd () int
   int method_4303() {
      return this.field_2547 * -189807535;
   }

   // $FF: renamed from: aj () boolean
   boolean method_4304() {
      return this.field_2558 && this.field_2559;
   }

   // $FF: renamed from: am (jv) void
   void method_4305(class_306 var1) {
      if(!this.method_4292((byte)25)) {
         byte[] var2 = var1.method_5381(-630921225 * this.field_2560, -373998791 * this.field_2556, -26460885);
         if(null != var2) {
            class_28 var10001 = new class_28(var2);
            this.method_4306(var10001, 1223315238);
            this.field_2558 = true;
            this.field_2559 = true;
         }

      }
   }

   // $FF: renamed from: n (nd, int) void
   abstract void method_4306(class_28 var1, int var2);

   // $FF: renamed from: av (jv) void
   void method_4307(class_306 var1) {
      if(!this.method_4292((byte)25)) {
         byte[] var2 = var1.method_5381(-630921225 * this.field_2560, -373998791 * this.field_2556, -26460885);
         if(null != var2) {
            class_28 var10001 = new class_28(var2);
            this.method_4306(var10001, 1223315238);
            this.field_2558 = true;
            this.field_2559 = true;
         }

      }
   }

   // $FF: renamed from: ac (jv) void
   void method_4308(class_306 var1) {
      if(!this.method_4292((byte)25)) {
         byte[] var2 = var1.method_5381(-630921225 * this.field_2560, -373998791 * this.field_2556, -26460885);
         if(null != var2) {
            class_28 var10001 = new class_28(var2);
            this.method_4306(var10001, 1223315238);
            this.field_2558 = true;
            this.field_2559 = true;
         }

      }
   }

   // $FF: renamed from: at () void
   void method_4309() {
      this.field_2553 = (short[][][])null;
      this.field_2554 = (short[][][])null;
      this.field_2557 = (byte[][][])null;
      this.field_2555 = (byte[][][])null;
      this.field_2546 = (class_223[][][][])null;
      this.field_2558 = false;
      this.field_2559 = false;
   }

   // $FF: renamed from: ah () void
   void method_4310() {
      this.field_2553 = (short[][][])null;
      this.field_2554 = (short[][][])null;
      this.field_2557 = (byte[][][])null;
      this.field_2555 = (byte[][][])null;
      this.field_2546 = (class_223[][][][])null;
      this.field_2558 = false;
      this.field_2559 = false;
   }

   // $FF: renamed from: ao () void
   void method_4311() {
      this.field_2553 = (short[][][])null;
      this.field_2554 = (short[][][])null;
      this.field_2557 = (byte[][][])null;
      this.field_2555 = (byte[][][])null;
      this.field_2546 = (class_223[][][][])null;
      this.field_2558 = false;
      this.field_2559 = false;
   }

   // $FF: renamed from: aq (int, int, nd) void
   void method_4312(int var1, int var2, class_28 var3) {
      int var4 = var3.method_130(865652325);
      if(0 != var4) {
         if((var4 & 1) != 0) {
            this.method_4296(var1, var2, var3, var4, -300212411);
         } else {
            this.method_4317(var1, var2, var3, var4, -2133492631);
         }

      }
   }

   // $FF: renamed from: aw (int, int, nd) void
   void method_4313(int var1, int var2, class_28 var3) {
      int var4 = var3.method_130(2075419688);
      if(0 != var4) {
         if((var4 & 1) != 0) {
            this.method_4296(var1, var2, var3, var4, -300212411);
         } else {
            this.method_4317(var1, var2, var3, var4, -2143027430);
         }

      }
   }

   // $FF: renamed from: af (int, int, nd, int) void
   void method_4314(int var1, int var2, class_28 var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if(var5) {
         this.field_2554[0][var1][var2] = (short)var3.method_130(1895347707);
      }

      this.field_2553[0][var1][var2] = (short)var3.method_130(-454605480);
   }

   // $FF: renamed from: ak (int, int, nd, int) void
   void method_4315(int var1, int var2, class_28 var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if(var5) {
         this.field_2554[0][var1][var2] = (short)var3.method_130(-1729252359);
      }

      this.field_2553[0][var1][var2] = (short)var3.method_130(828592506);
   }

   // $FF: renamed from: ay (int, int, nd, int) void
   void method_4316(int var1, int var2, class_28 var3, int var4) {
      boolean var5 = (var4 & 2) != 0;
      if(var5) {
         this.field_2554[0][var1][var2] = (short)var3.method_130(-1899978541);
      }

      this.field_2553[0][var1][var2] = (short)var3.method_130(1472973765);
   }

   // $FF: renamed from: ai (int, int, nd, int, int) void
   void method_4317(int var1, int var2, class_28 var3, int var4, int var5) {
      try {
         int var6 = ((var4 & 24) >> 3) + 1;
         boolean var10000;
         if((var4 & 2) != 0) {
            if(var5 >= -2122241510) {
               return;
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var7 = var10000;
         if(0 != (var4 & 4)) {
            if(var5 >= -2122241510) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         boolean var8 = var10000;
         this.field_2553[0][var1][var2] = (short)var3.method_130(-1592918015);
         int var9;
         int var10;
         int var12;
         if(var7) {
            if(var5 >= -2122241510) {
               return;
            }

            var9 = var3.method_130(-1628967244);

            for(var10 = 0; var10 < var9; ++var10) {
               if(var5 >= -2122241510) {
                  throw new IllegalStateException();
               }

               int var11 = var3.method_130(-403897701);
               if(var11 != 0) {
                  if(var5 >= -2122241510) {
                     throw new IllegalStateException();
                  }

                  this.field_2554[var10][var1][var2] = (short)var11;
                  var12 = var3.method_130(-443126888);
                  this.field_2557[var10][var1][var2] = (byte)(var12 >> 2);
                  this.field_2555[var10][var1][var2] = (byte)(var12 & 3);
               }
            }
         }

         if(var8) {
            if(var5 >= -2122241510) {
               throw new IllegalStateException();
            }

            for(var9 = 0; var9 < var6; ++var9) {
               if(var5 >= -2122241510) {
                  throw new IllegalStateException();
               }

               var10 = var3.method_130(894716755);
               if(0 == var10) {
                  if(var5 >= -2122241510) {
                     return;
                  }
               } else {
                  class_223[] var16 = this.field_2546[var9][var1][var2] = new class_223[var10];

                  for(var12 = 0; var12 < var10; ++var12) {
                     if(var5 >= -2122241510) {
                        throw new IllegalStateException();
                     }

                     int var13 = var3.method_147(1422664365);
                     int var14 = var3.method_130(-1820345209);
                     class_223 var10002 = new class_223(var13, var14 >> 2, var14 & 3);
                     var16[var12] = var10002;
                  }
               }
            }
         }

      } catch (RuntimeException var15) {
         throw class_223.method_4281(var15, "fm.ai(" + ')');
      }
   }

   // $FF: renamed from: aa (int, int, nd, int) void
   void method_4318(int var1, int var2, class_28 var3, int var4) {
      int var5 = ((var4 & 24) >> 3) + 1;
      boolean var6 = (var4 & 2) != 0;
      boolean var7 = 0 != (var4 & 4);
      this.field_2553[0][var1][var2] = (short)var3.method_130(-184141991);
      int var8;
      int var9;
      int var11;
      if(var6) {
         var8 = var3.method_130(43741590);

         for(var9 = 0; var9 < var8; ++var9) {
            int var10 = var3.method_130(1851374983);
            if(var10 != 0) {
               this.field_2554[var9][var1][var2] = (short)var10;
               var11 = var3.method_130(-179578946);
               this.field_2557[var9][var1][var2] = (byte)(var11 >> 2);
               this.field_2555[var9][var1][var2] = (byte)(var11 & 3);
            }
         }
      }

      if(var7) {
         for(var8 = 0; var8 < var5; ++var8) {
            var9 = var3.method_130(-500733352);
            if(0 != var9) {
               class_223[] var14 = this.field_2546[var8][var1][var2] = new class_223[var9];

               for(var11 = 0; var11 < var9; ++var11) {
                  int var12 = var3.method_147(1018812513);
                  int var13 = var3.method_130(-1722594094);
                  class_223 var10002 = new class_223(var12, var13 >> 2, var13 & 3);
                  var14[var11] = var10002;
               }
            }
         }
      }

   }

   // $FF: renamed from: au () int
   int method_4319() {
      return this.field_2547 * 1253594293;
   }

   // $FF: renamed from: an () int
   int method_4320() {
      return this.field_2547 * 1253594293;
   }

   // $FF: renamed from: az (jv) void
   void method_4321(class_306 var1) {
      if(!this.method_4292((byte)25)) {
         byte[] var2 = var1.method_5381(-630921225 * this.field_2560, -1524809937 * this.field_2556, -26460885);
         if(null != var2) {
            class_28 var10001 = new class_28(var2);
            this.method_4306(var10001, 1223315238);
            this.field_2558 = true;
            this.field_2559 = true;
         }

      }
   }
}
