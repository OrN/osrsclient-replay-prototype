
// $FF: renamed from: ef
public class class_88 extends class_59 {

   // $FF: renamed from: t int
   public int field_853;
   // $FF: renamed from: ai int
   int field_854;
   // $FF: renamed from: h int
   int field_855;
   // $FF: renamed from: qn l
   static class_171 field_856;
   // $FF: renamed from: p int
   public int field_857;
   // $FF: renamed from: j java.lang.String
   public String field_858;
   // $FF: renamed from: r int
   public int field_859;
   // $FF: renamed from: m short[]
   short[] field_860;
   // $FF: renamed from: d int[]
   int[] field_861;
   // $FF: renamed from: ad int[]
   public int[] field_862;
   // $FF: renamed from: u int
   public int field_863;
   // $FF: renamed from: k short[]
   short[] field_864;
   // $FF: renamed from: o int
   public int field_865;
   // $FF: renamed from: b int[]
   int[] field_866;
   // $FF: renamed from: e int
   public int field_867;
   // $FF: renamed from: g int
   public int field_868;
   // $FF: renamed from: a short[]
   short[] field_869;
   // $FF: renamed from: c int
   public int field_870;
   // $FF: renamed from: i boolean
   public boolean field_871;
   // $FF: renamed from: x short[]
   short[] field_872;
   // $FF: renamed from: z java.lang.String[]
   public String[] field_873;
   // $FF: renamed from: l int
   public int field_874;
   // $FF: renamed from: s int
   public int field_875;
   // $FF: renamed from: y hz
   public static class_272 field_876;
   // $FF: renamed from: q int
   int field_877;
   // $FF: renamed from: n jv
   public static class_306 field_878;
   // $FF: renamed from: ae int
   int field_879;
   // $FF: renamed from: ap int
   int field_880;
   // $FF: renamed from: ab int
   public int field_881;
   // $FF: renamed from: al int
   public int field_882;
   // $FF: renamed from: w boolean
   public boolean field_883;
   // $FF: renamed from: f hz
   public static class_272 field_884;
   // $FF: renamed from: ar int
   int field_885;
   // $FF: renamed from: ag boolean
   public boolean field_886;
   // $FF: renamed from: ax boolean
   public boolean field_887;
   // $FF: renamed from: as boolean
   public boolean field_888;
   // $FF: renamed from: aj mr
   class_369 field_889;
   // $FF: renamed from: v jv
   public static class_306 field_890;
   // $FF: renamed from: gr oh
   static class_67 field_891;


   // $FF: renamed from: k () gm
   public final class_93 method_1539() {
      if(null != this.field_862) {
         class_88 var5 = this.method_1545((byte)-92);
         return var5 == null?null:var5.method_1544((short)7106);
      } else if(null == this.field_861) {
         return null;
      } else {
         boolean var1 = false;

         for(int var2 = 0; var2 < this.field_861.length; ++var2) {
            if(!field_878.method_5383(this.field_861[var2], 0, (byte)46)) {
               var1 = true;
            }
         }

         if(var1) {
            return null;
         } else {
            class_93[] var6 = new class_93[this.field_861.length];

            for(int var3 = 0; var3 < this.field_861.length; ++var3) {
               var6[var3] = class_93.method_1708(field_878, this.field_861[var3], 0);
            }

            class_93 var7;
            if(var6.length == 1) {
               var7 = var6[0];
            } else {
               class_93 var10000 = new class_93(var6, var6.length);
               var7 = var10000;
            }

            int var4;
            if(this.field_869 != null) {
               for(var4 = 0; var4 < this.field_869.length; ++var4) {
                  var7.method_1703(this.field_869[var4], this.field_864[var4]);
               }
            }

            if(this.field_860 != null) {
               for(var4 = 0; var4 < this.field_860.length; ++var4) {
                  var7.method_1701(this.field_860[var4], this.field_872[var4]);
               }
            }

            return var7;
         }
      }
   }

