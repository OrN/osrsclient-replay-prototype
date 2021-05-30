
// $FF: renamed from: gm
public class class_93 extends class_91 {

   // $FF: renamed from: e byte
   byte field_982;
   // $FF: renamed from: t int[][]
   int[][] field_983;
   // $FF: renamed from: aj int[]
   static int[] field_984;
   // $FF: renamed from: y int[]
   int[] field_985;
   // $FF: renamed from: k short[]
   short[] field_986;
   // $FF: renamed from: ae gc[]
   class_243[] field_987;
   // $FF: renamed from: r int[]
   int[] field_988;
   // $FF: renamed from: z int[]
   int[] field_989;
   // $FF: renamed from: d byte[]
   byte[] field_990;
   // $FF: renamed from: b int[]
   int[] field_991;
   // $FF: renamed from: u byte[]
   byte[] field_992;
   // $FF: renamed from: l byte[]
   byte[] field_993;
   // $FF: renamed from: o short[]
   short[] field_994;
   // $FF: renamed from: ag int
   int field_995;
   // $FF: renamed from: v int
   int field_996;
   // $FF: renamed from: g int
   int field_997;
   // $FF: renamed from: a byte[]
   byte[] field_998;
   // $FF: renamed from: s byte[]
   byte[] field_999;
   // $FF: renamed from: m short[]
   short[] field_1000;
   // $FF: renamed from: x short[]
   short[] field_1001;
   // $FF: renamed from: j int[]
   int[] field_1002;
   // $FF: renamed from: w int[]
   int[] field_1003;
   // $FF: renamed from: c short[]
   short[] field_1004;
   // $FF: renamed from: h int[][]
   int[][] field_1005;
   // $FF: renamed from: q gk[]
   class_246[] field_1006;
   // $FF: renamed from: i gc[]
   class_243[] field_1007;
   // $FF: renamed from: n int[]
   int[] field_1008;
   // $FF: renamed from: ap short
   public short field_1009;
   // $FF: renamed from: ab short
   public short field_1010;
   // $FF: renamed from: al boolean
   boolean field_1011;
   // $FF: renamed from: ad int
   int field_1012;
   // $FF: renamed from: ai int
   int field_1013;
   // $FF: renamed from: az int[]
   static int[] field_1014;
   // $FF: renamed from: f int[]
   int[] field_1015;
   // $FF: renamed from: ar int
   int field_1016;
   // $FF: renamed from: as int[]
   static int[] field_1017;
   // $FF: renamed from: p int
   int field_1018;
   // $FF: renamed from: am int
   static int field_1019;
   // $FF: renamed from: ax int
   int field_1020;
   // $FF: renamed from: av int[]
   static int[] field_1021;


   // $FF: renamed from: w () void
   void method_1688() {
      this.field_1007 = null;
      this.field_987 = null;
      this.field_1006 = null;
      this.field_1011 = false;
   }

   // $FF: renamed from: ci (int) int
   static final int method_1689(int var0) {
      if(var0 < 2) {
         var0 = 2;
      } else if(var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   // $FF: renamed from: bm () void
   public void method_1690() {
      int var1;
      for(var1 = 0; var1 < this.field_996; ++var1) {
         this.field_985[var1] = -this.field_985[var1];
      }

      for(var1 = 0; var1 < this.field_1018; ++var1) {
         int var2 = this.field_1002[var1];
         this.field_1002[var1] = this.field_991[var1];
         this.field_991[var1] = var2;
      }

      this.method_1688();
   }

   // $FF: renamed from: bh (int, int, int) void
   public void method_1691(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_996; ++var4) {
         this.field_1008[var4] = this.field_1008[var4] * var1 / -47763426;
         this.field_1015[var4] = this.field_1015[var4] * var2 / -588512301;
         this.field_985[var4] = this.field_985[var4] * var3 / 128;
      }

      this.method_1688();
   }

   // $FF: renamed from: y (byte[]) void
   void method_1692(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var10000 = new Buffer(var1);
      Buffer var4 = var10000;
      var10000 = new Buffer(var1);
      Buffer var5 = var10000;
      var10000 = new Buffer(var1);
      Buffer var6 = var10000;
      var10000 = new Buffer(var1);
      Buffer var7 = var10000;
      var10000 = new Buffer(var1);
      Buffer var8 = var10000;
      var4.offset = (var1.length - 18) * -1025691571;
      int var9 = var4.readShort();
      int var10 = var4.readShort();
      int var11 = var4.readUnsignedByte();
      int var12 = var4.readUnsignedByte();
      int var13 = var4.readUnsignedByte();
      int var14 = var4.readUnsignedByte();
      int var15 = var4.readUnsignedByte();
      int var16 = var4.readUnsignedByte();
      int var17 = var4.readShort();
      int var18 = var4.readShort();
      int var19 = var4.readShort();
      int var20 = var4.readShort();
      byte var21 = 0;
      int var46 = var21 + var9;
      int var23 = var46;
      var46 += var10;
      int var24 = var46;
      if(var13 == 255) {
         var46 += var10;
      }

      int var25 = var46;
      if(var15 == 1) {
         var46 += var10;
      }

      int var26 = var46;
      if(var12 == 1) {
         var46 += var10;
      }

      int var27 = var46;
      if(var16 == 1) {
         var46 += var9;
      }

      int var28 = var46;
      if(var14 == 1) {
         var46 += var10;
      }

      int var29 = var46;
      var46 += var20;
      int var30 = var46;
      var46 += var10 * 2;
      int var31 = var46;
      var46 += var11 * 6;
      int var32 = var46;
      var46 += var17;
      int var33 = var46;
      var46 += var18;
      int var45 = var46 + var19;
      this.field_996 = var9;
      this.field_1018 = var10;
      this.field_997 = var11;
      this.field_1008 = new int[var9];
      this.field_1015 = new int[var9];
      this.field_985 = new int[var9];
      this.field_1002 = new int[var10];
      this.field_988 = new int[var10];
      this.field_991 = new int[var10];
      if(var11 > 0) {
         this.field_998 = new byte[var11];
         this.field_986 = new short[var11];
         this.field_1000 = new short[var11];
         this.field_1001 = new short[var11];
      }

      if(var16 == 1) {
         this.field_989 = new int[var9];
      }

      if(var12 == 1) {
         this.field_990 = new byte[var10];
         this.field_993 = new byte[var10];
         this.field_1004 = new short[var10];
      }

      if(var13 == 255) {
         this.field_999 = new byte[var10];
      } else {
         this.field_982 = (byte)var13;
      }

      if(var14 == 1) {
         this.field_992 = new byte[var10];
      }

      if(var15 == 1) {
         this.field_1003 = new int[var10];
      }

      this.field_994 = new short[var10];
      var4.offset = var21 * -1025691571;
      var5.offset = var32 * -1025691571;
      var6.offset = var33 * -1025691571;
      var7.offset = var46 * -1025691571;
      var8.offset = var27 * -1025691571;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.readUnsignedByte();
         var40 = 0;
         if((var39 & 1) != 0) {
            var40 = var5.method_143((byte)54);
         }

         var41 = 0;
         if((var39 & 2) != 0) {
            var41 = var6.method_143((byte)40);
         }

         var42 = 0;
         if((var39 & 4) != 0) {
            var42 = var7.method_143((byte)67);
         }

         this.field_1008[var38] = var35 + var40;
         this.field_1015[var38] = var36 + var41;
         this.field_985[var38] = var37 + var42;
         var35 = this.field_1008[var38];
         var36 = this.field_1015[var38];
         var37 = this.field_985[var38];
         if(var16 == 1) {
            this.field_989[var38] = var8.readUnsignedByte();
         }
      }

      var4.offset = var30 * -1025691571;
      var5.offset = var26 * -1025691571;
      var6.offset = var24 * -1025691571;
      var7.offset = var28 * -1025691571;
      var8.offset = var25 * -1025691571;

      for(var38 = 0; var38 < var10; ++var38) {
         this.field_994[var38] = (short)var4.readShort();
         if(var12 == 1) {
            var39 = var5.readUnsignedByte();
            if((var39 & 1) == 1) {
               this.field_990[var38] = 1;
               var2 = true;
            } else {
               this.field_990[var38] = 0;
            }

            if((var39 & 2) == 2) {
               this.field_993[var38] = (byte)(var39 >> 2);
               this.field_1004[var38] = this.field_994[var38];
               this.field_994[var38] = 127;
               if(this.field_1004[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.field_993[var38] = -1;
               this.field_1004[var38] = -1;
            }
         }

         if(var13 == 255) {
            this.field_999[var38] = var6.method_131();
         }

         if(var14 == 1) {
            this.field_992[var38] = var7.method_131();
         }

         if(var15 == 1) {
            this.field_1003[var38] = var8.readUnsignedByte();
         }
      }

      var4.offset = var29 * -1025691571;
      var5.offset = var23 * -1025691571;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.readUnsignedByte();
         if(var43 == 1) {
            var38 = var4.method_143((byte)51) + var41;
            var39 = var4.method_143((byte)98) + var38;
            var40 = var4.method_143((byte)122) + var39;
            var41 = var40;
            this.field_1002[var42] = var38;
            this.field_988[var42] = var39;
            this.field_991[var42] = var40;
         }

         if(var43 == 2) {
            var39 = var40;
            var40 = var4.method_143((byte)42) + var41;
            var41 = var40;
            this.field_1002[var42] = var38;
            this.field_988[var42] = var39;
            this.field_991[var42] = var40;
         }

         if(var43 == 3) {
            var38 = var40;
            var40 = var4.method_143((byte)71) + var41;
            var41 = var40;
            this.field_1002[var42] = var38;
            this.field_988[var42] = var39;
            this.field_991[var42] = var40;
         }

         if(var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.method_143((byte)35) + var41;
            var41 = var40;
            this.field_1002[var42] = var38;
            this.field_988[var42] = var44;
            this.field_991[var42] = var40;
         }
      }

      var4.offset = var31 * -1025691571;

      for(var42 = 0; var42 < var11; ++var42) {
         this.field_998[var42] = 0;
         this.field_986[var42] = (short)var4.readShort();
         this.field_1000[var42] = (short)var4.readShort();
         this.field_1001[var42] = (short)var4.readShort();
      }

      if(this.field_993 != null) {
         boolean var47 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.field_993[var43] & 255;
            if(var44 != 255) {
               if((this.field_986[var44] & '\uffff') == this.field_1002[var43] && (this.field_1000[var44] & '\uffff') == this.field_988[var43] && (this.field_1001[var44] & '\uffff') == this.field_991[var43]) {
                  this.field_993[var43] = -1;
               } else {
                  var47 = true;
               }
            }
         }

         if(!var47) {
            this.field_993 = null;
         }
      }

      if(!var3) {
         this.field_1004 = null;
      }

      if(!var2) {
         this.field_990 = null;
      }

   }

   // $FF: renamed from: <clinit> () void
   static {
      field_1017 = new int[10000];
      field_984 = new int[10000];
      field_1019 = 0;
      field_1014 = class_70.field_548;
      field_1021 = class_70.field_559;
   }

   // $FF: renamed from: b (gm, int) int
   final int method_1694(class_93 var1, int var2) {
      int var3 = -1;
      int var4 = var1.field_1008[var2];
      int var5 = var1.field_1015[var2];
      int var6 = var1.field_985[var2];

      for(int var7 = 0; var7 < this.field_996; ++var7) {
         if(var4 == this.field_1008[var7] && var5 == this.field_1015[var7] && var6 == this.field_985[var7]) {
            var3 = var7;
            break;
         }
      }

      if(var3 == -1) {
         this.field_1008[this.field_996] = var4;
         this.field_1015[this.field_996] = var5;
         this.field_985[this.field_996] = var6;
         if(var1.field_989 != null) {
            this.field_989[this.field_996] = var1.field_989[var2];
         }

         var3 = this.field_996++;
      }

      return var3;
   }

   // $FF: renamed from: <init> () void
   class_93() {
      super();
      this.field_996 = 0;
      this.field_1018 = 0;
      this.field_982 = 0;
      this.field_1011 = false;
   }

   // $FF: renamed from: d () gm
   public class_93 method_1695() {
      class_93 var10000 = new class_93();
      class_93 var1 = var10000;
      if(this.field_990 != null) {
         var1.field_990 = new byte[this.field_1018];

         for(int var2 = 0; var2 < this.field_1018; ++var2) {
            var1.field_990[var2] = this.field_990[var2];
         }
      }

      var1.field_996 = this.field_996;
      var1.field_1018 = this.field_1018;
      var1.field_997 = this.field_997;
      var1.field_1008 = this.field_1008;
      var1.field_1015 = this.field_1015;
      var1.field_985 = this.field_985;
      var1.field_1002 = this.field_1002;
      var1.field_988 = this.field_988;
      var1.field_991 = this.field_991;
      var1.field_999 = this.field_999;
      var1.field_992 = this.field_992;
      var1.field_993 = this.field_993;
      var1.field_994 = this.field_994;
      var1.field_1004 = this.field_1004;
      var1.field_982 = this.field_982;
      var1.field_998 = this.field_998;
      var1.field_986 = this.field_986;
      var1.field_1000 = this.field_1000;
      var1.field_1001 = this.field_1001;
      var1.field_989 = this.field_989;
      var1.field_1003 = this.field_1003;
      var1.field_983 = this.field_983;
      var1.field_1005 = this.field_1005;
      var1.field_1007 = this.field_1007;
      var1.field_1006 = this.field_1006;
      var1.field_1009 = this.field_1009;
      var1.field_1010 = this.field_1010;
      return var1;
   }

