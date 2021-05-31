
// $FF: renamed from: cy
public abstract class class_98 extends class_91 {

   // $FF: renamed from: an byte
   byte field_1075;
   // $FF: renamed from: ai int
   int field_1076;
   // $FF: renamed from: ad int
   int field_1077;
   // $FF: renamed from: bc int
   int field_1078;
   // $FF: renamed from: ax int
   int field_1079;
   // $FF: renamed from: as int
   int field_1080;
   // $FF: renamed from: aj int
   int field_1081;
   // $FF: renamed from: bs int
   int field_1082;
   // $FF: renamed from: az int
   int field_1083;
   // $FF: renamed from: av int
   int field_1084;
   // $FF: renamed from: bp int
   int field_1085;
   // $FF: renamed from: cg byte[]
   byte[] field_1086;
   // $FF: renamed from: ah int
   int field_1087;
   // $FF: renamed from: af boolean
   boolean field_1088;
   // $FF: renamed from: aq java.lang.String
   String field_1089;
   // $FF: renamed from: aw boolean
   boolean field_1090;
   // $FF: renamed from: br int
   int field_1091;
   // $FF: renamed from: ak int
   int field_1092;
   // $FF: renamed from: ay int
   int field_1093;
   // $FF: renamed from: aa int
   int field_1094;
   // $FF: renamed from: ag boolean
   boolean field_1095;
   // $FF: renamed from: bd int[]
   int[] field_1096;
   // $FF: renamed from: bt int[]
   int[] field_1097;
   // $FF: renamed from: bq int[]
   int[] field_1098;
   // $FF: renamed from: bu int[]
   int[] field_1099;
   // $FF: renamed from: bl int[]
   int[] field_1100;
   // $FF: renamed from: bv ki
   class_323 field_1101;
   // $FF: renamed from: bo int
   int field_1102;
   // $FF: renamed from: bz boolean
   boolean field_1103;
   // $FF: renamed from: bh int
   int field_1104;
   // $FF: renamed from: cd int
   int field_1105;
   // $FF: renamed from: ct int
   int field_1106;
   // $FF: renamed from: ac int
   int field_1107;
   // $FF: renamed from: ba int
   int field_1108;
   // $FF: renamed from: bg int
   int field_1109;
   // $FF: renamed from: bj int
   int field_1110;
   // $FF: renamed from: bx int
   int field_1111;
   // $FF: renamed from: cn int[]
   int[] field_1112;
   // $FF: renamed from: bn int
   int field_1113;
   // $FF: renamed from: ck int
   int field_1114;
   // $FF: renamed from: bw int
   int field_1115;
   // $FF: renamed from: ci int
   int field_1116;
   // $FF: renamed from: bb int
   int field_1117;
   // $FF: renamed from: bk int
   int field_1118;
   // $FF: renamed from: ar int
   int field_1119;
   // $FF: renamed from: by int
   int field_1120;
   // $FF: renamed from: am int
   int field_1121;
   // $FF: renamed from: cq int
   int field_1122;
   // $FF: renamed from: cm int
   int field_1123;
   // $FF: renamed from: cv int
   int field_1124;
   // $FF: renamed from: cp int
   int field_1125;
   // $FF: renamed from: cs int[]
   int[] field_1126;
   // $FF: renamed from: bi int
   int field_1127;
   // $FF: renamed from: bm int
   int field_1128;
   // $FF: renamed from: cr int
   int field_1129;
   // $FF: renamed from: cf int
   int field_1130;
   // $FF: renamed from: be int
   int field_1131;
   // $FF: renamed from: at int
   int field_1132;
   // $FF: renamed from: ao int
   int field_1133;
   // $FF: renamed from: co int
   int field_1134;
   // $FF: renamed from: bf int
   int field_1135;
   // $FF: renamed from: fh kt
   static class_69 field_1136;
   // $FF: renamed from: nr int
   static int field_1137;


   // $FF: renamed from: br () boolean
   boolean method_1791() {
      return false;
   }

