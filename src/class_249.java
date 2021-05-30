
// $FF: renamed from: gp
public final class class_249 {

   // $FF: renamed from: s int[]
   int[] field_2754;
   // $FF: renamed from: l int
   int field_2755;
   // $FF: renamed from: g int[]
   static int[] field_2756;
   // $FF: renamed from: y int[]
   int[] field_2757;
   // $FF: renamed from: p int[]
   int[] field_2758;
   // $FF: renamed from: j int[]
   int[] field_2759;
   // $FF: renamed from: r int[]
   int[] field_2760;
   // $FF: renamed from: b int[]
   int[] field_2761;
   // $FF: renamed from: f int[]
   int[] field_2762;
   // $FF: renamed from: n int[]
   int[] field_2763;
   // $FF: renamed from: v int[]
   int[] field_2764;
   // $FF: renamed from: u boolean
   boolean field_2765;
   // $FF: renamed from: o int
   int field_2766;
   // $FF: renamed from: c int
   int field_2767;
   // $FF: renamed from: e int
   int field_2768;
   // $FF: renamed from: d int[]
   int[] field_2769;
   // $FF: renamed from: a int[]
   static int[] field_2770;
   // $FF: renamed from: k int[]
   static int[] field_2771;
   // $FF: renamed from: m int[]
   static int[] field_2772;
   // $FF: renamed from: x int[]
   static int[] field_2773;
   // $FF: renamed from: z int[][]
   static final int[][] field_2774;
   // $FF: renamed from: w int[][]
   static final int[][] field_2775;


