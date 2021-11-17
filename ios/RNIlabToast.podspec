
Pod::Spec.new do |s|
  s.name         = "RNIlabToast"
  s.version      = "1.0.0"
  s.summary      = "RNIlabToast"
  s.description  = <<-DESC
                  RNIlabToast
                   DESC
  s.homepage     = ""
  s.license      = "MIT"
  # s.license      = { :type => "MIT", :file => "FILE_LICENSE" }
  s.author             = { "author" => "author@domain.cn" }
  s.platform     = :ios, "7.0"
  s.source       = { :git => "https://github.com/author/RNIlabToast.git", :tag => "master" }
  s.source_files  = "RNIlabToast/**/*.{h,m}"
  s.requires_arc = true


  s.dependency "React"
  #s.dependency "others"

end

  