   // $FF: renamed from: s (int[][], int, int, int, boolean, int) gm
   public class_93 method_1696(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method_1709();
      int var7 = var2 + this.field_1013;
      int var8 = var2 + this.field_1016;
      int var9 = var4 + this.field_1020;
      int var10 = var4 + this.field_995;
      if(var7 >= 0 && var8 + 128 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + 127 >> 7;
         var9 >>= 7;
         var10 = var10 + 127 >> 7;
         if(var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            class_93 var11;
            if(var5) {
               class_93 var10000 = new class_93();
               var11 = var10000;
               var11.field_996 = this.field_996;
               var11.field_1018 = this.field_1018;
               var11.field_997 = this.field_997;
               var11.field_1008 = this.field_1008;
               var11.field_985 = this.field_985;
               var11.field_1002 = this.field_1002;
               var11.field_988 = this.field_988;
               var11.field_991 = this.field_991;
               var11.field_990 = this.field_990;
               var11.field_999 = this.field_999;
               var11.field_992 = this.field_992;
               var11.field_993 = this.field_993;
               var11.field_994 = this.field_994;
               var11.field_1004 = this.field_1004;
               var11.field_982 = this.field_982;
               var11.field_998 = this.field_998;
               var11.field_986 = this.field_986;
               var11.field_1000 = this.field_1000;
               var11.field_1001 = this.field_1001;
               var11.field_989 = this.field_989;
               var11.field_1003 = this.field_1003;
               var11.field_983 = this.field_983;
               var11.field_1005 = this.field_1005;
               var11.field_1009 = this.field_1009;
               var11.field_1010 = this.field_1010;
               var11.field_1015 = new int[var11.field_996];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if(var6 == 0) {
               for(var12 = 0; var12 < var11.field_996; ++var12) {
                  var13 = this.field_1008[var12] + var2;
                  var14 = this.field_985[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (128 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field_1015[var12] = this.field_1015[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field_996; ++var12) {
                  var13 = (-this.field_1015[var12] << 16) / (this.field_911 * 267422413);
                  if(var13 < var6) {
                     var14 = this.field_1008[var12] + var2;
                     var15 = this.field_985[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (128 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field_1015[var12] = this.field_1015[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.method_1688();
            return var11;
         }
      } else {
         return this;
      }
   }

   // $FF: renamed from: ah () void
   void method_1697() {
      int[] var1;
      int var2;
      int var3;
      int var4;
      if(this.field_989 != null) {
         var1 = new int[-1124649962];
         var2 = 0;

         for(var3 = 0; var3 < this.field_996; ++var3) {
            var4 = this.field_989[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field_983 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field_983[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field_996; this.field_983[var4][var1[var4]++] = var3++) {
            var4 = this.field_989[var3];
         }

         this.field_989 = null;
      }

      if(this.field_1003 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field_1018; ++var3) {
            var4 = this.field_1003[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field_1005 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field_1005[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field_1018; this.field_1005[var4][var1[var4]++] = var3++) {
            var4 = this.field_1003[var3];
         }

         this.field_1003 = null;
      }

   }

   // $FF: renamed from: l () void
   public void method_1698() {
      for(int var1 = 0; var1 < this.field_996; ++var1) {
         int var2 = this.field_1008[var1];
         this.field_1008[var1] = this.field_985[var1];
         this.field_985[var1] = -var2;
      }

      this.method_1688();
   }

   // $FF: renamed from: i (int, int) int
   static final int method_1699(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   // $FF: renamed from: c () void
   public void method_1700() {
      for(int var1 = 0; var1 < this.field_996; ++var1) {
         int var2 = this.field_985[var1];
         this.field_985[var1] = this.field_1008[var1];
         this.field_1008[var1] = -var2;
      }

      this.method_1688();
   }

   // $FF: renamed from: k (short, short) void
   public void method_1701(short var1, short var2) {
      if(this.field_1004 != null) {
         for(int var3 = 0; var3 < this.field_1018; ++var3) {
            if(this.field_1004[var3] == var1) {
               this.field_1004[var3] = var2;
            }
         }

      }
   }

   // $FF: renamed from: ab (jv, int, int) gm
   public static class_93 method_1702(class_306 var0, int var1, int var2) {
      byte[] var3 = var0.method_5381(var1, var2);
      if(var3 == null) {
         return null;
      } else {
         class_93 var10000 = new class_93(var3);
         return var10000;
      }
   }

   // $FF: renamed from: a (short, short) void
   public void method_1703(short var1, short var2) {
      for(int var3 = 0; var3 < this.field_1018; ++var3) {
         if(this.field_994[var3] == var1) {
            this.field_994[var3] = var2;
         }
      }

   }

   // $FF: renamed from: <init> (gm[], int) void
   public class_93(class_93[] var1, int var2) {
      super();
      this.field_996 = 0;
      this.field_1018 = 0;
      this.field_982 = 0;
      this.field_1011 = false;
      boolean var3 = false;
      boolean var4 = false;
      boolean var5 = false;
      boolean var6 = false;
      boolean var7 = false;
      boolean var8 = false;
      this.field_996 = 0;
      this.field_1018 = 0;
      this.field_997 = 0;
      this.field_982 = -1;

      int var9;
      class_93 var10;
      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if(var10 != null) {
            this.field_996 += var10.field_996;
            this.field_1018 += var10.field_1018;
            this.field_997 += var10.field_997;
            if(var10.field_999 != null) {
               var4 = true;
            } else {
               if(this.field_982 == -1) {
                  this.field_982 = var10.field_982;
               }

               if(this.field_982 != var10.field_982) {
                  var4 = true;
               }
            }

            var3 |= var10.field_990 != null;
            var5 |= var10.field_992 != null;
            var6 |= var10.field_1003 != null;
            var7 |= var10.field_1004 != null;
            var8 |= var10.field_993 != null;
         }
      }

      this.field_1008 = new int[this.field_996];
      this.field_1015 = new int[this.field_996];
      this.field_985 = new int[this.field_996];
      this.field_989 = new int[this.field_996];
      this.field_1002 = new int[this.field_1018];
      this.field_988 = new int[this.field_1018];
      this.field_991 = new int[this.field_1018];
      if(var3) {
         this.field_990 = new byte[this.field_1018];
      }

      if(var4) {
         this.field_999 = new byte[this.field_1018];
      }

      if(var5) {
         this.field_992 = new byte[this.field_1018];
      }

      if(var6) {
         this.field_1003 = new int[this.field_1018];
      }

      if(var7) {
         this.field_1004 = new short[this.field_1018];
      }

      if(var8) {
         this.field_993 = new byte[this.field_1018];
      }

      this.field_994 = new short[this.field_1018];
      if(this.field_997 > 0) {
         this.field_998 = new byte[this.field_997];
         this.field_986 = new short[this.field_997];
         this.field_1000 = new short[this.field_997];
         this.field_1001 = new short[this.field_997];
      }

      this.field_996 = 0;
      this.field_1018 = 0;
      this.field_997 = 0;

      for(var9 = 0; var9 < var2; ++var9) {
         var10 = var1[var9];
         if(var10 != null) {
            int var11;
            for(var11 = 0; var11 < var10.field_1018; ++var11) {
               if(var3 && var10.field_990 != null) {
                  this.field_990[this.field_1018] = var10.field_990[var11];
               }

               if(var4) {
                  if(var10.field_999 != null) {
                     this.field_999[this.field_1018] = var10.field_999[var11];
                  } else {
                     this.field_999[this.field_1018] = var10.field_982;
                  }
               }

               if(var5 && var10.field_992 != null) {
                  this.field_992[this.field_1018] = var10.field_992[var11];
               }

               if(var6 && var10.field_1003 != null) {
                  this.field_1003[this.field_1018] = var10.field_1003[var11];
               }

               if(var7) {
                  if(var10.field_1004 != null) {
                     this.field_1004[this.field_1018] = var10.field_1004[var11];
                  } else {
                     this.field_1004[this.field_1018] = -1;
                  }
               }

               if(var8) {
                  if(var10.field_993 != null && var10.field_993[var11] != -1) {
                     this.field_993[this.field_1018] = (byte)(var10.field_993[var11] + this.field_997);
                  } else {
                     this.field_993[this.field_1018] = -1;
                  }
               }

               this.field_994[this.field_1018] = var10.field_994[var11];
               this.field_1002[this.field_1018] = this.method_1694(var10, var10.field_1002[var11]);
               this.field_988[this.field_1018] = this.method_1694(var10, var10.field_988[var11]);
               this.field_991[this.field_1018] = this.method_1694(var10, var10.field_991[var11]);
               ++this.field_1018;
            }

            for(var11 = 0; var11 < var10.field_997; ++var11) {
               byte var12 = this.field_998[this.field_997] = var10.field_998[var11];
               if(var12 == 0) {
                  this.field_986[this.field_997] = (short)this.method_1694(var10, var10.field_986[var11]);
                  this.field_1000[this.field_997] = (short)this.method_1694(var10, var10.field_1000[var11]);
                  this.field_1001[this.field_997] = (short)this.method_1694(var10, var10.field_1001[var11]);
               }

               ++this.field_997;
            }
         }
      }

   }

   // $FF: renamed from: m () void
   public void method_1705() {
      int var1;
      for(var1 = 0; var1 < this.field_996; ++var1) {
         this.field_985[var1] = -this.field_985[var1];
      }

      for(var1 = 0; var1 < this.field_1018; ++var1) {
         int var2 = this.field_1002[var1];
         this.field_1002[var1] = this.field_991[var1];
         this.field_991[var1] = var2;
      }

      this.method_1688();
   }

   // $FF: renamed from: bs (int, int, int) void
   public void method_1706(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_996; ++var4) {
         this.field_1008[var4] = this.field_1008[var4] * var1 / 128;
         this.field_1015[var4] = this.field_1015[var4] * var2 / 128;
         this.field_985[var4] = this.field_985[var4] * var3 / 128;
      }

      this.method_1688();
   }

   // $FF: renamed from: z () void
   public void method_1707() {
      if(this.field_1007 == null) {
         this.field_1007 = new class_243[this.field_996];

         int var1;
         for(var1 = 0; var1 < this.field_996; ++var1) {
            class_243[] var10000 = this.field_1007;
            class_243 var10002 = new class_243();
            var10000[var1] = var10002;
         }

         for(var1 = 0; var1 < this.field_1018; ++var1) {
            int var2 = this.field_1002[var1];
            int var3 = this.field_988[var1];
            int var4 = this.field_991[var1];
            int var5 = this.field_1008[var3] - this.field_1008[var2];
            int var6 = this.field_1015[var3] - this.field_1015[var2];
            int var7 = this.field_985[var3] - this.field_985[var2];
            int var8 = this.field_1008[var4] - this.field_1008[var2];
            int var9 = this.field_1015[var4] - this.field_1015[var2];
            int var10 = this.field_985[var4] - this.field_985[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -8192; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if(var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 256 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if(this.field_990 == null) {
               var15 = 0;
            } else {
               var15 = this.field_990[var1];
            }

            if(var15 == 0) {
               class_243 var16 = this.field_1007[var2];
               var16.field_2695 += var11 * 1549962149;
               var16.field_2699 += var12 * 371866635;
               var16.field_2696 += var13 * 700938581;
               var16.field_2694 += -698232183;
               var16 = this.field_1007[var3];
               var16.field_2695 += var11 * 1549962149;
               var16.field_2699 += var12 * 371866635;
               var16.field_2696 += var13 * 700938581;
               var16.field_2694 += -698232183;
               var16 = this.field_1007[var4];
               var16.field_2695 += var11 * 1549962149;
               var16.field_2699 += var12 * 371866635;
               var16.field_2696 += var13 * 700938581;
               var16.field_2694 += -698232183;
            } else if(var15 == 1) {
               if(this.field_1006 == null) {
                  this.field_1006 = new class_246[this.field_1018];
               }

               class_246[] var17 = this.field_1006;
               class_246 var19 = new class_246();
               class_246 var18 = var17[var1] = var19;
               var18.field_2725 = var11 * -110082733;
               var18.field_2723 = var12 * 1942273987;
               var18.field_2721 = var13 * -907502103;
            }
         }

      }
   }

   // $FF: renamed from: v (jv, int, int) gm
   public static class_93 method_1708(class_306 var0, int var1, int var2) {
      byte[] var3 = var0.method_5381(var1, var2);
      if(var3 == null) {
         return null;
      } else {
         class_93 var10000 = new class_93(var3);
         return var10000;
      }
   }

   // $FF: renamed from: t () void
   void method_1709() {
      if(!this.field_1011) {
         this.field_911 = 0;
         this.field_1012 = 0;
         this.field_1013 = 999999;
         this.field_1016 = -999999;
         this.field_995 = -99999;
         this.field_1020 = 99999;

         for(int var1 = 0; var1 < this.field_996; ++var1) {
            int var2 = this.field_1008[var1];
            int var3 = this.field_1015[var1];
            int var4 = this.field_985[var1];
            if(var2 < this.field_1013) {
               this.field_1013 = var2;
            }

            if(var2 > this.field_1016) {
               this.field_1016 = var2;
            }

            if(var4 < this.field_1020) {
               this.field_1020 = var4;
            }

            if(var4 > this.field_995) {
               this.field_995 = var4;
            }

            if(-var3 > this.field_911 * 267422413) {
               this.field_911 = -var3 * -126455291;
            }

            if(var3 > this.field_1012) {
               this.field_1012 = var3;
            }
         }

         this.field_1011 = true;
      }
   }

   // $FF: renamed from: h (gm, gm, int, int, int, boolean) void
   static void method_1710(class_93 var0, class_93 var1, int var2, int var3, int var4, boolean var5) {
      var0.method_1709();
      var0.method_1707();
      var1.method_1709();
      var1.method_1707();
      ++field_1019;
      int var6 = 0;
      int[] var7 = var1.field_1008;
      int var8 = var1.field_996;

      int var9;
      for(var9 = 0; var9 < var0.field_996; ++var9) {
         class_243 var10 = var0.field_1007[var9];
         if(var10.field_2694 * 1984775097 != 0) {
            int var11 = var0.field_1015[var9] - var3;
            if(var11 <= var1.field_1012) {
               int var12 = var0.field_1008[var9] - var2;
               if(var12 >= var1.field_1013 && var12 <= var1.field_1016) {
                  int var13 = var0.field_985[var9] - var4;
                  if(var13 >= var1.field_1020 && var13 <= var1.field_995) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        class_243 var15 = var1.field_1007[var14];
                        if(var12 == var7[var14] && var13 == var1.field_985[var14] && var11 == var1.field_1015[var14] && var15.field_2694 * 1984775097 != 0) {
                           if(var0.field_987 == null) {
                              var0.field_987 = new class_243[var0.field_996];
                           }

                           if(var1.field_987 == null) {
                              var1.field_987 = new class_243[var8];
                           }

                           class_243 var16 = var0.field_987[var9];
                           class_243[] var10000;
                           class_243 var10002;
                           if(var16 == null) {
                              var10000 = var0.field_987;
                              var10002 = new class_243(var10);
                              var16 = var10000[var9] = var10002;
                           }

                           class_243 var17 = var1.field_987[var14];
                           if(var17 == null) {
                              var10000 = var1.field_987;
                              var10002 = new class_243(var15);
                              var17 = var10000[var14] = var10002;
                           }

                           var16.field_2695 += var15.field_2695 * 1;
                           var16.field_2699 += var15.field_2699 * 1;
                           var16.field_2696 += var15.field_2696 * 1;
                           var16.field_2694 += var15.field_2694 * 1;
                           var17.field_2695 += var10.field_2695 * 1;
                           var17.field_2699 += var10.field_2699 * 1;
                           var17.field_2696 += var10.field_2696 * 1;
                           var17.field_2694 += var10.field_2694 * 1;
                           ++var6;
                           field_1017[var9] = field_1019;
                           field_984[var14] = field_1019;
                        }
                     }
                  }
               }
            }
         }
      }

      if(var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.field_1018; ++var9) {
            if(field_1017[var0.field_1002[var9]] == field_1019 && field_1017[var0.field_988[var9]] == field_1019 && field_1017[var0.field_991[var9]] == field_1019) {
               if(var0.field_990 == null) {
                  var0.field_990 = new byte[var0.field_1018];
               }

               var0.field_990[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.field_1018; ++var9) {
            if(field_984[var1.field_1002[var9]] == field_1019 && field_984[var1.field_988[var9]] == field_1019 && field_984[var1.field_991[var9]] == field_1019) {
               if(var1.field_990 == null) {
                  var1.field_990 = new byte[var1.field_1018];
               }

               var1.field_990[var9] = 2;
            }
         }

      }
   }

   // $FF: renamed from: q (int, int, int, int, int) gr
   public final class_92 method_1711(int var1, int var2, int var3, int var4, int var5) {
      this.method_1707();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      class_92 var10000 = new class_92();
      class_92 var8 = var10000;
      var8.field_920 = new int[this.field_1018];
      var8.field_925 = new int[this.field_1018];
      var8.field_926 = new int[this.field_1018];
      if(this.field_997 > 0 && this.field_993 != null) {
         int[] var9 = new int[this.field_997];

         int var10;
         for(var10 = 0; var10 < this.field_1018; ++var10) {
            if(this.field_993[var10] != -1) {
               ++var9[this.field_993[var10] & 255];
            }
         }

         var8.field_932 = 0;

         for(var10 = 0; var10 < this.field_997; ++var10) {
            if(var9[var10] > 0 && this.field_998[var10] == 0) {
               ++var8.field_932;
            }
         }

         var8.field_933 = new int[var8.field_932];
         var8.field_934 = new int[var8.field_932];
         var8.field_958 = new int[var8.field_932];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field_997; ++var11) {
            if(var9[var11] > 0 && this.field_998[var11] == 0) {
               var8.field_933[var10] = this.field_986[var11] & '\uffff';
               var8.field_934[var10] = this.field_1000[var11] & '\uffff';
               var8.field_958[var10] = this.field_1001[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field_929 = new byte[this.field_1018];

         for(var11 = 0; var11 < this.field_1018; ++var11) {
            if(this.field_993[var11] != -1) {
               var8.field_929[var11] = (byte)var9[this.field_993[var11] & 255];
            } else {
               var8.field_929[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.field_1018; ++var16) {
         byte var17;
         if(this.field_990 == null) {
            var17 = 0;
         } else {
            var17 = this.field_990[var16];
         }

         byte var18;
         if(this.field_992 == null) {
            var18 = 0;
         } else {
            var18 = this.field_992[var16];
         }

         short var12;
         if(this.field_1004 == null) {
            var12 = -1;
         } else {
            var12 = this.field_1004[var16];
         }

         if(var18 == -2) {
            var17 = 3;
         }

         if(var18 == -1) {
            var17 = 2;
         }

         class_243 var13;
         int var14;
         class_246 var19;
         if(var12 == -1) {
            if(var17 == 0) {
               int var15 = this.field_994[var16] & '\uffff';
               if(this.field_987 != null && this.field_987[this.field_1002[var16]] != null) {
                  var13 = this.field_987[this.field_1002[var16]];
               } else {
                  var13 = this.field_1007[this.field_1002[var16]];
               }

               var14 = var1 + (var3 * var13.field_2695 * -573742035 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1984775097);
               var8.field_920[var16] = method_1699(var15, var14);
               if(this.field_987 != null && this.field_987[this.field_988[var16]] != null) {
                  var13 = this.field_987[this.field_988[var16]];
               } else {
                  var13 = this.field_1007[this.field_988[var16]];
               }

               var14 = var1 + (var3 * var13.field_2695 * -573742035 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1984775097);
               var8.field_925[var16] = method_1699(var15, var14);
               if(this.field_987 != null && this.field_987[this.field_991[var16]] != null) {
                  var13 = this.field_987[this.field_991[var16]];
               } else {
                  var13 = this.field_1007[this.field_991[var16]];
               }

               var14 = var1 + (var3 * var13.field_2695 * -573742035 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1984775097);
               var8.field_926[var16] = method_1699(var15, var14);
            } else if(var17 == 1) {
               var19 = this.field_1006[var16];
               var14 = var1 + (var3 * var19.field_2725 * 771770075 + var4 * var19.field_2723 * -1803245333 + var5 * var19.field_2721 * -1870263719) / (var7 + var7 / 2);
               var8.field_920[var16] = method_1699(this.field_994[var16] & '\uffff', var14);
               var8.field_926[var16] = -1;
            } else if(var17 == 3) {
               var8.field_920[var16] = 128;
               var8.field_926[var16] = -1;
            } else {
               var8.field_926[var16] = -2;
            }
         } else if(var17 == 0) {
            if(this.field_987 != null && this.field_987[this.field_1002[var16]] != null) {
               var13 = this.field_987[this.field_1002[var16]];
            } else {
               var13 = this.field_1007[this.field_1002[var16]];
            }

            var14 = var1 + (var3 * var13.field_2695 * -573742035 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1984775097);
            var8.field_920[var16] = method_1713(var14);
            if(this.field_987 != null && this.field_987[this.field_988[var16]] != null) {
               var13 = this.field_987[this.field_988[var16]];
            } else {
               var13 = this.field_1007[this.field_988[var16]];
            }

            var14 = var1 + (var3 * var13.field_2695 * -573742035 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1984775097);
            var8.field_925[var16] = method_1713(var14);
            if(this.field_987 != null && this.field_987[this.field_991[var16]] != null) {
               var13 = this.field_987[this.field_991[var16]];
            } else {
               var13 = this.field_1007[this.field_991[var16]];
            }

            var14 = var1 + (var3 * var13.field_2695 * -573742035 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1984775097);
            var8.field_926[var16] = method_1713(var14);
         } else if(var17 == 1) {
            var19 = this.field_1006[var16];
            var14 = var1 + (var3 * var19.field_2725 * 771770075 + var4 * var19.field_2723 * -1803245333 + var5 * var19.field_2721 * -1870263719) / (var7 + var7 / 2);
            var8.field_920[var16] = method_1713(var14);
            var8.field_926[var16] = -1;
         } else {
            var8.field_926[var16] = -2;
         }
      }

      this.method_1746();
      var8.field_916 = this.field_996;
      var8.field_917 = this.field_1008;
      var8.field_918 = this.field_1015;
      var8.field_936 = this.field_985;
      var8.field_970 = this.field_1018;
      var8.field_921 = this.field_1002;
      var8.field_966 = this.field_988;
      var8.field_923 = this.field_991;
      var8.field_948 = this.field_999;
      var8.field_928 = this.field_992;
      var8.field_931 = this.field_982;
      var8.field_977 = this.field_983;
      var8.field_937 = this.field_1005;
      var8.field_930 = this.field_1004;
      return var8;
   }

   // $FF: renamed from: e (int) void
   public void method_1712(int var1) {
      int var2 = field_1014[var1];
      int var3 = field_1021[var1];

      for(int var4 = 0; var4 < this.field_996; ++var4) {
         int var5 = this.field_985[var4] * var2 + this.field_1008[var4] * var3 >> 16;
         this.field_985[var4] = this.field_985[var4] * var3 - this.field_1008[var4] * var2 >> 16;
         this.field_1008[var4] = var5;
      }

      this.method_1688();
   }

   // $FF: renamed from: ae (int) int
   static final int method_1713(int var0) {
      if(var0 < 2) {
         var0 = 2;
      } else if(var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   // $FF: renamed from: bt (short, short) void
   public void method_1714(short var1, short var2) {
      for(int var3 = 0; var3 < this.field_1018; ++var3) {
         if(this.field_994[var3] == var1) {
            this.field_994[var3] = var2;
         }
      }

   }

   // $FF: renamed from: g (int, int, int) void
   public void method_1715(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_996; ++var4) {
         this.field_1008[var4] += var1;
         this.field_1015[var4] += var2;
         this.field_985[var4] += var3;
      }

      this.method_1688();
   }

   // $FF: renamed from: f (byte[]) void
   void method_1716(byte[] var1) {
      Buffer var10000 = new Buffer(var1);
      Buffer var2 = var10000;
      var10000 = new Buffer(var1);
      Buffer var3 = var10000;
      var10000 = new Buffer(var1);
      Buffer var4 = var10000;
      var10000 = new Buffer(var1);
      Buffer var5 = var10000;
      var10000 = new Buffer(var1);
      Buffer var6 = var10000;
      var10000 = new Buffer(var1);
      Buffer var7 = var10000;
      var10000 = new Buffer(var1);
      Buffer var8 = var10000;
      var2.offset = (var1.length - 23) * -1025691571;
      int var9 = var2.readShort();
      int var10 = var2.readShort();
      int var11 = var2.readUnsignedByte();
      int var12 = var2.readUnsignedByte();
      int var13 = var2.readUnsignedByte();
      int var14 = var2.readUnsignedByte();
      int var15 = var2.readUnsignedByte();
      int var16 = var2.readUnsignedByte();
      int var17 = var2.readUnsignedByte();
      int var18 = var2.readShort();
      int var19 = var2.readShort();
      int var20 = var2.readShort();
      int var21 = var2.readShort();
      int var22 = var2.readShort();
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if(var11 > 0) {
         this.field_998 = new byte[var11];
         var2.offset = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.field_998[var26] = var2.method_131();
            if(var27 == 0) {
               ++var23;
            }

            if(var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if(var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if(var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if(var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if(var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if(var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if(var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if(var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.field_996 = var9;
      this.field_1018 = var10;
      this.field_997 = var11;
      this.field_1008 = new int[var9];
      this.field_1015 = new int[var9];
      this.field_985 = new int[var9];
      this.field_1002 = new int[var10];
      this.field_988 = new int[var10];
      this.field_991 = new int[var10];
      if(var17 == 1) {
         this.field_989 = new int[var9];
      }

      if(var12 == 1) {
         this.field_990 = new byte[var10];
      }

      if(var13 == 255) {
         this.field_999 = new byte[var10];
      } else {
         this.field_982 = (byte)var13;
      }

      if(var14 == 1) {
         this.field_992 = new byte[var10];
      }

      if(var15 == 1) {
         this.field_1003 = new int[var10];
      }

      if(var16 == 1) {
         this.field_1004 = new short[var10];
      }

      if(var16 == 1 && var11 > 0) {
         this.field_993 = new byte[var10];
      }

      this.field_994 = new short[var10];
      if(var11 > 0) {
         this.field_986 = new short[var11];
         this.field_1000 = new short[var11];
         this.field_1001 = new short[var11];
      }

      var2.offset = var11 * -1025691571;
      var3.offset = var38 * -1025691571;
      var4.offset = var39 * -1025691571;
      var5.offset = var40 * -1025691571;
      var6.offset = var32 * -1025691571;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.readUnsignedByte();
         var53 = 0;
         if((var52 & 1) != 0) {
            var53 = var3.method_143((byte)86);
         }

         var54 = 0;
         if((var52 & 2) != 0) {
            var54 = var4.method_143((byte)84);
         }

         var55 = 0;
         if((var52 & 4) != 0) {
            var55 = var5.method_143((byte)41);
         }

         this.field_1008[var51] = var48 + var53;
         this.field_1015[var51] = var49 + var54;
         this.field_985[var51] = var50 + var55;
         var48 = this.field_1008[var51];
         var49 = this.field_1015[var51];
         var50 = this.field_985[var51];
         if(var17 == 1) {
            this.field_989[var51] = var6.readUnsignedByte();
         }
      }

      var2.offset = var37 * -1025691571;
      var3.offset = var28 * -1025691571;
      var4.offset = var30 * -1025691571;
      var5.offset = var33 * -1025691571;
      var6.offset = var31 * -1025691571;
      var7.offset = var35 * -1025691571;
      var8.offset = var36 * -1025691571;

      for(var51 = 0; var51 < var10; ++var51) {
         this.field_994[var51] = (short)var2.readShort();
         if(var12 == 1) {
            this.field_990[var51] = var3.method_131();
         }

         if(var13 == 255) {
            this.field_999[var51] = var4.method_131();
         }

         if(var14 == 1) {
            this.field_992[var51] = var5.method_131();
         }

         if(var15 == 1) {
            this.field_1003[var51] = var6.readUnsignedByte();
         }

         if(var16 == 1) {
            this.field_1004[var51] = (short)(var7.readShort() - 1);
         }

         if(this.field_993 != null && this.field_1004[var51] != -1) {
            this.field_993[var51] = (byte)(var8.readUnsignedByte() - 1);
         }
      }

      var2.offset = var34 * -1025691571;
      var3.offset = var29 * -1025691571;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.readUnsignedByte();
         if(var56 == 1) {
            var51 = var2.method_143((byte)61) + var54;
            var52 = var2.method_143((byte)72) + var51;
            var53 = var2.method_143((byte)22) + var52;
            var54 = var53;
            this.field_1002[var55] = var51;
            this.field_988[var55] = var52;
            this.field_991[var55] = var53;
         }

         if(var56 == 2) {
            var52 = var53;
            var53 = var2.method_143((byte)73) + var54;
            var54 = var53;
            this.field_1002[var55] = var51;
            this.field_988[var55] = var52;
            this.field_991[var55] = var53;
         }

         if(var56 == 3) {
            var51 = var53;
            var53 = var2.method_143((byte)67) + var54;
            var54 = var53;
            this.field_1002[var55] = var51;
            this.field_988[var55] = var52;
            this.field_991[var55] = var53;
         }

         if(var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.method_143((byte)57) + var54;
            var54 = var53;
            this.field_1002[var55] = var51;
            this.field_988[var55] = var57;
            this.field_991[var55] = var53;
         }
      }

      var2.offset = var41 * -1025691571;
      var3.offset = var42 * -1025691571;
      var4.offset = var43 * -1025691571;
      var5.offset = var44 * -1025691571;
      var6.offset = var45 * -1025691571;
      var7.offset = var46 * -1025691571;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.field_998[var55] & 255;
         if(var56 == 0) {
            this.field_986[var55] = (short)var2.readShort();
            this.field_1000[var55] = (short)var2.readShort();
            this.field_1001[var55] = (short)var2.readShort();
         }
      }

      var2.offset = var26 * -1025691571;
      var55 = var2.readUnsignedByte();
      if(var55 != 0) {
         new class_271();
         var2.readShort();
         var2.readShort();
         var2.readShort();
         var2.method_135();
      }

   }

   // $FF: renamed from: al (jv, int, int) gm
   public static class_93 method_1717(class_306 var0, int var1, int var2) {
      byte[] var3 = var0.method_5381(var1, var2);
      if(var3 == null) {
         return null;
      } else {
         class_93 var10000 = new class_93(var3);
         return var10000;
      }
   }

   // $FF: renamed from: ad (byte[]) void
   void method_1718(byte[] var1) {
      Buffer var10000 = new Buffer(var1);
      Buffer var2 = var10000;
      var10000 = new Buffer(var1);
      Buffer var3 = var10000;
      var10000 = new Buffer(var1);
      Buffer var4 = var10000;
      var10000 = new Buffer(var1);
      Buffer var5 = var10000;
      var10000 = new Buffer(var1);
      Buffer var6 = var10000;
      var10000 = new Buffer(var1);
      Buffer var7 = var10000;
      var10000 = new Buffer(var1);
      Buffer var8 = var10000;
      var2.offset = (var1.length - 23) * 1355962192;
      int var9 = var2.readShort();
      int var10 = var2.readShort();
      int var11 = var2.readUnsignedByte();
      int var12 = var2.readUnsignedByte();
      int var13 = var2.readUnsignedByte();
      int var14 = var2.readUnsignedByte();
      int var15 = var2.readUnsignedByte();
      int var16 = var2.readUnsignedByte();
      int var17 = var2.readUnsignedByte();
      int var18 = var2.readShort();
      int var19 = var2.readShort();
      int var20 = var2.readShort();
      int var21 = var2.readShort();
      int var22 = var2.readShort();
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if(var11 > 0) {
         this.field_998 = new byte[var11];
         var2.offset = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.field_998[var26] = var2.method_131();
            if(var27 == 0) {
               ++var23;
            }

            if(var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if(var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if(var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if(var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if(var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if(var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if(var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if(var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.field_996 = var9;
      this.field_1018 = var10;
      this.field_997 = var11;
      this.field_1008 = new int[var9];
      this.field_1015 = new int[var9];
      this.field_985 = new int[var9];
      this.field_1002 = new int[var10];
      this.field_988 = new int[var10];
      this.field_991 = new int[var10];
      if(var17 == 1) {
         this.field_989 = new int[var9];
      }

      if(var12 == 1) {
         this.field_990 = new byte[var10];
      }

      if(var13 == 255) {
         this.field_999 = new byte[var10];
      } else {
         this.field_982 = (byte)var13;
      }

      if(var14 == 1) {
         this.field_992 = new byte[var10];
      }

      if(var15 == 1) {
         this.field_1003 = new int[var10];
      }

      if(var16 == 1) {
         this.field_1004 = new short[var10];
      }

      if(var16 == 1 && var11 > 0) {
         this.field_993 = new byte[var10];
      }

      this.field_994 = new short[var10];
      if(var11 > 0) {
         this.field_986 = new short[var11];
         this.field_1000 = new short[var11];
         this.field_1001 = new short[var11];
      }

      var2.offset = var11 * 484467635;
      var3.offset = var38 * 1883699996;
      var4.offset = var39 * -1025691571;
      var5.offset = var40 * -1025691571;
      var6.offset = var32 * -1025691571;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.readUnsignedByte();
         var53 = 0;
         if((var52 & 1) != 0) {
            var53 = var3.method_143((byte)82);
         }

         var54 = 0;
         if((var52 & 2) != 0) {
            var54 = var4.method_143((byte)65);
         }

         var55 = 0;
         if((var52 & 4) != 0) {
            var55 = var5.method_143((byte)29);
         }

         this.field_1008[var51] = var48 + var53;
         this.field_1015[var51] = var49 + var54;
         this.field_985[var51] = var50 + var55;
         var48 = this.field_1008[var51];
         var49 = this.field_1015[var51];
         var50 = this.field_985[var51];
         if(var17 == 1) {
            this.field_989[var51] = var6.readUnsignedByte();
         }
      }

      var2.offset = var37 * -1423213759;
      var3.offset = var28 * 1473735834;
      var4.offset = var30 * 259221108;
      var5.offset = var33 * -1025691571;
      var6.offset = var31 * 1930013784;
      var7.offset = var35 * -1853321531;
      var8.offset = var36 * -1025691571;

      for(var51 = 0; var51 < var10; ++var51) {
         this.field_994[var51] = (short)var2.readShort();
         if(var12 == 1) {
            this.field_990[var51] = var3.method_131();
         }

         if(var13 == 255) {
            this.field_999[var51] = var4.method_131();
         }

         if(var14 == 1) {
            this.field_992[var51] = var5.method_131();
         }

         if(var15 == 1) {
            this.field_1003[var51] = var6.readUnsignedByte();
         }

         if(var16 == 1) {
            this.field_1004[var51] = (short)(var7.readShort() - 1);
         }

         if(this.field_993 != null && this.field_1004[var51] != -1) {
            this.field_993[var51] = (byte)(var8.readUnsignedByte() - 1);
         }
      }

      var2.offset = var34 * 714147529;
      var3.offset = var29 * 917645923;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.readUnsignedByte();
         if(var56 == 1) {
            var51 = var2.method_143((byte)127) + var54;
            var52 = var2.method_143((byte)107) + var51;
            var53 = var2.method_143((byte)116) + var52;
            var54 = var53;
            this.field_1002[var55] = var51;
            this.field_988[var55] = var52;
            this.field_991[var55] = var53;
         }

         if(var56 == 2) {
            var52 = var53;
            var53 = var2.method_143((byte)126) + var54;
            var54 = var53;
            this.field_1002[var55] = var51;
            this.field_988[var55] = var52;
            this.field_991[var55] = var53;
         }

         if(var56 == 3) {
            var51 = var53;
            var53 = var2.method_143((byte)51) + var54;
            var54 = var53;
            this.field_1002[var55] = var51;
            this.field_988[var55] = var52;
            this.field_991[var55] = var53;
         }

         if(var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.method_143((byte)83) + var54;
            var54 = var53;
            this.field_1002[var55] = var51;
            this.field_988[var55] = var57;
            this.field_991[var55] = var53;
         }
      }

      var2.offset = var41 * -1025691571;
      var3.offset = var42 * -1025691571;
      var4.offset = var43 * -1025691571;
      var5.offset = var44 * -1025691571;
      var6.offset = var45 * -1025691571;
      var7.offset = var46 * -1025691571;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.field_998[var55] & 255;
         if(var56 == 0) {
            this.field_986[var55] = (short)var2.readShort();
            this.field_1000[var55] = (short)var2.readShort();
            this.field_1001[var55] = (short)var2.readShort();
         }
      }

      var2.offset = var26 * -1021868162;
      var55 = var2.readUnsignedByte();
      if(var55 != 0) {
         new class_271();
         var2.readShort();
         var2.readShort();
         var2.readShort();
         var2.method_135();
      }

   }

   // $FF: renamed from: cm (int, int) int
   static final int method_1719(int var0, int var1) {
      var1 = var1 * (var0 & 127) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 126) {
         var1 = 126;
      }

      return (var0 & '\uff80') + var1;
   }

   // $FF: renamed from: ar (byte[]) void
   void method_1720(byte[] var1) {
      Buffer var10000 = new Buffer(var1);
      Buffer var2 = var10000;
      var10000 = new Buffer(var1);
      Buffer var3 = var10000;
      var10000 = new Buffer(var1);
      Buffer var4 = var10000;
      var10000 = new Buffer(var1);
      Buffer var5 = var10000;
      var10000 = new Buffer(var1);
      Buffer var6 = var10000;
      var10000 = new Buffer(var1);
      Buffer var7 = var10000;
      var10000 = new Buffer(var1);
      Buffer var8 = var10000;
      var2.offset = (var1.length - 23) * -1025691571;
      int var9 = var2.readShort();
      int var10 = var2.readShort();
      int var11 = var2.readUnsignedByte();
      int var12 = var2.readUnsignedByte();
      int var13 = var2.readUnsignedByte();
      int var14 = var2.readUnsignedByte();
      int var15 = var2.readUnsignedByte();
      int var16 = var2.readUnsignedByte();
      int var17 = var2.readUnsignedByte();
      int var18 = var2.readShort();
      int var19 = var2.readShort();
      int var20 = var2.readShort();
      int var21 = var2.readShort();
      int var22 = var2.readShort();
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if(var11 > 0) {
         this.field_998 = new byte[var11];
         var2.offset = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.field_998[var26] = var2.method_131();
            if(var27 == 0) {
               ++var23;
            }

            if(var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if(var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if(var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if(var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if(var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if(var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if(var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if(var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.field_996 = var9;
      this.field_1018 = var10;
      this.field_997 = var11;
      this.field_1008 = new int[var9];
      this.field_1015 = new int[var9];
      this.field_985 = new int[var9];
      this.field_1002 = new int[var10];
      this.field_988 = new int[var10];
      this.field_991 = new int[var10];
      if(var17 == 1) {
         this.field_989 = new int[var9];
      }

      if(var12 == 1) {
         this.field_990 = new byte[var10];
      }

      if(var13 == 255) {
         this.field_999 = new byte[var10];
      } else {
         this.field_982 = (byte)var13;
      }

      if(var14 == 1) {
         this.field_992 = new byte[var10];
      }

      if(var15 == 1) {
         this.field_1003 = new int[var10];
      }

      if(var16 == 1) {
         this.field_1004 = new short[var10];
      }

      if(var16 == 1 && var11 > 0) {
         this.field_993 = new byte[var10];
      }

      this.field_994 = new short[var10];
      if(var11 > 0) {
         this.field_986 = new short[var11];
         this.field_1000 = new short[var11];
         this.field_1001 = new short[var11];
      }

      var2.offset = var11 * -1025691571;
      var3.offset = var38 * -1025691571;
      var4.offset = var39 * -1025691571;
      var5.offset = var40 * -1025691571;
      var6.offset = var32 * -1025691571;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.readUnsignedByte();
         var53 = 0;
         if((var52 & 1) != 0) {
            var53 = var3.method_143((byte)92);
         }

         var54 = 0;
         if((var52 & 2) != 0) {
            var54 = var4.method_143((byte)53);
         }

         var55 = 0;
         if((var52 & 4) != 0) {
            var55 = var5.method_143((byte)41);
         }

         this.field_1008[var51] = var48 + var53;
         this.field_1015[var51] = var49 + var54;
         this.field_985[var51] = var50 + var55;
         var48 = this.field_1008[var51];
         var49 = this.field_1015[var51];
         var50 = this.field_985[var51];
         if(var17 == 1) {
            this.field_989[var51] = var6.readUnsignedByte();
         }
      }

      var2.offset = var37 * -1025691571;
      var3.offset = var28 * -1025691571;
      var4.offset = var30 * -1025691571;
      var5.offset = var33 * -1025691571;
      var6.offset = var31 * -1025691571;
      var7.offset = var35 * -1025691571;
      var8.offset = var36 * -1025691571;

      for(var51 = 0; var51 < var10; ++var51) {
         this.field_994[var51] = (short)var2.readShort();
         if(var12 == 1) {
            this.field_990[var51] = var3.method_131();
         }

         if(var13 == 255) {
            this.field_999[var51] = var4.method_131();
         }

         if(var14 == 1) {
            this.field_992[var51] = var5.method_131();
         }

         if(var15 == 1) {
            this.field_1003[var51] = var6.readUnsignedByte();
         }

         if(var16 == 1) {
            this.field_1004[var51] = (short)(var7.readShort() - 1);
         }

         if(this.field_993 != null && this.field_1004[var51] != -1) {
            this.field_993[var51] = (byte)(var8.readUnsignedByte() - 1);
         }
      }

      var2.offset = var34 * -1025691571;
      var3.offset = var29 * -1025691571;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.readUnsignedByte();
         if(var56 == 1) {
            var51 = var2.method_143((byte)41) + var54;
            var52 = var2.method_143((byte)24) + var51;
            var53 = var2.method_143((byte)36) + var52;
            var54 = var53;
            this.field_1002[var55] = var51;
            this.field_988[var55] = var52;
            this.field_991[var55] = var53;
         }

         if(var56 == 2) {
            var52 = var53;
            var53 = var2.method_143((byte)23) + var54;
            var54 = var53;
            this.field_1002[var55] = var51;
            this.field_988[var55] = var52;
            this.field_991[var55] = var53;
         }

         if(var56 == 3) {
            var51 = var53;
            var53 = var2.method_143((byte)27) + var54;
            var54 = var53;
            this.field_1002[var55] = var51;
            this.field_988[var55] = var52;
            this.field_991[var55] = var53;
         }

         if(var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.method_143((byte)108) + var54;
            var54 = var53;
            this.field_1002[var55] = var51;
            this.field_988[var55] = var57;
            this.field_991[var55] = var53;
         }
      }

      var2.offset = var41 * -1025691571;
      var3.offset = var42 * -1025691571;
      var4.offset = var43 * -1025691571;
      var5.offset = var44 * -1025691571;
      var6.offset = var45 * -1025691571;
      var7.offset = var46 * -1025691571;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.field_998[var55] & 255;
         if(var56 == 0) {
            this.field_986[var55] = (short)var2.readShort();
            this.field_1000[var55] = (short)var2.readShort();
            this.field_1001[var55] = (short)var2.readShort();
         }
      }

      var2.offset = var26 * -1025691571;
      var55 = var2.readUnsignedByte();
      if(var55 != 0) {
         new class_271();
         var2.readShort();
         var2.readShort();
         var2.readShort();
         var2.method_135();
      }

   }

   // $FF: renamed from: ag (byte[]) void
   void method_1721(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var10000 = new Buffer(var1);
      Buffer var4 = var10000;
      var10000 = new Buffer(var1);
      Buffer var5 = var10000;
      var10000 = new Buffer(var1);
      Buffer var6 = var10000;
      var10000 = new Buffer(var1);
      Buffer var7 = var10000;
      var10000 = new Buffer(var1);
      Buffer var8 = var10000;
      var4.offset = (var1.length - 18) * -1025691571;
      int var9 = var4.readShort();
      int var10 = var4.readShort();
      int var11 = var4.readUnsignedByte();
      int var12 = var4.readUnsignedByte();
      int var13 = var4.readUnsignedByte();
      int var14 = var4.readUnsignedByte();
      int var15 = var4.readUnsignedByte();
      int var16 = var4.readUnsignedByte();
      int var17 = var4.readShort();
      int var18 = var4.readShort();
      int var19 = var4.readShort();
      int var20 = var4.readShort();
      byte var21 = 0;
      int var46 = var21 + var9;
      int var23 = var46;
      var46 += var10;
      int var24 = var46;
      if(var13 == 255) {
         var46 += var10;
      }

      int var25 = var46;
      if(var15 == 1) {
         var46 += var10;
      }

      int var26 = var46;
      if(var12 == 1) {
         var46 += var10;
      }

      int var27 = var46;
      if(var16 == 1) {
         var46 += var9;
      }

      int var28 = var46;
      if(var14 == 1) {
         var46 += var10;
      }

      int var29 = var46;
      var46 += var20;
      int var30 = var46;
      var46 += var10 * 2;
      int var31 = var46;
      var46 += var11 * 6;
      int var32 = var46;
      var46 += var17;
      int var33 = var46;
      var46 += var18;
      int var45 = var46 + var19;
      this.field_996 = var9;
      this.field_1018 = var10;
      this.field_997 = var11;
      this.field_1008 = new int[var9];
      this.field_1015 = new int[var9];
      this.field_985 = new int[var9];
      this.field_1002 = new int[var10];
      this.field_988 = new int[var10];
      this.field_991 = new int[var10];
      if(var11 > 0) {
         this.field_998 = new byte[var11];
         this.field_986 = new short[var11];
         this.field_1000 = new short[var11];
         this.field_1001 = new short[var11];
      }

      if(var16 == 1) {
         this.field_989 = new int[var9];
      }

      if(var12 == 1) {
         this.field_990 = new byte[var10];
         this.field_993 = new byte[var10];
         this.field_1004 = new short[var10];
      }

      if(var13 == 255) {
         this.field_999 = new byte[var10];
      } else {
         this.field_982 = (byte)var13;
      }

      if(var14 == 1) {
         this.field_992 = new byte[var10];
      }

      if(var15 == 1) {
         this.field_1003 = new int[var10];
      }

      this.field_994 = new short[var10];
      var4.offset = var21 * 453084595;
      var5.offset = var32 * -1771019015;
      var6.offset = var33 * -1025691571;
      var7.offset = var46 * -418499726;
      var8.offset = var27 * -1025691571;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.readUnsignedByte();
         var40 = 0;
         if((var39 & 1) != 0) {
            var40 = var5.method_143((byte)57);
         }

         var41 = 0;
         if((var39 & 2) != 0) {
            var41 = var6.method_143((byte)79);
         }

         var42 = 0;
         if((var39 & 4) != 0) {
            var42 = var7.method_143((byte)45);
         }

         this.field_1008[var38] = var35 + var40;
         this.field_1015[var38] = var36 + var41;
         this.field_985[var38] = var37 + var42;
         var35 = this.field_1008[var38];
         var36 = this.field_1015[var38];
         var37 = this.field_985[var38];
         if(var16 == 1) {
            this.field_989[var38] = var8.readUnsignedByte();
         }
      }

      var4.offset = var30 * -2037975358;
      var5.offset = var26 * -1025691571;
      var6.offset = var24 * 559199765;
      var7.offset = var28 * -1146930994;
      var8.offset = var25 * -643287636;

      for(var38 = 0; var38 < var10; ++var38) {
         this.field_994[var38] = (short)var4.readShort();
         if(var12 == 1) {
            var39 = var5.readUnsignedByte();
            if((var39 & 1) == 1) {
               this.field_990[var38] = 1;
               var2 = true;
            } else {
               this.field_990[var38] = 0;
            }

            if((var39 & 2) == 2) {
               this.field_993[var38] = (byte)(var39 >> 2);
               this.field_1004[var38] = this.field_994[var38];
               this.field_994[var38] = 127;
               if(this.field_1004[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.field_993[var38] = -1;
               this.field_1004[var38] = -1;
            }
         }

         if(var13 == -2089125597) {
            this.field_999[var38] = var6.method_131();
         }

         if(var14 == 1) {
            this.field_992[var38] = var7.method_131();
         }

         if(var15 == 1) {
            this.field_1003[var38] = var8.readUnsignedByte();
         }
      }

      var4.offset = var29 * -1299204838;
      var5.offset = var23 * -520790716;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.readUnsignedByte();
         if(var43 == 1) {
            var38 = var4.method_143((byte)35) + var41;
            var39 = var4.method_143((byte)114) + var38;
            var40 = var4.method_143((byte)79) + var39;
            var41 = var40;
            this.field_1002[var42] = var38;
            this.field_988[var42] = var39;
            this.field_991[var42] = var40;
         }

         if(var43 == 2) {
            var39 = var40;
            var40 = var4.method_143((byte)117) + var41;
            var41 = var40;
            this.field_1002[var42] = var38;
            this.field_988[var42] = var39;
            this.field_991[var42] = var40;
         }

         if(var43 == 3) {
            var38 = var40;
            var40 = var4.method_143((byte)105) + var41;
            var41 = var40;
            this.field_1002[var42] = var38;
            this.field_988[var42] = var39;
            this.field_991[var42] = var40;
         }

         if(var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.method_143((byte)77) + var41;
            var41 = var40;
            this.field_1002[var42] = var38;
            this.field_988[var42] = var44;
            this.field_991[var42] = var40;
         }
      }

      var4.offset = var31 * 1987671656;

      for(var42 = 0; var42 < var11; ++var42) {
         this.field_998[var42] = 0;
         this.field_986[var42] = (short)var4.readShort();
         this.field_1000[var42] = (short)var4.readShort();
         this.field_1001[var42] = (short)var4.readShort();
      }

      if(this.field_993 != null) {
         boolean var47 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.field_993[var43] & 604196047;
            if(var44 != 255) {
               if((this.field_986[var44] & '\uffff') == this.field_1002[var43] && (this.field_1000[var44] & 784170337) == this.field_988[var43] && (this.field_1001[var44] & '\uffff') == this.field_991[var43]) {
                  this.field_993[var43] = -1;
               } else {
                  var47 = true;
               }
            }
         }

         if(!var47) {
            this.field_993 = null;
         }
      }

      if(!var3) {
         this.field_1004 = null;
      }

      if(!var2) {
         this.field_990 = null;
      }

   }

   // $FF: renamed from: ax (byte[]) void
   void method_1722(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var10000 = new Buffer(var1);
      Buffer var4 = var10000;
      var10000 = new Buffer(var1);
      Buffer var5 = var10000;
      var10000 = new Buffer(var1);
      Buffer var6 = var10000;
      var10000 = new Buffer(var1);
      Buffer var7 = var10000;
      var10000 = new Buffer(var1);
      Buffer var8 = var10000;
      var4.offset = (var1.length - 18) * -80733636;
      int var9 = var4.readShort();
      int var10 = var4.readShort();
      int var11 = var4.readUnsignedByte();
      int var12 = var4.readUnsignedByte();
      int var13 = var4.readUnsignedByte();
      int var14 = var4.readUnsignedByte();
      int var15 = var4.readUnsignedByte();
      int var16 = var4.readUnsignedByte();
      int var17 = var4.readShort();
      int var18 = var4.readShort();
      int var19 = var4.readShort();
      int var20 = var4.readShort();
      byte var21 = 0;
      int var46 = var21 + var9;
      int var23 = var46;
      var46 += var10;
      int var24 = var46;
      if(var13 == 629431731) {
         var46 += var10;
      }

      int var25 = var46;
      if(var15 == 1) {
         var46 += var10;
      }

      int var26 = var46;
      if(var12 == 1) {
         var46 += var10;
      }

      int var27 = var46;
      if(var16 == 1) {
         var46 += var9;
      }

      int var28 = var46;
      if(var14 == 1) {
         var46 += var10;
      }

      int var29 = var46;
      var46 += var20;
      int var30 = var46;
      var46 += var10 * 2;
      int var31 = var46;
      var46 += var11 * 6;
      int var32 = var46;
      var46 += var17;
      int var33 = var46;
      var46 += var18;
      int var45 = var46 + var19;
      this.field_996 = var9;
      this.field_1018 = var10;
      this.field_997 = var11;
      this.field_1008 = new int[var9];
      this.field_1015 = new int[var9];
      this.field_985 = new int[var9];
      this.field_1002 = new int[var10];
      this.field_988 = new int[var10];
      this.field_991 = new int[var10];
      if(var11 > 0) {
         this.field_998 = new byte[var11];
         this.field_986 = new short[var11];
         this.field_1000 = new short[var11];
         this.field_1001 = new short[var11];
      }

      if(var16 == 1) {
         this.field_989 = new int[var9];
      }

      if(var12 == 1) {
         this.field_990 = new byte[var10];
         this.field_993 = new byte[var10];
         this.field_1004 = new short[var10];
      }

      if(var13 == 1386569881) {
         this.field_999 = new byte[var10];
      } else {
         this.field_982 = (byte)var13;
      }

      if(var14 == 1) {
         this.field_992 = new byte[var10];
      }

      if(var15 == 1) {
         this.field_1003 = new int[var10];
      }

      this.field_994 = new short[var10];
      var4.offset = var21 * -1025691571;
      var5.offset = var32 * 623307032;
      var6.offset = var33 * -1025691571;
      var7.offset = var46 * -1025691571;
      var8.offset = var27 * 481351653;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.readUnsignedByte();
         var40 = 0;
         if((var39 & 1) != 0) {
            var40 = var5.method_143((byte)52);
         }

         var41 = 0;
         if((var39 & 2) != 0) {
            var41 = var6.method_143((byte)30);
         }

         var42 = 0;
         if((var39 & 4) != 0) {
            var42 = var7.method_143((byte)34);
         }

         this.field_1008[var38] = var35 + var40;
         this.field_1015[var38] = var36 + var41;
         this.field_985[var38] = var37 + var42;
         var35 = this.field_1008[var38];
         var36 = this.field_1015[var38];
         var37 = this.field_985[var38];
         if(var16 == 1) {
            this.field_989[var38] = var8.readUnsignedByte();
         }
      }

      var4.offset = var30 * 27775369;
      var5.offset = var26 * 1608339076;
      var6.offset = var24 * 1225857536;
      var7.offset = var28 * -1025691571;
      var8.offset = var25 * -860604781;

      for(var38 = 0; var38 < var10; ++var38) {
         this.field_994[var38] = (short)var4.readShort();
         if(var12 == 1) {
            var39 = var5.readUnsignedByte();
            if((var39 & 1) == 1) {
               this.field_990[var38] = 1;
               var2 = true;
            } else {
               this.field_990[var38] = 0;
            }

            if((var39 & 2) == 2) {
               this.field_993[var38] = (byte)(var39 >> 2);
               this.field_1004[var38] = this.field_994[var38];
               this.field_994[var38] = (short)-1386588041;
               if(this.field_1004[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.field_993[var38] = -1;
               this.field_1004[var38] = -1;
            }
         }

         if(var13 == 255) {
            this.field_999[var38] = var6.method_131();
         }

         if(var14 == 1) {
            this.field_992[var38] = var7.method_131();
         }

         if(var15 == 1) {
            this.field_1003[var38] = var8.readUnsignedByte();
         }
      }

      var4.offset = var29 * 1436138471;
      var5.offset = var23 * -1025691571;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.readUnsignedByte();
         if(var43 == 1) {
            var38 = var4.method_143((byte)91) + var41;
            var39 = var4.method_143((byte)106) + var38;
            var40 = var4.method_143((byte)104) + var39;
            var41 = var40;
            this.field_1002[var42] = var38;
            this.field_988[var42] = var39;
            this.field_991[var42] = var40;
         }

         if(var43 == 2) {
            var39 = var40;
            var40 = var4.method_143((byte)59) + var41;
            var41 = var40;
            this.field_1002[var42] = var38;
            this.field_988[var42] = var39;
            this.field_991[var42] = var40;
         }

         if(var43 == 3) {
            var38 = var40;
            var40 = var4.method_143((byte)118) + var41;
            var41 = var40;
            this.field_1002[var42] = var38;
            this.field_988[var42] = var39;
            this.field_991[var42] = var40;
         }

         if(var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.method_143((byte)109) + var41;
            var41 = var40;
            this.field_1002[var42] = var38;
            this.field_988[var42] = var44;
            this.field_991[var42] = var40;
         }
      }

      var4.offset = var31 * -1025691571;

      for(var42 = 0; var42 < var11; ++var42) {
         this.field_998[var42] = 0;
         this.field_986[var42] = (short)var4.readShort();
         this.field_1000[var42] = (short)var4.readShort();
         this.field_1001[var42] = (short)var4.readShort();
      }

      if(this.field_993 != null) {
         boolean var47 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.field_993[var43] & 873367432;
            if(var44 != 2021578468) {
               if((this.field_986[var44] & '\uffff') == this.field_1002[var43] && (this.field_1000[var44] & '\uffff') == this.field_988[var43] && (this.field_1001[var44] & 301872844) == this.field_991[var43]) {
                  this.field_993[var43] = -1;
               } else {
                  var47 = true;
               }
            }
         }

         if(!var47) {
            this.field_993 = null;
         }
      }

      if(!var3) {
         this.field_1004 = null;
      }

      if(!var2) {
         this.field_990 = null;
      }

   }

   // $FF: renamed from: as (byte[]) void
   void method_1723(byte[] var1) {
      boolean var2 = false;
      boolean var3 = false;
      Buffer var10000 = new Buffer(var1);
      Buffer var4 = var10000;
      var10000 = new Buffer(var1);
      Buffer var5 = var10000;
      var10000 = new Buffer(var1);
      Buffer var6 = var10000;
      var10000 = new Buffer(var1);
      Buffer var7 = var10000;
      var10000 = new Buffer(var1);
      Buffer var8 = var10000;
      var4.offset = (var1.length - 18) * -1025691571;
      int var9 = var4.readShort();
      int var10 = var4.readShort();
      int var11 = var4.readUnsignedByte();
      int var12 = var4.readUnsignedByte();
      int var13 = var4.readUnsignedByte();
      int var14 = var4.readUnsignedByte();
      int var15 = var4.readUnsignedByte();
      int var16 = var4.readUnsignedByte();
      int var17 = var4.readShort();
      int var18 = var4.readShort();
      int var19 = var4.readShort();
      int var20 = var4.readShort();
      byte var21 = 0;
      int var46 = var21 + var9;
      int var23 = var46;
      var46 += var10;
      int var24 = var46;
      if(var13 == 255) {
         var46 += var10;
      }

      int var25 = var46;
      if(var15 == 1) {
         var46 += var10;
      }

      int var26 = var46;
      if(var12 == 1) {
         var46 += var10;
      }

      int var27 = var46;
      if(var16 == 1) {
         var46 += var9;
      }

      int var28 = var46;
      if(var14 == 1) {
         var46 += var10;
      }

      int var29 = var46;
      var46 += var20;
      int var30 = var46;
      var46 += var10 * 2;
      int var31 = var46;
      var46 += var11 * 6;
      int var32 = var46;
      var46 += var17;
      int var33 = var46;
      var46 += var18;
      int var45 = var46 + var19;
      this.field_996 = var9;
      this.field_1018 = var10;
      this.field_997 = var11;
      this.field_1008 = new int[var9];
      this.field_1015 = new int[var9];
      this.field_985 = new int[var9];
      this.field_1002 = new int[var10];
      this.field_988 = new int[var10];
      this.field_991 = new int[var10];
      if(var11 > 0) {
         this.field_998 = new byte[var11];
         this.field_986 = new short[var11];
         this.field_1000 = new short[var11];
         this.field_1001 = new short[var11];
      }

      if(var16 == 1) {
         this.field_989 = new int[var9];
      }

      if(var12 == 1) {
         this.field_990 = new byte[var10];
         this.field_993 = new byte[var10];
         this.field_1004 = new short[var10];
      }

      if(var13 == -416091225) {
         this.field_999 = new byte[var10];
      } else {
         this.field_982 = (byte)var13;
      }

      if(var14 == 1) {
         this.field_992 = new byte[var10];
      }

      if(var15 == 1) {
         this.field_1003 = new int[var10];
      }

      this.field_994 = new short[var10];
      var4.offset = var21 * 1935033684;
      var5.offset = var32 * -558167892;
      var6.offset = var33 * 977167687;
      var7.offset = var46 * -935091742;
      var8.offset = var27 * 881130338;
      int var35 = 0;
      int var36 = 0;
      int var37 = 0;

      int var38;
      int var39;
      int var40;
      int var41;
      int var42;
      for(var38 = 0; var38 < var9; ++var38) {
         var39 = var4.readUnsignedByte();
         var40 = 0;
         if((var39 & 1) != 0) {
            var40 = var5.method_143((byte)58);
         }

         var41 = 0;
         if((var39 & 2) != 0) {
            var41 = var6.method_143((byte)15);
         }

         var42 = 0;
         if((var39 & 4) != 0) {
            var42 = var7.method_143((byte)77);
         }

         this.field_1008[var38] = var35 + var40;
         this.field_1015[var38] = var36 + var41;
         this.field_985[var38] = var37 + var42;
         var35 = this.field_1008[var38];
         var36 = this.field_1015[var38];
         var37 = this.field_985[var38];
         if(var16 == 1) {
            this.field_989[var38] = var8.readUnsignedByte();
         }
      }

      var4.offset = var30 * -1025691571;
      var5.offset = var26 * -1025691571;
      var6.offset = var24 * -623820722;
      var7.offset = var28 * -1025691571;
      var8.offset = var25 * -1025691571;

      for(var38 = 0; var38 < var10; ++var38) {
         this.field_994[var38] = (short)var4.readShort();
         if(var12 == 1) {
            var39 = var5.readUnsignedByte();
            if((var39 & 1) == 1) {
               this.field_990[var38] = 1;
               var2 = true;
            } else {
               this.field_990[var38] = 0;
            }

            if((var39 & 2) == 2) {
               this.field_993[var38] = (byte)(var39 >> 2);
               this.field_1004[var38] = this.field_994[var38];
               this.field_994[var38] = (short)1414450241;
               if(this.field_1004[var38] != -1) {
                  var3 = true;
               }
            } else {
               this.field_993[var38] = -1;
               this.field_1004[var38] = -1;
            }
         }

         if(var13 == 255) {
            this.field_999[var38] = var6.method_131();
         }

         if(var14 == 1) {
            this.field_992[var38] = var7.method_131();
         }

         if(var15 == 1) {
            this.field_1003[var38] = var8.readUnsignedByte();
         }
      }

      var4.offset = var29 * -1025691571;
      var5.offset = var23 * -1025691571;
      var38 = 0;
      var39 = 0;
      var40 = 0;
      var41 = 0;

      int var43;
      int var44;
      for(var42 = 0; var42 < var10; ++var42) {
         var43 = var5.readUnsignedByte();
         if(var43 == 1) {
            var38 = var4.method_143((byte)31) + var41;
            var39 = var4.method_143((byte)51) + var38;
            var40 = var4.method_143((byte)46) + var39;
            var41 = var40;
            this.field_1002[var42] = var38;
            this.field_988[var42] = var39;
            this.field_991[var42] = var40;
         }

         if(var43 == 2) {
            var39 = var40;
            var40 = var4.method_143((byte)22) + var41;
            var41 = var40;
            this.field_1002[var42] = var38;
            this.field_988[var42] = var39;
            this.field_991[var42] = var40;
         }

         if(var43 == 3) {
            var38 = var40;
            var40 = var4.method_143((byte)23) + var41;
            var41 = var40;
            this.field_1002[var42] = var38;
            this.field_988[var42] = var39;
            this.field_991[var42] = var40;
         }

         if(var43 == 4) {
            var44 = var38;
            var38 = var39;
            var39 = var44;
            var40 = var4.method_143((byte)10) + var41;
            var41 = var40;
            this.field_1002[var42] = var38;
            this.field_988[var42] = var44;
            this.field_991[var42] = var40;
         }
      }

      var4.offset = var31 * 1564670527;

      for(var42 = 0; var42 < var11; ++var42) {
         this.field_998[var42] = 0;
         this.field_986[var42] = (short)var4.readShort();
         this.field_1000[var42] = (short)var4.readShort();
         this.field_1001[var42] = (short)var4.readShort();
      }

      if(this.field_993 != null) {
         boolean var47 = false;

         for(var43 = 0; var43 < var10; ++var43) {
            var44 = this.field_993[var43] & 255;
            if(var44 != 255) {
               if((this.field_986[var44] & '\uffff') == this.field_1002[var43] && (this.field_1000[var44] & -963777043) == this.field_988[var43] && (this.field_1001[var44] & '\uffff') == this.field_991[var43]) {
                  this.field_993[var43] = -1;
               } else {
                  var47 = true;
               }
            }
         }

         if(!var47) {
            this.field_993 = null;
         }
      }

      if(!var3) {
         this.field_1004 = null;
      }

      if(!var2) {
         this.field_990 = null;
      }

   }

   // $FF: renamed from: aj (gm, int) int
   final int method_1724(class_93 var1, int var2) {
      int var3 = -1;
      int var4 = var1.field_1008[var2];
      int var5 = var1.field_1015[var2];
      int var6 = var1.field_985[var2];

      for(int var7 = 0; var7 < this.field_996; ++var7) {
         if(var4 == this.field_1008[var7] && var5 == this.field_1015[var7] && var6 == this.field_985[var7]) {
            var3 = var7;
            break;
         }
      }

      if(var3 == -1) {
         this.field_1008[this.field_996] = var4;
         this.field_1015[this.field_996] = var5;
         this.field_985[this.field_996] = var6;
         if(var1.field_989 != null) {
            this.field_989[this.field_996] = var1.field_989[var2];
         }

         var3 = this.field_996++;
      }

      return var3;
   }

   // $FF: renamed from: an (int) void
   public void method_1725(int var1) {
      int var2 = field_1014[var1];
      int var3 = field_1021[var1];

      for(int var4 = 0; var4 < this.field_996; ++var4) {
         int var5 = this.field_985[var4] * var2 + this.field_1008[var4] * var3 >> 16;
         this.field_985[var4] = this.field_985[var4] * var3 - this.field_1008[var4] * var2 >> 16;
         this.field_1008[var4] = var5;
      }

      this.method_1688();
   }

   // $FF: renamed from: az (int[][], int, int, int, boolean, int) gm
   public class_93 method_1726(int[][] var1, int var2, int var3, int var4, boolean var5, int var6) {
      this.method_1709();
      int var7 = var2 + this.field_1013;
      int var8 = var2 + this.field_1016;
      int var9 = var4 + this.field_1020;
      int var10 = var4 + this.field_995;
      if(var7 >= 0 && var8 + -389133043 >> 7 < var1.length && var9 >= 0 && var10 + 128 >> 7 < var1[0].length) {
         var7 >>= 7;
         var8 = var8 + -612581197 >> 7;
         var9 >>= 7;
         var10 = var10 + 1583812573 >> 7;
         if(var1[var7][var9] == var3 && var1[var8][var9] == var3 && var1[var7][var10] == var3 && var1[var8][var10] == var3) {
            return this;
         } else {
            class_93 var11;
            if(var5) {
               class_93 var10000 = new class_93();
               var11 = var10000;
               var11.field_996 = this.field_996;
               var11.field_1018 = this.field_1018;
               var11.field_997 = this.field_997;
               var11.field_1008 = this.field_1008;
               var11.field_985 = this.field_985;
               var11.field_1002 = this.field_1002;
               var11.field_988 = this.field_988;
               var11.field_991 = this.field_991;
               var11.field_990 = this.field_990;
               var11.field_999 = this.field_999;
               var11.field_992 = this.field_992;
               var11.field_993 = this.field_993;
               var11.field_994 = this.field_994;
               var11.field_1004 = this.field_1004;
               var11.field_982 = this.field_982;
               var11.field_998 = this.field_998;
               var11.field_986 = this.field_986;
               var11.field_1000 = this.field_1000;
               var11.field_1001 = this.field_1001;
               var11.field_989 = this.field_989;
               var11.field_1003 = this.field_1003;
               var11.field_983 = this.field_983;
               var11.field_1005 = this.field_1005;
               var11.field_1009 = this.field_1009;
               var11.field_1010 = this.field_1010;
               var11.field_1015 = new int[var11.field_996];
            } else {
               var11 = this;
            }

            int var12;
            int var13;
            int var14;
            int var15;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if(var6 == 0) {
               for(var12 = 0; var12 < var11.field_996; ++var12) {
                  var13 = this.field_1008[var12] + var2;
                  var14 = this.field_985[var12] + var4;
                  var15 = var13 & 127;
                  var16 = var14 & 127;
                  var17 = var13 >> 7;
                  var18 = var14 >> 7;
                  var19 = var1[var17][var18] * (128 - var15) + var1[var17 + 1][var18] * var15 >> 7;
                  var20 = var1[var17][var18 + 1] * (-83866777 - var15) + var1[var17 + 1][var18 + 1] * var15 >> 7;
                  var21 = var19 * (128 - var16) + var20 * var16 >> 7;
                  var11.field_1015[var12] = this.field_1015[var12] + var21 - var3;
               }
            } else {
               for(var12 = 0; var12 < var11.field_996; ++var12) {
                  var13 = (-this.field_1015[var12] << 16) / (this.field_911 * 267422413);
                  if(var13 < var6) {
                     var14 = this.field_1008[var12] + var2;
                     var15 = this.field_985[var12] + var4;
                     var16 = var14 & 127;
                     var17 = var15 & 127;
                     var18 = var14 >> 7;
                     var19 = var15 >> 7;
                     var20 = var1[var18][var19] * (128 - var16) + var1[var18 + 1][var19] * var16 >> 7;
                     var21 = var1[var18][var19 + 1] * (-962867630 - var16) + var1[var18 + 1][var19 + 1] * var16 >> 7;
                     int var22 = var20 * (128 - var17) + var21 * var17 >> 7;
                     var11.field_1015[var12] = this.field_1015[var12] + (var22 - var3) * (var6 - var13) / var6;
                  }
               }
            }

            var11.method_1688();
            return var11;
         }
      } else {
         return this;
      }
   }

   // $FF: renamed from: av () void
   void method_1727() {
      int[] var1;
      int var2;
      int var3;
      int var4;
      if(this.field_989 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field_996; ++var3) {
            var4 = this.field_989[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field_983 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field_983[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field_996; this.field_983[var4][var1[var4]++] = var3++) {
            var4 = this.field_989[var3];
         }

         this.field_989 = null;
      }

      if(this.field_1003 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field_1018; ++var3) {
            var4 = this.field_1003[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field_1005 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field_1005[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field_1018; this.field_1005[var4][var1[var4]++] = var3++) {
            var4 = this.field_1003[var3];
         }

         this.field_1003 = null;
      }

   }

   // $FF: renamed from: ac () void
   void method_1728() {
      int[] var1;
      int var2;
      int var3;
      int var4;
      if(this.field_989 != null) {
         var1 = new int[1688508325];
         var2 = 0;

         for(var3 = 0; var3 < this.field_996; ++var3) {
            var4 = this.field_989[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field_983 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field_983[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field_996; this.field_983[var4][var1[var4]++] = var3++) {
            var4 = this.field_989[var3];
         }

         this.field_989 = null;
      }

      if(this.field_1003 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field_1018; ++var3) {
            var4 = this.field_1003[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field_1005 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field_1005[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field_1018; this.field_1005[var4][var1[var4]++] = var3++) {
            var4 = this.field_1003[var3];
         }

         this.field_1003 = null;
      }

   }

   // $FF: renamed from: am () gm
   public class_93 method_1729() {
      class_93 var10000 = new class_93();
      class_93 var1 = var10000;
      if(this.field_990 != null) {
         var1.field_990 = new byte[this.field_1018];

         for(int var2 = 0; var2 < this.field_1018; ++var2) {
            var1.field_990[var2] = this.field_990[var2];
         }
      }

      var1.field_996 = this.field_996;
      var1.field_1018 = this.field_1018;
      var1.field_997 = this.field_997;
      var1.field_1008 = this.field_1008;
      var1.field_1015 = this.field_1015;
      var1.field_985 = this.field_985;
      var1.field_1002 = this.field_1002;
      var1.field_988 = this.field_988;
      var1.field_991 = this.field_991;
      var1.field_999 = this.field_999;
      var1.field_992 = this.field_992;
      var1.field_993 = this.field_993;
      var1.field_994 = this.field_994;
      var1.field_1004 = this.field_1004;
      var1.field_982 = this.field_982;
      var1.field_998 = this.field_998;
      var1.field_986 = this.field_986;
      var1.field_1000 = this.field_1000;
      var1.field_1001 = this.field_1001;
      var1.field_989 = this.field_989;
      var1.field_1003 = this.field_1003;
      var1.field_983 = this.field_983;
      var1.field_1005 = this.field_1005;
      var1.field_1007 = this.field_1007;
      var1.field_1006 = this.field_1006;
      var1.field_1009 = this.field_1009;
      var1.field_1010 = this.field_1010;
      return var1;
   }

   // $FF: renamed from: x (int, int, int) void
   public void method_1730(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_996; ++var4) {
         this.field_1008[var4] = this.field_1008[var4] * var1 / 128;
         this.field_1015[var4] = this.field_1015[var4] * var2 / 128;
         this.field_985[var4] = this.field_985[var4] * var3 / 128;
      }

      this.method_1688();
   }

   // $FF: renamed from: by (int, int, int, int, int) gr
   public final class_92 method_1731(int var1, int var2, int var3, int var4, int var5) {
      this.method_1707();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      class_92 var10000 = new class_92();
      class_92 var8 = var10000;
      var8.field_920 = new int[this.field_1018];
      var8.field_925 = new int[this.field_1018];
      var8.field_926 = new int[this.field_1018];
      if(this.field_997 > 0 && this.field_993 != null) {
         int[] var9 = new int[this.field_997];

         int var10;
         for(var10 = 0; var10 < this.field_1018; ++var10) {
            if(this.field_993[var10] != -1) {
               ++var9[this.field_993[var10] & 255];
            }
         }

         var8.field_932 = 0;

         for(var10 = 0; var10 < this.field_997; ++var10) {
            if(var9[var10] > 0 && this.field_998[var10] == 0) {
               ++var8.field_932;
            }
         }

         var8.field_933 = new int[var8.field_932];
         var8.field_934 = new int[var8.field_932];
         var8.field_958 = new int[var8.field_932];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field_997; ++var11) {
            if(var9[var11] > 0 && this.field_998[var11] == 0) {
               var8.field_933[var10] = this.field_986[var11] & '\uffff';
               var8.field_934[var10] = this.field_1000[var11] & '\uffff';
               var8.field_958[var10] = this.field_1001[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field_929 = new byte[this.field_1018];

         for(var11 = 0; var11 < this.field_1018; ++var11) {
            if(this.field_993[var11] != -1) {
               var8.field_929[var11] = (byte)var9[this.field_993[var11] & 255];
            } else {
               var8.field_929[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.field_1018; ++var16) {
         byte var17;
         if(this.field_990 == null) {
            var17 = 0;
         } else {
            var17 = this.field_990[var16];
         }

         byte var18;
         if(this.field_992 == null) {
            var18 = 0;
         } else {
            var18 = this.field_992[var16];
         }

         short var12;
         if(this.field_1004 == null) {
            var12 = -1;
         } else {
            var12 = this.field_1004[var16];
         }

         if(var18 == -2) {
            var17 = 3;
         }

         if(var18 == -1) {
            var17 = 2;
         }

         class_243 var13;
         int var14;
         class_246 var19;
         if(var12 == -1) {
            if(var17 == 0) {
               int var15 = this.field_994[var16] & '\uffff';
               if(this.field_987 != null && this.field_987[this.field_1002[var16]] != null) {
                  var13 = this.field_987[this.field_1002[var16]];
               } else {
                  var13 = this.field_1007[this.field_1002[var16]];
               }

               var14 = var1 + (var3 * var13.field_2695 * -573742035 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1984775097);
               var8.field_920[var16] = method_1699(var15, var14);
               if(this.field_987 != null && this.field_987[this.field_988[var16]] != null) {
                  var13 = this.field_987[this.field_988[var16]];
               } else {
                  var13 = this.field_1007[this.field_988[var16]];
               }

               var14 = var1 + (var3 * var13.field_2695 * -573742035 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1984775097);
               var8.field_925[var16] = method_1699(var15, var14);
               if(this.field_987 != null && this.field_987[this.field_991[var16]] != null) {
                  var13 = this.field_987[this.field_991[var16]];
               } else {
                  var13 = this.field_1007[this.field_991[var16]];
               }

               var14 = var1 + (var3 * var13.field_2695 * -573742035 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1984775097);
               var8.field_926[var16] = method_1699(var15, var14);
            } else if(var17 == 1) {
               var19 = this.field_1006[var16];
               var14 = var1 + (var3 * var19.field_2725 * 771770075 + var4 * var19.field_2723 * -1803245333 + var5 * var19.field_2721 * -1870263719) / (var7 + var7 / 2);
               var8.field_920[var16] = method_1699(this.field_994[var16] & '\uffff', var14);
               var8.field_926[var16] = -1;
            } else if(var17 == 3) {
               var8.field_920[var16] = 128;
               var8.field_926[var16] = -1;
            } else {
               var8.field_926[var16] = -2;
            }
         } else if(var17 == 0) {
            if(this.field_987 != null && this.field_987[this.field_1002[var16]] != null) {
               var13 = this.field_987[this.field_1002[var16]];
            } else {
               var13 = this.field_1007[this.field_1002[var16]];
            }

            var14 = var1 + (var3 * var13.field_2695 * -573742035 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1984775097);
            var8.field_920[var16] = method_1713(var14);
            if(this.field_987 != null && this.field_987[this.field_988[var16]] != null) {
               var13 = this.field_987[this.field_988[var16]];
            } else {
               var13 = this.field_1007[this.field_988[var16]];
            }

            var14 = var1 + (var3 * var13.field_2695 * -573742035 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1984775097);
            var8.field_925[var16] = method_1713(var14);
            if(this.field_987 != null && this.field_987[this.field_991[var16]] != null) {
               var13 = this.field_987[this.field_991[var16]];
            } else {
               var13 = this.field_1007[this.field_991[var16]];
            }

            var14 = var1 + (var3 * var13.field_2695 * -573742035 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1984775097);
            var8.field_926[var16] = method_1713(var14);
         } else if(var17 == 1) {
            var19 = this.field_1006[var16];
            var14 = var1 + (var3 * var19.field_2725 * 771770075 + var4 * var19.field_2723 * -1803245333 + var5 * var19.field_2721 * -1870263719) / (var7 + var7 / 2);
            var8.field_920[var16] = method_1713(var14);
            var8.field_926[var16] = -1;
         } else {
            var8.field_926[var16] = -2;
         }
      }

      this.method_1746();
      var8.field_916 = this.field_996;
      var8.field_917 = this.field_1008;
      var8.field_918 = this.field_1015;
      var8.field_936 = this.field_985;
      var8.field_970 = this.field_1018;
      var8.field_921 = this.field_1002;
      var8.field_966 = this.field_988;
      var8.field_923 = this.field_991;
      var8.field_948 = this.field_999;
      var8.field_928 = this.field_992;
      var8.field_931 = this.field_982;
      var8.field_977 = this.field_983;
      var8.field_937 = this.field_1005;
      var8.field_930 = this.field_1004;
      return var8;
   }

   // $FF: renamed from: <init> (gm, boolean, boolean, boolean, boolean) void
   public class_93(class_93 var1, boolean var2, boolean var3, boolean var4, boolean var5) {
      super();
      this.field_996 = 0;
      this.field_1018 = 0;
      this.field_982 = 0;
      this.field_1011 = false;
      this.field_996 = var1.field_996;
      this.field_1018 = var1.field_1018;
      this.field_997 = var1.field_997;
      int var6;
      if(var2) {
         this.field_1008 = var1.field_1008;
         this.field_1015 = var1.field_1015;
         this.field_985 = var1.field_985;
      } else {
         this.field_1008 = new int[this.field_996];
         this.field_1015 = new int[this.field_996];
         this.field_985 = new int[this.field_996];

         for(var6 = 0; var6 < this.field_996; ++var6) {
            this.field_1008[var6] = var1.field_1008[var6];
            this.field_1015[var6] = var1.field_1015[var6];
            this.field_985[var6] = var1.field_985[var6];
         }
      }

      if(var3) {
         this.field_994 = var1.field_994;
      } else {
         this.field_994 = new short[this.field_1018];

         for(var6 = 0; var6 < this.field_1018; ++var6) {
            this.field_994[var6] = var1.field_994[var6];
         }
      }

      if(!var4 && var1.field_1004 != null) {
         this.field_1004 = new short[this.field_1018];

         for(var6 = 0; var6 < this.field_1018; ++var6) {
            this.field_1004[var6] = var1.field_1004[var6];
         }
      } else {
         this.field_1004 = var1.field_1004;
      }

      if(var5) {
         this.field_992 = var1.field_992;
      } else {
         this.field_992 = new byte[this.field_1018];
         if(var1.field_992 == null) {
            for(var6 = 0; var6 < this.field_1018; ++var6) {
               this.field_992[var6] = 0;
            }
         } else {
            for(var6 = 0; var6 < this.field_1018; ++var6) {
               this.field_992[var6] = var1.field_992[var6];
            }
         }
      }

      this.field_1002 = var1.field_1002;
      this.field_988 = var1.field_988;
      this.field_991 = var1.field_991;
      this.field_990 = var1.field_990;
      this.field_999 = var1.field_999;
      this.field_993 = var1.field_993;
      this.field_982 = var1.field_982;
      this.field_998 = var1.field_998;
      this.field_986 = var1.field_986;
      this.field_1000 = var1.field_1000;
      this.field_1001 = var1.field_1001;
      this.field_989 = var1.field_989;
      this.field_1003 = var1.field_1003;
      this.field_983 = var1.field_983;
      this.field_1005 = var1.field_1005;
      this.field_1007 = var1.field_1007;
      this.field_1006 = var1.field_1006;
      this.field_987 = var1.field_987;
      this.field_1009 = var1.field_1009;
      this.field_1010 = var1.field_1010;
   }

   // $FF: renamed from: aw () void
   public void method_1733() {
      for(int var1 = 0; var1 < this.field_996; ++var1) {
         this.field_1008[var1] = -this.field_1008[var1];
         this.field_985[var1] = -this.field_985[var1];
      }

      this.method_1688();
   }

   // $FF: renamed from: af () void
   public void method_1734() {
      for(int var1 = 0; var1 < this.field_996; ++var1) {
         this.field_1008[var1] = -this.field_1008[var1];
         this.field_985[var1] = -this.field_985[var1];
      }

      this.method_1688();
   }

   // $FF: renamed from: ak () void
   public void method_1735() {
      for(int var1 = 0; var1 < this.field_996; ++var1) {
         this.field_1008[var1] = -this.field_1008[var1];
         this.field_985[var1] = -this.field_985[var1];
      }

      this.method_1688();
   }

   // $FF: renamed from: ay () void
   public void method_1736() {
      for(int var1 = 0; var1 < this.field_996; ++var1) {
         int var2 = this.field_985[var1];
         this.field_985[var1] = this.field_1008[var1];
         this.field_1008[var1] = -var2;
      }

      this.method_1688();
   }

   // $FF: renamed from: aa (int) void
   public void method_1737(int var1) {
      int var2 = field_1014[var1];
      int var3 = field_1021[var1];

      for(int var4 = 0; var4 < this.field_996; ++var4) {
         int var5 = this.field_985[var4] * var2 + this.field_1008[var4] * var3 >> 16;
         this.field_985[var4] = this.field_985[var4] * var3 - this.field_1008[var4] * var2 >> 16;
         this.field_1008[var4] = var5;
      }

      this.method_1688();
   }

   // $FF: renamed from: au (int) void
   public void method_1738(int var1) {
      int var2 = field_1014[var1];
      int var3 = field_1021[var1];

      for(int var4 = 0; var4 < this.field_996; ++var4) {
         int var5 = this.field_985[var4] * var2 + this.field_1008[var4] * var3 >> 16;
         this.field_985[var4] = this.field_985[var4] * var3 - this.field_1008[var4] * var2 >> 16;
         this.field_1008[var4] = var5;
      }

      this.method_1688();
   }

   // $FF: renamed from: ao () void
   public void method_1739() {
      for(int var1 = 0; var1 < this.field_996; ++var1) {
         int var2 = this.field_1008[var1];
         this.field_1008[var1] = this.field_985[var1];
         this.field_985[var1] = -var2;
      }

      this.method_1688();
   }

   // $FF: renamed from: bd (int, int, int) void
   public void method_1740(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_996; ++var4) {
         this.field_1008[var4] += var1;
         this.field_1015[var4] += var2;
         this.field_985[var4] += var3;
      }

      this.method_1688();
   }

   // $FF: renamed from: bq (short, short) void
   public void method_1741(short var1, short var2) {
      for(int var3 = 0; var3 < this.field_1018; ++var3) {
         if(this.field_994[var3] == var1) {
            this.field_994[var3] = var2;
         }
      }

   }

   // $FF: renamed from: ai (byte[]) void
   void method_1742(byte[] var1) {
      Buffer var10000 = new Buffer(var1);
      Buffer var2 = var10000;
      var10000 = new Buffer(var1);
      Buffer var3 = var10000;
      var10000 = new Buffer(var1);
      Buffer var4 = var10000;
      var10000 = new Buffer(var1);
      Buffer var5 = var10000;
      var10000 = new Buffer(var1);
      Buffer var6 = var10000;
      var10000 = new Buffer(var1);
      Buffer var7 = var10000;
      var10000 = new Buffer(var1);
      Buffer var8 = var10000;
      var2.offset = (var1.length - 23) * -1025691571;
      int var9 = var2.readShort();
      int var10 = var2.readShort();
      int var11 = var2.readUnsignedByte();
      int var12 = var2.readUnsignedByte();
      int var13 = var2.readUnsignedByte();
      int var14 = var2.readUnsignedByte();
      int var15 = var2.readUnsignedByte();
      int var16 = var2.readUnsignedByte();
      int var17 = var2.readUnsignedByte();
      int var18 = var2.readShort();
      int var19 = var2.readShort();
      int var20 = var2.readShort();
      int var21 = var2.readShort();
      int var22 = var2.readShort();
      int var23 = 0;
      int var24 = 0;
      int var25 = 0;
      int var26;
      if(var11 > 0) {
         this.field_998 = new byte[var11];
         var2.offset = 0;

         for(var26 = 0; var26 < var11; ++var26) {
            byte var27 = this.field_998[var26] = var2.method_131();
            if(var27 == 0) {
               ++var23;
            }

            if(var27 >= 1 && var27 <= 3) {
               ++var24;
            }

            if(var27 == 2) {
               ++var25;
            }
         }
      }

      var26 = var11 + var9;
      int var28 = var26;
      if(var12 == 1) {
         var26 += var10;
      }

      int var29 = var26;
      var26 += var10;
      int var30 = var26;
      if(var13 == 255) {
         var26 += var10;
      }

      int var31 = var26;
      if(var15 == 1) {
         var26 += var10;
      }

      int var32 = var26;
      if(var17 == 1) {
         var26 += var9;
      }

      int var33 = var26;
      if(var14 == 1) {
         var26 += var10;
      }

      int var34 = var26;
      var26 += var21;
      int var35 = var26;
      if(var16 == 1) {
         var26 += var10 * 2;
      }

      int var36 = var26;
      var26 += var22;
      int var37 = var26;
      var26 += var10 * 2;
      int var38 = var26;
      var26 += var18;
      int var39 = var26;
      var26 += var19;
      int var40 = var26;
      var26 += var20;
      int var41 = var26;
      var26 += var23 * 6;
      int var42 = var26;
      var26 += var24 * 6;
      int var43 = var26;
      var26 += var24 * 6;
      int var44 = var26;
      var26 += var24 * 2;
      int var45 = var26;
      var26 += var24;
      int var46 = var26;
      var26 += var24 * 2 + var25 * 2;
      this.field_996 = var9;
      this.field_1018 = var10;
      this.field_997 = var11;
      this.field_1008 = new int[var9];
      this.field_1015 = new int[var9];
      this.field_985 = new int[var9];
      this.field_1002 = new int[var10];
      this.field_988 = new int[var10];
      this.field_991 = new int[var10];
      if(var17 == 1) {
         this.field_989 = new int[var9];
      }

      if(var12 == 1) {
         this.field_990 = new byte[var10];
      }

      if(var13 == 255) {
         this.field_999 = new byte[var10];
      } else {
         this.field_982 = (byte)var13;
      }

      if(var14 == 1) {
         this.field_992 = new byte[var10];
      }

      if(var15 == 1) {
         this.field_1003 = new int[var10];
      }

      if(var16 == 1) {
         this.field_1004 = new short[var10];
      }

      if(var16 == 1 && var11 > 0) {
         this.field_993 = new byte[var10];
      }

      this.field_994 = new short[var10];
      if(var11 > 0) {
         this.field_986 = new short[var11];
         this.field_1000 = new short[var11];
         this.field_1001 = new short[var11];
      }

      var2.offset = var11 * -1025691571;
      var3.offset = var38 * -1025691571;
      var4.offset = var39 * -1025691571;
      var5.offset = var40 * -1025691571;
      var6.offset = var32 * -1025691571;
      int var48 = 0;
      int var49 = 0;
      int var50 = 0;

      int var51;
      int var52;
      int var53;
      int var54;
      int var55;
      for(var51 = 0; var51 < var9; ++var51) {
         var52 = var2.readUnsignedByte();
         var53 = 0;
         if((var52 & 1) != 0) {
            var53 = var3.method_143((byte)26);
         }

         var54 = 0;
         if((var52 & 2) != 0) {
            var54 = var4.method_143((byte)118);
         }

         var55 = 0;
         if((var52 & 4) != 0) {
            var55 = var5.method_143((byte)91);
         }

         this.field_1008[var51] = var48 + var53;
         this.field_1015[var51] = var49 + var54;
         this.field_985[var51] = var50 + var55;
         var48 = this.field_1008[var51];
         var49 = this.field_1015[var51];
         var50 = this.field_985[var51];
         if(var17 == 1) {
            this.field_989[var51] = var6.readUnsignedByte();
         }
      }

      var2.offset = var37 * -1025691571;
      var3.offset = var28 * -1025691571;
      var4.offset = var30 * -1025691571;
      var5.offset = var33 * -1025691571;
      var6.offset = var31 * -1025691571;
      var7.offset = var35 * -1025691571;
      var8.offset = var36 * -1025691571;

      for(var51 = 0; var51 < var10; ++var51) {
         this.field_994[var51] = (short)var2.readShort();
         if(var12 == 1) {
            this.field_990[var51] = var3.method_131();
         }

         if(var13 == 255) {
            this.field_999[var51] = var4.method_131();
         }

         if(var14 == 1) {
            this.field_992[var51] = var5.method_131();
         }

         if(var15 == 1) {
            this.field_1003[var51] = var6.readUnsignedByte();
         }

         if(var16 == 1) {
            this.field_1004[var51] = (short)(var7.readShort() - 1);
         }

         if(this.field_993 != null && this.field_1004[var51] != -1) {
            this.field_993[var51] = (byte)(var8.readUnsignedByte() - 1);
         }
      }

      var2.offset = var34 * -1025691571;
      var3.offset = var29 * -1025691571;
      var51 = 0;
      var52 = 0;
      var53 = 0;
      var54 = 0;

      int var56;
      for(var55 = 0; var55 < var10; ++var55) {
         var56 = var3.readUnsignedByte();
         if(var56 == 1) {
            var51 = var2.method_143((byte)16) + var54;
            var52 = var2.method_143((byte)118) + var51;
            var53 = var2.method_143((byte)108) + var52;
            var54 = var53;
            this.field_1002[var55] = var51;
            this.field_988[var55] = var52;
            this.field_991[var55] = var53;
         }

         if(var56 == 2) {
            var52 = var53;
            var53 = var2.method_143((byte)96) + var54;
            var54 = var53;
            this.field_1002[var55] = var51;
            this.field_988[var55] = var52;
            this.field_991[var55] = var53;
         }

         if(var56 == 3) {
            var51 = var53;
            var53 = var2.method_143((byte)83) + var54;
            var54 = var53;
            this.field_1002[var55] = var51;
            this.field_988[var55] = var52;
            this.field_991[var55] = var53;
         }

         if(var56 == 4) {
            int var57 = var51;
            var51 = var52;
            var52 = var57;
            var53 = var2.method_143((byte)38) + var54;
            var54 = var53;
            this.field_1002[var55] = var51;
            this.field_988[var55] = var57;
            this.field_991[var55] = var53;
         }
      }

      var2.offset = var41 * -1025691571;
      var3.offset = var42 * -1025691571;
      var4.offset = var43 * -1025691571;
      var5.offset = var44 * -1025691571;
      var6.offset = var45 * -1025691571;
      var7.offset = var46 * -1025691571;

      for(var55 = 0; var55 < var11; ++var55) {
         var56 = this.field_998[var55] & 255;
         if(var56 == 0) {
            this.field_986[var55] = (short)var2.readShort();
            this.field_1000[var55] = (short)var2.readShort();
            this.field_1001[var55] = (short)var2.readShort();
         }
      }

      var2.offset = var26 * -1025691571;
      var55 = var2.readUnsignedByte();
      if(var55 != 0) {
         new class_271();
         var2.readShort();
         var2.readShort();
         var2.readShort();
         var2.method_135();
      }

   }

   // $FF: renamed from: bu (short, short) void
   public void method_1743(short var1, short var2) {
      if(this.field_1004 != null) {
         for(int var3 = 0; var3 < this.field_1018; ++var3) {
            if(this.field_1004[var3] == var1) {
               this.field_1004[var3] = var2;
            }
         }

      }
   }

   // $FF: renamed from: bl (short, short) void
   public void method_1744(short var1, short var2) {
      if(this.field_1004 != null) {
         for(int var3 = 0; var3 < this.field_1018; ++var3) {
            if(this.field_1004[var3] == var1) {
               this.field_1004[var3] = var2;
            }
         }

      }
   }

   // $FF: renamed from: bv () void
   public void method_1745() {
      int var1;
      for(var1 = 0; var1 < this.field_996; ++var1) {
         this.field_985[var1] = -this.field_985[var1];
      }

      for(var1 = 0; var1 < this.field_1018; ++var1) {
         int var2 = this.field_1002[var1];
         this.field_1002[var1] = this.field_991[var1];
         this.field_991[var1] = var2;
      }

      this.method_1688();
   }

   // $FF: renamed from: u () void
   void method_1746() {
      int[] var1;
      int var2;
      int var3;
      int var4;
      if(this.field_989 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field_996; ++var3) {
            var4 = this.field_989[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field_983 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field_983[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field_996; this.field_983[var4][var1[var4]++] = var3++) {
            var4 = this.field_989[var3];
         }

         this.field_989 = null;
      }

      if(this.field_1003 != null) {
         var1 = new int[256];
         var2 = 0;

         for(var3 = 0; var3 < this.field_1018; ++var3) {
            var4 = this.field_1003[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field_1005 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field_1005[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field_1018; this.field_1005[var4][var1[var4]++] = var3++) {
            var4 = this.field_1003[var3];
         }

         this.field_1003 = null;
      }

   }

   // $FF: renamed from: bz () void
   public void method_1747() {
      int var1;
      for(var1 = 0; var1 < this.field_996; ++var1) {
         this.field_985[var1] = -this.field_985[var1];
      }

      for(var1 = 0; var1 < this.field_1018; ++var1) {
         int var2 = this.field_1002[var1];
         this.field_1002[var1] = this.field_991[var1];
         this.field_991[var1] = var2;
      }

      this.method_1688();
   }

   // $FF: renamed from: ap (jv, int, int) gm
   public static class_93 method_1748(class_306 var0, int var1, int var2) {
      byte[] var3 = var0.method_5381(var1, var2);
      if(var3 == null) {
         return null;
      } else {
         class_93 var10000 = new class_93(var3);
         return var10000;
      }
   }

   // $FF: renamed from: <init> (byte[]) void
   class_93(byte[] var1) {
      super();
      this.field_996 = 0;
      this.field_1018 = 0;
      this.field_982 = 0;
      this.field_1011 = false;
      if(var1[var1.length - 1] == -1 && var1[var1.length - 2] == -1) {
         this.method_1716(var1);
      } else {
         this.method_1692(var1);
      }

   }

   // $FF: renamed from: br (int, int, int) void
   public void method_1750(int var1, int var2, int var3) {
      for(int var4 = 0; var4 < this.field_996; ++var4) {
         this.field_1008[var4] = this.field_1008[var4] * var1 / 180870772;
         this.field_1015[var4] = this.field_1015[var4] * var2 / -1757419479;
         this.field_985[var4] = this.field_985[var4] * var3 / 128;
      }

      this.method_1688();
   }

   // $FF: renamed from: bf () void
   public void method_1751() {
      if(this.field_1007 == null) {
         this.field_1007 = new class_243[this.field_996];

         int var1;
         for(var1 = 0; var1 < this.field_996; ++var1) {
            class_243[] var10000 = this.field_1007;
            class_243 var10002 = new class_243();
            var10000[var1] = var10002;
         }

         for(var1 = 0; var1 < this.field_1018; ++var1) {
            int var2 = this.field_1002[var1];
            int var3 = this.field_988[var1];
            int var4 = this.field_991[var1];
            int var5 = this.field_1008[var3] - this.field_1008[var2];
            int var6 = this.field_1015[var3] - this.field_1015[var2];
            int var7 = this.field_985[var3] - this.field_985[var2];
            int var8 = this.field_1008[var4] - this.field_1008[var2];
            int var9 = this.field_1015[var4] - this.field_1015[var2];
            int var10 = this.field_985[var4] - this.field_985[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > -1614178845 || var13 > 8192 || var11 < -1696957115 || var12 < 1616112947 || var13 < 141901592; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if(var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 1104729598 / var14;
            var12 = var12 * -1533458700 / var14;
            var13 = var13 * 170891322 / var14;
            byte var15;
            if(this.field_990 == null) {
               var15 = 0;
            } else {
               var15 = this.field_990[var1];
            }

            if(var15 == 0) {
               class_243 var16 = this.field_1007[var2];
               var16.field_2695 += var11 * 1549962149;
               var16.field_2699 += var12 * -1937229865;
               var16.field_2696 += var13 * -751295597;
               var16.field_2694 += -698232183;
               var16 = this.field_1007[var3];
               var16.field_2695 += var11 * 592648651;
               var16.field_2699 += var12 * 371866635;
               var16.field_2696 += var13 * 700938581;
               var16.field_2694 += -698232183;
               var16 = this.field_1007[var4];
               var16.field_2695 += var11 * 1549962149;
               var16.field_2699 += var12 * 49420056;
               var16.field_2696 += var13 * 173220473;
               var16.field_2694 += 1973227895;
            } else if(var15 == 1) {
               if(this.field_1006 == null) {
                  this.field_1006 = new class_246[this.field_1018];
               }

               class_246[] var17 = this.field_1006;
               class_246 var19 = new class_246();
               class_246 var18 = var17[var1] = var19;
               var18.field_2725 = var11 * -201886597;
               var18.field_2723 = var12 * 1942273987;
               var18.field_2721 = var13 * -907502103;
            }
         }

      }
   }

   // $FF: renamed from: at () void
   void method_1752() {
      int[] var1;
      int var2;
      int var3;
      int var4;
      if(this.field_989 != null) {
         var1 = new int[-690835732];
         var2 = 0;

         for(var3 = 0; var3 < this.field_996; ++var3) {
            var4 = this.field_989[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field_983 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field_983[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field_996; this.field_983[var4][var1[var4]++] = var3++) {
            var4 = this.field_989[var3];
         }

         this.field_989 = null;
      }

      if(this.field_1003 != null) {
         var1 = new int[-185798788];
         var2 = 0;

         for(var3 = 0; var3 < this.field_1018; ++var3) {
            var4 = this.field_1003[var3];
            ++var1[var4];
            if(var4 > var2) {
               var2 = var4;
            }
         }

         this.field_1005 = new int[var2 + 1][];

         for(var3 = 0; var3 <= var2; ++var3) {
            this.field_1005[var3] = new int[var1[var3]];
            var1[var3] = 0;
         }

         for(var3 = 0; var3 < this.field_1018; this.field_1005[var4][var1[var4]++] = var3++) {
            var4 = this.field_1003[var3];
         }

         this.field_1003 = null;
      }

   }

   // $FF: renamed from: be () void
   public void method_1753() {
      if(this.field_1007 == null) {
         this.field_1007 = new class_243[this.field_996];

         int var1;
         for(var1 = 0; var1 < this.field_996; ++var1) {
            class_243[] var10000 = this.field_1007;
            class_243 var10002 = new class_243();
            var10000[var1] = var10002;
         }

         for(var1 = 0; var1 < this.field_1018; ++var1) {
            int var2 = this.field_1002[var1];
            int var3 = this.field_988[var1];
            int var4 = this.field_991[var1];
            int var5 = this.field_1008[var3] - this.field_1008[var2];
            int var6 = this.field_1015[var3] - this.field_1015[var2];
            int var7 = this.field_985[var3] - this.field_985[var2];
            int var8 = this.field_1008[var4] - this.field_1008[var2];
            int var9 = this.field_1015[var4] - this.field_1015[var2];
            int var10 = this.field_985[var4] - this.field_985[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < -734753327; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if(var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * -14013447 / var14;
            var12 = var12 * -483822127 / var14;
            var13 = var13 * 480113157 / var14;
            byte var15;
            if(this.field_990 == null) {
               var15 = 0;
            } else {
               var15 = this.field_990[var1];
            }

            if(var15 == 0) {
               class_243 var16 = this.field_1007[var2];
               var16.field_2695 += var11 * 1416285725;
               var16.field_2699 += var12 * 2081338512;
               var16.field_2696 += var13 * -114375206;
               var16.field_2694 += 45450811;
               var16 = this.field_1007[var3];
               var16.field_2695 += var11 * 1549962149;
               var16.field_2699 += var12 * -404052289;
               var16.field_2696 += var13 * 700938581;
               var16.field_2694 += -698232183;
               var16 = this.field_1007[var4];
               var16.field_2695 += var11 * 596151926;
               var16.field_2699 += var12 * 371866635;
               var16.field_2696 += var13 * 599154135;
               var16.field_2694 += -698232183;
            } else if(var15 == 1) {
               if(this.field_1006 == null) {
                  this.field_1006 = new class_246[this.field_1018];
               }

               class_246[] var17 = this.field_1006;
               class_246 var19 = new class_246();
               class_246 var18 = var17[var1] = var19;
               var18.field_2725 = var11 * -110082733;
               var18.field_2723 = var12 * -1708523446;
               var18.field_2721 = var13 * 1372202870;
            }
         }

      }
   }

   // $FF: renamed from: bj () void
   void method_1754() {
      this.field_1007 = null;
      this.field_987 = null;
      this.field_1006 = null;
      this.field_1011 = false;
   }

   // $FF: renamed from: bx () void
   void method_1755() {
      this.field_1007 = null;
      this.field_987 = null;
      this.field_1006 = null;
      this.field_1011 = false;
   }

   // $FF: renamed from: bp () void
   void method_1756() {
      this.field_1007 = null;
      this.field_987 = null;
      this.field_1006 = null;
      this.field_1011 = false;
   }

   // $FF: renamed from: bn () void
   void method_1757() {
      this.field_1007 = null;
      this.field_987 = null;
      this.field_1006 = null;
      this.field_1011 = false;
   }

   // $FF: renamed from: bo () void
   void method_1758() {
      this.field_1007 = null;
      this.field_987 = null;
      this.field_1006 = null;
      this.field_1011 = false;
   }

   // $FF: renamed from: bw () void
   void method_1759() {
      if(!this.field_1011) {
         this.field_911 = 0;
         this.field_1012 = 0;
         this.field_1013 = 999999;
         this.field_1016 = -999999;
         this.field_995 = -99999;
         this.field_1020 = 99999;

         for(int var1 = 0; var1 < this.field_996; ++var1) {
            int var2 = this.field_1008[var1];
            int var3 = this.field_1015[var1];
            int var4 = this.field_985[var1];
            if(var2 < this.field_1013) {
               this.field_1013 = var2;
            }

            if(var2 > this.field_1016) {
               this.field_1016 = var2;
            }

            if(var4 < this.field_1020) {
               this.field_1020 = var4;
            }

            if(var4 > this.field_995) {
               this.field_995 = var4;
            }

            if(-var3 > this.field_911 * 267422413) {
               this.field_911 = -var3 * -126455291;
            }

            if(var3 > this.field_1012) {
               this.field_1012 = var3;
            }
         }

         this.field_1011 = true;
      }
   }

   // $FF: renamed from: bi (gm, gm, int, int, int, boolean) void
   static void method_1760(class_93 var0, class_93 var1, int var2, int var3, int var4, boolean var5) {
      var0.method_1709();
      var0.method_1707();
      var1.method_1709();
      var1.method_1707();
      ++field_1019;
      int var6 = 0;
      int[] var7 = var1.field_1008;
      int var8 = var1.field_996;

      int var9;
      for(var9 = 0; var9 < var0.field_996; ++var9) {
         class_243 var10 = var0.field_1007[var9];
         if(var10.field_2694 * 1984775097 != 0) {
            int var11 = var0.field_1015[var9] - var3;
            if(var11 <= var1.field_1012) {
               int var12 = var0.field_1008[var9] - var2;
               if(var12 >= var1.field_1013 && var12 <= var1.field_1016) {
                  int var13 = var0.field_985[var9] - var4;
                  if(var13 >= var1.field_1020 && var13 <= var1.field_995) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        class_243 var15 = var1.field_1007[var14];
                        if(var12 == var7[var14] && var13 == var1.field_985[var14] && var11 == var1.field_1015[var14] && var15.field_2694 * 1984775097 != 0) {
                           if(var0.field_987 == null) {
                              var0.field_987 = new class_243[var0.field_996];
                           }

                           if(var1.field_987 == null) {
                              var1.field_987 = new class_243[var8];
                           }

                           class_243 var16 = var0.field_987[var9];
                           class_243[] var10000;
                           class_243 var10002;
                           if(var16 == null) {
                              var10000 = var0.field_987;
                              var10002 = new class_243(var10);
                              var16 = var10000[var9] = var10002;
                           }

                           class_243 var17 = var1.field_987[var14];
                           if(var17 == null) {
                              var10000 = var1.field_987;
                              var10002 = new class_243(var15);
                              var17 = var10000[var14] = var10002;
                           }

                           var16.field_2695 += var15.field_2695 * 1;
                           var16.field_2699 += var15.field_2699 * 1;
                           var16.field_2696 += var15.field_2696 * 1;
                           var16.field_2694 += var15.field_2694 * 1;
                           var17.field_2695 += var10.field_2695 * 1;
                           var17.field_2699 += var10.field_2699 * 1;
                           var17.field_2696 += var10.field_2696 * 1;
                           var17.field_2694 += var10.field_2694 * 1;
                           ++var6;
                           field_1017[var9] = field_1019;
                           field_984[var14] = field_1019;
                        }
                     }
                  }
               }
            }
         }
      }

      if(var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.field_1018; ++var9) {
            if(field_1017[var0.field_1002[var9]] == field_1019 && field_1017[var0.field_988[var9]] == field_1019 && field_1017[var0.field_991[var9]] == field_1019) {
               if(var0.field_990 == null) {
                  var0.field_990 = new byte[var0.field_1018];
               }

               var0.field_990[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.field_1018; ++var9) {
            if(field_984[var1.field_1002[var9]] == field_1019 && field_984[var1.field_988[var9]] == field_1019 && field_984[var1.field_991[var9]] == field_1019) {
               if(var1.field_990 == null) {
                  var1.field_990 = new byte[var1.field_1018];
               }

               var1.field_990[var9] = 2;
            }
         }

      }
   }

   // $FF: renamed from: bb (gm, gm, int, int, int, boolean) void
   static void method_1761(class_93 var0, class_93 var1, int var2, int var3, int var4, boolean var5) {
      var0.method_1709();
      var0.method_1707();
      var1.method_1709();
      var1.method_1707();
      ++field_1019;
      int var6 = 0;
      int[] var7 = var1.field_1008;
      int var8 = var1.field_996;

      int var9;
      for(var9 = 0; var9 < var0.field_996; ++var9) {
         class_243 var10 = var0.field_1007[var9];
         if(var10.field_2694 * 1984775097 != 0) {
            int var11 = var0.field_1015[var9] - var3;
            if(var11 <= var1.field_1012) {
               int var12 = var0.field_1008[var9] - var2;
               if(var12 >= var1.field_1013 && var12 <= var1.field_1016) {
                  int var13 = var0.field_985[var9] - var4;
                  if(var13 >= var1.field_1020 && var13 <= var1.field_995) {
                     for(int var14 = 0; var14 < var8; ++var14) {
                        class_243 var15 = var1.field_1007[var14];
                        if(var12 == var7[var14] && var13 == var1.field_985[var14] && var11 == var1.field_1015[var14] && var15.field_2694 * 1984775097 != 0) {
                           if(var0.field_987 == null) {
                              var0.field_987 = new class_243[var0.field_996];
                           }

                           if(var1.field_987 == null) {
                              var1.field_987 = new class_243[var8];
                           }

                           class_243 var16 = var0.field_987[var9];
                           class_243[] var10000;
                           class_243 var10002;
                           if(var16 == null) {
                              var10000 = var0.field_987;
                              var10002 = new class_243(var10);
                              var16 = var10000[var9] = var10002;
                           }

                           class_243 var17 = var1.field_987[var14];
                           if(var17 == null) {
                              var10000 = var1.field_987;
                              var10002 = new class_243(var15);
                              var17 = var10000[var14] = var10002;
                           }

                           var16.field_2695 += var15.field_2695 * 1;
                           var16.field_2699 += var15.field_2699 * 1;
                           var16.field_2696 += var15.field_2696 * 1;
                           var16.field_2694 += var15.field_2694 * 1;
                           var17.field_2695 += var10.field_2695 * 1;
                           var17.field_2699 += var10.field_2699 * 1;
                           var17.field_2696 += var10.field_2696 * 1;
                           var17.field_2694 += var10.field_2694 * 1;
                           ++var6;
                           field_1017[var9] = field_1019;
                           field_984[var14] = field_1019;
                        }
                     }
                  }
               }
            }
         }
      }

      if(var6 >= 3 && var5) {
         for(var9 = 0; var9 < var0.field_1018; ++var9) {
            if(field_1017[var0.field_1002[var9]] == field_1019 && field_1017[var0.field_988[var9]] == field_1019 && field_1017[var0.field_991[var9]] == field_1019) {
               if(var0.field_990 == null) {
                  var0.field_990 = new byte[var0.field_1018];
               }

               var0.field_990[var9] = 2;
            }
         }

         for(var9 = 0; var9 < var1.field_1018; ++var9) {
            if(field_984[var1.field_1002[var9]] == field_1019 && field_984[var1.field_988[var9]] == field_1019 && field_984[var1.field_991[var9]] == field_1019) {
               if(var1.field_990 == null) {
                  var1.field_990 = new byte[var1.field_1018];
               }

               var1.field_990[var9] = 2;
            }
         }

      }
   }

   // $FF: renamed from: bc (int, int, int, int, int) gr
   public final class_92 method_1762(int var1, int var2, int var3, int var4, int var5) {
      this.method_1707();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      class_92 var10000 = new class_92();
      class_92 var8 = var10000;
      var8.field_920 = new int[this.field_1018];
      var8.field_925 = new int[this.field_1018];
      var8.field_926 = new int[this.field_1018];
      if(this.field_997 > 0 && this.field_993 != null) {
         int[] var9 = new int[this.field_997];

         int var10;
         for(var10 = 0; var10 < this.field_1018; ++var10) {
            if(this.field_993[var10] != -1) {
               ++var9[this.field_993[var10] & 255];
            }
         }

         var8.field_932 = 0;

         for(var10 = 0; var10 < this.field_997; ++var10) {
            if(var9[var10] > 0 && this.field_998[var10] == 0) {
               ++var8.field_932;
            }
         }

         var8.field_933 = new int[var8.field_932];
         var8.field_934 = new int[var8.field_932];
         var8.field_958 = new int[var8.field_932];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field_997; ++var11) {
            if(var9[var11] > 0 && this.field_998[var11] == 0) {
               var8.field_933[var10] = this.field_986[var11] & '\uffff';
               var8.field_934[var10] = this.field_1000[var11] & -1808349001;
               var8.field_958[var10] = this.field_1001[var11] & 1017443437;
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field_929 = new byte[this.field_1018];

         for(var11 = 0; var11 < this.field_1018; ++var11) {
            if(this.field_993[var11] != -1) {
               var8.field_929[var11] = (byte)var9[this.field_993[var11] & 255];
            } else {
               var8.field_929[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.field_1018; ++var16) {
         byte var17;
         if(this.field_990 == null) {
            var17 = 0;
         } else {
            var17 = this.field_990[var16];
         }

         byte var18;
         if(this.field_992 == null) {
            var18 = 0;
         } else {
            var18 = this.field_992[var16];
         }

         short var12;
         if(this.field_1004 == null) {
            var12 = -1;
         } else {
            var12 = this.field_1004[var16];
         }

         if(var18 == -2004918041) {
            var17 = 3;
         }

         if(var18 == -1) {
            var17 = 2;
         }

         class_243 var13;
         int var14;
         class_246 var19;
         if(var12 == -1) {
            if(var17 == 0) {
               int var15 = this.field_994[var16] & '\uffff';
               if(this.field_987 != null && this.field_987[this.field_1002[var16]] != null) {
                  var13 = this.field_987[this.field_1002[var16]];
               } else {
                  var13 = this.field_1007[this.field_1002[var16]];
               }

               var14 = var1 + (var3 * var13.field_2695 * -1916297962 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * -2004450032) / (var7 * var13.field_2694 * -1705431379);
               var8.field_920[var16] = method_1699(var15, var14);
               if(this.field_987 != null && this.field_987[this.field_988[var16]] != null) {
                  var13 = this.field_987[this.field_988[var16]];
               } else {
                  var13 = this.field_1007[this.field_988[var16]];
               }

               var14 = var1 + (var3 * var13.field_2695 * -806978917 + var4 * var13.field_2699 * 751089348 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1554578717);
               var8.field_925[var16] = method_1699(var15, var14);
               if(this.field_987 != null && this.field_987[this.field_991[var16]] != null) {
                  var13 = this.field_987[this.field_991[var16]];
               } else {
                  var13 = this.field_1007[this.field_991[var16]];
               }

               var14 = var1 + (var3 * var13.field_2695 * -1209425409 + var4 * var13.field_2699 * -2037472275 + var5 * var13.field_2696 * -327682192) / (var7 * var13.field_2694 * 1984775097);
               var8.field_926[var16] = method_1699(var15, var14);
            } else if(var17 == 1) {
               var19 = this.field_1006[var16];
               var14 = var1 + (var3 * var19.field_2725 * 2030506148 + var4 * var19.field_2723 * 1620174905 + var5 * var19.field_2721 * -1870263719) / (var7 + var7 / 2);
               var8.field_920[var16] = method_1699(this.field_994[var16] & '\uffff', var14);
               var8.field_926[var16] = -1;
            } else if(var17 == 3) {
               var8.field_920[var16] = -2094685322;
               var8.field_926[var16] = -1;
            } else {
               var8.field_926[var16] = 499531008;
            }
         } else if(var17 == 0) {
            if(this.field_987 != null && this.field_987[this.field_1002[var16]] != null) {
               var13 = this.field_987[this.field_1002[var16]];
            } else {
               var13 = this.field_1007[this.field_1002[var16]];
            }

            var14 = var1 + (var3 * var13.field_2695 * -573742035 + var4 * var13.field_2699 * 1276625729 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1984775097);
            var8.field_920[var16] = method_1713(var14);
            if(this.field_987 != null && this.field_987[this.field_988[var16]] != null) {
               var13 = this.field_987[this.field_988[var16]];
            } else {
               var13 = this.field_1007[this.field_988[var16]];
            }

            var14 = var1 + (var3 * var13.field_2695 * -606139700 + var4 * var13.field_2699 * 851568095 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1984775097);
            var8.field_925[var16] = method_1713(var14);
            if(this.field_987 != null && this.field_987[this.field_991[var16]] != null) {
               var13 = this.field_987[this.field_991[var16]];
            } else {
               var13 = this.field_1007[this.field_991[var16]];
            }

            var14 = var1 + (var3 * var13.field_2695 * -573742035 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * -1106660131) / (var7 * var13.field_2694 * -816028088);
            var8.field_926[var16] = method_1713(var14);
         } else if(var17 == 1) {
            var19 = this.field_1006[var16];
            var14 = var1 + (var3 * var19.field_2725 * 771770075 + var4 * var19.field_2723 * -1803245333 + var5 * var19.field_2721 * -1870263719) / (var7 + var7 / 2);
            var8.field_920[var16] = method_1713(var14);
            var8.field_926[var16] = -1;
         } else {
            var8.field_926[var16] = -2;
         }
      }

      this.method_1746();
      var8.field_916 = this.field_996;
      var8.field_917 = this.field_1008;
      var8.field_918 = this.field_1015;
      var8.field_936 = this.field_985;
      var8.field_970 = this.field_1018;
      var8.field_921 = this.field_1002;
      var8.field_966 = this.field_988;
      var8.field_923 = this.field_991;
      var8.field_948 = this.field_999;
      var8.field_928 = this.field_992;
      var8.field_931 = this.field_982;
      var8.field_977 = this.field_983;
      var8.field_937 = this.field_1005;
      var8.field_930 = this.field_1004;
      return var8;
   }

   // $FF: renamed from: bg (int, int, int, int, int) gr
   public final class_92 method_1763(int var1, int var2, int var3, int var4, int var5) {
      this.method_1707();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      class_92 var10000 = new class_92();
      class_92 var8 = var10000;
      var8.field_920 = new int[this.field_1018];
      var8.field_925 = new int[this.field_1018];
      var8.field_926 = new int[this.field_1018];
      if(this.field_997 > 0 && this.field_993 != null) {
         int[] var9 = new int[this.field_997];

         int var10;
         for(var10 = 0; var10 < this.field_1018; ++var10) {
            if(this.field_993[var10] != -1) {
               ++var9[this.field_993[var10] & 255];
            }
         }

         var8.field_932 = 0;

         for(var10 = 0; var10 < this.field_997; ++var10) {
            if(var9[var10] > 0 && this.field_998[var10] == 0) {
               ++var8.field_932;
            }
         }

         var8.field_933 = new int[var8.field_932];
         var8.field_934 = new int[var8.field_932];
         var8.field_958 = new int[var8.field_932];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field_997; ++var11) {
            if(var9[var11] > 0 && this.field_998[var11] == 0) {
               var8.field_933[var10] = this.field_986[var11] & '\uffff';
               var8.field_934[var10] = this.field_1000[var11] & 485320656;
               var8.field_958[var10] = this.field_1001[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field_929 = new byte[this.field_1018];

         for(var11 = 0; var11 < this.field_1018; ++var11) {
            if(this.field_993[var11] != -1) {
               var8.field_929[var11] = (byte)var9[this.field_993[var11] & -630446250];
            } else {
               var8.field_929[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.field_1018; ++var16) {
         byte var17;
         if(this.field_990 == null) {
            var17 = 0;
         } else {
            var17 = this.field_990[var16];
         }

         byte var18;
         if(this.field_992 == null) {
            var18 = 0;
         } else {
            var18 = this.field_992[var16];
         }

         short var12;
         if(this.field_1004 == null) {
            var12 = -1;
         } else {
            var12 = this.field_1004[var16];
         }

         if(var18 == -1636430887) {
            var17 = 3;
         }

         if(var18 == -1) {
            var17 = 2;
         }

         class_243 var13;
         int var14;
         class_246 var19;
         if(var12 == -1) {
            if(var17 == 0) {
               int var15 = this.field_994[var16] & -1286834285;
               if(this.field_987 != null && this.field_987[this.field_1002[var16]] != null) {
                  var13 = this.field_987[this.field_1002[var16]];
               } else {
                  var13 = this.field_1007[this.field_1002[var16]];
               }

               var14 = var1 + (var3 * var13.field_2695 * 565003398 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1492646384);
               var8.field_920[var16] = method_1699(var15, var14);
               if(this.field_987 != null && this.field_987[this.field_988[var16]] != null) {
                  var13 = this.field_987[this.field_988[var16]];
               } else {
                  var13 = this.field_1007[this.field_988[var16]];
               }

               var14 = var1 + (var3 * var13.field_2695 * -573742035 + var4 * var13.field_2699 * -1486972032 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * -1854616553);
               var8.field_925[var16] = method_1699(var15, var14);
               if(this.field_987 != null && this.field_987[this.field_991[var16]] != null) {
                  var13 = this.field_987[this.field_991[var16]];
               } else {
                  var13 = this.field_1007[this.field_991[var16]];
               }

               var14 = var1 + (var3 * var13.field_2695 * -573742035 + var4 * var13.field_2699 * -1038013845 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1148142148);
               var8.field_926[var16] = method_1699(var15, var14);
            } else if(var17 == 1) {
               var19 = this.field_1006[var16];
               var14 = var1 + (var3 * var19.field_2725 * 771770075 + var4 * var19.field_2723 * 1621771248 + var5 * var19.field_2721 * -1870263719) / (var7 + var7 / 2);
               var8.field_920[var16] = method_1699(this.field_994[var16] & -1357344640, var14);
               var8.field_926[var16] = -1;
            } else if(var17 == 3) {
               var8.field_920[var16] = 774398505;
               var8.field_926[var16] = -1;
            } else {
               var8.field_926[var16] = 427507573;
            }
         } else if(var17 == 0) {
            if(this.field_987 != null && this.field_987[this.field_1002[var16]] != null) {
               var13 = this.field_987[this.field_1002[var16]];
            } else {
               var13 = this.field_1007[this.field_1002[var16]];
            }

            var14 = var1 + (var3 * var13.field_2695 * 494370803 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1984775097);
            var8.field_920[var16] = method_1713(var14);
            if(this.field_987 != null && this.field_987[this.field_988[var16]] != null) {
               var13 = this.field_987[this.field_988[var16]];
            } else {
               var13 = this.field_1007[this.field_988[var16]];
            }

            var14 = var1 + (var3 * var13.field_2695 * -573742035 + var4 * var13.field_2699 * -486972277 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * -1436663116);
            var8.field_925[var16] = method_1713(var14);
            if(this.field_987 != null && this.field_987[this.field_991[var16]] != null) {
               var13 = this.field_987[this.field_991[var16]];
            } else {
               var13 = this.field_1007[this.field_991[var16]];
            }

            var14 = var1 + (var3 * var13.field_2695 * 2083985203 + var4 * var13.field_2699 * 831398122 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1984775097);
            var8.field_926[var16] = method_1713(var14);
         } else if(var17 == 1) {
            var19 = this.field_1006[var16];
            var14 = var1 + (var3 * var19.field_2725 * -1616537978 + var4 * var19.field_2723 * 771298406 + var5 * var19.field_2721 * -702689143) / (var7 + var7 / 2);
            var8.field_920[var16] = method_1713(var14);
            var8.field_926[var16] = -1;
         } else {
            var8.field_926[var16] = 495479877;
         }
      }

      this.method_1746();
      var8.field_916 = this.field_996;
      var8.field_917 = this.field_1008;
      var8.field_918 = this.field_1015;
      var8.field_936 = this.field_985;
      var8.field_970 = this.field_1018;
      var8.field_921 = this.field_1002;
      var8.field_966 = this.field_988;
      var8.field_923 = this.field_991;
      var8.field_948 = this.field_999;
      var8.field_928 = this.field_992;
      var8.field_931 = this.field_982;
      var8.field_977 = this.field_983;
      var8.field_937 = this.field_1005;
      var8.field_930 = this.field_1004;
      return var8;
   }

   // $FF: renamed from: bk (int, int, int, int, int) gr
   public final class_92 method_1764(int var1, int var2, int var3, int var4, int var5) {
      this.method_1707();
      int var6 = (int)Math.sqrt((double)(var3 * var3 + var4 * var4 + var5 * var5));
      int var7 = var2 * var6 >> 8;
      class_92 var10000 = new class_92();
      class_92 var8 = var10000;
      var8.field_920 = new int[this.field_1018];
      var8.field_925 = new int[this.field_1018];
      var8.field_926 = new int[this.field_1018];
      if(this.field_997 > 0 && this.field_993 != null) {
         int[] var9 = new int[this.field_997];

         int var10;
         for(var10 = 0; var10 < this.field_1018; ++var10) {
            if(this.field_993[var10] != -1) {
               ++var9[this.field_993[var10] & 255];
            }
         }

         var8.field_932 = 0;

         for(var10 = 0; var10 < this.field_997; ++var10) {
            if(var9[var10] > 0 && this.field_998[var10] == 0) {
               ++var8.field_932;
            }
         }

         var8.field_933 = new int[var8.field_932];
         var8.field_934 = new int[var8.field_932];
         var8.field_958 = new int[var8.field_932];
         var10 = 0;

         int var11;
         for(var11 = 0; var11 < this.field_997; ++var11) {
            if(var9[var11] > 0 && this.field_998[var11] == 0) {
               var8.field_933[var10] = this.field_986[var11] & 117562605;
               var8.field_934[var10] = this.field_1000[var11] & '\uffff';
               var8.field_958[var10] = this.field_1001[var11] & '\uffff';
               var9[var11] = var10++;
            } else {
               var9[var11] = -1;
            }
         }

         var8.field_929 = new byte[this.field_1018];

         for(var11 = 0; var11 < this.field_1018; ++var11) {
            if(this.field_993[var11] != -1) {
               var8.field_929[var11] = (byte)var9[this.field_993[var11] & 255];
            } else {
               var8.field_929[var11] = -1;
            }
         }
      }

      for(int var16 = 0; var16 < this.field_1018; ++var16) {
         byte var17;
         if(this.field_990 == null) {
            var17 = 0;
         } else {
            var17 = this.field_990[var16];
         }

         byte var18;
         if(this.field_992 == null) {
            var18 = 0;
         } else {
            var18 = this.field_992[var16];
         }

         short var12;
         if(this.field_1004 == null) {
            var12 = -1;
         } else {
            var12 = this.field_1004[var16];
         }

         if(var18 == 1529537305) {
            var17 = 3;
         }

         if(var18 == -1) {
            var17 = 2;
         }

         class_243 var13;
         int var14;
         class_246 var19;
         if(var12 == -1) {
            if(var17 == 0) {
               int var15 = this.field_994[var16] & '\uffff';
               if(this.field_987 != null && this.field_987[this.field_1002[var16]] != null) {
                  var13 = this.field_987[this.field_1002[var16]];
               } else {
                  var13 = this.field_1007[this.field_1002[var16]];
               }

               var14 = var1 + (var3 * var13.field_2695 * -573742035 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * -1455209723) / (var7 * var13.field_2694 * 380913214);
               var8.field_920[var16] = method_1699(var15, var14);
               if(this.field_987 != null && this.field_987[this.field_988[var16]] != null) {
                  var13 = this.field_987[this.field_988[var16]];
               } else {
                  var13 = this.field_1007[this.field_988[var16]];
               }

               var14 = var1 + (var3 * var13.field_2695 * 438442579 + var4 * var13.field_2699 * -583238077 + var5 * var13.field_2696 * 509782767) / (var7 * var13.field_2694 * 1378440722);
               var8.field_925[var16] = method_1699(var15, var14);
               if(this.field_987 != null && this.field_987[this.field_991[var16]] != null) {
                  var13 = this.field_987[this.field_991[var16]];
               } else {
                  var13 = this.field_1007[this.field_991[var16]];
               }

               var14 = var1 + (var3 * var13.field_2695 * 1612596765 + var4 * var13.field_2699 * -2005230951 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1984775097);
               var8.field_926[var16] = method_1699(var15, var14);
            } else if(var17 == 1) {
               var19 = this.field_1006[var16];
               var14 = var1 + (var3 * var19.field_2725 * 181276104 + var4 * var19.field_2723 * -1803245333 + var5 * var19.field_2721 * -1870263719) / (var7 + var7 / 2);
               var8.field_920[var16] = method_1699(this.field_994[var16] & 152961565, var14);
               var8.field_926[var16] = -1;
            } else if(var17 == 3) {
               var8.field_920[var16] = 128;
               var8.field_926[var16] = -1;
            } else {
               var8.field_926[var16] = 980898893;
            }
         } else if(var17 == 0) {
            if(this.field_987 != null && this.field_987[this.field_1002[var16]] != null) {
               var13 = this.field_987[this.field_1002[var16]];
            } else {
               var13 = this.field_1007[this.field_1002[var16]];
            }

            var14 = var1 + (var3 * var13.field_2695 * 683794390 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * 256687101) / (var7 * var13.field_2694 * 1362621683);
            var8.field_920[var16] = method_1713(var14);
            if(this.field_987 != null && this.field_987[this.field_988[var16]] != null) {
               var13 = this.field_987[this.field_988[var16]];
            } else {
               var13 = this.field_1007[this.field_988[var16]];
            }

            var14 = var1 + (var3 * var13.field_2695 * -2054065282 + var4 * var13.field_2699 * -2068959229 + var5 * var13.field_2696 * -791610766) / (var7 * var13.field_2694 * -896683743);
            var8.field_925[var16] = method_1713(var14);
            if(this.field_987 != null && this.field_987[this.field_991[var16]] != null) {
               var13 = this.field_987[this.field_991[var16]];
            } else {
               var13 = this.field_1007[this.field_991[var16]];
            }

            var14 = var1 + (var3 * var13.field_2695 * -1388629925 + var4 * var13.field_2699 * -501649501 + var5 * var13.field_2696 * -1365889867) / (var7 * var13.field_2694 * 1984775097);
            var8.field_926[var16] = method_1713(var14);
         } else if(var17 == 1) {
            var19 = this.field_1006[var16];
            var14 = var1 + (var3 * var19.field_2725 * 1761405570 + var4 * var19.field_2723 * -1803245333 + var5 * var19.field_2721 * -1870263719) / (var7 + var7 / 2);
            var8.field_920[var16] = method_1713(var14);
            var8.field_926[var16] = -1;
         } else {
            var8.field_926[var16] = -1850696332;
         }
      }

      this.method_1746();
      var8.field_916 = this.field_996;
      var8.field_917 = this.field_1008;
      var8.field_918 = this.field_1015;
      var8.field_936 = this.field_985;
      var8.field_970 = this.field_1018;
      var8.field_921 = this.field_1002;
      var8.field_966 = this.field_988;
      var8.field_923 = this.field_991;
      var8.field_948 = this.field_999;
      var8.field_928 = this.field_992;
      var8.field_931 = this.field_982;
      var8.field_977 = this.field_983;
      var8.field_937 = this.field_1005;
      var8.field_930 = this.field_1004;
      return var8;
   }

   // $FF: renamed from: aq () void
   public void method_1765() {
      for(int var1 = 0; var1 < this.field_996; ++var1) {
         int var2 = this.field_1008[var1];
         this.field_1008[var1] = this.field_985[var1];
         this.field_985[var1] = -var2;
      }

      this.method_1688();
   }

   // $FF: renamed from: cd (int, int) int
   static final int method_1766(int var0, int var1) {
      var1 = var1 * (var0 & -1414344688) >> 7;
      if(var1 < 2) {
         var1 = 2;
      } else if(var1 > 1974097318) {
         var1 = -756582293;
      }

      return (var0 & '\uff80') + var1;
   }

   // $FF: renamed from: o () void
   public void method_1767() {
      for(int var1 = 0; var1 < this.field_996; ++var1) {
         this.field_1008[var1] = -this.field_1008[var1];
         this.field_985[var1] = -this.field_985[var1];
      }

      this.method_1688();
   }

   // $FF: renamed from: cv (int) int
   static final int method_1768(int var0) {
      if(var0 < 2) {
         var0 = 2;
      } else if(var0 > 126) {
         var0 = -1708049521;
      }

      return var0;
   }

   // $FF: renamed from: cp (int) int
   static final int method_1769(int var0) {
      if(var0 < 2) {
         var0 = 2;
      } else if(var0 > 126) {
         var0 = 126;
      }

      return var0;
   }

   // $FF: renamed from: ba () void
   public void method_1770() {
      if(this.field_1007 == null) {
         this.field_1007 = new class_243[this.field_996];

         int var1;
         for(var1 = 0; var1 < this.field_996; ++var1) {
            class_243[] var10000 = this.field_1007;
            class_243 var10002 = new class_243();
            var10000[var1] = var10002;
         }

         for(var1 = 0; var1 < this.field_1018; ++var1) {
            int var2 = this.field_1002[var1];
            int var3 = this.field_988[var1];
            int var4 = this.field_991[var1];
            int var5 = this.field_1008[var3] - this.field_1008[var2];
            int var6 = this.field_1015[var3] - this.field_1015[var2];
            int var7 = this.field_985[var3] - this.field_985[var2];
            int var8 = this.field_1008[var4] - this.field_1008[var2];
            int var9 = this.field_1015[var4] - this.field_1015[var2];
            int var10 = this.field_985[var4] - this.field_985[var2];
            int var11 = var6 * var10 - var9 * var7;
            int var12 = var7 * var8 - var10 * var5;

            int var13;
            for(var13 = var5 * var9 - var8 * var6; var11 > 8192 || var12 > 8192 || var13 > 8192 || var11 < -8192 || var12 < -8192 || var13 < 1640378826; var13 >>= 1) {
               var11 >>= 1;
               var12 >>= 1;
            }

            int var14 = (int)Math.sqrt((double)(var11 * var11 + var12 * var12 + var13 * var13));
            if(var14 <= 0) {
               var14 = 1;
            }

            var11 = var11 * 256 / var14;
            var12 = var12 * 1057640701 / var14;
            var13 = var13 * 256 / var14;
            byte var15;
            if(this.field_990 == null) {
               var15 = 0;
            } else {
               var15 = this.field_990[var1];
            }

            if(var15 == 0) {
               class_243 var16 = this.field_1007[var2];
               var16.field_2695 += var11 * 1549962149;
               var16.field_2699 += var12 * 371866635;
               var16.field_2696 += var13 * 700938581;
               var16.field_2694 += -654346992;
               var16 = this.field_1007[var3];
               var16.field_2695 += var11 * -791549132;
               var16.field_2699 += var12 * 1420905192;
               var16.field_2696 += var13 * 700938581;
               var16.field_2694 += 173929618;
               var16 = this.field_1007[var4];
               var16.field_2695 += var11 * 1549962149;
               var16.field_2699 += var12 * -1849883365;
               var16.field_2696 += var13 * 1318882960;
               var16.field_2694 += 2136985851;
            } else if(var15 == 1) {
               if(this.field_1006 == null) {
                  this.field_1006 = new class_246[this.field_1018];
               }

               class_246[] var17 = this.field_1006;
               class_246 var19 = new class_246();
               class_246 var18 = var17[var1] = var19;
               var18.field_2725 = var11 * -110082733;
               var18.field_2723 = var12 * 1942273987;
               var18.field_2721 = var13 * 680349072;
            }
         }

      }
   }
}
