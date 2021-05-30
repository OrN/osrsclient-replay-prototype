
// $FF: renamed from: bj
public class class_150 {

    // $FF: renamed from: f int[][][]
   int[][][] field_1899;
   // $FF: renamed from: d int
   static int field_1900;
   // $FF: renamed from: p int[]
   int[] field_1901;
   // $FF: renamed from: r int[][]
   static int[][] field_1902;
    // $FF: renamed from: b float
   static float field_1904;
   // $FF: renamed from: j float[][]
   static float[][] field_1905;
   // $FF: renamed from: v int[]
   int[] field_1906;
    // $FF: renamed from: y int[][][]
   int[][][] field_1908;


   // $FF: renamed from: y (int, float) int
   int method_3183(int var1, float var2) {
      float var3;
      if(var1 == 0) {
         var3 = (float)this.field_1901[0] + (float)(this.field_1901[1] - this.field_1901[0]) * var2;
         var3 *= 0.0030517578F;
         field_1904 = (float)Math.pow(0.1D, (double)(var3 / 20.0F));
         field_1900 = (int)(field_1904 * 65536.0F);
      }

      if(this.field_1906[var1] == 0) {
         return 0;
      } else {
         var3 = this.method_3196(var1, 0, var2);
         field_1905[var1][0] = -2.0F * var3 * (float)Math.cos((double)this.method_3186(var1, 0, var2));
         field_1905[var1][1] = var3 * var3;

         int var4;
         for(var4 = 1; var4 < this.field_1906[var1]; ++var4) {
            var3 = this.method_3196(var1, var4, var2);
            float var5 = -2.0F * var3 * (float)Math.cos((double)this.method_3186(var1, var4, var2));
            float var6 = var3 * var3;
            field_1905[var1][var4 * 2 + 1] = field_1905[var1][var4 * 2 - 1] * var6;
            field_1905[var1][var4 * 2] = field_1905[var1][var4 * 2 - 1] * var5 + field_1905[var1][var4 * 2 - 2] * var6;

            for(int var7 = var4 * 2 - 1; var7 >= 2; --var7) {
               field_1905[var1][var7] += field_1905[var1][var7 - 1] * var5 + field_1905[var1][var7 - 2] * var6;
            }

            field_1905[var1][1] += field_1905[var1][0] * var5 + var6;
            field_1905[var1][0] += var5;
         }

         if(var1 == 0) {
            for(var4 = 0; var4 < this.field_1906[0] * 2; ++var4) {
               field_1905[0][var4] *= field_1904;
            }
         }

         for(var4 = 0; var4 < this.field_1906[var1] * 2; ++var4) {
            field_1902[var1][var4] = (int)(field_1905[var1][var4] * 65536.0F);
         }

         return this.field_1906[var1] * 2;
      }
   }

   // $FF: renamed from: <init> () void
   class_150() {
      super();
      this.field_1906 = new int[2];
      this.field_1899 = new int[2][2][4];
      this.field_1908 = new int[2][2][4];
      this.field_1901 = new int[2];
   }

   // $FF: renamed from: n (float) float
   static float method_3185(float var0) {
      float var1 = 32.703197F * (float)Math.pow(2.0D, (double)var0);
      return var1 * 3.1415927F / 11025.0F;
   }

   // $FF: renamed from: f (int, int, float) float
   float method_3186(int var1, int var2, float var3) {
      float var4 = (float)this.field_1899[var1][0][var2] + var3 * (float)(this.field_1899[var1][1][var2] - this.field_1899[var1][0][var2]);
      var4 *= 1.2207031E-4F;
      return method_3185(var4);
   }

    // $FF: renamed from: p (nd, bt) void
   final void method_3188(Buffer var1, class_156 var2) {
      int var3 = var1.readUnsignedByte();
      this.field_1906[0] = var3 >> 4;
      this.field_1906[1] = var3 & 15;
      if(var3 != 0) {
         this.field_1901[0] = var1.readShort();
         this.field_1901[1] = var1.readShort();
         int var4 = var1.readUnsignedByte();

         int var5;
         int var6;
         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field_1906[var5]; ++var6) {
               this.field_1899[var5][0][var6] = var1.readShort();
               this.field_1908[var5][0][var6] = var1.readShort();
            }
         }

         for(var5 = 0; var5 < 2; ++var5) {
            for(var6 = 0; var6 < this.field_1906[var5]; ++var6) {
               if((var4 & 1 << var5 * 4 << var6) != 0) {
                  this.field_1899[var5][1][var6] = var1.readShort();
                  this.field_1908[var5][1][var6] = var1.readShort();
               } else {
                  this.field_1899[var5][1][var6] = this.field_1899[var5][0][var6];
                  this.field_1908[var5][1][var6] = this.field_1908[var5][0][var6];
               }
            }
         }

         if(var4 != 0 || this.field_1901[1] != this.field_1901[0]) {
            var2.method_3277(var1);
         }
      } else {
         int[] var7 = this.field_1901;
         this.field_1901[1] = 0;
         var7[0] = 0;
      }

   }

   // $FF: renamed from: <clinit> () void
   static {
      field_1905 = new float[2][8];
      field_1902 = new int[2][8];
   }

    // $FF: renamed from: v (int, int, float) float
   float method_3196(int var1, int var2, float var3) {
      float var4 = (float)this.field_1908[var1][0][var2] + var3 * (float)(this.field_1908[var1][1][var2] - this.field_1908[var1][0][var2]);
      var4 *= 0.0015258789F;
      return 1.0F - (float)Math.pow(10.0D, (double)(-var4 / 20.0F));
   }

}
