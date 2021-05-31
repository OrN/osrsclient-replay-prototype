
// $FF: renamed from: eg
public class class_87 extends class_59 {

   // $FF: renamed from: c short[]
   short[] field_801;
   // $FF: renamed from: n jv
   public static class_306 field_802;
   // $FF: renamed from: y hz
   static class_272 field_803;
   // $FF: renamed from: as int
   int field_804;
   // $FF: renamed from: j hz
   static class_272 field_805;
   // $FF: renamed from: v boolean
   public static boolean field_806;
   // $FF: renamed from: b gm[]
   static class_93[] field_807;
   // $FF: renamed from: d int
   public int field_808;
   // $FF: renamed from: u int[]
   int[] field_809;
   // $FF: renamed from: i int
   public int field_810;
   // $FF: renamed from: l java.lang.String
   public String field_811;
   // $FF: renamed from: o short[]
   short[] field_812;
   // $FF: renamed from: ac boolean
   boolean field_813;
   // $FF: renamed from: e short[]
   short[] field_814;
   // $FF: renamed from: al int
   public int field_815;
   // $FF: renamed from: h boolean
   public boolean field_816;
   // $FF: renamed from: p hz
   public static class_272 field_817;
   // $FF: renamed from: m int
   public int field_818;
   // $FF: renamed from: aj int
   int field_819;
   // $FF: renamed from: z int
   public int field_820;
   // $FF: renamed from: w int
   int field_821;
   // $FF: renamed from: t boolean
   boolean field_822;
   // $FF: renamed from: an mr
   class_369 field_823;
   // $FF: renamed from: q int
   public int field_824;
   // $FF: renamed from: ao int
   int field_825;
   // $FF: renamed from: ae int
   int field_826;
   // $FF: renamed from: r hz
   static class_272 field_827;
   // $FF: renamed from: ab java.lang.String[]
   public String[] field_828;
   // $FF: renamed from: aw int
   public int field_829;
   // $FF: renamed from: ad int
   public int field_830;
   // $FF: renamed from: ai boolean
   boolean field_831;
   // $FF: renamed from: ar boolean
   public boolean field_832;
   // $FF: renamed from: g short[]
   short[] field_833;
   // $FF: renamed from: ax int
   int field_834;
   // $FF: renamed from: s int[]
   int[] field_835;
   // $FF: renamed from: ag int
   int field_836;
   // $FF: renamed from: x boolean
   public boolean field_837;
   // $FF: renamed from: az int
   int field_838;
   // $FF: renamed from: a int
   public int field_839;
   // $FF: renamed from: am int
   int field_840;
   // $FF: renamed from: at int
   public int field_841;
   // $FF: renamed from: ah int[]
   public int[] field_842;
   // $FF: renamed from: av boolean
   public boolean field_843;
   // $FF: renamed from: aq int
   int field_844;
   // $FF: renamed from: ap int
   int field_845;
   // $FF: renamed from: af int
   public int field_846;
   // $FF: renamed from: ak int
   public int field_847;
   // $FF: renamed from: ay int
   public int field_848;
   // $FF: renamed from: aa int[]
   public int[] field_849;
   // $FF: renamed from: au boolean
   public boolean field_850;
   // $FF: renamed from: k int
   public int field_851;
   // $FF: renamed from: sf cl
   static Preferences preferences;


