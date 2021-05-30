
// $FF: renamed from: nb
public class class_29 extends class_28 {

   // $FF: renamed from: f int
   int field_18;
   // $FF: renamed from: v oy
   class_404 field_19;
   // $FF: renamed from: n int[]
   static final int[] field_20;


   // $FF: renamed from: n (oy, byte) void
   public void method_354(class_404 var1) {
      try {
         this.field_19 = var1;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: v (int[], int) void
   public void method_355(int[] var1) {
      try {
         class_404 var10001 = new class_404(var1);
         this.field_19 = var10001;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: m () int
   public int method_356() {
      int var1 = this.field_12[(this.field_15 += -1025691571) * -442398587 - 1] - this.field_19.method_6841((byte)27) & 255;
      return var1 < 128?var1:(var1 - 128 << 8) + (this.field_12[(this.field_15 += -1025691571) * -442398587 - 1] - this.field_19.method_6841((byte)95) & 255);
   }

   // $FF: renamed from: f (int, int) void
   public void method_357(int var1) {
      try {
         this.field_12[(this.field_15 += -1025691571) * -442398587 - 1] = (byte)(var1 + this.field_19.method_6841((byte)81));
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: b (int) void
   public void method_358() {
      try {
         this.field_18 = 608211864 * this.field_15;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_20 = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, '\uffff', 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1};
   }

   // $FF: renamed from: i () void
   public void method_359() {
      this.field_18 = 608211864 * this.field_15;
   }

   // $FF: renamed from: r (byte[], int, int, short) void
   public void method_360(byte[] var1, int var2, int var3, short var4) {
      try {
         for(int var5 = 0; var5 < var3; ++var5) {
            if(var4 != 255) {
               throw new IllegalStateException();
            }

            var1[var5 + var2] = (byte)(this.field_12[(this.field_15 += -1025691571) * -442398587 - 1] - this.field_19.method_6841((byte)120));
         }

      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: <init> (int) void
   public class_29(int var1) {
      super(var1);
      try {
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: d (int, byte) int
   public int method_361(int var1, byte var2) {
      try {
         int var3 = this.field_18 * -958717145 >> 3;
         int var4 = 8 - (this.field_18 * -958717145 & 7);
         int var5 = 0;

         for(this.field_18 += var1 * -1817568105; var1 > var4; var4 = 8) {
            if(var2 == 14) {
               throw new IllegalStateException();
            }

            var5 += (this.field_12[var3++] & field_20[var4]) << var1 - var4;
            var1 -= var4;
         }

         if(var1 == var4) {
            if(var2 == 14) {
               throw new IllegalStateException();
            }

            var5 += this.field_12[var3] & field_20[var4];
         } else {
            var5 += this.field_12[var3] >> var4 - var1 & field_20[var1];
         }

         return var5;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: s (byte) void
   public void method_362() {
      try {
         this.field_15 = (-958717145 * this.field_18 + 7) / 8 * -1025691571;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: u (int, byte) int
   public int method_363(int var1) {
      try {
         return 8 * var1 - -958717145 * this.field_18;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: al (int) int
   public int method_364(int var1) {
      return 8 * var1 - -958717145 * this.field_18;
   }

   // $FF: renamed from: l (int[]) void
   public void method_365(int[] var1) {
      class_404 var10001 = new class_404(var1);
      this.field_19 = var10001;
   }

   // $FF: renamed from: o (int[]) void
   public void method_366(int[] var1) {
      class_404 var10001 = new class_404(var1);
      this.field_19 = var10001;
   }

   // $FF: renamed from: c (oy) void
   public void method_367(class_404 var1) {
      this.field_19 = var1;
   }

   // $FF: renamed from: p (int) boolean
   public boolean method_368(int var1) {
      try {
         int var2 = this.field_12[-442398587 * this.field_15] - this.field_19.method_6842((byte)-58) & 255;
         if(var2 < 128) {
            if(var1 == 1501339273) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            return true;
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: e () int
   public int method_369() {
      return this.field_12[(this.field_15 += -1025691571) * -442398587 - 1] - this.field_19.method_6841((byte)83) & 255;
   }

   // $FF: renamed from: a () boolean
   public boolean method_370() {
      int var1 = this.field_12[-442398587 * this.field_15] - this.field_19.method_6842((byte)-98) & 255;
      return var1 >= 128;
   }

   // $FF: renamed from: k () int
   public int method_371() {
      int var1 = this.field_12[(this.field_15 += -1025691571) * -442398587 - 1] - this.field_19.method_6841((byte)11) & 255;
      return var1 < 128?var1:(var1 - 128 << 8) + (this.field_12[(this.field_15 += -1025691571) * -442398587 - 1] - this.field_19.method_6841((byte)39) & 255);
   }

   // $FF: renamed from: h (byte[], int, int) void
   public void method_372(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var4 + var2] = (byte)(this.field_12[(this.field_15 += -1025691571) * -442398587 - 1] - this.field_19.method_6841((byte)74));
      }

   }

   // $FF: renamed from: x () int
   public int method_373() {
      int var1 = this.field_12[(this.field_15 += -1025691571) * -442398587 - 1] - this.field_19.method_6841((byte)42) & 255;
      return var1 < 128?var1:(var1 - 128 << 8) + (this.field_12[(this.field_15 += -1025691571) * -442398587 - 1] - this.field_19.method_6841((byte)63) & 255);
   }

   // $FF: renamed from: z () int
   public int method_374() {
      int var1 = this.field_12[(this.field_15 += -1025691571) * 1058608607 - 1] - this.field_19.method_6841((byte)36) & 255;
      return var1 < -2034336270?var1:(var1 - -533781148 << 8) + (this.field_12[(this.field_15 += 2128572356) * -442398587 - 1] - this.field_19.method_6841((byte)42) & 255);
   }

   // $FF: renamed from: w () int
   public int method_375() {
      int var1 = this.field_12[(this.field_15 += -1025691571) * -442398587 - 1] - this.field_19.method_6841((byte)109) & 255;
      return var1 < 128?var1:(var1 - 128 << 8) + (this.field_12[(this.field_15 += -1025691571) * -442398587 - 1] - this.field_19.method_6841((byte)43) & 255);
   }

   // $FF: renamed from: t (byte[], int, int) void
   public void method_376(byte[] var1, int var2, int var3) {
      for(int var4 = 0; var4 < var3; ++var4) {
         var1[var4 + var2] = (byte)(this.field_12[(this.field_15 += -1025691571) * -442398587 - 1] - this.field_19.method_6841((byte)43));
      }

   }

   // $FF: renamed from: j (int) int
   public int method_377(int var1) {
      try {
         int var2 = this.field_12[(this.field_15 += -1025691571) * -442398587 - 1] - this.field_19.method_6841((byte)32) & 255;
         if(var2 < 128) {
            if(var1 <= -1494377253) {
               throw new IllegalStateException();
            } else {
               return var2;
            }
         } else {
            return (var2 - 128 << 8) + (this.field_12[(this.field_15 += -1025691571) * -442398587 - 1] - this.field_19.method_6841((byte)12) & 255);
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: q () void
   public void method_378() {
      this.field_18 = 608211864 * this.field_15;
   }

   // $FF: renamed from: y (byte) int
   public int method_379() {
      try {
         return this.field_12[(this.field_15 += -1025691571) * -442398587 - 1] - this.field_19.method_6841((byte)81) & 255;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: ae (int) int
   public int method_380(int var1) {
      int var2 = this.field_18 * -958717145 >> 3;
      int var3 = 8 - (this.field_18 * -958717145 & 7);
      int var4 = 0;

      for(this.field_18 += var1 * -1817568105; var1 > var3; var3 = 8) {
         var4 += (this.field_12[var2++] & field_20[var3]) << var1 - var3;
         var1 -= var3;
      }

      if(var1 == var3) {
         var4 += this.field_12[var2] & field_20[var3];
      } else {
         var4 += this.field_12[var2] >> var3 - var1 & field_20[var1];
      }

      return var4;
   }

   // $FF: renamed from: ap (int) int
   public int method_381(int var1) {
      int var2 = this.field_18 * 673402490 >> 3;
      int var3 = 8 - (this.field_18 * -1148327983 & 7);
      int var4 = 0;

      for(this.field_18 += var1 * -1817568105; var1 > var3; var3 = 8) {
         var4 += (this.field_12[var2++] & field_20[var3]) << var1 - var3;
         var1 -= var3;
      }

      if(var1 == var3) {
         var4 += this.field_12[var2] & field_20[var3];
      } else {
         var4 += this.field_12[var2] >> var3 - var1 & field_20[var1];
      }

      return var4;
   }

   // $FF: renamed from: ab (int) int
   public int method_382(int var1) {
      int var2 = this.field_18 * -958717145 >> 3;
      int var3 = 8 - (this.field_18 * 1864982744 & 7);
      int var4 = 0;

      for(this.field_18 += var1 * -1817568105; var1 > var3; var3 = 8) {
         var4 += (this.field_12[var2++] & field_20[var3]) << var1 - var3;
         var1 -= var3;
      }

      if(var1 == var3) {
         var4 += this.field_12[var2] & field_20[var3];
      } else {
         var4 += this.field_12[var2] >> var3 - var1 & field_20[var1];
      }

      return var4;
   }

   // $FF: renamed from: g () int
   public int method_383() {
      return this.field_12[(this.field_15 += -1025691571) * -442398587 - 1] - this.field_19.method_6841((byte)92) & 255;
   }

   // $FF: renamed from: ad (int) int
   public int method_384(int var1) {
      return 8 * var1 - -958717145 * this.field_18;
   }
}
