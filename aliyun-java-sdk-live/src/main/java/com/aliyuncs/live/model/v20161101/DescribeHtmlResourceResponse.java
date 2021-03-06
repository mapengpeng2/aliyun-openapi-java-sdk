/*
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.aliyuncs.live.model.v20161101;

import com.aliyuncs.AcsResponse;
import com.aliyuncs.live.transform.v20161101.DescribeHtmlResourceResponseUnmarshaller;
import com.aliyuncs.transform.UnmarshallerContext;

/**
 * @author auto create
 * @version 
 */
public class DescribeHtmlResourceResponse extends AcsResponse {

	private String requestId;

	private HtmlResource htmlResource;

	public String getRequestId() {
		return this.requestId;
	}

	public void setRequestId(String requestId) {
		this.requestId = requestId;
	}

	public HtmlResource getHtmlResource() {
		return this.htmlResource;
	}

	public void setHtmlResource(HtmlResource htmlResource) {
		this.htmlResource = htmlResource;
	}

	public static class HtmlResource {

		private String htmlResourceId;

		private String htmlUrl;

		private String htmlContent;

		private String casterId;

		private String config;

		private String streamId;

		public String getHtmlResourceId() {
			return this.htmlResourceId;
		}

		public void setHtmlResourceId(String htmlResourceId) {
			this.htmlResourceId = htmlResourceId;
		}

		public String getHtmlUrl() {
			return this.htmlUrl;
		}

		public void setHtmlUrl(String htmlUrl) {
			this.htmlUrl = htmlUrl;
		}

		public String getHtmlContent() {
			return this.htmlContent;
		}

		public void setHtmlContent(String htmlContent) {
			this.htmlContent = htmlContent;
		}

		public String getCasterId() {
			return this.casterId;
		}

		public void setCasterId(String casterId) {
			this.casterId = casterId;
		}

		public String getConfig() {
			return this.config;
		}

		public void setConfig(String config) {
			this.config = config;
		}

		public String getStreamId() {
			return this.streamId;
		}

		public void setStreamId(String streamId) {
			this.streamId = streamId;
		}
	}

	@Override
	public DescribeHtmlResourceResponse getInstance(UnmarshallerContext context) {
		return	DescribeHtmlResourceResponseUnmarshaller.unmarshall(this, context);
	}
}