   // $FF: renamed from: n (byte) void
   void method_1483(byte var1) {
      try {
         if(this.field_820 * -1747290425 == -1) {
            this.field_820 = 0;
            if(null != this.field_835) {
               label73: {
                  if(var1 != 1) {
                     throw new IllegalStateException();
                  }

                  if(this.field_809 != null) {
                     if(var1 != 1) {
                        throw new IllegalStateException();
                     }

                     if(this.field_809[0] != 10) {
                        break label73;
                     }

                     if(var1 != 1) {
                        throw new IllegalStateException();
                     }
                  }

                  this.field_820 = -2085655817;
               }
            }

            for(int var2 = 0; var2 < 5; ++var2) {
               if(var1 != 1) {
                  throw new IllegalStateException();
               }

               if(null != this.field_828[var2]) {
                  if(var1 != 1) {
                     throw new IllegalStateException();
                  }

                  this.field_820 = -2085655817;
               }
            }
         }

         if(-1 == -1364896901 * this.field_841) {
            if(var1 != 1) {
               return;
            }

            byte var10002;
            if(0 != this.field_818 * 1384594797) {
               if(var1 != 1) {
                  throw new IllegalStateException();
               }

               var10002 = 1;
            } else {
               var10002 = 0;
            }

            this.field_841 = -1858759757 * var10002;
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: f (nd, byte) void
   void method_1484(Buffer var1, byte var2) {
      try {
         while(true) {
            int var3 = var1.readUnsignedByte();
            if(0 == var3) {
               if(var2 != 1) {
                  return;
               }

               return;
            }

            this.method_1485(var1, var3, -1041207607);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: y (nd, int, int) void
   void method_1485(Buffer var1, int var2, int var3) {
      try {
         int var4;
         int var5;
         if(1 == var2) {
            if(var3 >= -864081678) {
               throw new IllegalStateException();
            }

            var4 = var1.readUnsignedByte();
            if(var4 > 0) {
               if(var3 >= -864081678) {
                  return;
               }

               if(this.field_835 != null) {
                  if(var3 >= -864081678) {
                     throw new IllegalStateException();
                  }

                  if(!field_806) {
                     var1.offset += 1217892583 * var4;
                     return;
                  }

                  if(var3 >= -864081678) {
                     return;
                  }
               }

               this.field_809 = new int[var4];
               this.field_835 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if(var3 >= -864081678) {
                     throw new IllegalStateException();
                  }

                  this.field_835[var5] = var1.readShort();
                  this.field_809[var5] = var1.readUnsignedByte();
               }
            }
         } else if(var2 == 2) {
            if(var3 >= -864081678) {
               throw new IllegalStateException();
            }

            this.field_811 = var1.method_139(-391631059);
         } else if(var2 == 5) {
            if(var3 >= -864081678) {
               return;
            }

            var4 = var1.readUnsignedByte();
            if(var4 > 0) {
               if(this.field_835 != null) {
                  if(var3 >= -864081678) {
                     return;
                  }

                  if(!field_806) {
                     var1.offset += -2051383142 * var4;
                     return;
                  }

                  if(var3 >= -864081678) {
                     return;
                  }
               }

               this.field_809 = null;
               this.field_835 = new int[var4];

               for(var5 = 0; var5 < var4; ++var5) {
                  if(var3 >= -864081678) {
                     throw new IllegalStateException();
                  }

                  this.field_835[var5] = var1.readShort();
               }
            }
         } else if(14 == var2) {
            this.field_839 = var1.readUnsignedByte() * 822501225;
         } else if(15 == var2) {
            if(var3 >= -864081678) {
               throw new IllegalStateException();
            }

            this.field_851 = var1.readUnsignedByte() * -2102030313;
         } else if(var2 == 17) {
            if(var3 >= -864081678) {
               throw new IllegalStateException();
            }

            this.field_818 = 0;
            this.field_837 = false;
         } else if(18 == var2) {
            if(var3 >= -864081678) {
               throw new IllegalStateException();
            }

            this.field_837 = false;
         } else if(19 == var2) {
            if(var3 >= -864081678) {
               throw new IllegalStateException();
            }

            this.field_820 = var1.readUnsignedByte() * -2085655817;
         } else if(21 == var2) {
            if(var3 >= -864081678) {
               throw new IllegalStateException();
            }

            this.field_821 = 0;
         } else if(var2 == 22) {
            if(var3 >= -864081678) {
               throw new IllegalStateException();
            }

            this.field_822 = true;
         } else if(23 == var2) {
            this.field_816 = true;
         } else if(24 == var2) {
            if(var3 >= -864081678) {
               throw new IllegalStateException();
            }

            this.field_824 = var1.readShort() * -1042698627;
            if(91732693 * this.field_824 == '\uffff') {
               this.field_824 = 1042698627;
            }
         } else if(var2 == 27) {
            if(var3 >= -864081678) {
               throw new IllegalStateException();
            }

            this.field_818 = -2058267547;
         } else if(28 == var2) {
            if(var3 >= -864081678) {
               throw new IllegalStateException();
            }

            this.field_810 = var1.readUnsignedByte() * 1012101565;
         } else if(var2 == 29) {
            if(var3 >= -864081678) {
               return;
            }

            this.field_826 = var1.readByte() * -2118336885;
         } else if(39 == var2) {
            if(var3 >= -864081678) {
               throw new IllegalStateException();
            }

            this.field_845 = var1.readByte() * 1911142931;
         } else if(var2 >= 30 && var2 < 35) {
            this.field_828[var2 - 30] = var1.method_139(-391631059);
            if(this.field_828[var2 - 30].equalsIgnoreCase(class_305.field_3405)) {
               if(var3 >= -864081678) {
                  throw new IllegalStateException();
               }

               this.field_828[var2 - 30] = null;
            }
         } else if(var2 == 40) {
            if(var3 >= -864081678) {
               return;
            }

            var4 = var1.readUnsignedByte();
            this.field_812 = new short[var4];
            this.field_801 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               this.field_812[var5] = (short)var1.readShort();
               this.field_801[var5] = (short)var1.readShort();
            }
         } else if(var2 == 41) {
            if(var3 >= -864081678) {
               return;
            }

            var4 = var1.readUnsignedByte();
            this.field_814 = new short[var4];
            this.field_833 = new short[var4];

            for(var5 = 0; var5 < var4; ++var5) {
               if(var3 >= -864081678) {
                  return;
               }

               this.field_814[var5] = (short)var1.readShort();
               this.field_833[var5] = (short)var1.readShort();
            }
         } else if(62 == var2) {
            this.field_831 = true;
         } else if(64 == var2) {
            if(var3 >= -864081678) {
               throw new IllegalStateException();
            }

            this.field_832 = false;
         } else if(65 == var2) {
            if(var3 >= -864081678) {
               throw new IllegalStateException();
            }

            this.field_836 = var1.readShort() * 1454289911;
         } else if(66 == var2) {
            this.field_834 = var1.readShort() * -1826017161;
         } else if(var2 == 67) {
            if(var3 >= -864081678) {
               throw new IllegalStateException();
            }

            this.field_804 = var1.readShort() * 1641642293;
         } else if(var2 == 68) {
            if(var3 >= -864081678) {
               throw new IllegalStateException();
            }

            this.field_830 = var1.readShort() * 1440922517;
         } else if(69 == var2) {
            if(var3 >= -864081678) {
               throw new IllegalStateException();
            }

            var1.readUnsignedByte();
         } else if(70 == var2) {
            if(var3 >= -864081678) {
               return;
            }

            this.field_819 = var1.method_269(-1542485131) * 491527025;
         } else if(var2 == 71) {
            this.field_840 = var1.method_269(-1542485131) * -1445187263;
         } else if(var2 == 72) {
            this.field_838 = var1.method_269(-1542485131) * -1289088241;
         } else if(var2 == 73) {
            this.field_843 = true;
         } else if(var2 == 74) {
            this.field_813 = true;
         } else if(var2 == 75) {
            if(var3 >= -864081678) {
               return;
            }

            this.field_841 = var1.readUnsignedByte() * -1858759757;
         } else {
            if(77 != var2) {
               if(var3 >= -864081678) {
                  throw new IllegalStateException();
               }

               if(92 != var2) {
                  if(78 == var2) {
                     if(var3 >= -864081678) {
                        throw new IllegalStateException();
                     }

                     this.field_829 = var1.readShort() * 1857685779;
                     this.field_846 = var1.readUnsignedByte() * -364813997;
                     return;
                  } else if(79 == var2) {
                     if(var3 >= -864081678) {
                        return;
                     }

                     this.field_847 = var1.readShort() * -1446744557;
                     this.field_848 = var1.readShort() * -2968437;
                     this.field_846 = var1.readUnsignedByte() * -364813997;
                     var4 = var1.readUnsignedByte();
                     this.field_849 = new int[var4];

                     for(var5 = 0; var5 < var4; ++var5) {
                        if(var3 >= -864081678) {
                           throw new IllegalStateException();
                        }

                        this.field_849[var5] = var1.readShort();
                     }

                     return;
                  } else if(var2 == 81) {
                     if(var3 >= -864081678) {
                        throw new IllegalStateException();
                     }

                     this.field_821 = var1.readUnsignedByte() * 1095153920;
                     return;
                  } else if(var2 == 82) {
                     if(var3 >= -864081678) {
                        throw new IllegalStateException();
                     }

                     this.field_815 = var1.readShort() * 551383109;
                     return;
                  } else {
                     if(89 == var2) {
                        if(var3 >= -864081678) {
                           throw new IllegalStateException();
                        }

                        this.field_850 = false;
                     } else if(var2 == 249) {
                        this.field_823 = class_325.method_5781(var1, this.field_823, -391561047);
                        return;
                     }

                     return;
                  }
               }

               if(var3 >= -864081678) {
                  return;
               }
            }

            this.field_825 = var1.readShort() * 1029028887;
            if('\uffff' == this.field_825 * -240174169) {
               if(var3 >= -864081678) {
                  throw new IllegalStateException();
               }

               this.field_825 = -1029028887;
            }

            this.field_844 = var1.readShort() * 1365543255;
            if('\uffff' == this.field_844 * 758936167) {
               this.field_844 = -1365543255;
            }

            var4 = -1;
            if(var2 == 92) {
               if(var3 >= -864081678) {
                  throw new IllegalStateException();
               }

               var4 = var1.readShort();
               if(var4 == '\uffff') {
                  if(var3 >= -864081678) {
                     throw new IllegalStateException();
                  }

                  var4 = -1;
               }
            }

            var5 = var1.readUnsignedByte();
            this.field_842 = new int[2 + var5];

            for(int var6 = 0; var6 <= var5; ++var6) {
               if(var3 >= -864081678) {
                  throw new IllegalStateException();
               }

               this.field_842[var6] = var1.readShort();
               if('\uffff' == this.field_842[var6]) {
                  this.field_842[var6] = -1;
               }
            }

            this.field_842[1 + var5] = var4;
         }

      } catch (RuntimeException var7) {
         throw class_223.method_4281(var7);
      }
   }

   // $FF: renamed from: p (int, int) boolean
   public final boolean method_1486(int var1, int var2) {
      try {
         if(null == this.field_809) {
            if(var2 >= -1123306073) {
               throw new IllegalStateException();
            } else if(this.field_835 == null) {
               if(var2 >= -1123306073) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else if(10 != var1) {
               if(var2 >= -1123306073) {
                  throw new IllegalStateException();
               } else {
                  return true;
               }
            } else {
               boolean var6 = true;

               for(int var4 = 0; var4 < this.field_835.length; ++var4) {
                  if(var2 >= -1123306073) {
                     throw new IllegalStateException();
                  }

                  var6 &= class_327.field_3846.method_5383(this.field_835[var4] & '\uffff', 0, (byte)22);
               }

               return var6;
            }
         } else {
            for(int var3 = 0; var3 < this.field_809.length; ++var3) {
               if(var2 >= -1123306073) {
                  throw new IllegalStateException();
               }

               if(var1 == this.field_809[var3]) {
                  if(var2 >= -1123306073) {
                     throw new IllegalStateException();
                  }

                  return class_327.field_3846.method_5383(this.field_835[var3] & '\uffff', 0, (byte)75);
               }
            }

            return true;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: l (int, int, int) int
   public int method_1487(int var1, int var2) {
      try {
         return class_174.method_3723(this.field_823, var1, var2, -1602148320);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: r (int, int, int[][], int, int, int, byte) gl
   public final class_91 method_1488(int var1, int var2, int[][] var3, int var4, int var5, int var6, byte var7) {
      try {
         long var8;
         if(this.field_809 == null) {
            if(var7 <= 1) {
               throw new IllegalStateException();
            }

            var8 = (long)(var2 + (this.field_808 * 1257920551 << 10));
         } else {
            var8 = (long)((var1 << 3) + (this.field_808 * 1257920551 << 10) + var2);
         }

         Object var10 = (class_91)field_805.method_5065(var8);
         if(var10 == null) {
            if(var7 <= 1) {
               throw new IllegalStateException();
            }

            class_93 var11 = this.method_1537(var1, var2, 1581886638);
            if(null == var11) {
               if(var7 <= 1) {
                  throw new IllegalStateException();
               }

               return null;
            }

            if(!this.field_822) {
               if(var7 <= 1) {
                  throw new IllegalStateException();
               }

               var10 = var11.method_1711(this.field_826 * 737098019 + 64, this.field_845 * -1951915357 + 768, -50, -10, -50);
            } else {
               var11.field_1009 = (short)(64 + this.field_826 * 737098019);
               var11.field_1010 = (short)(this.field_845 * -1951915357 + 768);
               var11.method_1707();
               var10 = var11;
            }

            field_805.method_5064((class_59)var10, var8);
         }

         if(this.field_822) {
            if(var7 <= 1) {
               throw new IllegalStateException();
            }

            var10 = ((class_93)var10).method_1695();
         }

         if(this.field_821 * 1982259081 >= 0) {
            if(var7 <= 1) {
               throw new IllegalStateException();
            }

            if(var10 instanceof class_92) {
               if(var7 <= 1) {
                  throw new IllegalStateException();
               }

               var10 = ((class_92)var10).method_1616(var3, var4, var5, var6, true, this.field_821 * 1982259081);
            } else if(var10 instanceof class_93) {
               if(var7 <= 1) {
                  throw new IllegalStateException();
               }

               var10 = ((class_93)var10).method_1696(var3, var4, var5, var6, true, 1982259081 * this.field_821);
            }
         }

         return (class_91)var10;
      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12);
      }
   }

   // $FF: renamed from: b (int, int, int[][], int, int, int, int) gr
   public final class_92 method_1489(int var1, int var2, int[][] var3, int var4, int var5, int var6, int var7) {
      try {
         long var8;
         if(null == this.field_809) {
            if(var7 != -925676771) {
               throw new IllegalStateException();
            }

            var8 = (long)((1257920551 * this.field_808 << 10) + var2);
         } else {
            var8 = (long)((1257920551 * this.field_808 << 10) + (var1 << 3) + var2);
         }

         class_92 var10 = (class_92)field_827.method_5065(var8);
         if(null == var10) {
            if(var7 != -925676771) {
               throw new IllegalStateException();
            }

            class_93 var11 = this.method_1537(var1, var2, 1581886638);
            if(null == var11) {
               if(var7 != -925676771) {
                  throw new IllegalStateException();
               }

               return null;
            }

            var10 = var11.method_1711(64 + this.field_826 * 737098019, -1951915357 * this.field_845 + 768, -50, -10, -50);
            field_827.method_5064(var10, var8);
         }

         if(1982259081 * this.field_821 >= 0) {
            var10 = var10.method_1616(var3, var4, var5, var6, true, 1982259081 * this.field_821);
         }

         return var10;
      } catch (RuntimeException var12) {
         throw class_223.method_4281(var12);
      }
   }

   // $FF: renamed from: <clinit> () void
   static {
      field_806 = false;
      class_272 var10000 = new class_272(4096);
      field_803 = var10000;
      var10000 = new class_272(500);
      field_817 = var10000;
      var10000 = new class_272(30);
      field_805 = var10000;
      var10000 = new class_272(30);
      field_827 = var10000;
      field_807 = new class_93[4];
   }

   // $FF: renamed from: u (int) eg
   public final class_87 method_1492(int var1) {
      try {
         int var2 = -1;
         if(this.field_825 * -240174169 != -1) {
            if(var1 <= -682773644) {
               throw new IllegalStateException();
            }

            var2 = class_43.method_496(-240174169 * this.field_825);
         } else if(758936167 * this.field_844 != -1) {
            if(var1 <= -682773644) {
               throw new IllegalStateException();
            }

            var2 = class_282.field_3246[758936167 * this.field_844];
         }

         int var3;
         label46: {
            if(var2 >= 0) {
               if(var1 <= -682773644) {
                  throw new IllegalStateException();
               }

               if(var2 < this.field_842.length - 1) {
                  var3 = this.field_842[var2];
                  break label46;
               }

               if(var1 <= -682773644) {
                  throw new IllegalStateException();
               }
            }

            var3 = this.field_842[this.field_842.length - 1];
         }

         if(var3 != -1) {
            if(var1 <= -682773644) {
               throw new IllegalStateException();
            } else {
               return class_121.method_2269(var3, -245346979);
            }
         } else {
            return null;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: o (int, java.lang.String, int) java.lang.String
   public String method_1494(int var1, String var2) {
      try {
         return class_346.method_6180(this.field_823, var1, var2, (byte)85);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: t (int, cf, boolean, int) int
   static int method_1495(int var0, int var3) {
      try {
         if(var0 == 3200) {
            if(var3 <= 1369136416) {
               throw new IllegalStateException();
            } else {
               class_136.field_1752 -= 1031785609;
               NetworkInput.method_6259(class_165.field_2052[-26460885 * class_136.field_1752], class_165.field_2052[1 + class_136.field_1752 * -26460885], class_165.field_2052[2 + class_136.field_1752 * -26460885], -337847097);
               return 1;
            }
         } else if(3201 == var0) {
            class_125.method_2288(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885], (byte)69);
            return 1;
         } else if(var0 == 3202) {
            if(var3 <= 1369136416) {
               throw new IllegalStateException();
            } else {
               class_136.field_1752 -= 2119512838;
               class_294.method_5314(class_165.field_2052[-26460885 * class_136.field_1752], -1577344558);
               return 1;
            }
         } else {
            int var4;
            if(var0 == 3203) {
               if(var3 <= 1369136416) {
                  throw new IllegalStateException();
               } else {
                  var4 = Math.min(Math.max(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885], 0), 100);
                  class_203.method_4097(Math.round((float)var4 * 2.55F), 57953685);
                  return 1;
               }
            } else if(var0 == 3204) {
               class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = Math.round((float)(preferences.field_2122 * 1285356667) / 2.55F);
               return 1;
            } else if(3205 == var0) {
               if(var3 <= 1369136416) {
                  throw new IllegalStateException();
               } else {
                  var4 = Math.min(Math.max(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885], 0), 100);
                  class_232.method_4453(Math.round(1.27F * (float)var4));
                  return 1;
               }
            } else if(3206 == var0) {
               if(var3 <= 1369136416) {
                  throw new IllegalStateException();
               } else {
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = Math.round((float)(-140834991 * preferences.field_2121) / 1.27F);
                  return 1;
               }
            } else if(3207 == var0) {
               var4 = Math.min(Math.max(class_165.field_2052[(class_136.field_1752 -= -1087727229) * -26460885], 0), 100);
               class_268.method_5038(Math.round((float)var4 * 1.27F));
               return 1;
            } else if(3208 == var0) {
               if(var3 <= 1369136416) {
                  throw new IllegalStateException();
               } else {
                  class_165.field_2052[(class_136.field_1752 += -1087727229) * -26460885 - 1] = Math.round((float)(-1768933319 * preferences.field_2115) / 1.27F);
                  return 1;
               }
            } else {
               return 2;
            }
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: e (byte) boolean
   public boolean method_1496(byte var1) {
      try {
         if(this.field_842 == null) {
            if(var1 <= 5) {
               throw new IllegalStateException();
            } else {
               boolean var10000;
               if(this.field_829 * 805251355 == -1) {
                  if(var1 <= 5) {
                     throw new IllegalStateException();
                  }

                  if(this.field_849 == null) {
                     var10000 = false;
                     return var10000;
                  }

                  if(var1 <= 5) {
                     throw new IllegalStateException();
                  }
               }

               var10000 = true;
               return var10000;
            }
         } else {
            int var2 = 0;

            while(true) {
               if(var2 >= this.field_842.length) {
                  return false;
               }

               if(var1 <= 5) {
                  throw new IllegalStateException();
               }

               if(-1 != this.field_842[var2]) {
                  if(var1 <= 5) {
                     throw new IllegalStateException();
                  }

                  class_87 var3 = class_121.method_2269(this.field_842[var2], 100337777);
                  if(805251355 * var3.field_829 != -1) {
                     break;
                  }

                  if(var1 <= 5) {
                     throw new IllegalStateException();
                  }

                  if(var3.field_849 != null) {
                     if(var1 <= 5) {
                        throw new IllegalStateException();
                     }
                     break;
                  }
               }

               ++var2;
            }

            return true;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: lt (java.lang.String, boolean, byte) void
   static void method_1499(String var0, boolean var1, byte var2) {
      try {
         var0 = var0.toLowerCase();
         short[] var3 = new short[16];
         int var4 = 0;

         for(int var5 = 0; var5 < 251127981 * class_80.field_701; ++var5) {
            if(var2 == 4) {
               throw new IllegalStateException();
            }

            class_80 var6 = class_299.method_5347(var5, 433698652);
            if(var1) {
               if(var2 == 4) {
                  throw new IllegalStateException();
               }

               if(!var6.field_747) {
                  if(var2 == 4) {
                     return;
                  }
                  continue;
               }
            }

            if(-1 == 168192755 * var6.field_743) {
               if(var6.field_707.toLowerCase().indexOf(var0) == -1) {
                  if(var2 == 4) {
                     throw new IllegalStateException();
                  }
               } else {
                  if(var4 >= 250) {
                     if(var2 == 4) {
                        throw new IllegalStateException();
                     }

                     class_171.field_2155 = 2001229319;
                     class_191.field_2289 = null;
                     return;
                  }

                  if(var4 >= var3.length) {
                     short[] var7 = new short[var3.length * 2];

                     for(int var8 = 0; var8 < var4; ++var8) {
                        if(var2 == 4) {
                           throw new IllegalStateException();
                        }

                        var7[var8] = var3[var8];
                     }

                     var3 = var7;
                  }

                  var3[var4++] = (short)var5;
               }
            }
         }

         class_191.field_2289 = var3;
         class_26.field_5 = 0;
         class_171.field_2155 = var4 * -2001229319;
         String[] var10 = new String[class_171.field_2155 * -1559836599];

         for(int var11 = 0; var11 < class_171.field_2155 * -1559836599; ++var11) {
            if(var2 == 4) {
               throw new IllegalStateException();
            }

            var10[var11] = class_299.method_5347(var3[var11], 558948064).field_707;
         }

         short[] var12 = class_191.field_2289;
         class_40.method_477(var10, var12, 0, var10.length - 1, 1137110463);
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9);
      }
   }

   // $FF: renamed from: v (byte) long
   public static final synchronized long method_1516(byte var0) {
      try {
         long var1 = System.currentTimeMillis();
         if(var1 < -7034796619104833383L * class_377.field_4156) {
            if(var0 != 1) {
               throw new IllegalStateException();
            }

            class_377.field_4157 += 1673139678575692923L * (class_377.field_4156 * -7034796619104833383L - var1);
         }

         class_377.field_4156 = var1 * 7137263162597843881L;
         return class_377.field_4157 * 1841679994680013491L + var1;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: <init> () void
   class_87() {
      super();
      try {
         this.field_811 = class_305.field_3410;
         this.field_839 = 822501225;
         this.field_851 = -2102030313;
         this.field_818 = 178432202;
         this.field_837 = true;
         this.field_820 = 2085655817;
         this.field_821 = 1556003143;
         this.field_822 = false;
         this.field_816 = false;
         this.field_824 = 1042698627;
         this.field_810 = -986244144;
         this.field_826 = 0;
         this.field_845 = 0;
         this.field_828 = new String[5];
         this.field_815 = -551383109;
         this.field_830 = -1440922517;
         this.field_831 = false;
         this.field_832 = true;
         this.field_836 = 1465514880;
         this.field_834 = -1801962624;
         this.field_804 = -323184000;
         this.field_819 = 0;
         this.field_840 = 0;
         this.field_838 = 0;
         this.field_843 = false;
         this.field_813 = false;
         this.field_841 = 1858759757;
         this.field_825 = -1029028887;
         this.field_844 = -1365543255;
         this.field_829 = -1857685779;
         this.field_846 = 0;
         this.field_847 = 0;
         this.field_848 = 0;
         this.field_850 = true;
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: d (int, int, int[][], int, int, int, fl, int, int) gr
   public final class_92 method_1531(int var1, int var2, int[][] var3, int var4, int var5, int var6, class_72 var7, int var8, int var9) {
      try {
         long var10;
         if(this.field_809 == null) {
            if(var9 <= -839549484) {
               throw new IllegalStateException();
            }

            var10 = (long)(var2 + (this.field_808 * 1257920551 << 10));
         } else {
            var10 = (long)(var2 + (1257920551 * this.field_808 << 10) + (var1 << 3));
         }

         class_92 var12 = (class_92)field_827.method_5065(var10);
         if(null == var12) {
            if(var9 <= -839549484) {
               throw new IllegalStateException();
            }

            class_93 var13 = this.method_1537(var1, var2, 1581886638);
            if(null == var13) {
               if(var9 <= -839549484) {
                  throw new IllegalStateException();
               }

               return null;
            }

            var12 = var13.method_1711(64 + this.field_826 * 737098019, this.field_845 * -1951915357 + 768, -50, -10, -50);
            field_827.method_5064(var12, var10);
         }

         if(null == var7) {
            if(var9 <= -839549484) {
               throw new IllegalStateException();
            }

            if(-1 == 1982259081 * this.field_821) {
               if(var9 <= -839549484) {
                  throw new IllegalStateException();
               }

               return var12;
            }
         }

         if(var7 != null) {
            if(var9 <= -839549484) {
               throw new IllegalStateException();
            }

            var12 = var7.method_1053(var12, var8, var2, (byte)-63);
         } else {
            var12 = var12.method_1617(true);
         }

         if(this.field_821 * 1982259081 >= 0) {
            if(var9 <= -839549484) {
               throw new IllegalStateException();
            }

            var12 = var12.method_1616(var3, var4, var5, var6, false, this.field_821 * 1982259081);
         }

         return var12;
      } catch (RuntimeException var14) {
         throw class_223.method_4281(var14);
      }
   }

   // $FF: renamed from: ko (int, int, int, int, oh, it, int) void
   static final void method_1535(int var0, int var1, int var2, int var3, class_67 var4, class_61 var5, int var6) {
      try {
         if(null == var4) {
            if(var6 != -1287867325) {
               throw new IllegalStateException();
            }
         } else {
            int var7 = -574530013 * client.field_1629 & 2047;
            int var8 = var3 * var3 + var2 * var2;
            if(var8 > 6400) {
               if(var6 != -1287867325) {
                  throw new IllegalStateException();
               }
            } else {
               int var9 = class_70.field_548[var7];
               int var10 = class_70.field_559[var7];
               int var11 = var9 * var3 + var2 * var10 >> 16;
               int var12 = var3 * var10 - var2 * var9 >> 16;
               if(var8 > 2500) {
                  if(var6 != -1287867325) {
                     throw new IllegalStateException();
                  }

                  var4.method_783(var11 + var5.field_479 * 1279799405 / 2 - var4.field_501 / 2, -1973837741 * var5.field_477 / 2 - var12 - var4.field_505 / 2, var0, var1, 1279799405 * var5.field_479, -1973837741 * var5.field_477, var5.field_476, var5.field_478);
               } else {
                  var4.method_767(1279799405 * var5.field_479 / 2 + var0 + var11 - var4.field_501 / 2, var5.field_477 * -1973837741 / 2 + var1 - var12 - var4.field_505 / 2);
               }

            }
         }
      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13);
      }
   }

   // $FF: renamed from: s (int, int, int) gm
   final class_93 method_1537(int var1, int var2, int var3) {
      try {
         class_93 var4 = null;
         boolean var5;
         int var6;
         int var8;
         class_93 var14;
         if(this.field_809 == null) {
            if(var3 != 1581886638) {
               throw new IllegalStateException();
            }

            if(10 != var1) {
               if(var3 != 1581886638) {
                  throw new IllegalStateException();
               }

               return null;
            }

            if(this.field_835 == null) {
               if(var3 != 1581886638) {
                  throw new IllegalStateException();
               }

               return null;
            }

            var5 = this.field_831;
            if(2 == var1) {
               if(var3 != 1581886638) {
                  throw new IllegalStateException();
               }

               if(var2 > 3) {
                  boolean var10000;
                  if(!var5) {
                     if(var3 != 1581886638) {
                        throw new IllegalStateException();
                     }

                     var10000 = true;
                  } else {
                     var10000 = false;
                  }

                  var5 = var10000;
               }
            }

            var6 = this.field_835.length;

            for(int var7 = 0; var7 < var6; ++var7) {
               if(var3 != 1581886638) {
                  throw new IllegalStateException();
               }

               var8 = this.field_835[var7];
               if(var5) {
                  if(var3 != 1581886638) {
                     throw new IllegalStateException();
                  }

                  var8 += 65536;
               }

               var4 = (class_93)field_817.method_5065((long)var8);
               if(var4 == null) {
                  if(var3 != 1581886638) {
                     throw new IllegalStateException();
                  }

                  var4 = class_93.method_1708(class_327.field_3846, var8 & '\uffff', 0);
                  if(null == var4) {
                     if(var3 != 1581886638) {
                        throw new IllegalStateException();
                     }

                     return null;
                  }

                  if(var5) {
                     if(var3 != 1581886638) {
                        throw new IllegalStateException();
                     }

                     var4.method_1705();
                  }

                  field_817.method_5064(var4, (long)var8);
               }

               if(var6 > 1) {
                  if(var3 != 1581886638) {
                     throw new IllegalStateException();
                  }

                  field_807[var7] = var4;
               }
            }

            if(var6 > 1) {
               var14 = new class_93(field_807, var6);
               var4 = var14;
            }
         } else {
            int var10 = -1;

            for(var6 = 0; var6 < this.field_809.length; ++var6) {
               if(var3 != 1581886638) {
                  throw new IllegalStateException();
               }

               if(this.field_809[var6] == var1) {
                  if(var3 != 1581886638) {
                     throw new IllegalStateException();
                  }

                  var10 = var6;
                  break;
               }
            }

            if(-1 == var10) {
               if(var3 != 1581886638) {
                  throw new IllegalStateException();
               }

               return null;
            }

            var6 = this.field_835[var10];
            boolean var11 = this.field_831 ^ var2 > 3;
            if(var11) {
               if(var3 != 1581886638) {
                  throw new IllegalStateException();
               }

               var6 += 65536;
            }

            var4 = (class_93)field_817.method_5065((long)var6);
            if(var4 == null) {
               if(var3 != 1581886638) {
                  throw new IllegalStateException();
               }

               var4 = class_93.method_1708(class_327.field_3846, var6 & '\uffff', 0);
               if(null == var4) {
                  if(var3 != 1581886638) {
                     throw new IllegalStateException();
                  }

                  return null;
               }

               if(var11) {
                  var4.method_1705();
               }

               field_817.method_5064(var4, (long)var6);
            }
         }

         label325: {
            if(128 == this.field_836 * 2023882183) {
               if(var3 != 1581886638) {
                  throw new IllegalStateException();
               }

               if(this.field_834 * -128734905 == 128) {
                  if(var3 != 1581886638) {
                     throw new IllegalStateException();
                  }

                  if(128 == this.field_804 * 1793446173) {
                     var5 = false;
                     break label325;
                  }

                  if(var3 != 1581886638) {
                     throw new IllegalStateException();
                  }
               }
            }

            var5 = true;
         }

         boolean var12;
         label316: {
            if(0 == -1494268527 * this.field_819 && -743874879 * this.field_840 == 0) {
               if(var3 != 1581886638) {
                  throw new IllegalStateException();
               }

               if(-227509265 * this.field_838 == 0) {
                  var12 = false;
                  break label316;
               }

               if(var3 != 1581886638) {
                  throw new IllegalStateException();
               }
            }

            var12 = true;
         }

         boolean var10003;
         label308: {
            if(var2 == 0) {
               if(var3 != 1581886638) {
                  throw new IllegalStateException();
               }

               if(!var5) {
                  if(var3 != 1581886638) {
                     throw new IllegalStateException();
                  }

                  if(!var12) {
                     var10003 = true;
                     break label308;
                  }
               }
            }

            var10003 = false;
         }

         boolean var10004;
         if(this.field_812 == null) {
            if(var3 != 1581886638) {
               throw new IllegalStateException();
            }

            var10004 = true;
         } else {
            var10004 = false;
         }

         var14 = new class_93(var4, var10003, var10004, null == this.field_814, true);
         class_93 var13 = var14;
         if(var1 == 4) {
            if(var3 != 1581886638) {
               throw new IllegalStateException();
            }

            if(var2 > 3) {
               var13.method_1712(256);
               var13.method_1715(45, 0, -45);
            }
         }

         var2 &= 3;
         if(var2 == 1) {
            if(var3 != 1581886638) {
               throw new IllegalStateException();
            }

            var13.method_1698();
         } else if(2 == var2) {
            if(var3 != 1581886638) {
               throw new IllegalStateException();
            }

            var13.method_1767();
         } else if(3 == var2) {
            if(var3 != 1581886638) {
               throw new IllegalStateException();
            }

            var13.method_1700();
         }

         if(null != this.field_812) {
            if(var3 != 1581886638) {
               throw new IllegalStateException();
            }

            for(var8 = 0; var8 < this.field_812.length; ++var8) {
               if(var3 != 1581886638) {
                  throw new IllegalStateException();
               }

               var13.method_1703(this.field_812[var8], this.field_801[var8]);
            }
         }

         if(this.field_814 != null) {
            if(var3 != 1581886638) {
               throw new IllegalStateException();
            }

            for(var8 = 0; var8 < this.field_814.length; ++var8) {
               if(var3 != 1581886638) {
                  throw new IllegalStateException();
               }

               var13.method_1701(this.field_814[var8], this.field_833[var8]);
            }
         }

         if(var5) {
            if(var3 != 1581886638) {
               throw new IllegalStateException();
            }

            var13.method_1730(this.field_836 * 2023882183, this.field_834 * -128734905, 1793446173 * this.field_804);
         }

         if(var12) {
            if(var3 != 1581886638) {
               throw new IllegalStateException();
            }

            var13.method_1715(-1494268527 * this.field_819, this.field_840 * -743874879, -227509265 * this.field_838);
         }

         return var13;
      } catch (RuntimeException var9) {
         throw class_223.method_4281(var9);
      }
   }

   // $FF: renamed from: j (int) boolean
   public final boolean method_1538(int var1) {
      try {
         if(null == this.field_835) {
            if(var1 == -388884852) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            boolean var2 = true;

            for(int var3 = 0; var3 < this.field_835.length; ++var3) {
               var2 &= class_327.field_3846.method_5383(this.field_835[var3] & '\uffff', 0, (byte)108);
            }

            return var2;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }
}
