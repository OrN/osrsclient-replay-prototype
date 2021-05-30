
// $FF: renamed from: gg
public class class_244 implements class_6 {

    // $FF: renamed from: n int
   int field_2702;
   // $FF: renamed from: f int
   int field_2703;
   // $FF: renamed from: v int
   int field_2704;
   // $FF: renamed from: p int
   int field_2705;
   // $FF: renamed from: j int
   int field_2706;
   // $FF: renamed from: y int
   int field_2707;
   // $FF: renamed from: aw boolean
   protected static boolean field_2708;


   // $FF: renamed from: g (int, int, int) int[]
   public int[] method_10(int var1, int var2, int var3) {
      if(!this.method_23(var1, var2, var3, 264048682)) {
         return null;
      } else {
         int[] var4 = new int[]{var2 + (this.field_2705 * -1452437440 - 1531899757 * this.field_2703), var3 + (132274724 * this.field_2706 - this.field_2707 * -1023667904)};
         return var4;
      }
   }

   // $FF: renamed from: p (int, int, int) ii
   public class_280 method_29(int var1, int var2, int var3) {
      try {
         if(!this.method_14(var1, var2, (byte)30)) {
            if(var3 <= -1010131779) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int var4 = var1 + (this.field_2703 * -967316800 - this.field_2705 * -1452437440);
            int var5 = var2 + (-1023667904 * this.field_2707 - this.field_2706 * 334149312);
            class_280 var10000 = new class_280(this.field_2704 * -1722297591, var4, var5);
            return var10000;
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: <init> () void
   class_244() {
      super();
      try {
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: f (int, int, byte) boolean
   public boolean method_14(int var1, int var2, byte var3) {
      try {
         boolean var10000;
         if(-1700415935 * this.field_2705 == var1 >> 6) {
            if(var3 >= 31) {
               throw new IllegalStateException();
            }

            if(-61887781 * this.field_2706 == var2 >> 6) {
               if(var3 >= 31) {
                  throw new IllegalStateException();
               }

               var10000 = true;
               return var10000;
            }
         }

         var10000 = false;
         return var10000;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: y (int, int, int, int) int[]
   public int[] method_13(int var1, int var2, int var3, int var4) {
      try {
         if(!this.method_23(var1, var2, var3, 264048682)) {
            if(var4 != 1943891890) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            int[] var5 = new int[]{var2 + (this.field_2705 * -1452437440 - -967316800 * this.field_2703), var3 + (334149312 * this.field_2706 - this.field_2707 * -1023667904)};
            return var5;
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: j (nd, int) void
   public void method_15(Buffer var1) {
      try {
         this.field_2704 = var1.readUnsignedByte() * 761506617;
         this.field_2702 = var1.readUnsignedByte() * 399311255;
         this.field_2703 = var1.readShort() * 173974275;
         this.field_2707 = var1.readShort() * -143809907;
         this.field_2705 = var1.readShort() * 1098209729;
         this.field_2706 = var1.readShort() * -1602338477;
         this.method_4689();
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: z (nd) void
   public void method_11(Buffer var1) {
      this.field_2704 = var1.readUnsignedByte() * 896131215;
      this.field_2702 = var1.readUnsignedByte() * -396182926;
      this.field_2703 = var1.readShort() * -2050052174;
      this.field_2707 = var1.readShort() * -143809907;
      this.field_2705 = var1.readShort() * -786791825;
      this.field_2706 = var1.readShort() * -1602338477;
      this.method_4689();
   }

   // $FF: renamed from: r (int) void
   void method_4689() {
      try {
         ;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: m (int, int) ii
   public class_280 method_27(int var1, int var2) {
      if(!this.method_14(var1, var2, (byte)-74)) {
         return null;
      } else {
         int var3 = var1 + (this.field_2703 * -967316800 - this.field_2705 * -1452437440);
         int var4 = var2 + (-1023667904 * this.field_2707 - this.field_2706 * 334149312);
         class_280 var10000 = new class_280(this.field_2704 * -1722297591, var3, var4);
         return var10000;
      }
   }

   // $FF: renamed from: d (int, int, int) boolean
   public boolean method_17(int var1, int var2, int var3) {
      return var1 >= -1722297591 * this.field_2704 && var1 < this.field_2702 * -1533702617 + -1722297591 * this.field_2704?var2 >> 6 == 51994539 * this.field_2703 && this.field_2707 * 1997271109 == var3 >> 6:false;
   }

   // $FF: renamed from: v (fo, int) void
   public void method_16(class_230 var1, int var2) {
      try {
         if(var1.field_2584 * -214984287 > -1700415935 * this.field_2705) {
            var1.field_2584 = this.field_2705 * 116332705;
         }

         if(var1.field_2575 * 1975622015 < this.field_2705 * -1700415935) {
            if(var2 == 859416337) {
               throw new IllegalStateException();
            }

            var1.field_2575 = this.field_2705 * 1142362175;
         }

         if(var1.field_2583 * -1153356879 > this.field_2706 * -61887781) {
            if(var2 == 859416337) {
               return;
            }

            var1.field_2583 = this.field_2706 * -1852621237;
         }

         if(1020551999 * var1.field_2582 < -61887781 * this.field_2706) {
            if(var2 == 859416337) {
               return;
            }

            var1.field_2582 = 872529253 * this.field_2706;
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: u (int, int, int) boolean
   public boolean method_19(int var1, int var2, int var3) {
      return var1 >= 1586510926 * this.field_2704 && var1 < this.field_2702 * -1533702617 + -1722297591 * this.field_2704?var2 >> 6 == 51994539 * this.field_2703 && this.field_2707 * -654178971 == var3 >> 6:false;
   }

   // $FF: renamed from: l (int, int) boolean
   public boolean method_20(int var1, int var2) {
      return -1700415935 * this.field_2705 == var1 >> 6 && -61887781 * this.field_2706 == var2 >> 6;
   }

   // $FF: renamed from: o (int, int) boolean
   public boolean method_21(int var1, int var2) {
      return -1700415935 * this.field_2705 == var1 >> 6 && 505324930 * this.field_2706 == var2 >> 6;
   }

   // $FF: renamed from: c (int, int) boolean
   public boolean method_22(int var1, int var2) {
      return 1486476933 * this.field_2705 == var1 >> 6 && -1997613805 * this.field_2706 == var2 >> 6;
   }

   // $FF: renamed from: e (int, int, int) int[]
   public int[] method_24(int var1, int var2, int var3) {
      if(!this.method_23(var1, var2, var3, 264048682)) {
         return null;
      } else {
         int[] var4 = new int[]{var2 + (this.field_2705 * -810517831 - 363005722 * this.field_2703), var3 + (334149312 * this.field_2706 - this.field_2707 * -1023667904)};
         return var4;
      }
   }

   // $FF: renamed from: n (int, int, int, int) boolean
   public boolean method_23(int var1, int var2, int var3, int var4) {
      try {
         if(var1 >= -1722297591 * this.field_2704) {
            if(var4 != 264048682) {
               throw new IllegalStateException();
            }

            if(var1 < this.field_2702 * -1533702617 + -1722297591 * this.field_2704) {
               boolean var10000;
               if(var2 >> 6 == 51994539 * this.field_2703 && this.field_2707 * 1997271109 == var3 >> 6) {
                  if(var4 != 264048682) {
                     throw new IllegalStateException();
                  }

                  var10000 = true;
               } else {
                  var10000 = false;
               }

               return var10000;
            }

            if(var4 != 264048682) {
               throw new IllegalStateException();
            }
         }

         return false;
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: a (int, int) ii
   public class_280 method_25(int var1, int var2) {
      if(!this.method_14(var1, var2, (byte)-77)) {
         return null;
      } else {
         int var3 = var1 + (this.field_2703 * 274351343 - this.field_2705 * -1577208233);
         int var4 = var2 + (-1354203530 * this.field_2707 - this.field_2706 * 1915434030);
         class_280 var10000 = new class_280(this.field_2704 * -1137695398, var3, var4);
         return var10000;
      }
   }

   // $FF: renamed from: k (int, int) ii
   public class_280 method_26(int var1, int var2) {
      if(!this.method_14(var1, var2, (byte)-30)) {
         return null;
      } else {
         int var3 = var1 + (this.field_2703 * -967316800 - this.field_2705 * -1452437440);
         int var4 = var2 + (-1023667904 * this.field_2707 - this.field_2706 * 334149312);
         class_280 var10000 = new class_280(this.field_2704 * -1722297591, var3, var4);
         return var10000;
      }
   }

    // $FF: renamed from: x (nd) void
   public void method_28(Buffer var1) {
      this.field_2704 = var1.readUnsignedByte() * 761506617;
      this.field_2702 = var1.readUnsignedByte() * 399311255;
      this.field_2703 = var1.readShort() * 173974275;
      this.field_2707 = var1.readShort() * -143809907;
      this.field_2705 = var1.readShort() * 1098209729;
      this.field_2706 = var1.readShort() * -1602338477;
      this.method_4689();
   }

   // $FF: renamed from: s (int, int, int) boolean
   public boolean method_18(int var1, int var2, int var3) {
      return var1 >= -1722297591 * this.field_2704 && var1 < this.field_2702 * 1382478132 + 137257226 * this.field_2704?var2 >> 6 == 51994539 * this.field_2703 && this.field_2707 * -2032314293 == var3 >> 6:false;
   }

   // $FF: renamed from: b (fo) void
   public void method_12(class_230 var1) {
      if(var1.field_2584 * -214984287 > 900674572 * this.field_2705) {
         var1.field_2584 = this.field_2705 * 1493233087;
      }

      if(var1.field_2575 * -1500188875 < this.field_2705 * 893968928) {
         var1.field_2575 = this.field_2705 * 1142362175;
      }

      if(var1.field_2583 * 596950259 > this.field_2706 * -61887781) {
         var1.field_2583 = this.field_2706 * -1852621237;
      }

      if(1020551999 * var1.field_2582 < -61887781 * this.field_2706) {
         var1.field_2582 = -620110629 * this.field_2706;
      }

   }
}
