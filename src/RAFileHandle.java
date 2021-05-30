import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.SyncFailedException;

// $FF: renamed from: nm
public final class RAFileHandle {

   // $FF: renamed from: f long
   long field_4209;
   // $FF: renamed from: n long
   final long field_4210;
   // $FF: renamed from: v java.io.RandomAccessFile
   RandomAccessFile file;

   // $FF: renamed from: n (byte[], int, int, byte) void
   public final void write(byte[] src, int offset, int len, byte var4) throws IOException {
      try {
         if(8167831269062289551L * this.field_4209 + (long)len > 5188253846465837923L * this.field_4210) {
            if(var4 == 15) {
               throw new IllegalStateException();
            } else {
               this.file.seek(this.field_4210 * 5188253846465837923L);
               this.file.write(1);
               throw new EOFException();
            }
         } else {
            this.file.write(src, offset, len);
            this.field_4209 += 2621632103171946095L * (long)len;
         }
      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: y (boolean, int) void
   public final void closeSync(boolean sync, int var2) throws IOException {
      try {
         if(this.file != null) {
            if(sync) {
               if(var2 >= 1003938789) {
                  return;
               }

               try {
                  this.file.getFD().sync();
               } catch (SyncFailedException var4) {
                  ;
               }
            }

            this.file.close();
            this.file = null;
         }

      } catch (RuntimeException var5) {
         throw class_223.method_4281(var5);
      }
   }

   // $FF: renamed from: p (int) long
   public final long size() throws IOException {
      try {
         return this.file.length();
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }

   // $FF: renamed from: j (byte[], int, int, byte) int
   public final int read(byte[] dst, int offset, int len, byte var4) throws IOException {
      try {
         int readLength = this.file.read(dst, offset, len);
         if(readLength > 0) {
            if(var4 >= 1) {
               throw new IllegalStateException();
            }

            this.field_4209 += 2621632103171946095L * (long)readLength;
         }

         return readLength;
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   protected void finalize() throws Throwable {
      try {
         if(this.file != null) {
            System.out.println("");
            this.close();
         }

      } catch (RuntimeException var1) {
         throw class_223.method_4281(var1);
      }
   }

   // $FF: renamed from: <init> (java.io.File, java.lang.String, long) void
   public RAFileHandle(File f, String mode, long var3) throws IOException {
      super();
      try {
         if(var3 == -1L) {
            var3 = Long.MAX_VALUE;
         }

         if(f.length() > var3) {
            f.delete();
         }

         this.file = new RandomAccessFile(f, mode);
         this.field_4210 = 2269086115354828363L * var3;
         this.field_4209 = 0L;
         int var5 = this.file.read();
         if(var5 != -1 && !mode.equals("r")) {
            this.file.seek(0L);
            this.file.write(var5);
         }

         this.file.seek(0L);
      } catch (RuntimeException var6) {
         throw class_223.method_4281(var6);
      }
   }

   // $FF: renamed from: v (long) void
   final void seek(long offset) throws IOException {
      try {
         this.file.seek(offset);
         this.field_4209 = 2621632103171946095L * offset;
      } catch (RuntimeException var3) {
         throw class_223.method_4281(var3);
      }
   }

   // $FF: renamed from: f (int) void
   public final void close() throws IOException {
      try {
         this.closeSync(false, -891531898);
      } catch (RuntimeException var2) {
         throw class_223.method_4281(var2);
      }
   }
}