   // $FF: renamed from: <init> (int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int, int) void
   class_249(int var1, int var2, int var3, int var4, int var5, int var6, int var7, int var8, int var9, int var10, int var11, int var12, int var13, int var14, int var15, int var16, int var17, int var18, int var19) {
      super();
      this.field_2765 = true;
      if(var6 != var7 || var6 != var8 || var6 != var9) {
         this.field_2765 = false;
      }

      this.field_2755 = var1;
      this.field_2766 = var2;
      this.field_2767 = var18;
      this.field_2768 = var19;
      short var20 = 128;
      int var21 = var20 / 2;
      int var22 = var20 / 4;
      int var23 = var20 * 3 / 4;
      int[] var24 = field_2774[var1];
      int var25 = var24.length;
      this.field_2764 = new int[var25];
      this.field_2763 = new int[var25];
      this.field_2762 = new int[var25];
      int[] var26 = new int[var25];
      int[] var27 = new int[var25];
      int var28 = var4 * var20;
      int var29 = var5 * var20;

      int var31;
      int var32;
      int var33;
      int var34;
      int var35;
      int var36;
      for(int var30 = 0; var30 < var25; ++var30) {
         var31 = var24[var30];
         if((var31 & 1) == 0 && var31 <= 8) {
            var31 = (var31 - var2 - var2 - 1 & 7) + 1;
         }

         if(var31 > 8 && var31 <= 12) {
            var31 = (var31 - 9 - var2 & 3) + 9;
         }

         if(var31 > 12 && var31 <= 16) {
            var31 = (var31 - 13 - var2 & 3) + 13;
         }

         if(var31 == 1) {
            var32 = var28;
            var33 = var29;
            var34 = var6;
            var35 = var10;
            var36 = var14;
         } else if(var31 == 2) {
            var32 = var28 + var21;
            var33 = var29;
            var34 = var6 + var7 >> 1;
            var35 = var10 + var11 >> 1;
            var36 = var14 + var15 >> 1;
         } else if(var31 == 3) {
            var32 = var28 + var20;
            var33 = var29;
            var34 = var7;
            var35 = var11;
            var36 = var15;
         } else if(var31 == 4) {
            var32 = var28 + var20;
            var33 = var29 + var21;
            var34 = var7 + var8 >> 1;
            var35 = var11 + var12 >> 1;
            var36 = var15 + var16 >> 1;
         } else if(var31 == 5) {
            var32 = var28 + var20;
            var33 = var29 + var20;
            var34 = var8;
            var35 = var12;
            var36 = var16;
         } else if(var31 == 6) {
            var32 = var28 + var21;
            var33 = var29 + var20;
            var34 = var8 + var9 >> 1;
            var35 = var12 + var13 >> 1;
            var36 = var16 + var17 >> 1;
         } else if(var31 == 7) {
            var32 = var28;
            var33 = var29 + var20;
            var34 = var9;
            var35 = var13;
            var36 = var17;
         } else if(var31 == 8) {
            var32 = var28;
            var33 = var29 + var21;
            var34 = var9 + var6 >> 1;
            var35 = var13 + var10 >> 1;
            var36 = var17 + var14 >> 1;
         } else if(var31 == 9) {
            var32 = var28 + var21;
            var33 = var29 + var22;
            var34 = var6 + var7 >> 1;
            var35 = var10 + var11 >> 1;
            var36 = var14 + var15 >> 1;
         } else if(var31 == 10) {
            var32 = var28 + var23;
            var33 = var29 + var21;
            var34 = var7 + var8 >> 1;
            var35 = var11 + var12 >> 1;
            var36 = var15 + var16 >> 1;
         } else if(var31 == 11) {
            var32 = var28 + var21;
            var33 = var29 + var23;
            var34 = var8 + var9 >> 1;
            var35 = var12 + var13 >> 1;
            var36 = var16 + var17 >> 1;
         } else if(var31 == 12) {
            var32 = var28 + var22;
            var33 = var29 + var21;
            var34 = var9 + var6 >> 1;
            var35 = var13 + var10 >> 1;
            var36 = var17 + var14 >> 1;
         } else if(var31 == 13) {
            var32 = var28 + var22;
            var33 = var29 + var22;
            var34 = var6;
            var35 = var10;
            var36 = var14;
         } else if(var31 == 14) {
            var32 = var28 + var23;
            var33 = var29 + var22;
            var34 = var7;
            var35 = var11;
            var36 = var15;
         } else if(var31 == 15) {
            var32 = var28 + var23;
            var33 = var29 + var23;
            var34 = var8;
            var35 = var12;
            var36 = var16;
         } else {
            var32 = var28 + var22;
            var33 = var29 + var23;
            var34 = var9;
            var35 = var13;
            var36 = var17;
         }

         this.field_2764[var30] = var32;
         this.field_2763[var30] = var34;
         this.field_2762[var30] = var33;
         var26[var30] = var35;
         var27[var30] = var36;
      }

      int[] var38 = field_2775[var1];
      var31 = var38.length / 4;
      this.field_2760 = new int[var31];
      this.field_2761 = new int[var31];
      this.field_2769 = new int[var31];
      this.field_2757 = new int[var31];
      this.field_2758 = new int[var31];
      this.field_2759 = new int[var31];
      if(var3 != -1) {
         this.field_2754 = new int[var31];
      }

      var32 = 0;

      for(var33 = 0; var33 < var31; ++var33) {
         var34 = var38[var32];
         var35 = var38[var32 + 1];
         var36 = var38[var32 + 2];
         int var37 = var38[var32 + 3];
         var32 += 4;
         if(var35 < 4) {
            var35 = var35 - var2 & 3;
         }

         if(var36 < 4) {
            var36 = var36 - var2 & 3;
         }

         if(var37 < 4) {
            var37 = var37 - var2 & 3;
         }

         this.field_2760[var33] = var35;
         this.field_2761[var33] = var36;
         this.field_2769[var33] = var37;
         if(var34 == 0) {
            this.field_2757[var33] = var26[var35];
            this.field_2758[var33] = var26[var36];
            this.field_2759[var33] = var26[var37];
            if(this.field_2754 != null) {
               this.field_2754[var33] = -1;
            }
         } else {
            this.field_2757[var33] = var27[var35];
            this.field_2758[var33] = var27[var36];
            this.field_2759[var33] = var27[var37];
            if(this.field_2754 != null) {
               this.field_2754[var33] = var3;
            }
         }
      }

      var33 = var6;
      var34 = var7;
      if(var7 < var6) {
         var33 = var7;
      }

      if(var7 > var7) {
         var34 = var7;
      }

      if(var8 < var33) {
         var33 = var8;
      }

      if(var8 > var34) {
         var34 = var8;
      }

      if(var9 < var33) {
         var33 = var9;
      }

      if(var9 > var34) {
         var34 = var9;
      }

      var33 /= 14;
      var34 /= 14;
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_2756 = new int[6];
      field_2770 = new int[6];
      field_2771 = new int[6];
      field_2772 = new int[6];
      field_2773 = new int[6];
      field_2774 = new int[][]{{1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 6}, {1, 3, 5, 7, 2, 6}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 2, 8}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 11, 12}, {1, 3, 5, 7, 13, 14}};
      field_2775 = new int[][]{{0, 1, 2, 3, 0, 0, 1, 3}, {1, 1, 2, 3, 1, 0, 1, 3}, {0, 1, 2, 3, 1, 0, 1, 3}, {0, 0, 1, 2, 0, 0, 2, 4, 1, 0, 4, 3}, {0, 0, 1, 4, 0, 0, 4, 3, 1, 1, 2, 4}, {0, 0, 4, 3, 1, 0, 1, 2, 1, 0, 2, 4}, {0, 1, 2, 4, 1, 0, 1, 4, 1, 0, 4, 3}, {0, 4, 1, 2, 0, 4, 2, 5, 1, 0, 4, 5, 1, 0, 5, 3}, {0, 4, 1, 2, 0, 4, 2, 3, 0, 4, 3, 5, 1, 0, 4, 5}, {0, 0, 4, 5, 1, 4, 1, 2, 1, 4, 2, 3, 1, 4, 3, 5}, {0, 0, 1, 5, 0, 1, 4, 5, 0, 1, 2, 4, 1, 0, 5, 3, 1, 5, 4, 3, 1, 4, 2, 3}, {1, 0, 1, 5, 1, 1, 4, 5, 1, 1, 2, 4, 0, 0, 5, 3, 0, 5, 4, 3, 0, 4, 2, 3}, {1, 0, 5, 4, 1, 0, 1, 5, 0, 0, 4, 3, 0, 4, 5, 3, 0, 5, 2, 3, 0, 1, 2, 5}};
   }
}
