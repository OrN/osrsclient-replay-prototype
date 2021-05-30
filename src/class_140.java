import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.SourceDataLine;
import javax.sound.sampled.DataLine.Info;

// $FF: renamed from: at
public class class_140 extends class_139 {

   // $FF: renamed from: v javax.sound.sampled.AudioFormat
   AudioFormat field_1809;
   // $FF: renamed from: n javax.sound.sampled.SourceDataLine
   SourceDataLine field_1810;
   // $FF: renamed from: f int
   int field_1811;
   // $FF: renamed from: y byte[]
   byte[] field_1812;


   // $FF: renamed from: r () void
   protected void method_3003() {
      this.field_1809 = new AudioFormat((float)(1631160541 * field_1793), 16, field_1781?2:1, true, false);
      this.field_1812 = new byte[256 << (field_1781?2:1)];
   }

   // $FF: renamed from: v (byte) void
   protected void method_3006(byte var1) {
      try {
         AudioFormat var10001 = new AudioFormat;
         float var10003 = (float)(1631160541 * field_1793);
         byte var10005;
         if(field_1781) {
            if(var1 != 4) {
               throw new IllegalStateException();
            }

            var10005 = 2;
         } else {
            var10005 = 1;
         }

         var10001.<init>(var10003, 16, var10005, true, false);
         this.field_1809 = var10001;
         byte var10002;
         if(field_1781) {
            if(var1 != 4) {
               throw new IllegalStateException();
            }

            var10002 = 2;
         } else {
            var10002 = 1;
         }

         this.field_1812 = new byte[256 << var10002];
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "at.v(" + ')');
      }
   }

   // $FF: renamed from: n (int, short) void
   protected void method_2998(int var1, short var2) throws LineUnavailableException {
      try {
         try {
            Info var3 = new Info(SourceDataLine.class, this.field_1809, var1 << (field_1781?2:1));
            this.field_1810 = (SourceDataLine)AudioSystem.getLine(var3);
            this.field_1810.open();
            this.field_1810.start();
            this.field_1811 = var1 * -875476967;
         } catch (LineUnavailableException var4) {
            if(class_72.method_1092(var1, 2003025544) != 1) {
               this.method_2998(class_100.method_1845(var1, 130039632), (short)-20094);
            } else {
               this.field_1810 = null;
               throw var4;
            }
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5, "at.n(" + ')');
      }
   }

   // $FF: renamed from: k () void
   protected void method_3014() {
      if(this.field_1810 != null) {
         this.field_1810.close();
         this.field_1810 = null;
      }

   }

   // $FF: renamed from: y () void
   protected void method_3000() {
      int var1 = 256;
      if(field_1781) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.field_1785[var2];
         if((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field_1812[2 * var2] = (byte)(var3 >> 8);
         this.field_1812[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field_1810.write(this.field_1812, 0, var1 << 1);
   }

   // $FF: renamed from: p (short) void
   protected void method_3001(short var1) {
      try {
         if(this.field_1810 != null) {
            this.field_1810.close();
            this.field_1810 = null;
         }

      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "at.p(" + ')');
      }
   }

   // $FF: renamed from: j (int) void
   protected void method_3002(int var1) {
      try {
         this.field_1810.flush();
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "at.j(" + ')');
      }
   }

   // $FF: renamed from: a () void
   protected void method_3042() {
      int var1 = 256;
      if(field_1781) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.field_1785[var2];
         if((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field_1812[2 * var2] = (byte)(var3 >> 8);
         this.field_1812[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field_1810.write(this.field_1812, 0, var1 << 1);
   }

   // $FF: renamed from: m () void
   protected void method_3036() {
      if(this.field_1810 != null) {
         this.field_1810.close();
         this.field_1810 = null;
      }

   }

   // $FF: renamed from: <init> () void
   void method_3017() {
      try {
         super.method_3017();
      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1, "at.<init>(" + ')');
      }
   }

   // $FF: renamed from: s (int) void
   protected void method_3011(int var1) throws LineUnavailableException {
      try {
         Info var2 = new Info(SourceDataLine.class, this.field_1809, var1 << (field_1781?2:1));
         this.field_1810 = (SourceDataLine)AudioSystem.getLine(var2);
         this.field_1810.open();
         this.field_1810.start();
         this.field_1811 = var1 * -875476967;
      } catch (LineUnavailableException var3) {
         if(class_72.method_1092(var1, 2124390633) != 1) {
            this.method_2998(class_100.method_1845(var1, 1719464707), (short)-17060);
         } else {
            this.field_1810 = null;
            throw var3;
         }
      }
   }

   // $FF: renamed from: u () int
   protected int method_3007() {
      return this.field_1811 * -930009341 - (this.field_1810.available() >> (field_1781?2:1));
   }

   // $FF: renamed from: e () void
   protected void method_3032() {
      int var1 = 256;
      if(field_1781) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.field_1785[var2];
         if((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field_1812[2 * var2] = (byte)(var3 >> 8);
         this.field_1812[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field_1810.write(this.field_1812, 0, var1 << 1);
   }

   // $FF: renamed from: o () void
   protected void method_3030() {
      int var1 = 1682321453;
      if(field_1781) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.field_1785[var2];
         if((var3 + 1921270098 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 396406547;
         }

         this.field_1812[2 * var2] = (byte)(var3 >> 8);
         this.field_1812[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field_1810.write(this.field_1812, 0, var1 << 1);
   }

   // $FF: renamed from: c () void
   protected void method_3010() {
      int var1 = 256;
      if(field_1781) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.field_1785[var2];
         if((var3 + 8388608 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> 31;
         }

         this.field_1812[2 * var2] = (byte)(var3 >> 8);
         this.field_1812[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field_1810.write(this.field_1812, 0, var1 << 1);
   }

   // $FF: renamed from: d (int) void
   protected void method_3005(int var1) throws LineUnavailableException {
      try {
         Info var2 = new Info(SourceDataLine.class, this.field_1809, var1 << (field_1781?2:1));
         this.field_1810 = (SourceDataLine)AudioSystem.getLine(var2);
         this.field_1810.open();
         this.field_1810.start();
         this.field_1811 = var1 * -875476967;
      } catch (LineUnavailableException var3) {
         if(class_72.method_1092(var1, 663002296) != 1) {
            this.method_2998(class_100.method_1845(var1, -1523874617), (short)-30453);
         } else {
            this.field_1810 = null;
            throw var3;
         }
      }
   }

   // $FF: renamed from: g () void
   protected void method_3012() {
      int var1 = -2139664883;
      if(field_1781) {
         var1 <<= 1;
      }

      for(int var2 = 0; var2 < var1; ++var2) {
         int var3 = this.field_1785[var2];
         if((var3 + 601121108 & -16777216) != 0) {
            var3 = 8388607 ^ var3 >> -245494496;
         }

         this.field_1812[2 * var2] = (byte)(var3 >> 8);
         this.field_1812[var2 * 2 + 1] = (byte)(var3 >> 16);
      }

      this.field_1810.write(this.field_1812, 0, var1 << 1);
   }

   // $FF: renamed from: l () int
   protected int method_3015() {
      return this.field_1811 * -1982491607 - (this.field_1810.available() >> (field_1781?2:1));
   }

   // $FF: renamed from: b () void
   protected void method_3004() {
      this.field_1809 = new AudioFormat((float)(1631160541 * field_1793), 16, field_1781?2:1, true, false);
      this.field_1812 = new byte[256 << (field_1781?2:1)];
   }

   // $FF: renamed from: x () void
   protected void method_3018() {
      if(this.field_1810 != null) {
         this.field_1810.close();
         this.field_1810 = null;
      }

   }

   // $FF: renamed from: f (byte) int
   protected int method_2999(byte var1) {
      try {
         int var10000 = this.field_1811 * -1982491607;
         int var10001 = this.field_1810.available();
         byte var10002;
         if(field_1781) {
            if(var1 == 0) {
               throw new IllegalStateException();
            }

            var10002 = 2;
         } else {
            var10002 = 1;
         }

         return var10000 - (var10001 >> var10002);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2, "at.f(" + ')');
      }
   }

   // $FF: renamed from: z () void
   protected void method_2995() {
      this.field_1810.flush();
   }

   // $FF: renamed from: w () void
   protected void method_2992() {
      this.field_1810.flush();
   }

   // $FF: renamed from: t () void
   protected void method_3039() {
      this.field_1810.flush();
   }
}
