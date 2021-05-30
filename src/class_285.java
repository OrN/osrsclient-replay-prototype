
// $FF: renamed from: ir
public class class_285 {

   // $FF: renamed from: j int[]
   int[] field_3261;
   // $FF: renamed from: n int
   int field_3262;
   // $FF: renamed from: p int[]
   int[] field_3263;
   // $FF: renamed from: y int[]
   int[] field_3264;
    // $FF: renamed from: r int
   int field_3266;
   // $FF: renamed from: f int[]
   int[] field_3267;
    // $FF: renamed from: d long
   long field_3269;
   // $FF: renamed from: s byte[]
   static final byte[] field_3270;
    // $FF: renamed from: v nd
   Buffer field_3274;


    // $FF: renamed from: <init> (byte[]) void
   class_285(byte[] var1) {
      super();
      Buffer var10001 = new Buffer((byte[])null);
      this.field_3274 = var10001;
      this.method_5233(var1);
   }

    // $FF: renamed from: f () boolean
   boolean method_5195() {
      return this.field_3274.data != null;
   }

   // $FF: renamed from: y () int
   int method_5196() {
      return this.field_3264.length;
   }

   // $FF: renamed from: p (int) void
   void method_5197(int var1) {
      this.field_3274.offset = this.field_3264[var1] * -1025691571;
   }

    // $FF: renamed from: d (int) int
   int method_5201(int var1) {
      int var2 = this.method_5202(var1);
      return var2;
   }

   // $FF: renamed from: s (int) int
   int method_5202(int var1) {
      byte var2 = this.field_3274.data[this.field_3274.offset * -442398587];
      int var5;
      if(var2 < 0) {
         var5 = var2 & 255;
         this.field_3261[var1] = var5;
         this.field_3274.offset += -1025691571;
      } else {
         var5 = this.field_3261[var1];
      }

      if(var5 != 240 && var5 != 247) {
         return this.method_5203(var1, var5);
      } else {
         int var3 = this.field_3274.method_127(-1103958523);
         if(var5 == 247 && var3 > 0) {
            int var4 = this.field_3274.data[this.field_3274.offset * -442398587] & 255;
            if(var4 >= 241 && var4 <= 243 || var4 == 246 || var4 == 248 || var4 >= 250 && var4 <= 252 || var4 == 254) {
               this.field_3274.offset += -1025691571;
               this.field_3261[var1] = var4;
               return this.method_5203(var1, var4);
            }
         }

         this.field_3274.offset += var3 * -1025691571;
         return 0;
      }
   }

   // $FF: renamed from: u (int, int) int
   int method_5203(int var1, int var2) {
      int var4;
      if(var2 == 255) {
         int var7 = this.field_3274.readUnsignedByte();
         var4 = this.field_3274.method_127(126843636);
         if(var7 == 47) {
            this.field_3274.offset += var4 * -1025691571;
            return 1;
         } else if(var7 == 81) {
            int var5 = this.field_3274.method_134();
            var4 -= 3;
            int var6 = this.field_3263[var1];
            this.field_3269 += (long)var6 * (long)(this.field_3266 - var5);
            this.field_3266 = var5;
            this.field_3274.offset += var4 * -1025691571;
            return 2;
         } else {
            this.field_3274.offset += var4 * -1025691571;
            return 3;
         }
      } else {
         byte var3 = field_3270[var2 - 128];
         var4 = var2;
         if(var3 >= 1) {
            var4 = var2 | this.field_3274.readUnsignedByte() << 8;
         }

         if(var3 >= 2) {
            var4 |= this.field_3274.readUnsignedByte() << 16;
         }

         return var4;
      }
   }

    // $FF: renamed from: o () int
   int method_5205() {
      int var1 = this.field_3264.length;
      int var2 = -1;
      int var3 = Integer.MAX_VALUE;

      for(int var4 = 0; var4 < var1; ++var4) {
         if(this.field_3264[var4] >= 0 && this.field_3263[var4] < var3) {
            var2 = var4;
            var3 = this.field_3263[var4];
         }
      }

      return var2;
   }

    // $FF: renamed from: e (long) void
   void method_5207(long var1) {
      this.field_3269 = var1;
      int var3 = this.field_3264.length;

      for(int var4 = 0; var4 < var3; ++var4) {
         this.field_3263[var4] = 0;
         this.field_3261[var4] = 0;
         this.field_3274.offset = this.field_3267[var4] * -1025691571;
         this.method_5212(var4);
         this.field_3264[var4] = this.field_3274.offset * -442398587;
      }

   }

   // $FF: renamed from: <clinit> () void
   static {
      field_3270 = new byte[]{(byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)1, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)2, (byte)0, (byte)1, (byte)2, (byte)1, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0, (byte)0};
   }

    // $FF: renamed from: <init> () void
   class_285() {
      super();
      Buffer var10001 = new Buffer((byte[])null);
      this.field_3274 = var10001;
   }

    // $FF: renamed from: b (int) void
   void method_5212(int var1) {
      int var2 = this.field_3274.method_127(-207349067);
      this.field_3263[var1] += var2;
   }

    // $FF: renamed from: l (int) long
   long method_5216(int var1) {
      return this.field_3269 + (long)var1 * (long)this.field_3266;
   }

    // $FF: renamed from: c () boolean
   boolean method_5220() {
      int var1 = this.field_3264.length;

      for(int var2 = 0; var2 < var1; ++var2) {
         if(this.field_3264[var2] >= 0) {
            return false;
         }
      }

      return true;
   }

    // $FF: renamed from: j (int) void
   void method_5224(int var1) {
      this.field_3264[var1] = this.field_3274.offset * -442398587;
   }

    // $FF: renamed from: n () void
   void method_5226() {
      this.field_3274.data = null;
      this.field_3267 = null;
      this.field_3264 = null;
      this.field_3263 = null;
      this.field_3261 = null;
   }

    // $FF: renamed from: r () void
   void method_5229() {
      this.field_3274.offset = 1025691571;
   }

    // $FF: renamed from: v (byte[]) void
   void method_5233(byte[] var1) {
      this.field_3274.data = var1;
      this.field_3274.offset = -1666981118;
      int var2 = this.field_3274.readShort();
      this.field_3262 = this.field_3274.readShort();
      this.field_3266 = 500000;
      this.field_3267 = new int[var2];

      int var3;
      int var5;
      for(var3 = 0; var3 < var2; this.field_3274.offset += var5 * -1025691571) {
         int var4 = this.field_3274.readInt();
         var5 = this.field_3274.readInt();
         if(var4 == 1297379947) {
            this.field_3267[var3] = this.field_3274.offset * -442398587;
            ++var3;
         }
      }

      this.field_3269 = 0L;
      this.field_3264 = new int[var2];

      for(var3 = 0; var3 < var2; ++var3) {
         this.field_3264[var3] = this.field_3267[var3];
      }

      this.field_3263 = new int[var2];
      this.field_3261 = new int[var2];
   }

}
