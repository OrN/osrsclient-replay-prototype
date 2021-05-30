import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;

// $FF: renamed from: lj
public abstract class class_343 {

   // $FF: renamed from: s int
   int field_3900;
   // $FF: renamed from: d int
   final int field_3901;
   // $FF: renamed from: c java.util.Comparator
   Comparator field_3902;
   // $FF: renamed from: l java.util.HashMap
   HashMap field_3903;
   // $FF: renamed from: o java.util.HashMap
   HashMap field_3904;
   // $FF: renamed from: u lx[]
   class_338[] field_3905;


   // $FF: renamed from: y () lx
   abstract class_338 method_6059();

   // $FF: renamed from: ao (lx, int) void
   final void method_6060(class_338 var1, int var2) {
      try {
         this.field_3903.put(var1.field_3883, var1);
         if(null != var1.field_3882) {
            class_338 var3 = (class_338)this.field_3904.put(var1.field_3882, var1);
            if(var3 != null) {
               if(var2 != 16776960) {
                  throw new IllegalStateException();
               }

               if(var3 != var1) {
                  if(var2 != 16776960) {
                     throw new IllegalStateException();
                  }

                  var3.field_3882 = null;
               }
            }
         }

      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: ap (int) int
   public int method_6061() {
      try {
         return this.field_3900 * -1892768295;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: cs (lx) void
   final void method_6062(class_338 var1) {
      if(this.field_3903.remove(var1.field_3883) == null) {
         throw new IllegalStateException();
      } else {
         if(null != var1.field_3882) {
            this.field_3904.remove(var1.field_3882);
         }

      }
   }

   // $FF: renamed from: al (ly, int) boolean
   public boolean method_6063(class_359 var1, int var2) {
      try {
         if(!var1.method_6273((byte)0)) {
            if(var2 != -234571238) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else if(this.field_3903.containsKey(var1)) {
            if(var2 != -234571238) {
               throw new IllegalStateException();
            } else {
               return true;
            }
         } else {
            return this.field_3904.containsKey(var1);
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: ad (ly, int) lx
   public class_338 method_6064(class_359 var1) {
      try {
         class_338 var3 = this.method_6065(var1, (byte)7);
         return null != var3?var3:this.method_6066(var1, (byte)1);
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: ai (ly, byte) lx
   class_338 method_6065(class_359 var1, byte var2) {
      try {
         if(!var1.method_6273((byte)0)) {
            if(var2 != 7) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return (class_338)this.field_3903.get(var1);
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: ar (ly, byte) lx
   class_338 method_6066(class_359 var1, byte var2) {
      try {
         if(!var1.method_6273((byte)0)) {
            if(var2 != 1) {
               throw new IllegalStateException();
            } else {
               return null;
            }
         } else {
            return (class_338)this.field_3904.get(var1);
         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: cf (lx) int
   final int method_6067(class_338 var1) {
      for(int var2 = 0; var2 < this.field_3900 * -1892768295; ++var2) {
         if(this.field_3905[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   // $FF: renamed from: ax (lx, int) void
   final void method_6068(class_338 var1, int var2) {
      try {
         int var3 = this.method_6074(var1, (short)400);
         if(-1 == var3) {
            if(var2 <= -176862229) {
               throw new IllegalStateException();
            }
         } else {
            this.method_6078(var3, (byte)1);
            this.method_6105(var1, 1618016496);
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: as (ly, int) lx
   class_338 method_6069(class_359 var1) {
      try {
         return this.method_6070(var1, (class_359)null, -656990705);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: aj (ly, ly, int) lx
   class_338 method_6070(class_359 var1, class_359 var2, int var3) {
      try {
         if(this.method_6065(var1, (byte)7) != null) {
            if(var3 != -656990705) {
               throw new IllegalStateException();
            } else {
               throw new IllegalStateException();
            }
         } else {
            class_338 var4 = this.method_6079();
            var4.method_6003(var1, var2, 2108784704);
            this.method_6128(var4);
            this.method_6060(var4, 16776960);
            return var4;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: am (int, byte) lx
   public final class_338 method_6071(int var1, byte var2) {
      try {
         if(var1 >= 0) {
            if(var2 != -1) {
               throw new IllegalStateException();
            }

            if(var1 < -1892768295 * this.field_3900) {
               return this.field_3905[var1];
            }

            if(var2 != -1) {
               throw new IllegalStateException();
            }
         }

         throw new ArrayIndexOutOfBoundsException(var1);
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: cx (java.util.Comparator) void
   public final void method_6072(Comparator var1) {
      if(null == this.field_3902) {
         this.field_3902 = var1;
      } else if(this.field_3902 instanceof class_181) {
         ((class_181)this.field_3902).method_3823(var1, -82971499);
      }

   }

   // $FF: renamed from: av (lx, ly, ly, byte) void
   final void method_6073(class_338 var1, class_359 var2, class_359 var3) {
      try {
         this.method_6105(var1, -186276678);
         var1.method_6003(var2, var3, 2126754295);
         this.method_6060(var1, 16776960);
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: ac (lx, short) int
   final int method_6074(class_338 var1, short var2) {
      try {
         for(int var3 = 0; var3 < this.field_3900 * -1892768295; ++var3) {
            if(var2 != 400) {
               throw new IllegalStateException();
            }

            if(this.field_3905[var3] == var1) {
               return var3;
            }
         }

         return -1;
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: bi (ly) lx
   class_338 method_6075(class_359 var1) {
      return this.method_6070(var1, (class_359)null, -656990705);
   }

   // $FF: renamed from: bd () int
   public int method_6076() {
      return this.field_3900 * -1892768295;
   }

   // $FF: renamed from: ce (int) void
   final void method_6077(int var1) {
      this.field_3900 -= 1993312873;
      if(var1 < this.field_3900 * -1892768295) {
         System.arraycopy(this.field_3905, var1 + 1, this.field_3905, var1, this.field_3900 * -1892768295 - var1);
      }

   }

   // $FF: renamed from: aq (int, byte) void
   final void method_6078(int var1, byte var2) {
      try {
         this.field_3900 -= 1993312873;
         if(var1 < this.field_3900 * -1892768295) {
            if(var2 != 1) {
               throw new IllegalStateException();
            }

            System.arraycopy(this.field_3905, var1 + 1, this.field_3905, var1, this.field_3900 * -1892768295 - var1);
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: v (byte) lx
   abstract class_338 method_6079();

   // $FF: renamed from: n (int, int) lx[]
   abstract class_338[] method_6080(int var1);

   // $FF: renamed from: aw (int) void
   public final void method_6081() {
      try {
         this.field_3902 = null;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: cm () void
   public final void method_6082() {
      if(this.field_3902 == null) {
         Arrays.sort(this.field_3905, 0, this.field_3900 * 439603530);
      } else {
         Arrays.sort(this.field_3905, 0, this.field_3900 * -1729121560, this.field_3902);
      }

   }

   // $FF: renamed from: <init> (int) void
   class_343(int var1) {
      super();
      try {
         this.field_3900 = 0;
         this.field_3902 = null;
         this.field_3901 = 1132480583 * var1;
         this.field_3905 = this.method_6080(var1);
         this.field_3903 = new HashMap(var1 / 8);
         this.field_3904 = new HashMap(var1 / 8);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: ag (ly, int) boolean
   public final boolean method_6084(class_359 var1, int var2) {
      try {
         class_338 var3 = this.method_6065(var1, (byte)7);
         if(null == var3) {
            if(var2 >= 879370066) {
               throw new IllegalStateException();
            } else {
               return false;
            }
         } else {
            this.method_6068(var3, 648382979);
            return true;
         }
      } catch (RuntimeException var4) {
         throw class_223.method_4281(var4);
      }
   }

   // $FF: renamed from: j (int) lx[]
   abstract class_338[] method_6085(int var1);

   // $FF: renamed from: be (ly) lx
   class_338 method_6086(class_359 var1) {
      return !var1.method_6273((byte)0)?null:(class_338)this.field_3904.get(var1);
   }

   // $FF: renamed from: ak () void
   public void method_6087() {
      this.field_3900 = 0;
      Arrays.fill(this.field_3905, (Object)null);
      this.field_3903.clear();
      this.field_3904.clear();
   }

   // $FF: renamed from: ay () void
   public void method_6088() {
      this.field_3900 = 0;
      Arrays.fill(this.field_3905, (Object)null);
      this.field_3903.clear();
      this.field_3904.clear();
   }

   // $FF: renamed from: aa () void
   public void method_6089() {
      this.field_3900 = 0;
      Arrays.fill(this.field_3905, (Object)null);
      this.field_3903.clear();
      this.field_3904.clear();
   }

   // $FF: renamed from: au () int
   public int method_6090() {
      return this.field_3900 * 189984688;
   }

   // $FF: renamed from: an () int
   public int method_6091() {
      return this.field_3900 * -679680308;
   }

   // $FF: renamed from: bx (ly) boolean
   public final boolean method_6092(class_359 var1) {
      class_338 var2 = this.method_6065(var1, (byte)7);
      if(null == var2) {
         return false;
      } else {
         this.method_6068(var2, 1159677010);
         return true;
      }
   }

   // $FF: renamed from: bt () boolean
   public boolean method_6093() {
      return this.field_3901 * -446111369 == this.field_3900 * -1892768295;
   }

   // $FF: renamed from: bq () boolean
   public boolean method_6094() {
      return this.field_3901 * -446111369 == this.field_3900 * 1339863511;
   }

   // $FF: renamed from: bu (ly) boolean
   public boolean method_6095(class_359 var1) {
      return !var1.method_6273((byte)0)?false:(this.field_3903.containsKey(var1)?true:this.field_3904.containsKey(var1));
   }

   // $FF: renamed from: bj (ly) boolean
   public final boolean method_6096(class_359 var1) {
      class_338 var2 = this.method_6065(var1, (byte)7);
      if(null == var2) {
         return false;
      } else {
         this.method_6068(var2, 586472358);
         return true;
      }
   }

   // $FF: renamed from: bv (ly) boolean
   public boolean method_6097(class_359 var1) {
      return !var1.method_6273((byte)0)?false:(this.field_3903.containsKey(var1)?true:this.field_3904.containsKey(var1));
   }

   // $FF: renamed from: bm (ly) boolean
   public boolean method_6098(class_359 var1) {
      return !var1.method_6273((byte)0)?false:(this.field_3903.containsKey(var1)?true:this.field_3904.containsKey(var1));
   }

   // $FF: renamed from: ba (ly) lx
   class_338 method_6099(class_359 var1) {
      return !var1.method_6273((byte)0)?null:(class_338)this.field_3904.get(var1);
   }

   // $FF: renamed from: bh (ly) lx
   class_338 method_6100(class_359 var1) {
      return !var1.method_6273((byte)0)?null:(class_338)this.field_3903.get(var1);
   }

   // $FF: renamed from: bs (ly) lx
   class_338 method_6101(class_359 var1) {
      return !var1.method_6273((byte)0)?null:(class_338)this.field_3903.get(var1);
   }

   // $FF: renamed from: br (ly) lx
   class_338 method_6102(class_359 var1) {
      return !var1.method_6273((byte)0)?null:(class_338)this.field_3904.get(var1);
   }

   // $FF: renamed from: p (int) lx[]
   abstract class_338[] method_6103(int var1);

   // $FF: renamed from: ae (int) void
   public void method_6104() {
      try {
         this.field_3900 = 0;
         Arrays.fill(this.field_3905, (Object)null);
         this.field_3903.clear();
         this.field_3904.clear();
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: at (lx, int) void
   final void method_6105(class_338 var1, int var2) {
      try {
         if(this.field_3903.remove(var1.field_3883) == null) {
            throw new IllegalStateException();
         } else {
            if(null != var1.field_3882) {
               if(var2 <= -422930921) {
                  throw new IllegalStateException();
               }

               this.field_3904.remove(var1.field_3882);
            }

         }
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: cd () void
   public final void method_6106() {
      if(this.field_3902 == null) {
         Arrays.sort(this.field_3905, 0, this.field_3900 * -1892768295);
      } else {
         Arrays.sort(this.field_3905, 0, this.field_3900 * -1892768295, this.field_3902);
      }

   }

   // $FF: renamed from: cn (lx) int
   final int method_6107(class_338 var1) {
      for(int var2 = 0; var2 < this.field_3900 * -1892768295; ++var2) {
         if(this.field_3905[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   // $FF: renamed from: bp (lx) void
   final void method_6108(class_338 var1) {
      int var2 = this.method_6074(var1, (short)400);
      if(-1 != var2) {
         this.method_6078(var2, (byte)1);
         this.method_6105(var1, 1151261891);
      }
   }

   // $FF: renamed from: bn (lx) void
   final void method_6109(class_338 var1) {
      int var2 = this.method_6074(var1, (short)400);
      if(-1 != var2) {
         this.method_6078(var2, (byte)1);
         this.method_6105(var1, -31873560);
      }
   }

   // $FF: renamed from: bo (ly) lx
   class_338 method_6110(class_359 var1) {
      return this.method_6070(var1, (class_359)null, -656990705);
   }

   // $FF: renamed from: bw (ly) lx
   class_338 method_6111(class_359 var1) {
      return this.method_6070(var1, (class_359)null, -656990705);
   }

   // $FF: renamed from: bl (ly) boolean
   public boolean method_6112(class_359 var1) {
      return !var1.method_6273((byte)0)?false:(this.field_3903.containsKey(var1)?true:this.field_3904.containsKey(var1));
   }

   // $FF: renamed from: bb (ly, ly) lx
   class_338 method_6113(class_359 var1, class_359 var2) {
      if(this.method_6065(var1, (byte)7) != null) {
         throw new IllegalStateException();
      } else {
         class_338 var3 = this.method_6079();
         var3.method_6003(var1, var2, 1876683000);
         this.method_6128(var3);
         this.method_6060(var3, 16776960);
         return var3;
      }
   }

   // $FF: renamed from: bk (ly, ly) lx
   class_338 method_6114(class_359 var1, class_359 var2) {
      if(this.method_6065(var1, (byte)7) != null) {
         throw new IllegalStateException();
      } else {
         class_338 var3 = this.method_6079();
         var3.method_6003(var1, var2, 1952231447);
         this.method_6128(var3);
         this.method_6060(var3, 16776960);
         return var3;
      }
   }

   // $FF: renamed from: bg (int) lx
   public final class_338 method_6115(int var1) {
      if(var1 >= 0 && var1 < -1892768295 * this.field_3900) {
         return this.field_3905[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   // $FF: renamed from: f (byte[], int) cf
   static class_90 method_6116(byte[] var0, int var1) {
      try {
         class_90 var10000 = new class_90();
         class_90 var2 = var10000;
         Buffer var14 = new Buffer(var0);
         Buffer var3 = var14;
         var3.offset = -1025691571 * (var3.data.length - 2);
         int var4 = var3.readShort();
         int var5 = var3.data.length - 2 - var4 - 12;
         var3.offset = var5 * -1025691571;
         int var6 = var3.readInt();
         var2.field_904 = var3.readShort() * -341761097;
         var2.field_905 = var3.readShort() * -465592225;
         var2.field_906 = var3.readShort() * 635067323;
         var2.field_907 = var3.readShort() * -1949296963;
         int var7 = var3.readUnsignedByte();
         int var8;
         int var9;
         if(var7 > 0) {
            var2.field_908 = var2.method_1592(var7);

            for(var8 = 0; var8 < var7; ++var8) {
               if(var1 != 1132367592) {
                  throw new IllegalStateException();
               }

               var9 = var3.readShort();
               int var10002;
               if(var9 > 0) {
                  if(var1 != 1132367592) {
                     throw new IllegalStateException();
                  }

                  var10002 = class_100.method_1845(var9);
               } else {
                  var10002 = 1;
               }

               class_369 var15 = new class_369(var10002);
               class_369 var10 = var15;
               var2.field_908[var8] = var10;

               while(var9-- > 0) {
                  if(var1 != 1132367592) {
                     throw new IllegalStateException();
                  }

                  int var11 = var3.readInt();
                  int var12 = var3.readInt();
                  class_32 var10001 = new class_32(var12);
                  var10.method_6588(var10001, (long)var11);
               }
            }
         }

         var3.offset = 0;
         var2.field_899 = var3.method_347(-1757441309);
         var2.field_903 = new int[var6];
         var2.field_902 = new int[var6];
         var2.field_910 = new String[var6];

         for(var8 = 0; var3.offset * -442398587 < var5; var2.field_903[var8++] = var9) {
            if(var1 != 1132367592) {
               throw new IllegalStateException();
            }

            var9 = var3.readShort();
            if(var9 == 3) {
               if(var1 != 1132367592) {
                  throw new IllegalStateException();
               }

               var2.field_910[var8] = var3.method_139(-391631059);
            } else {
               if(var9 < 100) {
                  if(var1 != 1132367592) {
                     throw new IllegalStateException();
                  }

                  if(var9 != 21) {
                     if(var1 != 1132367592) {
                        throw new IllegalStateException();
                     }

                     if(38 != var9 && var9 != 39) {
                        if(var1 != 1132367592) {
                           throw new IllegalStateException();
                        }

                        var2.field_902[var8] = var3.readInt();
                        continue;
                     }
                  }
               }

               var2.field_902[var8] = var3.readUnsignedByte();
            }
         }

         return var2;
      } catch (RuntimeException var13) {
         throw class_223.method_4281(var13);
      }
   }

   // $FF: renamed from: bc () void
   public final void method_6117() {
      if(this.field_3902 == null) {
         Arrays.sort(this.field_3905, 0, this.field_3900 * -1892768295);
      } else {
         Arrays.sort(this.field_3905, 0, this.field_3900 * -1892768295, this.field_3902);
      }

   }

   // $FF: renamed from: az (int) void
   public final void method_6118() {
      try {
         if(this.field_3902 == null) {
            Arrays.sort(this.field_3905, 0, this.field_3900 * -1892768295);
         } else {
            Arrays.sort(this.field_3905, 0, this.field_3900 * -1892768295, this.field_3902);
         }

      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: bf (ly) lx
   class_338 method_6119(class_359 var1) {
      return !var1.method_6273((byte)0)?null:(class_338)this.field_3904.get(var1);
   }

   // $FF: renamed from: cv () void
   public final void method_6120() {
      if(this.field_3902 == null) {
         Arrays.sort(this.field_3905, 0, this.field_3900 * -1892768295);
      } else {
         Arrays.sort(this.field_3905, 0, this.field_3900 * -1892768295, this.field_3902);
      }

   }

   // $FF: renamed from: cp () void
   public final void method_6121() {
      if(this.field_3902 == null) {
         Arrays.sort(this.field_3905, 0, this.field_3900 * -1892768295);
      } else {
         Arrays.sort(this.field_3905, 0, this.field_3900 * -1892768295, this.field_3902);
      }

   }

   // $FF: renamed from: cq (lx, ly, ly) void
   final void method_6122(class_338 var1, class_359 var2, class_359 var3) {
      this.method_6105(var1, -66845849);
      var1.method_6003(var2, var3, 1886309633);
      this.method_6060(var1, 16776960);
   }

   // $FF: renamed from: ct (lx, ly, ly) void
   final void method_6123(class_338 var1, class_359 var2, class_359 var3) {
      this.method_6105(var1, 130837976);
      var1.method_6003(var2, var3, 1942224686);
      this.method_6060(var1, 16776960);
   }

   // $FF: renamed from: af (java.util.Comparator, int) void
   public final void method_6124(Comparator var1, int var2) {
      try {
         if(null == this.field_3902) {
            if(var2 != 1224360715) {
               throw new IllegalStateException();
            }

            this.field_3902 = var1;
         } else if(this.field_3902 instanceof class_181) {
            if(var2 != 1224360715) {
               throw new IllegalStateException();
            }

            ((class_181)this.field_3902).method_3823(var1, -82971499);
         }

      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: cr (lx) int
   final int method_6125(class_338 var1) {
      for(int var2 = 0; var2 < this.field_3900 * -1892768295; ++var2) {
         if(this.field_3905[var2] == var1) {
            return var2;
         }
      }

      return -1;
   }

   // $FF: renamed from: r (int) lx[]
   abstract class_338[] method_6126(int var1);

   // $FF: renamed from: by (int) lx
   public final class_338 method_6127(int var1) {
      if(var1 >= 0 && var1 < -1892768295 * this.field_3900) {
         return this.field_3905[var1];
      } else {
         throw new ArrayIndexOutOfBoundsException(var1);
      }
   }

   // $FF: renamed from: ah (lx, int) void
   final void method_6128(class_338 var1) {
      try {
         this.field_3905[(this.field_3900 += 1993312873) * -1892768295 - 1] = var1;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: cg (lx) void
   final void method_6129(class_338 var1) {
      if(this.field_3903.remove(var1.field_3883) == null) {
         throw new IllegalStateException();
      } else {
         if(null != var1.field_3882) {
            this.field_3904.remove(var1.field_3882);
         }

      }
   }

   // $FF: renamed from: co (lx) void
   final void method_6130(class_338 var1) {
      if(this.field_3903.remove(var1.field_3883) == null) {
         throw new IllegalStateException();
      } else {
         if(null != var1.field_3882) {
            this.field_3904.remove(var1.field_3882);
         }

      }
   }

   // $FF: renamed from: ck (lx) void
   final void method_6131(class_338 var1) {
      this.field_3905[(this.field_3900 += -1987789879) * -1892768295 - 1] = var1;
   }

   // $FF: renamed from: cj (lx) void
   final void method_6132(class_338 var1) {
      this.field_3903.put(var1.field_3883, var1);
      if(null != var1.field_3882) {
         class_338 var2 = (class_338)this.field_3904.put(var1.field_3882, var1);
         if(var2 != null && var2 != var1) {
            var2.field_3882 = null;
         }
      }

   }

   // $FF: renamed from: ab (byte) boolean
   public boolean method_6133(byte var1) {
      try {
         boolean var10000;
         if(this.field_3901 * -446111369 == this.field_3900 * -1892768295) {
            if(var1 == 60) {
               throw new IllegalStateException();
            }

            var10000 = true;
         } else {
            var10000 = false;
         }

         return var10000;
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: cu (lx) void
   final void method_6134(class_338 var1) {
      this.field_3903.put(var1.field_3883, var1);
      if(null != var1.field_3882) {
         class_338 var2 = (class_338)this.field_3904.put(var1.field_3882, var1);
         if(var2 != null && var2 != var1) {
            var2.field_3882 = null;
         }
      }

   }

   // $FF: renamed from: cz (lx) void
   final void method_6135(class_338 var1) {
      this.field_3903.put(var1.field_3883, var1);
      if(null != var1.field_3882) {
         class_338 var2 = (class_338)this.field_3904.put(var1.field_3882, var1);
         if(var2 != null && var2 != var1) {
            var2.field_3882 = null;
         }
      }

   }

   // $FF: renamed from: cb (int) void
   final void method_6136(int var1) {
      this.field_3900 -= 1993312873;
      if(var1 < this.field_3900 * -1892768295) {
         System.arraycopy(this.field_3905, var1 + 1, this.field_3905, var1, this.field_3900 * -1892768295 - var1);
      }

   }

   // $FF: renamed from: ci (lx, ly, ly) void
   final void method_6137(class_338 var1, class_359 var2, class_359 var3) {
      this.method_6105(var1, 1762377019);
      var1.method_6003(var2, var3, 1900162562);
      this.method_6060(var1, 16776960);
   }

   // $FF: renamed from: ch (int) void
   final void method_6138(int var1) {
      this.field_3900 -= 1993312873;
      if(var1 < this.field_3900 * -1892768295) {
         System.arraycopy(this.field_3905, var1 + 1, this.field_3905, var1, this.field_3900 * -1892768295 - var1);
      }

   }

   // $FF: renamed from: cy () void
   public final void method_6139() {
      this.field_3902 = null;
   }

   // $FF: renamed from: bz (ly) lx
   class_338 method_6140(class_359 var1) {
      return !var1.method_6273((byte)0)?null:(class_338)this.field_3903.get(var1);
   }

   // $FF: renamed from: ca (java.util.Comparator) void
   public final void method_6141(Comparator var1) {
      if(null == this.field_3902) {
         this.field_3902 = var1;
      } else if(this.field_3902 instanceof class_181) {
         ((class_181)this.field_3902).method_3823(var1, -82971499);
      }

   }

   // $FF: renamed from: cc (lx) void
   final void method_6142(class_338 var1) {
      this.field_3903.put(var1.field_3883, var1);
      if(null != var1.field_3882) {
         class_338 var2 = (class_338)this.field_3904.put(var1.field_3882, var1);
         if(var2 != null && var2 != var1) {
            var2.field_3882 = null;
         }
      }

   }
}