   // $FF: renamed from: n (int) void
   void method_1540(int var1) {
      try {
         ;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "ef.n(" + ')');
      }
   }

   // $FF: renamed from: e (fl, int, fl, int) gr
   public final class_92 method_1541(class_72 var1, int var2, class_72 var3, int var4) {
      if(this.field_862 != null) {
         class_88 var11 = this.method_1545((byte)-23);
         return var11 == null?null:var11.method_1543(var1, var2, var3, var4, -26460885);
      } else {
         class_92 var5 = (class_92)field_876.method_5065((long)(-1162887588 * this.field_857));
         if(null == var5) {
            boolean var6 = false;

            for(int var7 = 0; var7 < this.field_866.length; ++var7) {
               if(!field_878.method_5383(this.field_866[var7], 0, (byte)89)) {
                  var6 = true;
               }
            }

            if(var6) {
               return null;
            }

            class_93[] var8 = new class_93[this.field_866.length];

            int var9;
            for(var9 = 0; var9 < this.field_866.length; ++var9) {
               var8[var9] = class_93.method_1708(field_878, this.field_866[var9], 0);
            }

            class_93 var12;
            if(var8.length == 1) {
               var12 = var8[0];
            } else {
               class_93 var10000 = new class_93(var8, var8.length);
               var12 = var10000;
            }

            if(null != this.field_869) {
               for(var9 = 0; var9 < this.field_869.length; ++var9) {
                  var12.method_1703(this.field_869[var9], this.field_864[var9]);
               }
            }

            if(null != this.field_860) {
               for(var9 = 0; var9 < this.field_860.length; ++var9) {
                  var12.method_1701(this.field_860[var9], this.field_872[var9]);
               }
            }

            var5 = var12.method_1711(64 + 2079488611 * this.field_879, 850 + this.field_880 * 1867659125, -30, -403272246, -30);
            field_876.method_5064(var5, (long)(this.field_857 * -2060838679));
         }

         class_92 var10;
         if(null != var1 && var3 != null) {
            var10 = var1.method_1086(var5, var2, var3, var4, 1241065454);
         } else if(var1 != null) {
            var10 = var1.method_1052(var5, var2, -1695651160);
         } else if(var3 != null) {
            var10 = var3.method_1052(var5, var4, -1486886648);
         } else {
            var10 = var5.method_1617(true);
         }

         if(128 != this.field_855 * 506938277 || 897379273 != -180289747 * this.field_877) {
            var10.method_1633(this.field_855 * -1131928038, this.field_877 * 706186912, 660228356 * this.field_855);
         }

         return var10;
      }
   }

   // $FF: renamed from: y (nd, int, byte) void
   void method_1542(class_28 var1, int var2, byte var3) {
      try {
         int var4;
         int var5;
         if(var2 == 1) {
            var4 = var1.method_130(788266055);
            this.field_866 = new int[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if(var3 == 7) {
                  throw new IllegalStateException();
               }

               this.field_866[var5] = var1.method_132((byte)-97);
            }
         } else if(var2 == 2) {
            if(var3 == 7) {
               throw new IllegalStateException();
            }

            this.field_858 = var1.method_139(-391631059);
         } else if(12 == var2) {
            this.field_859 = var1.method_130(1747192605) * 2143888193;
         } else if(13 == var2) {
            this.field_875 = var1.method_132((byte)-30) * 1784073613;
         } else if(14 == var2) {
            this.field_865 = var1.method_132((byte)-105) * -824174637;
         } else if(var2 == 15) {
            if(var3 == 7) {
               return;
            }

            this.field_863 = var1.method_132((byte)-90) * 1081629083;
         } else if(var2 == 16) {
            if(var3 == 7) {
               throw new IllegalStateException();
            }

            this.field_874 = var1.method_132((byte)-99) * 825755253;
         } else if(17 == var2) {
            if(var3 == 7) {
               return;
            }

            this.field_865 = var1.method_132((byte)-87) * -824174637;
            this.field_870 = var1.method_132((byte)-24) * 1636089201;
            this.field_867 = var1.method_132((byte)-84) * -939915041;
            this.field_868 = var1.method_132((byte)-71) * -250921021;
         } else if(var2 == 18) {
            if(var3 == 7) {
               return;
            }

            var1.method_132((byte)-52);
         } else {
            if(var2 >= 30) {
               if(var3 == 7) {
                  throw new IllegalStateException();
               }

               if(var2 < 35) {
                  this.field_873[var2 - 30] = var1.method_139(-391631059);
                  if(this.field_873[var2 - 30].equalsIgnoreCase(class_305.field_3405)) {
                     if(var3 == 7) {
                        throw new IllegalStateException();
                     }

                     this.field_873[var2 - 30] = null;
                  }

                  return;
               }
            }

            if(var2 == 40) {
               if(var3 == 7) {
                  throw new IllegalStateException();
               }

               var4 = var1.method_130(-493986425);
               this.field_869 = new short[var4];
               this.field_864 = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if(var3 == 7) {
                     throw new IllegalStateException();
                  }

                  this.field_869[var5] = (short)var1.method_132((byte)-61);
                  this.field_864[var5] = (short)var1.method_132((byte)-103);
               }
            } else if(41 == var2) {
               var4 = var1.method_130(-790859881);
               this.field_860 = new short[var4];
               this.field_872 = new short[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if(var3 == 7) {
                     throw new IllegalStateException();
                  }

                  this.field_860[var5] = (short)var1.method_132((byte)-60);
                  this.field_872[var5] = (short)var1.method_132((byte)-12);
               }
            } else if(var2 == 60) {
               if(var3 == 7) {
                  return;
               }

               var4 = var1.method_130(733577724);
               this.field_861 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  this.field_861[var5] = var1.method_132((byte)-109);
               }
            } else if(93 == var2) {
               this.field_883 = false;
            } else if(var2 == 95) {
               this.field_853 = var1.method_132((byte)-57) * -1182914317;
            } else if(var2 == 97) {
               if(var3 == 7) {
                  throw new IllegalStateException();
               }

               this.field_855 = var1.method_132((byte)-57) * 82664775;
            } else if(98 == var2) {
               if(var3 == 7) {
                  throw new IllegalStateException();
               }

               this.field_877 = var1.method_132((byte)-93) * -1453934407;
            } else if(99 == var2) {
               if(var3 == 7) {
                  throw new IllegalStateException();
               }

               this.field_871 = true;
            } else if(var2 == 100) {
               this.field_879 = var1.method_131((byte)-66) * 288347979;
            } else if(101 == var2) {
               this.field_880 = var1.method_131((byte)-48) * -1536154543;
            } else if(var2 == 102) {
               if(var3 == 7) {
                  throw new IllegalStateException();
               }

               this.field_881 = var1.method_132((byte)-106) * 915888573;
            } else if(var2 == 103) {
               if(var3 == 7) {
                  throw new IllegalStateException();
               }

               this.field_882 = var1.method_132((byte)-121) * 198576593;
            } else {
               if(var2 != 106) {
                  if(var3 == 7) {
                     throw new IllegalStateException();
                  }

                  if(118 != var2) {
                     if(107 == var2) {
                        if(var3 == 7) {
                           throw new IllegalStateException();
                        }

                        this.field_886 = false;
                        return;
                     } else if(109 == var2) {
                        if(var3 == 7) {
                           return;
                        }

                        this.field_887 = false;
                        return;
                     } else {
                        if(var2 == 111) {
                           if(var3 == 7) {
                              throw new IllegalStateException();
                           }

                           this.field_888 = true;
                        } else if(249 == var2) {
                           if(var3 == 7) {
                              throw new IllegalStateException();
                           }

                           this.field_889 = class_325.method_5781(var1, this.field_889, -391561047);
                           return;
                        }

                        return;
                     }
                  }

                  if(var3 == 7) {
                     throw new IllegalStateException();
                  }
               }

               this.field_854 = var1.method_132((byte)-18) * 217670275;
               if('\uffff' == this.field_854 * -17335253) {
                  this.field_854 = -217670275;
               }

               this.field_885 = var1.method_132((byte)-26) * -236114995;
               if(-1483491067 * this.field_885 == '\uffff') {
                  if(var3 == 7) {
                     throw new IllegalStateException();
                  }

                  this.field_885 = 236114995;
               }

               var4 = -1;
               if(var2 == 118) {
                  if(var3 == 7) {
                     throw new IllegalStateException();
                  }

                  var4 = var1.method_132((byte)-122);
                  if(var4 == '\uffff') {
                     if(var3 == 7) {
                        throw new IllegalStateException();
                     }

                     var4 = -1;
                  }
               }

               var5 = var1.method_130(-1338062671);
               this.field_862 = new int[var5 + 2];

               for(int var6 = 0; var6 <= var5; ++var6) {
                  this.field_862[var6] = var1.method_132((byte)-24);
                  if(this.field_862[var6] == '\uffff') {
                     if(var3 == 7) {
                        throw new IllegalStateException();
                     }

                     this.field_862[var6] = -1;
                  }
               }

               this.field_862[var5 + 1] = var4;
            }
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7, "ef.y(" + ')');
      }
   }

   // $FF: renamed from: p (fl, int, fl, int, int) gr
   public final class_92 method_1543(class_72 var1, int var2, class_72 var3, int var4, int var5) {
      try {
         if(this.field_862 != null) {
            if(var5 != -26460885) {
               throw new IllegalStateException();
            } else {
               class_88 var13 = this.method_1545((byte)-40);
               if(var13 == null) {
                  if(var5 != -26460885) {
                     throw new IllegalStateException();
                  } else {
                     return null;
                  }
               } else {
                  return var13.method_1543(var1, var2, var3, var4, -26460885);
               }
            }
         } else {
            class_92 var6 = (class_92)field_876.method_5065((long)(-2060838679 * this.field_857));
            if(null == var6) {
               if(var5 != -26460885) {
                  throw new IllegalStateException();
               }

               boolean var7 = false;

               for(int var8 = 0; var8 < this.field_866.length; ++var8) {
                  if(var5 != -26460885) {
                     throw new IllegalStateException();
                  }

                  if(!field_878.method_5383(this.field_866[var8], 0, (byte)125)) {
                     if(var5 != -26460885) {
                        throw new IllegalStateException();
                     }

                     var7 = true;
                  }
               }

               if(var7) {
                  if(var5 != -26460885) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               class_93[] var9 = new class_93[this.field_866.length];

               int var10;
               for(var10 = 0; var10 < this.field_866.length; ++var10) {
                  if(var5 != -26460885) {
                     throw new IllegalStateException();
                  }

                  var9[var10] = class_93.method_1708(field_878, this.field_866[var10], 0);
               }

               class_93 var14;
               if(var9.length == 1) {
                  var14 = var9[0];
               } else {
                  class_93 var10000 = new class_93(var9, var9.length);
                  var14 = var10000;
               }

               if(null != this.field_869) {
                  if(var5 != -26460885) {
                     throw new IllegalStateException();
                  }

                  for(var10 = 0; var10 < this.field_869.length; ++var10) {
                     if(var5 != -26460885) {
                        throw new IllegalStateException();
                     }

                     var14.method_1703(this.field_869[var10], this.field_864[var10]);
                  }
               }

               if(null != this.field_860) {
                  if(var5 != -26460885) {
                     throw new IllegalStateException();
                  }

                  for(var10 = 0; var10 < this.field_860.length; ++var10) {
                     var14.method_1701(this.field_860[var10], this.field_872[var10]);
                  }
               }

               var6 = var14.method_1711(64 + 2079488611 * this.field_879, 850 + this.field_880 * 1867659125, -30, -50, -30);
               field_876.method_5064(var6, (long)(this.field_857 * -2060838679));
            }

            class_92 var12;
            label135: {
               if(null != var1) {
                  if(var5 != -26460885) {
                     throw new IllegalStateException();
                  }

                  if(var3 != null) {
                     if(var5 != -26460885) {
                        throw new IllegalStateException();
                     }

                     var12 = var1.method_1086(var6, var2, var3, var4, -617440038);
                     break label135;
                  }
               }

               if(var1 != null) {
                  if(var5 != -26460885) {
                     throw new IllegalStateException();
                  }

                  var12 = var1.method_1052(var6, var2, -1930468330);
               } else if(var3 != null) {
                  if(var5 != -26460885) {
                     throw new IllegalStateException();
                  }

                  var12 = var3.method_1052(var6, var4, -1854456409);
               } else {
                  var12 = var6.method_1617(true);
               }
            }

            if(128 == this.field_855 * 1078672503) {
               if(var5 != -26460885) {
                  throw new IllegalStateException();
               }

               if(128 == -1467757175 * this.field_877) {
                  return var12;
               }

               if(var5 != -26460885) {
                  throw new IllegalStateException();
               }
            }

            var12.method_1633(this.field_855 * 1078672503, this.field_877 * -1467757175, 1078672503 * this.field_855);
            return var12;
         }
      } catch (RuntimeException var11) {
         throw class_223.method_4281(var11, "ef.p(" + ')');
      }
   }

   // $FF: renamed from: j (short) gm
   public final class_93 method_1544(short var1) {
      try {
         if(null != this.field_862) {
            if(var1 != 7106) {
               throw new IllegalStateException();
            } else {
               class_88 var7 = this.method_1545((byte)22);
               return var7 == null?null:var7.method_1544((short)7106);
            }
         } else if(null == this.field_861) {
            if(var1 != 7106) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            boolean var2 = false;

            for(int var3 = 0; var3 < this.field_861.length; ++var3) {
               if(var1 != 7106) {
                  throw new IllegalStateException();
               }

               if(!field_878.method_5383(this.field_861[var3], 0, (byte)91)) {
                  if(var1 != 7106) {
                     throw new IllegalStateException();
                  }

                  var2 = true;
               }
            }

            if(var2) {
               if(var1 != 7106) {
                  throw new IllegalStateException();
               } else {
                  return null;
               }
            } else {
               class_93[] var8 = new class_93[this.field_861.length];

               for(int var4 = 0; var4 < this.field_861.length; ++var4) {
                  if(var1 != 7106) {
                     throw new IllegalStateException();
                  }

                  var8[var4] = class_93.method_1708(field_878, this.field_861[var4], 0);
               }

               class_93 var9;
               if(var8.length == 1) {
                  if(var1 != 7106) {
                     throw new IllegalStateException();
                  }

                  var9 = var8[0];
               } else {
                  class_93 var10000 = new class_93(var8, var8.length);
                  var9 = var10000;
               }

               int var5;
               if(this.field_869 != null) {
                  if(var1 != 7106) {
                     throw new IllegalStateException();
                  }

                  for(var5 = 0; var5 < this.field_869.length; ++var5) {
                     if(var1 != 7106) {
                        throw new IllegalStateException();
                     }

                     var9.method_1703(this.field_869[var5], this.field_864[var5]);
                  }
               }

               if(this.field_860 != null) {
                  if(var1 != 7106) {
                     throw new IllegalStateException();
                  }

                  for(var5 = 0; var5 < this.field_860.length; ++var5) {
                     if(var1 != 7106) {
                        throw new IllegalStateException();
                     }

                     var9.method_1701(this.field_860[var5], this.field_872[var5]);
                  }
               }

               return var9;
            }
         }
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6, "ef.j(" + ')');
      }
   }

   // $FF: renamed from: r (byte) ef
   public final class_88 method_1545(byte var1) {
      try {
         int var2 = -1;
         if(-1 != this.field_854 * -17335253) {
            if(var1 == 1) {
               throw new IllegalStateException();
            }

            var2 = class_43.method_496(this.field_854 * -17335253, 1078304144);
         } else if(this.field_885 * -1483491067 != -1) {
            if(var1 == 1) {
               throw new IllegalStateException();
            }

            var2 = class_282.field_3246[this.field_885 * -1483491067];
         }

         int var3;
         label46: {
            if(var2 >= 0) {
               if(var1 == 1) {
                  throw new IllegalStateException();
               }

               if(var2 < this.field_862.length - 1) {
                  var3 = this.field_862[var2];
                  break label46;
               }

               if(var1 == 1) {
                  throw new IllegalStateException();
               }
            }

            var3 = this.field_862[this.field_862.length - 1];
         }

         if(-1 != var3) {
            if(var1 == 1) {
               throw new IllegalStateException();
            } else {
               return class_85.method_1443(var3, 1519013164);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "ef.r(" + ')');
      }
   }

   // $FF: renamed from: b (int) boolean
   public boolean method_1546(int var1) {
      try {
         if(this.field_862 == null) {
            if(var1 >= 1070699805) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            int var2 = -1;
            if(-1 != this.field_854 * -17335253) {
               if(var1 >= 1070699805) {
                  throw new IllegalStateException();
               }

               var2 = class_43.method_496(this.field_854 * -17335253, -811372337);
            } else if(-1 != this.field_885 * -1483491067) {
               if(var1 >= 1070699805) {
                  throw new IllegalStateException();
               }

               var2 = class_282.field_3246[this.field_885 * -1483491067];
            }

            if(var2 >= 0) {
               if(var1 >= 1070699805) {
                  throw new IllegalStateException();
               }

               if(var2 < this.field_862.length) {
                  boolean var10000;
                  if(this.field_862[var2] != -1) {
                     if(var1 >= 1070699805) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  return var10000;
               }

               if(var1 >= 1070699805) {
                  throw new IllegalStateException();
               }
            }

            return this.field_862[this.field_862.length - 1] != -1;
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "ef.b(" + ')');
      }
   }

   // $FF: renamed from: d (int, int, int) int
   public int method_1547(int var1, int var2, int var3) {
      try {
         return class_174.method_3723(this.field_889, var1, var2, -1327945264);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "ef.d(" + ')');
      }
   }

   // $FF: renamed from: s (int, java.lang.String, int) java.lang.String
   public String method_1548(int var1, String var2, int var3) {
      try {
         return class_346.method_6180(this.field_889, var1, var2, (byte)98);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "ef.s(" + ')');
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      class_272 var10000 = new class_272(64);
      field_884 = var10000;
      var10000 = new class_272(50);
      field_876 = var10000;
   }

   // $FF: renamed from: u (int) ef
   public static class_88 method_1550(int var0) {
      class_88 var1 = (class_88)field_884.method_5065((long)var0);
      if(null != var1) {
         return var1;
      } else {
         byte[] var2 = field_890.method_5381(9, var0, -26460885);
         class_88 var10000 = new class_88();
         var1 = var10000;
         var1.field_857 = var0 * 1893482329;
         if(var2 != null) {
            class_28 var10001 = new class_28(var2);
            var1.method_1566(var10001, 1170104499);
         }

         var1.method_1540(-1110153624);
         field_884.method_5064(var1, (long)var0);
         return var1;
      }
   }

   // $FF: renamed from: l (nd) void
   void method_1551(class_28 var1) {
      while(true) {
         int var2 = var1.method_130(437068569);
         if(var2 == 0) {
            return;
         }

         this.method_1542(var1, var2, (byte)62);
      }
   }

   // $FF: renamed from: w () boolean
   public boolean method_1552() {
      if(this.field_862 == null) {
         return true;
      } else {
         int var1 = -1;
         if(-1 != this.field_854 * -17335253) {
            var1 = class_43.method_496(this.field_854 * -99777828, -2062373051);
         } else if(-1 != this.field_885 * 277889017) {
            var1 = class_282.field_3246[this.field_885 * -1483491067];
         }

         return var1 >= 0 && var1 < this.field_862.length?this.field_862[var1] != -1:this.field_862[this.field_862.length - 1] != -1;
      }
   }

   // $FF: renamed from: o (nd, int) void
   void method_1553(class_28 var1, int var2) {
      int var3;
      int var4;
      if(var2 == 1) {
         var3 = var1.method_130(230341802);
         this.field_866 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field_866[var4] = var1.method_132((byte)-76);
         }
      } else if(var2 == 2) {
         this.field_858 = var1.method_139(-391631059);
      } else if(12 == var2) {
         this.field_859 = var1.method_130(-465511847) * -1124041450;
      } else if(13 == var2) {
         this.field_875 = var1.method_132((byte)-54) * 1784073613;
      } else if(14 == var2) {
         this.field_865 = var1.method_132((byte)-28) * -481012047;
      } else if(var2 == 15) {
         this.field_863 = var1.method_132((byte)-42) * 82130600;
      } else if(var2 == 16) {
         this.field_874 = var1.method_132((byte)-82) * 825755253;
      } else if(17 == var2) {
         this.field_865 = var1.method_132((byte)-30) * -824174637;
         this.field_870 = var1.method_132((byte)-73) * 1636089201;
         this.field_867 = var1.method_132((byte)-10) * -939915041;
         this.field_868 = var1.method_132((byte)-84) * 323171326;
      } else if(var2 == 18) {
         var1.method_132((byte)-81);
      } else if(var2 >= 30 && var2 < 35) {
         this.field_873[var2 - 30] = var1.method_139(-391631059);
         if(this.field_873[var2 - 30].equalsIgnoreCase(class_305.field_3405)) {
            this.field_873[var2 - 30] = null;
         }
      } else if(var2 == 40) {
         var3 = var1.method_130(347801036);
         this.field_869 = new short[var3];
         this.field_864 = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field_869[var4] = (short)var1.method_132((byte)-28);
            this.field_864[var4] = (short)var1.method_132((byte)-6);
         }
      } else if(-566421194 == var2) {
         var3 = var1.method_130(-89129845);
         this.field_860 = new short[var3];
         this.field_872 = new short[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field_860[var4] = (short)var1.method_132((byte)-20);
            this.field_872[var4] = (short)var1.method_132((byte)-62);
         }
      } else if(var2 == -842523885) {
         var3 = var1.method_130(-33323457);
         this.field_861 = new int[var3];

         for(var4 = 0; var4 < var3; ++var4) {
            this.field_861[var4] = var1.method_132((byte)-87);
         }
      } else if(93 == var2) {
         this.field_883 = false;
      } else if(var2 == 95) {
         this.field_853 = var1.method_132((byte)-29) * -1182914317;
      } else if(var2 == 495119271) {
         this.field_855 = var1.method_132((byte)-8) * 1031349239;
      } else if(1312735192 == var2) {
         this.field_877 = var1.method_132((byte)-85) * 1108634674;
      } else if(957766296 == var2) {
         this.field_871 = true;
      } else if(var2 == 100) {
         this.field_879 = var1.method_131((byte)2) * 288347979;
      } else if(101 == var2) {
         this.field_880 = var1.method_131((byte)-90) * -1536154543;
      } else if(var2 == -1147019909) {
         this.field_881 = var1.method_132((byte)-91) * 845029350;
      } else if(var2 == 103) {
         this.field_882 = var1.method_132((byte)-63) * 1245285155;
      } else if(var2 != 106 && 1005306346 != var2) {
         if(1200708576 == var2) {
            this.field_886 = false;
         } else if(138233384 == var2) {
            this.field_887 = false;
         } else if(var2 == 466590219) {
            this.field_888 = true;
         } else if(249 == var2) {
            this.field_889 = class_325.method_5781(var1, this.field_889, -391561047);
         }
      } else {
         this.field_854 = var1.method_132((byte)-38) * 217670275;
         if('\uffff' == this.field_854 * 1384300198) {
            this.field_854 = -217670275;
         }

         this.field_885 = var1.method_132((byte)-88) * -236114995;
         if(-1495282998 * this.field_885 == '\uffff') {
            this.field_885 = 236114995;
         }

         var3 = -1;
         if(var2 == 118) {
            var3 = var1.method_132((byte)-43);
            if(var3 == '\uffff') {
               var3 = -1;
            }
         }

         var4 = var1.method_130(431348261);
         this.field_862 = new int[var4 + 2];

         for(int var5 = 0; var5 <= var4; ++var5) {
            this.field_862[var5] = var1.method_132((byte)-4);
            if(this.field_862[var5] == -1234849221) {
               this.field_862[var5] = -1;
            }
         }

         this.field_862[var4 + 1] = var3;
      }

   }

   // $FF: renamed from: q (int, int) int
   public int method_1554(int var1, int var2) {
      return class_174.method_3723(this.field_889, var1, var2, -1810532339);
   }

   // $FF: renamed from: g (fl, int, fl, int) gr
   public final class_92 method_1555(class_72 var1, int var2, class_72 var3, int var4) {
      if(this.field_862 != null) {
         class_88 var11 = this.method_1545((byte)38);
         return var11 == null?null:var11.method_1543(var1, var2, var3, var4, -26460885);
      } else {
         class_92 var5 = (class_92)field_876.method_5065((long)(-677670931 * this.field_857));
         if(null == var5) {
            boolean var6 = false;

            for(int var7 = 0; var7 < this.field_866.length; ++var7) {
               if(!field_878.method_5383(this.field_866[var7], 0, (byte)89)) {
                  var6 = true;
               }
            }

            if(var6) {
               return null;
            }

            class_93[] var8 = new class_93[this.field_866.length];

            int var9;
            for(var9 = 0; var9 < this.field_866.length; ++var9) {
               var8[var9] = class_93.method_1708(field_878, this.field_866[var9], 0);
            }

            class_93 var12;
            if(var8.length == 1) {
               var12 = var8[0];
            } else {
               class_93 var10000 = new class_93(var8, var8.length);
               var12 = var10000;
            }

            if(null != this.field_869) {
               for(var9 = 0; var9 < this.field_869.length; ++var9) {
                  var12.method_1703(this.field_869[var9], this.field_864[var9]);
               }
            }

            if(null != this.field_860) {
               for(var9 = 0; var9 < this.field_860.length; ++var9) {
                  var12.method_1701(this.field_860[var9], this.field_872[var9]);
               }
            }

            var5 = var12.method_1711(64 + 1197642595 * this.field_879, 909110082 + this.field_880 * -710069658, 1566333618, -863465304, -30);
            field_876.method_5064(var5, (long)(this.field_857 * -2060838679));
         }

         class_92 var10;
         if(null != var1 && var3 != null) {
            var10 = var1.method_1086(var5, var2, var3, var4, -758486760);
         } else if(var1 != null) {
            var10 = var1.method_1052(var5, var2, -1806304392);
         } else if(var3 != null) {
            var10 = var3.method_1052(var5, var4, -1532791484);
         } else {
            var10 = var5.method_1617(true);
         }

         if(128 != this.field_855 * 1078672503 || 128 != -1857234360 * this.field_877) {
            var10.method_1633(this.field_855 * -580087781, this.field_877 * -752817139, 1078672503 * this.field_855);
         }

         return var10;
      }
   }

   // $FF: renamed from: ae (int, java.lang.String) java.lang.String
   public String method_1556(int var1, String var2) {
      return class_346.method_6180(this.field_889, var1, var2, (byte)65);
   }

   // $FF: renamed from: a () gm
   public final class_93 method_1557() {
      if(null != this.field_862) {
         class_88 var5 = this.method_1545((byte)-95);
         return var5 == null?null:var5.method_1544((short)7106);
      } else if(null == this.field_861) {
         return null;
      } else {
         boolean var1 = false;

         for(int var2 = 0; var2 < this.field_861.length; ++var2) {
            if(!field_878.method_5383(this.field_861[var2], 0, (byte)102)) {
               var1 = true;
            }
         }

         if(var1) {
            return null;
         } else {
            class_93[] var6 = new class_93[this.field_861.length];

            for(int var3 = 0; var3 < this.field_861.length; ++var3) {
               var6[var3] = class_93.method_1708(field_878, this.field_861[var3], 0);
            }

            class_93 var7;
            if(var6.length == 1) {
               var7 = var6[0];
            } else {
               class_93 var10000 = new class_93(var6, var6.length);
               var7 = var10000;
            }

            int var4;
            if(this.field_869 != null) {
               for(var4 = 0; var4 < this.field_869.length; ++var4) {
                  var7.method_1703(this.field_869[var4], this.field_864[var4]);
               }
            }

            if(this.field_860 != null) {
               for(var4 = 0; var4 < this.field_860.length; ++var4) {
                  var7.method_1701(this.field_860[var4], this.field_872[var4]);
               }
            }

            return var7;
         }
      }
   }

   // $FF: renamed from: m () gm
   public final class_93 method_1558() {
      if(null != this.field_862) {
         class_88 var5 = this.method_1545((byte)-115);
         return var5 == null?null:var5.method_1544((short)7106);
      } else if(null == this.field_861) {
         return null;
      } else {
         boolean var1 = false;

         for(int var2 = 0; var2 < this.field_861.length; ++var2) {
            if(!field_878.method_5383(this.field_861[var2], 0, (byte)41)) {
               var1 = true;
            }
         }

         if(var1) {
            return null;
         } else {
            class_93[] var6 = new class_93[this.field_861.length];

            for(int var3 = 0; var3 < this.field_861.length; ++var3) {
               var6[var3] = class_93.method_1708(field_878, this.field_861[var3], 0);
            }

            class_93 var7;
            if(var6.length == 1) {
               var7 = var6[0];
            } else {
               class_93 var10000 = new class_93(var6, var6.length);
               var7 = var10000;
            }

            int var4;
            if(this.field_869 != null) {
               for(var4 = 0; var4 < this.field_869.length; ++var4) {
                  var7.method_1703(this.field_869[var4], this.field_864[var4]);
               }
            }

            if(this.field_860 != null) {
               for(var4 = 0; var4 < this.field_860.length; ++var4) {
                  var7.method_1701(this.field_860[var4], this.field_872[var4]);
               }
            }

            return var7;
         }
      }
   }

   // $FF: renamed from: x () ef
   public final class_88 method_1559() {
      int var1 = -1;
      if(-1 != this.field_854 * -17335253) {
         var1 = class_43.method_496(this.field_854 * -17335253, 1772021951);
      } else if(this.field_885 * -1483491067 != -1) {
         var1 = class_282.field_3246[this.field_885 * -1483491067];
      }

      int var2;
      if(var1 >= 0 && var1 < this.field_862.length - 1) {
         var2 = this.field_862[var1];
      } else {
         var2 = this.field_862[this.field_862.length - 1];
      }

      return -1 != var2?class_85.method_1443(var2, 1507209948):null;
   }

   // $FF: renamed from: z () ef
   public final class_88 method_1560() {
      int var1 = -1;
      if(-1 != this.field_854 * -17335253) {
         var1 = class_43.method_496(this.field_854 * -17335253, -1982651271);
      } else if(this.field_885 * -1483491067 != -1) {
         var1 = class_282.field_3246[this.field_885 * -1483491067];
      }

      int var2;
      if(var1 >= 0 && var1 < this.field_862.length - 1) {
         var2 = this.field_862[var1];
      } else {
         var2 = this.field_862[this.field_862.length - 1];
      }

      return -1 != var2?class_85.method_1443(var2, 1296906469):null;
   }

   // $FF: renamed from: c (fl, int, fl, int) gr
   public final class_92 method_1561(class_72 var1, int var2, class_72 var3, int var4) {
      if(this.field_862 != null) {
         class_88 var11 = this.method_1545((byte)-44);
         return var11 == null?null:var11.method_1543(var1, var2, var3, var4, -26460885);
      } else {
         class_92 var5 = (class_92)field_876.method_5065((long)(-994975531 * this.field_857));
         if(null == var5) {
            boolean var6 = false;

            for(int var7 = 0; var7 < this.field_866.length; ++var7) {
               if(!field_878.method_5383(this.field_866[var7], 0, (byte)67)) {
                  var6 = true;
               }
            }

            if(var6) {
               return null;
            }

            class_93[] var8 = new class_93[this.field_866.length];

            int var9;
            for(var9 = 0; var9 < this.field_866.length; ++var9) {
               var8[var9] = class_93.method_1708(field_878, this.field_866[var9], 0);
            }

            class_93 var12;
            if(var8.length == 1) {
               var12 = var8[0];
            } else {
               class_93 var10000 = new class_93(var8, var8.length);
               var12 = var10000;
            }

            if(null != this.field_869) {
               for(var9 = 0; var9 < this.field_869.length; ++var9) {
                  var12.method_1703(this.field_869[var9], this.field_864[var9]);
               }
            }

            if(null != this.field_860) {
               for(var9 = 0; var9 < this.field_860.length; ++var9) {
                  var12.method_1701(this.field_860[var9], this.field_872[var9]);
               }
            }

            var5 = var12.method_1711(2052383382 + -271471907 * this.field_879, -1786115087 + this.field_880 * 1867659125, -30, -401714023, -30);
            field_876.method_5064(var5, (long)(this.field_857 * 1209242429));
         }

         class_92 var10;
         if(null != var1 && var3 != null) {
            var10 = var1.method_1086(var5, var2, var3, var4, 2106400325);
         } else if(var1 != null) {
            var10 = var1.method_1052(var5, var2, -1494676468);
         } else if(var3 != null) {
            var10 = var3.method_1052(var5, var4, -1294721053);
         } else {
            var10 = var5.method_1617(true);
         }

         if(128 != this.field_855 * 1869900169 || -603876265 != -1467757175 * this.field_877) {
            var10.method_1633(this.field_855 * 194030246, this.field_877 * -1467757175, 1078672503 * this.field_855);
         }

         return var10;
      }
   }

   // $FF: renamed from: t () boolean
   public boolean method_1562() {
      if(this.field_862 == null) {
         return true;
      } else {
         int var1 = -1;
         if(-1 != this.field_854 * -17335253) {
            var1 = class_43.method_496(this.field_854 * -17335253, 2112563994);
         } else if(-1 != this.field_885 * -1483491067) {
            var1 = class_282.field_3246[this.field_885 * -1483491067];
         }

         return var1 >= 0 && var1 < this.field_862.length?this.field_862[var1] != -1:this.field_862[this.field_862.length - 1] != -1;
      }
   }

   // $FF: renamed from: h () boolean
   public boolean method_1563() {
      if(this.field_862 == null) {
         return true;
      } else {
         int var1 = -1;
         if(-1 != this.field_854 * -17335253) {
            var1 = class_43.method_496(this.field_854 * 75872287, 1472168655);
         } else if(-1 != this.field_885 * -1483491067) {
            var1 = class_282.field_3246[this.field_885 * 1470501354];
         }

         return var1 >= 0 && var1 < this.field_862.length?this.field_862[var1] != -1:this.field_862[this.field_862.length - 1] != -1;
      }
   }

   // $FF: renamed from: kb (java.lang.String, short) void
   static final void method_1564(String var0, short var1) {
      try {
         if(!var0.equals("")) {
            class_40 var2 = class_112.method_2238(class_266.field_3048, client.field_1463.field_2384, (byte)8);
            var2.field_263.method_210(class_166.method_3598(var0, 1554265109), 303066737);
            var2.field_263.method_120(var0, -427478981);
            client.field_1463.method_4079(var2, -1813785027);
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3, "ef.kb(" + ')');
      }
   }

   // $FF: renamed from: i (int, java.lang.String) java.lang.String
   public String method_1565(int var1, String var2) {
      return class_346.method_6180(this.field_889, var1, var2, (byte)30);
   }

   // $FF: renamed from: f (nd, int) void
   void method_1566(class_28 var1, int var2) {
      try {
         while(true) {
            int var3 = var1.method_130(2064749124);
            if(var3 == 0) {
               if(var2 != 1170104499) {
                  throw new IllegalStateException();
               }

               return;
            }

            this.method_1542(var1, var3, (byte)-16);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "ef.f(" + ')');
      }
   }

   // $FF: renamed from: <init> () void
   class_88() {
      super();
      try {
         this.field_858 = class_305.field_3410;
         this.field_859 = 2143888193;
         this.field_875 = -1784073613;
         this.field_863 = -1081629083;
         this.field_874 = -825755253;
         this.field_865 = 824174637;
         this.field_870 = -1636089201;
         this.field_867 = 939915041;
         this.field_868 = 250921021;
         this.field_873 = new String[5];
         this.field_883 = true;
         this.field_853 = 1182914317;
         this.field_855 = 1991156608;
         this.field_877 = -1420010368;
         this.field_871 = false;
         this.field_879 = 0;
         this.field_880 = 0;
         this.field_881 = -915888573;
         this.field_882 = 2059483680;
         this.field_854 = -217670275;
         this.field_885 = 236114995;
         this.field_886 = true;
         this.field_887 = true;
         this.field_888 = false;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "ef.<init>(" + ')');
      }
   }

   // $FF: renamed from: lu (int) void
   static void method_1567(int var0) {
      try {
         if(client.field_1500) {
            if(var0 == -1390895386) {
               throw new IllegalStateException();
            }

            if(class_164.field_2044 != null) {
               int var1 = class_164.field_2044.field_1112[0];
               int var2 = class_164.field_2044.field_1126[0];
               if(var1 >= 0) {
                  if(var0 == -1390895386) {
                     throw new IllegalStateException();
                  }

                  if(var2 >= 0) {
                     if(var0 == -1390895386) {
                        return;
                     }

                     if(var1 < 104) {
                        if(var2 < 104) {
                           class_146.field_1861 = class_164.field_2044.field_1077 * -1047576023;
                           int var3 = class_205.method_4113(class_164.field_2044.field_1077 * -130212619, class_164.field_2044.field_1076 * 1248597615, 1115122599 * class_115.field_1289, 2139330324) - client.field_1596 * 334319879;
                           if(var3 < class_120.field_1329 * 769722653) {
                              if(var0 == -1390895386) {
                                 return;
                              }

                              class_120.field_1329 = 1591738677 * var3;
                           }

                           class_271.field_3188 = 1185261503 * class_164.field_2044.field_1076;
                           client.field_1500 = false;
                           return;
                        }

                        if(var0 == -1390895386) {
                           throw new IllegalStateException();
                        }
                     }
                  }
               }

               return;
            }
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4, "ef.lu(" + ')');
      }
   }
}