   // $FF: renamed from: be (int) void
   final void method_1792() {
      try {
         this.field_1130 = 0;
         this.field_1114 = 0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: bb (int, int, int, int, int, int) void
   final void method_1793(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         if(this.field_1098[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if(var1 >= 0) {
         class_76 var12 = class_95.method_1780(var1, 1084107234);
         var10 = -1535189134 * var12.field_643;
         var11 = 602802249 * var12.field_631;
      }

      int var14;
      if(var8) {
         if(-1 == var10) {
            return;
         }

         var9 = 0;
         var14 = 0;
         if(var10 == 0) {
            var14 = this.field_1098[0];
         } else if(1 == var10) {
            var14 = this.field_1097[0];
         }

         for(int var13 = 1; var13 < 4; ++var13) {
            if(0 == var10) {
               if(this.field_1098[var13] < var14) {
                  var9 = var13;
                  var14 = this.field_1098[var13];
               }
            } else if(var10 == 1 && this.field_1097[var13] < var14) {
               var9 = var13;
               var14 = this.field_1097[var13];
            }
         }

         if(var10 == 1 && var14 >= var2) {
            return;
         }
      } else {
         if(var7) {
            this.field_1075 = 0;
         }

         for(var14 = 0; var14 < 4; ++var14) {
            byte var15 = this.field_1075;
            this.field_1075 = (byte)((1 + this.field_1075) % 4);
            if(this.field_1098[var15] <= var5) {
               var9 = var15;
               break;
            }
         }
      }

      if(var9 >= 0) {
         this.field_1096[var9] = var1;
         this.field_1097[var9] = var2;
         this.field_1099[var9] = var3;
         this.field_1100[var9] = var4;
         this.field_1098[var9] = var5 + var11 + var6;
      }
   }

   // $FF: renamed from: bj (int, int, int, int, int, int, byte) void
   final void method_1794(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         boolean var8 = true;
         boolean var9 = true;

         int var10;
         for(var10 = 0; var10 < 4; ++var10) {
            if(this.field_1098[var10] > var5) {
               if(var7 == 0) {
                  throw new IllegalStateException();
               }

               var8 = false;
            } else {
               var9 = false;
            }
         }

         var10 = -1;
         int var11 = -1;
         int var12 = 0;
         if(var1 >= 0) {
            if(var7 == 0) {
               throw new IllegalStateException();
            }

            class_76 var13 = class_95.method_1780(var1, -1277280984);
            var11 = -1751658075 * var13.field_643;
            var12 = -1784798067 * var13.field_631;
         }

         int var16;
         if(var9) {
            if(var7 == 0) {
               throw new IllegalStateException();
            }

            if(-1 == var11) {
               if(var7 == 0) {
                  return;
               }

               return;
            }

            var10 = 0;
            var16 = 0;
            if(var11 == 0) {
               if(var7 == 0) {
                  return;
               }

               var16 = this.field_1098[0];
            } else if(1 == var11) {
               if(var7 == 0) {
                  throw new IllegalStateException();
               }

               var16 = this.field_1097[0];
            }

            for(int var14 = 1; var14 < 4; ++var14) {
               if(var7 == 0) {
                  throw new IllegalStateException();
               }

               if(0 == var11) {
                  if(var7 == 0) {
                     throw new IllegalStateException();
                  }

                  if(this.field_1098[var14] < var16) {
                     var10 = var14;
                     var16 = this.field_1098[var14];
                  }
               } else if(var11 == 1) {
                  if(var7 == 0) {
                     return;
                  }

                  if(this.field_1097[var14] < var16) {
                     if(var7 == 0) {
                        throw new IllegalStateException();
                     }

                     var10 = var14;
                     var16 = this.field_1097[var14];
                  }
               }
            }

            if(var11 == 1) {
               if(var7 == 0) {
                  return;
               }

               if(var16 >= var2) {
                  return;
               }
            }
         } else {
            if(var8) {
               if(var7 == 0) {
                  throw new IllegalStateException();
               }

               this.field_1075 = 0;
            }

            for(var16 = 0; var16 < 4; ++var16) {
               if(var7 == 0) {
                  throw new IllegalStateException();
               }

               byte var17 = this.field_1075;
               this.field_1075 = (byte)((1 + this.field_1075) % 4);
               if(this.field_1098[var17] <= var5) {
                  if(var7 == 0) {
                     throw new IllegalStateException();
                  }

                  var10 = var17;
                  break;
               }
            }
         }

         if(var10 < 0) {
            if(var7 == 0) {
               throw new IllegalStateException();
            }
         } else {
            this.field_1096[var10] = var1;
            this.field_1097[var10] = var2;
            this.field_1099[var10] = var3;
            this.field_1100[var10] = var4;
            this.field_1098[var10] = var5 + var12 + var6;
         }
      } catch (RuntimeException var15) {
         throw class_223.method_4281(var15);
      }
   }

   // $FF: renamed from: bs () boolean
   boolean method_1795() {
      return false;
   }

   // $FF: renamed from: m (byte) boolean
   boolean method_1796(byte var1) {
      try {
         return false;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: bh () boolean
   boolean method_1797() {
      return false;
   }

   // $FF: renamed from: bw () void
   final void method_1798() {
      this.field_1130 = 0;
      this.field_1114 = 0;
   }

   // $FF: renamed from: <init> () void
   class_98() {
      super();
      try {
         this.field_1095 = false;
         this.field_1079 = -83608191;
         this.field_1081 = -1248675989;
         this.field_1121 = -153727073;
         this.field_1083 = 1533228007;
         this.field_1084 = -1875923127;
         this.field_1107 = -1397049979;
         this.field_1132 = 1521376955;
         this.field_1087 = -1879253007;
         this.field_1133 = 1757135961;
         this.field_1089 = null;
         this.field_1088 = false;
         this.field_1092 = -845989412;
         this.field_1093 = 0;
         this.field_1094 = 0;
         this.field_1075 = 0;
         this.field_1096 = new int[4];
         this.field_1097 = new int[4];
         this.field_1098 = new int[4];
         this.field_1099 = new int[4];
         this.field_1100 = new int[4];
         class_323 var10001 = new class_323();
         this.field_1101 = var10001;
         this.field_1128 = 187990533;
         this.field_1103 = false;
         this.field_1104 = 702771293;
         this.field_1082 = 404487489;
         this.field_1091 = 0;
         this.field_1135 = 0;
         this.field_1108 = 1152446837;
         this.field_1131 = 0;
         this.field_1110 = 0;
         this.field_1111 = 0;
         this.field_1085 = 0;
         this.field_1113 = -1634941531;
         this.field_1102 = 0;
         this.field_1115 = 0;
         this.field_1125 = 0;
         this.field_1116 = 1695457848;
         this.field_1122 = 0;
         this.field_1129 = 1935853280;
         this.field_1130 = 0;
         this.field_1112 = new int[10];
         this.field_1126 = new int[10];
         this.field_1086 = new byte[10];
         this.field_1134 = 0;
         this.field_1114 = 0;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: bf () boolean
   boolean method_1799() {
      return false;
   }

   // $FF: renamed from: ba () boolean
   boolean method_1800() {
      return false;
   }

   // $FF: renamed from: bn () void
   final void method_1801() {
      this.field_1130 = 0;
      this.field_1114 = 0;
   }

   // $FF: renamed from: bo () void
   final void method_1802() {
      this.field_1130 = 0;
      this.field_1114 = 0;
   }

   // $FF: renamed from: bc (int, int, int, int, int, int) void
   final void method_1803(int var1, int var2, int var3, int var4, int var5, int var6) {
      class_77 var7 = class_186.method_3873(var1, 1784582281);
      class_47 var8 = null;
      class_47 var9 = null;
      int var10 = var7.field_658 * -1840545813;
      int var11 = 0;

      class_47 var12;
      for(var12 = (class_47)this.field_1101.method_5700(); null != var12; var12 = (class_47)this.field_1101.method_5702()) {
         ++var11;
         if(var7.field_656 * -1268318299 == -1268318299 * var12.field_350.field_656) {
            var12.method_539(var4 + var2, var5, var6, var3, 717779586);
            return;
         }

         if(-786020391 * var12.field_350.field_657 <= -786020391 * var7.field_657) {
            var8 = var12;
         }

         if(-1840545813 * var12.field_350.field_658 > var10) {
            var9 = var12;
            var10 = var12.field_350.field_658 * -1840545813;
         }
      }

      if(null != var9 || var11 < 4) {
         class_47 var10000 = new class_47(var7);
         var12 = var10000;
         if(var8 == null) {
            this.field_1101.method_5698(var12);
         } else {
            class_323.method_5743(var12, var8);
         }

         var12.method_539(var4 + var2, var5, var6, var3, 803565255);
         if(var11 >= 4) {
            var9.method_108();
         }

      }
   }

   // $FF: renamed from: bi () void
   final void method_1804() {
      this.field_1130 = 0;
      this.field_1114 = 0;
   }

   // $FF: renamed from: bx (int, int, int, int, int, int, byte) void
   final void method_1805(int var1, int var2, int var3, int var4, int var5, int var6, byte var7) {
      try {
         class_77 var8 = class_186.method_3873(var1, 1752854203);
         class_47 var9 = null;
         class_47 var10 = null;
         int var11 = var8.field_658 * -1840545813;
         int var12 = 0;

         class_47 var13;
         for(var13 = (class_47)this.field_1101.method_5700(); null != var13; var13 = (class_47)this.field_1101.method_5702()) {
            if(var7 >= 1) {
               throw new IllegalStateException();
            }

            ++var12;
            if(var8.field_656 * -1268318299 == -1268318299 * var13.field_350.field_656) {
               var13.method_539(var4 + var2, var5, var6, var3, -2108595638);
               return;
            }

            if(-786020391 * var13.field_350.field_657 <= -786020391 * var8.field_657) {
               if(var7 >= 1) {
                  throw new IllegalStateException();
               }

               var9 = var13;
            }

            if(-1840545813 * var13.field_350.field_658 > var11) {
               if(var7 >= 1) {
                  return;
               }

               var10 = var13;
               var11 = var13.field_350.field_658 * -1840545813;
            }
         }

         if(null == var10 && var12 >= 4) {
            if(var7 >= 1) {
               throw new IllegalStateException();
            }
         } else {
            class_47 var10000 = new class_47(var8);
            var13 = var10000;
            if(var9 == null) {
               if(var7 >= 1) {
                  throw new IllegalStateException();
               }

               this.field_1101.method_5698(var13);
            } else {
               class_323.method_5743(var13, var9);
            }

            var13.method_539(var4 + var2, var5, var6, var3, -581737697);
            if(var12 >= 4) {
               if(var7 >= 1) {
                  throw new IllegalStateException();
               }

               var10.method_108();
            }

         }
      } catch (RuntimeException var14) {
         throw class_223.method_4281(var14);
      }
   }

   // $FF: renamed from: bk (int, int, int, int, int, int) void
   final void method_1806(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         if(this.field_1098[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if(var1 >= 0) {
         class_76 var12 = class_95.method_1780(var1, -1186188067);
         var10 = -1751658075 * var12.field_643;
         var11 = -1784798067 * var12.field_631;
      }

      int var14;
      if(var8) {
         if(-1 == var10) {
            return;
         }

         var9 = 0;
         var14 = 0;
         if(var10 == 0) {
            var14 = this.field_1098[0];
         } else if(1 == var10) {
            var14 = this.field_1097[0];
         }

         for(int var13 = 1; var13 < 4; ++var13) {
            if(0 == var10) {
               if(this.field_1098[var13] < var14) {
                  var9 = var13;
                  var14 = this.field_1098[var13];
               }
            } else if(var10 == 1 && this.field_1097[var13] < var14) {
               var9 = var13;
               var14 = this.field_1097[var13];
            }
         }

         if(var10 == 1 && var14 >= var2) {
            return;
         }
      } else {
         if(var7) {
            this.field_1075 = 0;
         }

         for(var14 = 0; var14 < 4; ++var14) {
            byte var15 = this.field_1075;
            this.field_1075 = (byte)((1 + this.field_1075) % 4);
            if(this.field_1098[var15] <= var5) {
               var9 = var15;
               break;
            }
         }
      }

      if(var9 >= 0) {
         this.field_1096[var9] = var1;
         this.field_1097[var9] = var2;
         this.field_1099[var9] = var3;
         this.field_1100[var9] = var4;
         this.field_1098[var9] = var5 + var11 + var6;
      }
   }

   // $FF: renamed from: bg (int, int, int, int, int, int) void
   final void method_1807(int var1, int var2, int var3, int var4, int var5, int var6) {
      boolean var7 = true;
      boolean var8 = true;

      int var9;
      for(var9 = 0; var9 < 4; ++var9) {
         if(this.field_1098[var9] > var5) {
            var7 = false;
         } else {
            var8 = false;
         }
      }

      var9 = -1;
      int var10 = -1;
      int var11 = 0;
      if(var1 >= 0) {
         class_76 var12 = class_95.method_1780(var1, 11970382);
         var10 = -1751658075 * var12.field_643;
         var11 = -1784798067 * var12.field_631;
      }

      int var14;
      if(var8) {
         if(-1 == var10) {
            return;
         }

         var9 = 0;
         var14 = 0;
         if(var10 == 0) {
            var14 = this.field_1098[0];
         } else if(1 == var10) {
            var14 = this.field_1097[0];
         }

         for(int var13 = 1; var13 < 4; ++var13) {
            if(0 == var10) {
               if(this.field_1098[var13] < var14) {
                  var9 = var13;
                  var14 = this.field_1098[var13];
               }
            } else if(var10 == 1 && this.field_1097[var13] < var14) {
               var9 = var13;
               var14 = this.field_1097[var13];
            }
         }

         if(var10 == 1 && var14 >= var2) {
            return;
         }
      } else {
         if(var7) {
            this.field_1075 = 0;
         }

         for(var14 = 0; var14 < 4; ++var14) {
            byte var15 = this.field_1075;
            this.field_1075 = (byte)((1 + this.field_1075) % 4);
            if(this.field_1098[var15] <= var5) {
               var9 = var15;
               break;
            }
         }
      }

      if(var9 >= 0) {
         this.field_1096[var9] = var1;
         this.field_1097[var9] = var2;
         this.field_1099[var9] = var3;
         this.field_1100[var9] = var4;
         this.field_1098[var9] = var5 + var11 + var6;
      }
   }

   // $FF: renamed from: by (int, int, int, int, int, int) void
   final void method_1808(int var1, int var2, int var3, int var4, int var5, int var6) {
      class_77 var7 = class_186.method_3873(var1, 1200474169);
      class_47 var8 = null;
      class_47 var9 = null;
      int var10 = var7.field_658 * -1840545813;
      int var11 = 0;

      class_47 var12;
      for(var12 = (class_47)this.field_1101.method_5700(); null != var12; var12 = (class_47)this.field_1101.method_5702()) {
         ++var11;
         if(var7.field_656 * -1268318299 == -1268318299 * var12.field_350.field_656) {
            var12.method_539(var4 + var2, var5, var6, var3, -475195405);
            return;
         }

         if(-786020391 * var12.field_350.field_657 <= -786020391 * var7.field_657) {
            var8 = var12;
         }

         if(-1840545813 * var12.field_350.field_658 > var10) {
            var9 = var12;
            var10 = var12.field_350.field_658 * -1840545813;
         }
      }

      if(null != var9 || var11 < 4) {
         class_47 var10000 = new class_47(var7);
         var12 = var10000;
         if(var8 == null) {
            this.field_1101.method_5698(var12);
         } else {
            class_323.method_5743(var12, var8);
         }

         var12.method_539(var4 + var2, var5, var6, var3, 1011440521);
         if(var11 >= 4) {
            var9.method_108();
         }

      }
   }

   // $FF: renamed from: bp (int, byte) void
   final void method_1809(int var1, byte var2) {
      try {
         class_77 var3 = class_186.method_3873(var1, 1390407086);

         for(class_47 var4 = (class_47)this.field_1101.method_5700(); null != var4; var4 = (class_47)this.field_1101.method_5702()) {
            if(var2 >= 0) {
               throw new IllegalStateException();
            }

            if(var3 == var4.field_350) {
               if(var2 >= 0) {
                  throw new IllegalStateException();
               }

               var4.method_108();
               return;
            }
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: cd (int, int, int, int, int, int) void
   final void method_1810(int var1, int var2, int var3, int var4, int var5, int var6) {
      class_77 var7 = class_186.method_3873(var1, -223763595);
      class_47 var8 = null;
      class_47 var9 = null;
      int var10 = var7.field_658 * -1840545813;
      int var11 = 0;

      class_47 var12;
      for(var12 = (class_47)this.field_1101.method_5700(); null != var12; var12 = (class_47)this.field_1101.method_5702()) {
         ++var11;
         if(var7.field_656 * -1268318299 == -1268318299 * var12.field_350.field_656) {
            var12.method_539(var4 + var2, var5, var6, var3, -1354436204);
            return;
         }

         if(-786020391 * var12.field_350.field_657 <= -786020391 * var7.field_657) {
            var8 = var12;
         }

         if(-1840545813 * var12.field_350.field_658 > var10) {
            var9 = var12;
            var10 = var12.field_350.field_658 * -1840545813;
         }
      }

      if(null != var9 || var11 < 4) {
         class_47 var10000 = new class_47(var7);
         var12 = var10000;
         if(var8 == null) {
            this.field_1101.method_5698(var12);
         } else {
            class_323.method_5743(var12, var8);
         }

         var12.method_539(var4 + var2, var5, var6, var3, 432641758);
         if(var11 >= 4) {
            var9.method_108();
         }

      }
   }

   // $FF: renamed from: cm (int) void
   final void method_1811(int var1) {
      class_77 var2 = class_186.method_3873(var1, -240765180);

      for(class_47 var3 = (class_47)this.field_1101.method_5700(); null != var3; var3 = (class_47)this.field_1101.method_5702()) {
         if(var2 == var3.field_350) {
            var3.method_108();
            return;
         }
      }

   }

   // $FF: renamed from: o (long) void
   static final void method_1812(long var0) {
      try {
         class_255.field_2883[(class_255.field_2882 += 1407976525) * 253416581 - 1] = var0;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: iz (int, java.lang.String, int) void
   static void method_1813(int var0, String var1, int var2) {
      try {
         int var3 = class_195.field_2313 * -1143549299;
         int[] var4 = class_195.field_2318;
         boolean var5 = false;
         class_359 var10000 = new class_359(var1, class_239.field_2659);
         class_359 var6 = var10000;

         for(int var7 = 0; var7 < var3; ++var7) {
            if(var2 == 1590901191) {
               throw new IllegalStateException();
            }

            class_100 var8 = client.field_1605[var4[var7]];
            if(var8 != null) {
               if(var2 == 1590901191) {
                  throw new IllegalStateException();
               }

               if(class_164.field_2044 != var8) {
                  if(var2 == 1590901191) {
                     throw new IllegalStateException();
                  }

                  if(null != var8.field_1148) {
                     if(var2 == 1590901191) {
                        throw new IllegalStateException();
                     }

                     if(var8.field_1148.equals(var6)) {
                        if(var2 == 1590901191) {
                           throw new IllegalStateException();
                        }

                        class_40 var9;
                        if(var0 == 1) {
                           if(var2 == 1590901191) {
                              throw new IllegalStateException();
                           }

                           var9 = class_112.newPacket(Opcode.OPCODE_25, client.field_1463.isaac, (byte)8);
                           var9.networkBuffer.method_185(var4[var7]);
                           var9.networkBuffer.method_148(0);
                           client.field_1463.method_4079(var9);
                        } else if(var0 == 4) {
                           if(var2 == 1590901191) {
                              throw new IllegalStateException();
                           }

                           var9 = class_112.newPacket(Opcode.OPCODE_33, client.field_1463.isaac, (byte)8);
                           var9.networkBuffer.method_185(var4[var7]);
                           var9.networkBuffer.method_148(0);
                           client.field_1463.method_4079(var9);
                        } else if(var0 == 6) {
                           if(var2 == 1590901191) {
                              throw new IllegalStateException();
                           }

                           var9 = class_112.newPacket(Opcode.OPCODE_64, client.field_1463.isaac, (byte)8);
                           var9.networkBuffer.method_145(0);
                           var9.networkBuffer.writeShortAlt(var4[var7]);
                           client.field_1463.method_4079(var9);
                        } else if(7 == var0) {
                           if(var2 == 1590901191) {
                              throw new IllegalStateException();
                           }

                           var9 = class_112.newPacket(Opcode.OPCODE_48, client.field_1463.isaac, (byte)8);
                           var9.networkBuffer.writeByte(0);
                           var9.networkBuffer.writeShortAlt(var4[var7]);
                           client.field_1463.method_4079(var9);
                        }

                        var5 = true;
                        break;
                     }
                  }
               }
            }
         }

         if(!var5) {
            if(var2 == 1590901191) {
               return;
            }

            class_149.method_3135(4, "", class_305.field_3555 + var1);
         }

      } catch (RuntimeException var10) {
         throw class_223.method_4281(var10);
      }
   }
}
